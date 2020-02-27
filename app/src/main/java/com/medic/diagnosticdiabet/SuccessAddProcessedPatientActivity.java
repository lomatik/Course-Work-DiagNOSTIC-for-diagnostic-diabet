package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SuccessAddProcessedPatientActivity extends AppCompatActivity {
    Button show_button_success;
    Button back_button_success;
    TextView textView_surname_success;
    TextView textView_ven_krov_first_success;
    TextView textView_ven_krov_second_success;
    TextView textView_kapi_plaz_first_success;
    TextView textView_kapi_plaz_second_success;
    TextView textView_ven_plaz_first_success;
    TextView textView_ven_plaz_second_success;
    TextView textView_result_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_add_processed_patient);
        show_button_success = findViewById(R.id.showbutton);
        back_button_success = findViewById(R.id.buttonback);
        textView_surname_success = findViewById(R.id.textViewsurnamesuccess);
        textView_ven_krov_first_success = findViewById(R.id.textViewvenkrovfirstsuccess);
        textView_ven_krov_second_success = findViewById(R.id.textViewvenkrovsecondsuccess);
        textView_kapi_plaz_first_success = findViewById(R.id.textViewkapiplazfirstsuccess);
        textView_kapi_plaz_second_success = findViewById(R.id.textViewkapiplazsecondsuccess);
        textView_ven_plaz_first_success = findViewById(R.id.textViewvenplazfirstsuccess);
        textView_ven_plaz_second_success = findViewById(R.id.textViewvenplazsecondsuccess);
        textView_result_success = findViewById(R.id.textViewresultsuccess);
    }
}
