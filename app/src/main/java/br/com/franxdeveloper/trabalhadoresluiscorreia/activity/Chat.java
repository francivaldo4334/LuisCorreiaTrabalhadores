package br.com.franxdeveloper.trabalhadoresluiscorreia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import br.com.franxdeveloper.trabalhadoresluiscorreia.R;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }

    public void onBack(View view) {
        onBackPressed();
        finish();
    }
}