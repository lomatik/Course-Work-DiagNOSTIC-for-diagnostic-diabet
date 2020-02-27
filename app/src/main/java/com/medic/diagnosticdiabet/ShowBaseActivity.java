package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class ShowBaseActivity extends AppCompatActivity {
    RecyclerView recyclerView_show;
    Button button_back_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_base);
        AppDatabase db = App.getInstance().getDatabase();
        final DatabaseDiabetDao databaseDiabetDao = db.DatabaseDiabetDao();
        List<DatabaseDiabet> listpatient = databaseDiabetDao.getAll();
        recyclerView_show = findViewById(R.id.recyclerViewshow);
        button_back_show = findViewById(R.id.buttonbackshow);
        recyclerView_show.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_show.setAdapter(new DataDiabetAdapter(this,listpatient));
        button_back_show.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent back_to_main_from_show = new Intent(ShowBaseActivity.this, MainActivity.class);
                startActivity(back_to_main_from_show);
            }
        });
    }
}
