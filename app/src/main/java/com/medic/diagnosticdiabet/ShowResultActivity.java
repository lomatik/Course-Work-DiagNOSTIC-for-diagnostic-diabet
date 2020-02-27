package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        add_full_button = findViewById(R.id.addfullbutton);
        back_button = findViewById(R.id.back_button);
        textView_surname = findViewById(R.id.textViewsurname);
        textView_ven_krov_first = findViewById(R.id.textViewvenkrovfirst);
        textView_ven_krov_second = findViewById(R.id.textViewvenkrovsecond);
        textView_kapi_plaz_first = findViewById(R.id.textViewkapiplazfirst);
        textView_kapi_plaz_second = findViewById(R.id.textViewkapiplazsecond);
        textView_ven_plaz_first = findViewById(R.id.textViewvenplazfirst);
        textView_ven_plaz_second = findViewById(R.id.textViewvenplazsecond);
        textView_result = findViewById(R.id.textViewresult);
    }
}
