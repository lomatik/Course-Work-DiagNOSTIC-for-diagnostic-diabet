package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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
    public static int selecteditem = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_full);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        AppDatabase db = App.getInstance().getDatabase();
        final DatabaseDiabetDao DbasediabetDao = db.DatabaseDiabetDao();
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
        spinner_result_add.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {
                AddFullActivity.selecteditem = selectedItemPosition;
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        back_button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backfromadd = new Intent(AddFullActivity.this,MainActivity.class);
                startActivity(backfromadd);
            }
        });

        add_full_button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("".equals(editText_surname_add.getText().toString().trim())){
                    Toast errorsurname = Toast.makeText(getApplicationContext(),"Заповніть поле Прізвище", Toast.LENGTH_SHORT);
                    errorsurname.show();
                }
                else if ("".equals(editText_ven_krov_first_add.getText().toString().trim())) {
                    Toast errorven_krov_first = Toast.makeText(getApplicationContext(),"Заповніть поле Венозна кров", Toast.LENGTH_SHORT);
                    errorven_krov_first.show();
                }
                else if ("".equals(editText_ven_krov_second_add.getText().toString().trim())) {
                    Toast errorven_krov_second = Toast.makeText(getApplicationContext(),"Заповніть поле Венозна кров після 2 годин", Toast.LENGTH_SHORT);
                    errorven_krov_second.show();
                }
                else if ("".equals(editText_kapi_plaz_first_add.getText().toString().trim())) {
                    Toast errorkapi_plaz_first = Toast.makeText(getApplicationContext(),"Заповніть поле Капілярна плазма", Toast.LENGTH_SHORT);
                    errorkapi_plaz_first.show();
                }
                else if ("".equals(editText_kapi_plaz_second_add.getText().toString().trim())) {
                    Toast errorkapi_plaz_second = Toast.makeText(getApplicationContext(),"Заповніть поле Капілярна плазма після 2 годин", Toast.LENGTH_SHORT);
                    errorkapi_plaz_second.show();
                }
                else if ("".equals(editText_ven_plaz_first_add.getText().toString().trim())) {
                    Toast errorven_plaz_first = Toast.makeText(getApplicationContext(),"Заповніть поле Венозна плазма", Toast.LENGTH_SHORT);
                    errorven_plaz_first.show();
                }
                else if ("".equals(editText_ven_plaz_second_add.getText().toString().trim())) {
                    Toast errorven_plaz_second = Toast.makeText(getApplicationContext(),"Заповніть поле Венозна плазма після 2 годин", Toast.LENGTH_SHORT);
                    errorven_plaz_second.show();
                }
                else if (!(AddFullActivity.selecteditem >= 0 && AddFullActivity.selecteditem < 3)) {
                    Toast error_spin_result = Toast.makeText(getApplicationContext(),"Оберіть результат діагностики", Toast.LENGTH_SHORT);
                    error_spin_result.show();
                }
                else {
                    Intent sendtosave = new Intent(AddFullActivity.this, SuccessAddProcessedPatientActivity.class);
                    sendtosave.putExtra("send_surname_end", editText_surname_add.getText().toString());
                    sendtosave.putExtra("send_ven_krov_first_end", editText_ven_krov_first_add.getText().toString());
                    sendtosave.putExtra("send_ven_krov_second_end", editText_ven_krov_second_add.getText().toString());
                    sendtosave.putExtra("send_kapi_plaz_first_end", editText_kapi_plaz_first_add.getText().toString());
                    sendtosave.putExtra("send_kapi_plaz_second_end", editText_kapi_plaz_second_add.getText().toString());
                    sendtosave.putExtra("send_ven_plaz_first_end", editText_ven_plaz_first_add.getText().toString());
                    sendtosave.putExtra("send_ven_plaz_second_end", editText_ven_plaz_second_add.getText().toString());
                    sendtosave.putExtra("send_result_end", String.valueOf(selecteditem));
                    startActivity(sendtosave);
                }
            }
        });

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
