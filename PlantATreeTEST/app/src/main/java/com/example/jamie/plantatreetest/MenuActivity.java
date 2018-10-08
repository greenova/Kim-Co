package com.example.jamie.plantatreetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void buttonClick(View v){
        if(v.getId() == R.id.treesButton){
            Intent iTree = new Intent(MenuActivity.this, TreesActivity.class);
            startActivity(iTree);
        }

        if(v.getId() == R.id.shovelinfo){
            Intent iEquipment = new Intent(MenuActivity.this, EquipmentActivity.class);
            startActivity(iEquipment);
        }

        if(v.getId() == R.id.cartButton){
            Intent iCart = new Intent(MenuActivity.this, CartActivity.class);
            startActivity(iCart);
        }
    }
}
