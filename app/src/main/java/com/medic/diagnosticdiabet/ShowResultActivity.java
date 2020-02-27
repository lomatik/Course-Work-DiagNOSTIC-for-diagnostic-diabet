package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
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
        AppDatabase db = App.getInstance().getDatabase();
        final DatabaseDiabetDao DatabasediabetDao = db.DatabaseDiabetDao();
        double[] venakrovdoeat_norm = DatabasediabetDao.venakrovdoeat_base_get_min_33_norm();
        double[] venakrovposleeat_norm = DatabasediabetDao.venakrovposleeat_base_get_max_67_norm();
        double[] kapilarplazmadoleeat_norm = DatabasediabetDao.kapilarplazmadoleeat_base_get_min_33_norm();
        double[] kapilarplazmaposleeat_norm = DatabasediabetDao.kapilarplazmaposleeat_base_get_max_78_norm();
        double[] venaplazmadoleeat_norm = DatabasediabetDao.venaplazmadoleeat_base_get_min_40_norm();
        double[] venaplazmaposleeat_norm = DatabasediabetDao.venaplazmaposleeat_base_get_max_78_norm();
        double[] venakrovdoeat_glukoza = DatabasediabetDao.venakrovdoeat_base_get_max_61();
        double[] venakrovposleeat_glukoza = DatabasediabetDao.venakrovposleeat_base_get_min_67();
        double[] kapilarplazmadoleeat_glukoza = DatabasediabetDao.kapilarplazmadoleeat_base_get_max_61();
        double[] kapilarplazmaposleeat_glukoza = DatabasediabetDao.kapilarplazmaposleeat_base_get_min_78();
        double[] venaplazmadoleeat_glukoza = DatabasediabetDao.venaplazmadoleeat_base_get_max_70();
        double[] venaplazmaposleeat_glukoza = DatabasediabetDao.venaplazmaposleeat_base_get_min_78();
        double[] venakrovdoeat_diabet = DatabasediabetDao.venakrovdoeat_base_get_min_61_diabet();
        double[] venakrovposleeat_diabet = DatabasediabetDao.venakrovposleeat_base_get_min_100_diabet();
        double[] kapilarplazmadoleeat_diabet = DatabasediabetDao.kapilarplazmadoleeat_base_get_min_61_diabet();
        double[] kapilarplazmaposleeat_diabet = DatabasediabetDao.kapilarplazmaposleeat_base_get_min_111_diabet();
        double[] venaplazmadoleeat_diabet = DatabasediabetDao.venaplazmadoleeat_base_get_min_70_diabet();
        double[] venaplazmaposleeat_diabet = DatabasediabetDao.venaplazmaposleeat_base_get_min_111_diabet();
        int[] diabet_not_fnd_norm = DatabasediabetDao.diabet_not_found_norm();
        int[] glukoza_found_not_norm = DatabasediabetDao.glukoza_found();
        int[] diabet_fnd_diabet = DatabasediabetDao.diabet_found_diabet();

        int venakrovdoeat_norm_count = venakrovdoeat_norm.length;
        int venakrovposleeat_norm_count = venakrovposleeat_norm.length;
        int kapilarplazmadoleeat_norm_count = kapilarplazmadoleeat_norm.length;
        int kapilarplazmaposleeat_norm_count = kapilarplazmaposleeat_norm.length;
        int venaplazmadoleeat_norm_count = venaplazmadoleeat_norm.length;
        int venaplazmaposleeat_norm_count = venaplazmaposleeat_norm.length;
        int venakrovdoeat_glukoza_count = venakrovdoeat_glukoza.length;
        int venakrovposleeat_glukoza_count = venakrovposleeat_glukoza.length;
        int kapilarplazmadoleeat_glukoza_count = kapilarplazmadoleeat_glukoza.length;
        int kapilarplazmaposleeat_glukoza_count = kapilarplazmaposleeat_glukoza.length;
        int venaplazmadoleeat_glukoza_count = venaplazmadoleeat_glukoza.length;
        int venaplazmaposleeat_glukoza_count = venaplazmaposleeat_glukoza.length;
        int venakrovdoeat_diabet_count = venakrovdoeat_diabet.length;
        int venakrovposleeat_diabet_count = venakrovposleeat_diabet.length;
        int kapilarplazmadoleeat_diabet_count = kapilarplazmadoleeat_diabet.length;
        int kapilarplazmaposleeat_diabet_count = kapilarplazmaposleeat_diabet.length;
        int venaplazmadoleeat_diabet_count = venaplazmadoleeat_diabet.length;
        int venaplazmaposleeat_diabet_count = venaplazmaposleeat_diabet.length;
        int glukoza_found_not_norm_count = glukoza_found_not_norm.length;
        int diabet_not_fnd_norm_count = diabet_not_fnd_norm.length;
        int diabet_fnd_diabet_count = diabet_fnd_diabet.length;

        int venakrovdoeat_countofAll = venakrovdoeat_norm_count + venakrovdoeat_glukoza_count + venakrovdoeat_diabet_count;
        int venakrovposleeat_countofAll = venakrovposleeat_norm_count + venakrovposleeat_glukoza_count + venakrovposleeat_diabet_count;;
        int kapilarplazmadoleeat_countofAll = kapilarplazmadoleeat_norm_count + kapilarplazmadoleeat_glukoza_count + kapilarplazmadoleeat_diabet_count;;
        int kapilarplazmaposleeat_countofAll = kapilarplazmaposleeat_norm_count + kapilarplazmaposleeat_glukoza_count + kapilarplazmaposleeat_diabet_count;;
        int venaplazmadoleeat_countofAll = venaplazmadoleeat_norm_count + venaplazmadoleeat_glukoza_count + venaplazmadoleeat_diabet_count;;
        int venaplazmaposleeat_countofAll = venaplazmaposleeat_norm_count + venaplazmaposleeat_glukoza_count + venaplazmaposleeat_diabet_count;;

        int CountofAllBase = glukoza_found_not_norm_count + diabet_not_fnd_norm_count + diabet_fnd_diabet_count;

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
