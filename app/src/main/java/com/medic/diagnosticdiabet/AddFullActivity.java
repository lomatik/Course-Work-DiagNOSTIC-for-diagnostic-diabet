package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class AddFullActivity extends AppCompatActivity {
    selectitem[] dataspinner = {new selectitem("Норма"),new selectitem("Порушення толерантності до глюкози"),new selectitem("Цукровий діабет")};
    Spinner spinner_result_add;
    Button add_full_button_add;
    Button back_button_add;
    EditText editText_surname_add;
    EditText editText_ven_krov_first_add;
    EditText editText_ven_krov_second_add;
    EditText editText_kapi_plaz_first_add;
    EditText editText_kapi_plaz_second_add;
    EditText editText_ven_plaz_first_add;
    EditText editText_ven_plaz_second_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_full);
        add_full_button_add = findViewById(R.id.addfullbuttonadd);
        back_button_add = findViewById(R.id.backbuttonadd);
        editText_surname_add = findViewById(R.id.editTextsurnameadd);
        editText_ven_krov_first_add = findViewById(R.id.editTextvenkrovfirstadd);
        editText_ven_krov_second_add = findViewById(R.id.editTextvenkrovsecondadd);
        editText_kapi_plaz_first_add = findViewById(R.id.editTextkapiplazfirstadd);
        editText_kapi_plaz_second_add = findViewById(R.id.editTextkapiplazsecondadd);
        editText_ven_plaz_first_add = findViewById(R.id.editTextvenplazfirstadd);
        editText_ven_plaz_second_add = findViewById(R.id.editTextvenplazsecondadd);
        spinner_result_add = findViewById(R.id.spinnerresultadd);
        back_button_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent back_from_add = new Intent(AddFullActivity.this, MainActivity.class);
                startActivity(back_from_add);
            }
        });
        ArrayAdapter<selectitem> adapter = new MyCustomAdapter(this,R.layout.row,dataspinner);
        spinner_result_add.setAdapter(adapter);
    }
    public class MyCustomAdapter extends ArrayAdapter<selectitem> {

        public MyCustomAdapter(Context context, int textViewResourceId,
                               selectitem[] dataspinner) {
            super(context, textViewResourceId, dataspinner);

        }

        @Override
        public View getDropDownView(int position, View convertView,
                                    ViewGroup parent) {

            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView,
                                  ViewGroup parent) {

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.row, parent, false);
            TextView label = (TextView) row.findViewById(R.id.textView_row);
            label.setText(dataspinner[position].nameitem);
            return row;
        }
    }
}
