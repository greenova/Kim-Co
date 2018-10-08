package com.example.jamie.plantatreetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TreesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trees);
    }

    public void buttonClick(View v) {
        if (v.getId() == R.id.silverInfoButton) {
            Intent iSilver = new Intent(TreesActivity.this, TreeInfoActivity.class);
            startActivity(iSilver);
        }

        if (v.getId() == R.id.oakInfoButton) {
            Intent iOak = new Intent(TreesActivity.this, oak_info.class);
            startActivity(iOak);
        }
    }
}
