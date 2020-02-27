package com.medic.diagnosticdiabet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

public class ShowBaseActivity extends AppCompatActivity {
    RecyclerView recyclerView_show;
    Button button_back_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_base);
        recyclerView_show = findViewById(R.id.recyclerViewshow);
        button_back_show = findViewById(R.id.buttonbackshow);
    }
}
