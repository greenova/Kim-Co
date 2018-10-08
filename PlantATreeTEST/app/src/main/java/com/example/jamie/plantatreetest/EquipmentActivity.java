package com.example.jamie.plantatreetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EquipmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
    }

    public void buttonClick(View v) {
        if (v.getId() == R.id.shovelinfo) {
            Intent iSilver = new Intent(EquipmentActivity.this, EquipmentInfoActivity.class);
            startActivity(iSilver);
        }

        if (v.getId() == R.id.soilInfoButton) {
            Intent iSoil = new Intent(EquipmentActivity.this, soil_info.class);
            startActivity(iSoil);
        }
    }
}