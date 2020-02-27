package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class GetForCAlculateActivity extends AppCompatActivity {
    Button calc_button;
    Button back_button;
    EditText editText_surname;
    EditText editText_ven_krov_first;
    EditText editText_ven_krov_second;
    EditText editText_kapi_plaz_first;
    EditText editText_kapi_plaz_second;
    EditText editText_ven_plaz_first;
    EditText editText_ven_plaz_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_for_calculate);
        calc_button = findViewById(R.id.calcbutton);
        back_button = findViewById(R.id.backbutton);
        editText_surname = findViewById(R.id.editTextsurname);
        editText_ven_krov_first = findViewById(R.id.editTextvenkrovfirst);
        editText_ven_krov_second = findViewById(R.id.editTextvenkrovsecond);
        editText_kapi_plaz_first = findViewById(R.id.editTextkapiplazfirst);
        editText_kapi_plaz_second = findViewById(R.id.editTextkapiplazsecond);
        editText_ven_plaz_first = findViewById(R.id.editTextvenplazfirst);
        editText_ven_plaz_second = findViewById(R.id.editTextvenplazsecond);
    }
}
