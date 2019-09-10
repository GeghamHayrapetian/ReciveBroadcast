package com.example.recivebroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button secondChoice;
    private EditText chooseShade;
    private TextView second;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_main2);
        secondChoice=findViewById(R.id.b_second);
        chooseShade=findViewById(R.id.et_shade);
        second=findViewById(R.id.tv_second);
        String color=intent.getStringExtra("color");
        second.setText("Your favorite color is "+ color);
        secondChoice.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String shade=chooseShade.getText().toString();
       intent.putExtra("shade",shade);
       setResult(RESULT_OK,intent);
       finish();


    }
}
