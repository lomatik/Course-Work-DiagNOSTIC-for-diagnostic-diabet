package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final String ended_surname = getIntent().getStringExtra("send_surname_end");
        final String ended_ven_krov_first = getIntent().getStringExtra("send_ven_krov_first_end");
        final String ended_ven_krov_second = getIntent().getStringExtra("send_ven_krov_second_end");
        final String ended_kapi_plaz_first = getIntent().getStringExtra("send_kapi_plaz_first_end");
        final String ended_kapi_plaz_second = getIntent().getStringExtra("send_kapi_plaz_second_end");
        final String ended_ven_plaz_first = getIntent().getStringExtra("send_ven_plaz_first_end");
        final String ended_ven_plaz_second = getIntent().getStringExtra("send_ven_plaz_second_end");
        final String ended_result = getIntent().getStringExtra("send_result_end");

        AppDatabase db = App.getInstance().getDatabase();
        final DatabaseDiabetDao DatabasediabetDao = db.DatabaseDiabetDao();

        DatabaseDiabet newpatient = new DatabaseDiabet(ended_surname,Double.parseDouble(ended_ven_krov_first),Double.parseDouble(ended_ven_krov_second), Double.parseDouble(ended_ven_plaz_first),Double.parseDouble(ended_ven_plaz_second),  Double.parseDouble(ended_kapi_plaz_first), Double.parseDouble(ended_kapi_plaz_second), Integer.parseInt(ended_result));

        DatabasediabetDao.insert(newpatient);

        show_button_success = findViewById(R.id.showbutton);
        back_button_success = findViewById(R.id.buttonback);
        textView_surname_success = findViewById(R.id.textViewsurnamesuccess);
        textView_surname_success.setText(ended_surname);
        textView_ven_krov_first_success = findViewById(R.id.textViewvenkrovfirstsuccess);
        textView_ven_krov_first_success.setText(ended_ven_krov_first);
        textView_ven_krov_second_success = findViewById(R.id.textViewvenkrovsecondsuccess);
        textView_ven_krov_second_success.setText(ended_ven_krov_second);
        textView_kapi_plaz_first_success = findViewById(R.id.textViewkapiplazfirstsuccess);
        textView_kapi_plaz_first_success.setText(ended_kapi_plaz_first);
        textView_kapi_plaz_second_success = findViewById(R.id.textViewkapiplazsecondsuccess);
        textView_kapi_plaz_second_success.setText(ended_kapi_plaz_second);
        textView_ven_plaz_first_success = findViewById(R.id.textViewvenplazfirstsuccess);
        textView_ven_plaz_first_success.setText(ended_ven_plaz_first);
        textView_ven_plaz_second_success = findViewById(R.id.textViewvenplazsecondsuccess);
        textView_ven_plaz_second_success.setText(ended_ven_plaz_second);
        textView_result_success = findViewById(R.id.textViewresultsuccess);
        textView_result_success.setText(ended_result);
        show_button_success.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent start_show = new Intent(SuccessAddProcessedPatientActivity.this, ShowBaseActivity.class);
                startActivity(start_show);
            }
        });
        back_button_success.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent start_show = new Intent(SuccessAddProcessedPatientActivity.this, MainActivity.class);
                startActivity(start_show);
            }
        });
    }
}
