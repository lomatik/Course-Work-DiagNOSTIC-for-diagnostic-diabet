package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent back_to_main_from_show = new Intent(GetForCAlculateActivity.this, MainActivity.class);
                startActivity(back_to_main_from_show);
            }
        });
        calc_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ("".equals(editText_surname.getText().toString().trim())){
                    Toast errorsurname = Toast.makeText(getApplicationContext(),"Заповніть поле Прізвище", Toast.LENGTH_SHORT);
                    errorsurname.show();
                }
                else if ("".equals(editText_ven_krov_first.getText().toString().trim())) {
                    Toast errorven_krov_first = Toast.makeText(getApplicationContext(),"Заповніть поле Венозна кров", Toast.LENGTH_SHORT);
                    errorven_krov_first.show();
                }
                else if ("".equals(editText_ven_krov_second.getText().toString().trim())) {
                    Toast errorven_krov_second = Toast.makeText(getApplicationContext(),"Заповніть поле Венозна кров після 2 годин", Toast.LENGTH_SHORT);
                    errorven_krov_second.show();
                }
                else if ("".equals(editText_kapi_plaz_first.getText().toString().trim())) {
                    Toast errorkapi_plaz_first = Toast.makeText(getApplicationContext(),"Заповніть поле Капілярна плазма", Toast.LENGTH_SHORT);
                    errorkapi_plaz_first.show();
                }
                else if ("".equals(editText_kapi_plaz_second.getText().toString().trim())) {
                    Toast errorkapi_plaz_second = Toast.makeText(getApplicationContext(),"Заповніть поле Капілярна плазма після 2 годин", Toast.LENGTH_SHORT);
                    errorkapi_plaz_second.show();
                }
                else if ("".equals(editText_ven_plaz_first.getText().toString().trim())) {
                    Toast errorven_plaz_first = Toast.makeText(getApplicationContext(),"Заповніть поле Венозна плазма", Toast.LENGTH_SHORT);
                    errorven_plaz_first.show();
                }
                else if ("".equals(editText_ven_plaz_second.getText().toString().trim())) {
                    Toast errorven_plaz_second = Toast.makeText(getApplicationContext(),"Заповніть поле Венозна плазма після 2 годин", Toast.LENGTH_SHORT);
                    errorven_plaz_second.show();
                }
                else {
                    Intent sendtocalc = new Intent(GetForCAlculateActivity.this,ShowResultActivity.class);
                    sendtocalc.putExtra("send_surname",editText_surname.toString());
                    sendtocalc.putExtra("send_ven_krov_first",editText_ven_krov_first.toString());
                    sendtocalc.putExtra("send_ven_krov_second",editText_ven_krov_second.toString());
                    sendtocalc.putExtra("send_kapi_plaz_first",editText_kapi_plaz_first.toString());
                    sendtocalc.putExtra("send_kapi_plaz_second",editText_kapi_plaz_second.toString());
                    sendtocalc.putExtra("send_ven_plaz_first",editText_ven_plaz_first.toString());
                    sendtocalc.putExtra("send_ven_plaz_second",editText_ven_plaz_second.toString());
                    startActivity(sendtocalc);
                }
            }
        });
    }
}
