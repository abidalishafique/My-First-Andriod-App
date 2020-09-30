package com.myfirstapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void DisplayMessage(View view) {
        TextView message = findViewById(R.id.myText);
        TextView showText = findViewById(R.id.MessageView);
        showText.setText((message.getText()).toString());
    }
}