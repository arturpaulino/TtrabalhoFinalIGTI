package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Intent intent = getIntent();

       String fName = intent.getStringExtra("Alunos");
        TextView view = (TextView) findViewById(R.id.textViewAlunos);
        view.setText(fName);



    }
}