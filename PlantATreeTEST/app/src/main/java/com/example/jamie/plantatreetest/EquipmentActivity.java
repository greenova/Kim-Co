package com.example.jamie.plantatreetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class EquipmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
    }

    public void buttonClick(View v) {
        if (v.getId() == R.id.equipmentInfoButton) {
            Intent iSilver = new Intent(EquipmentActivity.this, EquipmentInfoActivity.class);
            startActivity(iSilver);
        }
    }

}
