package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    private static final String TAG = "Diag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        final String surname = getIntent().getStringExtra("send_surname");
        final double ven_krov_first = Double.parseDouble(getIntent().getStringExtra("send_ven_krov_first"));
        final double ven_krov_second = Double.parseDouble(getIntent().getStringExtra("send_ven_krov_second"));
        final double kapi_plaz_first = Double.parseDouble(getIntent().getStringExtra("send_kapi_plaz_first"));
        final double kapi_plaz_second = Double.parseDouble(getIntent().getStringExtra("send_kapi_plaz_second"));
        final double ven_plaz_first = Double.parseDouble(getIntent().getStringExtra("send_ven_plaz_first"));
        final double ven_plaz_second = Double.parseDouble(getIntent().getStringExtra("send_ven_plaz_second"));
        AppDatabase db = App.getInstance().getDatabase();
        final DatabaseDiabetDao DatabasediabetDao = db.DatabaseDiabetDao();

        int[] diabet_not_fnd_norm = DatabasediabetDao.diabet_not_found_norm();
        int[] glukoza_found_not_norm = DatabasediabetDao.glukoza_found();
        int[] diabet_fnd_diabet = DatabasediabetDao.diabet_found_diabet();

        int glukoza_found_not_norm_count = glukoza_found_not_norm.length;
        int diabet_not_fnd_norm_count = diabet_not_fnd_norm.length;
        int diabet_fnd_diabet_count = diabet_fnd_diabet.length;

        double[] venfirstkrov_diabet;
        double[] venfirstkrov_norm;
        double[] venfirstkrov_glukoza;

        double[] venkrovsecond_diabet;
        double[] venkrovsecond_norm;
        double[] venkrovsecond_glukoza;

        double[] kapiplazfirst_diabet;
        double[] kapiplazfirst_norm;
        double[] kapiplazfirst_glukoza;

        double[] kapiplazsecond_diabet;
        double[] kapiplazsecond_norm;
        double[] kapiplazsecond_glukoza;

        double[] venplazfirst_diabet;
        double[] venplazfirst_norm;
        double[] venplazfirst_glukoza;

        double[] venplazsecond_diabet;
        double[] venplazsecond_norm;
        double[] venplazsecond_glukoza;

        int numberofresult = 3;

        if (ven_krov_first > 3.3 && ven_krov_first < 5.5) {
            venfirstkrov_diabet = DatabasediabetDao.venakrovdoeat_base_get_min_33_norm__diabet();
            venfirstkrov_norm = DatabasediabetDao.venakrovdoeat_base_get_min_33_norm__norm();
            venfirstkrov_glukoza = DatabasediabetDao.venakrovdoeat_base_get_min_33_norm__glukoza();
        }
        else if (ven_krov_first > 6.1) {
            venfirstkrov_diabet = DatabasediabetDao.venakrovdoeat_base_get_min_61_diabet__diabet();
            venfirstkrov_norm = DatabasediabetDao.venakrovdoeat_base_get_min_61_diabet__norm();
            venfirstkrov_glukoza = DatabasediabetDao.venakrovdoeat_base_get_min_61_diabet__glukoza();
        }
        else {
            venfirstkrov_diabet = DatabasediabetDao.venakrovdoeat_base_get_max_61__diabet();
            venfirstkrov_norm = DatabasediabetDao.venakrovdoeat_base_get_max_61__norm();
            venfirstkrov_glukoza = DatabasediabetDao.venakrovdoeat_base_get_max_61__glukoza();
        }

        if (ven_krov_second < 6.7) {
            venkrovsecond_diabet = DatabasediabetDao.venakrovposleeat_base_get_max_67_norm__diabet();
            venkrovsecond_norm = DatabasediabetDao.venakrovposleeat_base_get_max_67_norm__norm();
            venkrovsecond_glukoza = DatabasediabetDao.venakrovposleeat_base_get_max_67_norm__glukoza();
        }
        else if(ven_krov_second > 10.0) {
            venkrovsecond_diabet = DatabasediabetDao.venakrovposleeat_base_get_min_100_diabet__diabet();
            venkrovsecond_norm = DatabasediabetDao.venakrovposleeat_base_get_min_100_diabet__norm();
            venkrovsecond_glukoza = DatabasediabetDao.venakrovposleeat_base_get_min_100_diabet__glukoza();
        }
        else {
            venkrovsecond_diabet = DatabasediabetDao.venakrovposleeat_base_get_min_67__diabet();
            venkrovsecond_norm = DatabasediabetDao.venakrovposleeat_base_get_min_67__norm();
            venkrovsecond_glukoza = DatabasediabetDao.venakrovposleeat_base_get_min_67__glukoza();
        }

        if (kapi_plaz_first > 3.3 && kapi_plaz_first < 5.5) {
            kapiplazfirst_diabet = DatabasediabetDao.kapilarplazmadoleeat_base_get_min_33_norm__diabet();
            kapiplazfirst_norm = DatabasediabetDao.kapilarplazmadoleeat_base_get_min_33_norm__norm();
            kapiplazfirst_glukoza = DatabasediabetDao.kapilarplazmadoleeat_base_get_min_33_norm__glukoza();
        }
        else if (kapi_plaz_first > 6.1) {
            kapiplazfirst_diabet = DatabasediabetDao.kapilarplazmadoleeat_base_get_min_61_diabet__diabet();
            kapiplazfirst_norm = DatabasediabetDao.kapilarplazmadoleeat_base_get_min_61_diabet__norm();
            kapiplazfirst_glukoza = DatabasediabetDao.kapilarplazmadoleeat_base_get_min_61_diabet__glukoza();
        }
        else {
            kapiplazfirst_diabet = DatabasediabetDao.kapilarplazmadoleeat_base_get_max_61__diabet();
            kapiplazfirst_norm = DatabasediabetDao.kapilarplazmadoleeat_base_get_max_61__norm();
            kapiplazfirst_glukoza = DatabasediabetDao.kapilarplazmadoleeat_base_get_max_61__glukoza();
        }

        if (kapi_plaz_second < 7.8) {
            kapiplazsecond_diabet = DatabasediabetDao.kapilarplazmaposleeat_base_get_max_78_norm__diabet();
            kapiplazsecond_norm = DatabasediabetDao.kapilarplazmaposleeat_base_get_max_78_norm__norm();
            kapiplazsecond_glukoza = DatabasediabetDao.kapilarplazmaposleeat_base_get_max_78_norm__glukoza();
        }
        else if(kapi_plaz_second > 11.1) {
            kapiplazsecond_diabet = DatabasediabetDao.kapilarplazmaposleeat_base_get_min_111_diabet__diabet();
            kapiplazsecond_norm = DatabasediabetDao.kapilarplazmaposleeat_base_get_min_111_diabet__norm();
            kapiplazsecond_glukoza = DatabasediabetDao.kapilarplazmaposleeat_base_get_min_111_diabet__glukoza();
        }
        else {
            kapiplazsecond_diabet = DatabasediabetDao.kapilarplazmaposleeat_base_get_min_78__diabet();
            kapiplazsecond_norm = DatabasediabetDao.kapilarplazmaposleeat_base_get_min_78__norm();
            kapiplazsecond_glukoza = DatabasediabetDao.kapilarplazmaposleeat_base_get_min_78__glukoza();
        }

        if (ven_plaz_first > 4.0 && ven_plaz_first < 6.1) {
            venplazfirst_diabet = DatabasediabetDao.venaplazmadoleeat_base_get_min_40_norm__diabet();
            venplazfirst_norm = DatabasediabetDao.venaplazmadoleeat_base_get_min_40_norm__norm();
            venplazfirst_glukoza = DatabasediabetDao.venaplazmadoleeat_base_get_min_40_norm__glukoza();
        }
        else if (ven_plaz_first > 7.0) {
            venplazfirst_diabet = DatabasediabetDao.venaplazmadoleeat_base_get_min_70_diabet__diabet();
            venplazfirst_norm = DatabasediabetDao.venaplazmadoleeat_base_get_min_70_diabet__norm();
            venplazfirst_glukoza = DatabasediabetDao.venaplazmadoleeat_base_get_min_70_diabet__glukoza();
        }
        else {
            venplazfirst_diabet = DatabasediabetDao.venaplazmadoleeat_base_get_max_70__diabet();
            venplazfirst_norm = DatabasediabetDao.venaplazmadoleeat_base_get_max_70__norm();
            venplazfirst_glukoza = DatabasediabetDao.venaplazmadoleeat_base_get_max_70__glukoza();
        }

        if (ven_plaz_second < 7.8) {
            venplazsecond_diabet = DatabasediabetDao.venaplazmaposleeat_base_get_max_78_norm__diabet();
            venplazsecond_norm = DatabasediabetDao.venaplazmaposleeat_base_get_max_78_norm__norm();
            venplazsecond_glukoza = DatabasediabetDao.venaplazmaposleeat_base_get_max_78_norm__glukoza();
        }
        else if(ven_plaz_second > 11.1) {
            venplazsecond_diabet = DatabasediabetDao.venaplazmaposleeat_base_get_min_111_diabet__diabet();
            venplazsecond_norm = DatabasediabetDao.venaplazmaposleeat_base_get_min_111_diabet__norm();
            venplazsecond_glukoza = DatabasediabetDao.venaplazmaposleeat_base_get_min_111_diabet__glukoza();
        }
        else {
            venplazsecond_diabet = DatabasediabetDao.venaplazmaposleeat_base_get_min_78__diabet();
            venplazsecond_norm = DatabasediabetDao.venaplazmaposleeat_base_get_min_78__norm();
            venplazsecond_glukoza = DatabasediabetDao.venaplazmaposleeat_base_get_min_78__glukoza();
        }

        int venfirstkrov_diabet_count = venfirstkrov_diabet.length;
        int venfirstkrov_norm_count = venfirstkrov_norm.length;
        int venfirstkrov_glukoza_count = venfirstkrov_glukoza.length;

        int venkrovsecond_diabet_count = venkrovsecond_diabet.length;
        int venkrovsecond_norm_count = venkrovsecond_norm.length;
        int venkrovsecond_glukoza_count = venkrovsecond_glukoza.length;

        int kapiplazfirst_diabet_count = kapiplazfirst_diabet.length;
        int kapiplazfirst_norm_count = kapiplazfirst_norm.length;
        int kapiplazfirst_glukoza_count = kapiplazfirst_glukoza.length;

        int kapiplazsecond_diabet_count = kapiplazsecond_diabet.length;
        int kapiplazsecond_norm_count = kapiplazsecond_norm.length;
        int kapiplazsecond_glukoza_count = kapiplazsecond_glukoza.length;

        int venplazfirst_diabet_count = venplazfirst_diabet.length;
        int venplazfirst_norm_count = venplazfirst_norm.length;
        int venplazfirst_glukoza_count = venplazfirst_glukoza.length;

        int venplazsecond_diabet_count = venplazsecond_diabet.length;
        int venplazsecond_norm_count = venplazsecond_norm.length;
        int venplazsecond_glukoza_count = venplazsecond_glukoza.length;

        double aposter_venfirstkrov_diabet = venfirstkrov_diabet_count / diabet_fnd_diabet_count;
        double aposter_venfirstkrov_norm = venfirstkrov_norm_count / diabet_not_fnd_norm_count;
        double aposter_venfirstkrov_glukoza = venfirstkrov_glukoza_count / glukoza_found_not_norm_count;

        double aposter_venkrovsecond_diabet = venkrovsecond_diabet_count / diabet_fnd_diabet_count;
        double aposter_venkrovsecond_norm = venkrovsecond_norm_count / diabet_not_fnd_norm_count;
        double aposter_venkrovsecond_glukoza = venkrovsecond_glukoza_count / glukoza_found_not_norm_count;

        double aposter_kapiplazfirst_diabet = kapiplazfirst_diabet_count / diabet_fnd_diabet_count;
        double aposter_kapiplazfirst_norm = kapiplazfirst_norm_count / diabet_not_fnd_norm_count;
        double aposter_kapiplazfirst_glukoza = kapiplazfirst_glukoza_count / glukoza_found_not_norm_count;

        double aposter_kapiplazsecond_diabet = kapiplazsecond_diabet_count / diabet_fnd_diabet_count;
        double aposter_kapiplazsecond_norm = kapiplazsecond_norm_count / diabet_not_fnd_norm_count;
        double aposter_kapiplazsecond_glukoza = kapiplazsecond_glukoza_count / glukoza_found_not_norm_count;

        double aposter_venplazfirst_diabet = venplazfirst_diabet_count / diabet_fnd_diabet_count;
        double aposter_venplazfirst_norm = venplazfirst_norm_count / diabet_not_fnd_norm_count;
        double aposter_venplazfirst_glukoza = venplazfirst_glukoza_count / glukoza_found_not_norm_count;

        double aposter_venplazsecond_diabet = venplazsecond_diabet_count / diabet_fnd_diabet_count;
        double aposter_venplazsecond_norm = venplazsecond_norm_count / diabet_not_fnd_norm_count;
        double aposter_venplazsecond_glukoza = venplazsecond_glukoza_count / glukoza_found_not_norm_count;

        double aposter1_all_diabet = aposter_venfirstkrov_diabet * aposter_venkrovsecond_diabet * aposter_kapiplazfirst_diabet * aposter_kapiplazsecond_diabet * aposter_venplazfirst_diabet * aposter_venplazsecond_diabet;
        double aposter1_all_norm = aposter_venfirstkrov_norm * aposter_venkrovsecond_norm * aposter_kapiplazfirst_norm * aposter_kapiplazsecond_norm * aposter_venplazfirst_norm * aposter_venplazsecond_norm;
        double aposter1_all_glukoza = aposter_venfirstkrov_glukoza * aposter_venkrovsecond_glukoza * aposter_kapiplazfirst_glukoza * aposter_kapiplazsecond_glukoza * aposter_venplazfirst_glukoza * aposter_venplazsecond_glukoza;

        double aposter1_all_sum = aposter1_all_diabet + aposter1_all_norm + aposter1_all_glukoza;

        double aposter2_diabet = aposter1_all_diabet / aposter1_all_sum;
        double aposter2_norm = aposter1_all_norm / aposter1_all_sum;
        double aposter2_glukoza = aposter1_all_glukoza / aposter1_all_sum;

        if (aposter2_diabet > aposter2_norm && aposter2_diabet > aposter2_glukoza) {
            numberofresult = 2;
        }
        else if (aposter2_glukoza > aposter2_diabet && aposter2_glukoza > aposter2_norm) {
            numberofresult = 1;
        }
        else if (aposter2_norm > aposter2_diabet && aposter2_norm > aposter2_glukoza) {
            numberofresult = 0;
        }

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
        if (numberofresult == 0) {
            textView_result.setText("Норма");
        }
        else if (numberofresult == 1) {
            textView_result.setText("Порушена тол-нтність до глюкози");
        }
        else if (numberofresult == 2) {
            textView_result.setText("Цукровий діабет");
        }
        else {
            textView_result.setText("Не вдалось визначити, необхідно більше даних в БД");
        }
        back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent back_to_show_from_result = new Intent(ShowResultActivity.this, GetForCAlculateActivity.class);
                startActivity(back_to_show_from_result);
            }
        });
        final int result = numberofresult;
        if (numberofresult >= 0 && numberofresult < 3){
            add_full_button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v){
                    Intent sendtosave = new Intent(ShowResultActivity.this,SuccessAddProcessedPatientActivity.class);
                    sendtosave.putExtra("send_surname_end",surname);
                    sendtosave.putExtra("send_ven_krov_first_end",String.valueOf(ven_krov_first));
                    sendtosave.putExtra("send_ven_krov_second_end",String.valueOf(ven_krov_second));
                    sendtosave.putExtra("send_kapi_plaz_first_end",String.valueOf(kapi_plaz_first));
                    sendtosave.putExtra("send_kapi_plaz_second_end",String.valueOf(kapi_plaz_second));
                    sendtosave.putExtra("send_ven_plaz_first_end",String.valueOf(ven_plaz_first));
                    sendtosave.putExtra("send_ven_plaz_second_end",String.valueOf(ven_plaz_second));
                    sendtosave.putExtra("send_result_end",String.valueOf(result));
                    startActivity(sendtosave);
                }
            });
        }
        else {
            add_full_button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v){
                    Toast errorundef = Toast.makeText(getApplicationContext(),"Помилка, читайте пункт з результатом", Toast.LENGTH_SHORT);
                    errorundef.show();
                }
            });
        }
    }
}
