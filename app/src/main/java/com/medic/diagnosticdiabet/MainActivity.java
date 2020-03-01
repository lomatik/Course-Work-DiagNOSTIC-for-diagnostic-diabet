package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button show_button;
    Button diagnos_button;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_button = findViewById(R.id.showbutton);
        diagnos_button = findViewById(R.id.diagnosbutton);
        add_button = findViewById(R.id.addbutton);
        AppDatabase db = App.getInstance().getDatabase();
        final DatabaseDiabetDao DatabasediabetDao = db.DatabaseDiabetDao();
        List<DatabaseDiabet> patients = DatabasediabetDao.getAll();
        if (patients.isEmpty()) {
            DatabaseDiabet first = new DatabaseDiabet("Example", 4.1, 5, 5.2, 5.5, 4.4, 6, 0);
            DatabasediabetDao.insert(first);
            DatabaseDiabet second = new DatabaseDiabet("Example2", 7.8, 12.2, 8.2, 11.6, 7.4, 11.3, 2);
            DatabasediabetDao.insert(second);
            DatabaseDiabet third = new DatabaseDiabet("Example3", 2 , 8, 2.3, 9.2 , 3 , 8 , 1);
            DatabasediabetDao.insert(third);
            Toast test = Toast.makeText(getApplicationContext(),"БД створена", Toast.LENGTH_SHORT);
            test.show();
        }
        show_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent start_show = new Intent(MainActivity.this, ShowBaseActivity.class);
                startActivity(start_show);
            }
        });
        diagnos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_diag = new Intent(MainActivity.this, GetForCAlculateActivity.class);
                startActivity(start_diag);
            }
        });
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_add = new Intent(MainActivity.this, AddFullActivity.class);
                startActivity(start_add);
            }
        });
    }
}