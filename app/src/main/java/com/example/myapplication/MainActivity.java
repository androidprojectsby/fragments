package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.BlankFragment2;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements myinterface{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void communicate(String data) {
            BlankFragment2 var= (BlankFragment2) getSupportFragmentManager().findFragmentById(R.id.BlankFragment2);
            var.setdata(data);
    }
}