package br.com.franxdeveloper.trabalhadoresluiscorreia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.franxdeveloper.trabalhadoresluiscorreia.R;

public class CV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}