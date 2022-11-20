package com.pny.github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyToast("Message");
    }

    private void MyToast(String message) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}