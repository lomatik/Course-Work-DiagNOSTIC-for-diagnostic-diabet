package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowResultActivity extends AppCompatActivity {
    Button add_full_button;
    Button back_button;
    TextView textView_surname;
    TextView textView_ven_krov_first;
    TextView textView_ven_krov_second;
    TextView textView_kapi_plaz_first;
    TextView textView_kapi_plaz_second;
    TextView textView_ven_plaz_first;
    TextView textView_ven_plaz_second;
    TextView textView_result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        String surname = getIntent().getStringExtra("send_surname");
        double ven_krov_first = Double.parseDouble(getIntent().getStringExtra("send_ven_krov_first"));
        double ven_krov_second = Double.parseDouble(getIntent().getStringExtra("send_ven_krov_second"));
        double kapi_plaz_first = Double.parseDouble(getIntent().getStringExtra("send_kapi_plaz_first"));
        double kapi_plaz_second = Double.parseDouble(getIntent().getStringExtra("send_kapi_plaz_second"));
        double ven_plaz_first = Double.parseDouble(getIntent().getStringExtra("send_ven_plaz_first"));
        double ven_plaz_second = Double.parseDouble(getIntent().getStringExtra("send_ven_plaz_second"));
        add_full_button = findViewById(R.id.addfullbutton);
        back_button = findViewById(R.id.back_button);
        textView_surname = findViewById(R.id.textViewsurname);
        textView_surname.setText(surname);
        textView_ven_krov_first = findViewById(R.id.textViewvenkrovfirst);
        textView_ven_krov_first.setText(String.valueOf(ven_krov_first));
        textView_ven_krov_second = findViewById(R.id.textViewvenkrovsecond);
        textView_ven_krov_second.setText(String.valueOf(ven_krov_second));
        textView_kapi_plaz_first = findViewById(R.id.textViewkapiplazfirst);
        textView_kapi_plaz_first.setText(String.valueOf(kapi_plaz_first));
        textView_kapi_plaz_second = findViewById(R.id.textViewkapiplazsecond);
        textView_kapi_plaz_second.setText(String.valueOf(kapi_plaz_second));
        textView_ven_plaz_first = findViewById(R.id.textViewvenplazfirst);
        textView_ven_plaz_first.setText(String.valueOf(ven_plaz_first));
        textView_ven_plaz_second = findViewById(R.id.textViewvenplazsecond);
        textView_ven_plaz_second.setText(String.valueOf(ven_plaz_second));
        textView_result = findViewById(R.id.textViewresult);
        back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent back_to_show_from_result = new Intent(ShowResultActivity.this, GetForCAlculateActivity.class);
                startActivity(back_to_show_from_result);
            }
        });
    }
}
