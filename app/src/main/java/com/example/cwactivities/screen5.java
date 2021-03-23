package com.example.cwactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class screen5 extends AppCompatActivity {
    EditText message5;
    Button button5;
    TextView view5;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);

        message5 =findViewById(R.id.textBox5);
        button5=findViewById(R.id.button5);
        view5=findViewById(R.id.messageView5);

        Intent intent=getIntent();
        String text5 =intent.getStringExtra("show");
        view5.setText(text5);

        button5.setOnClickListener((v)-> {

            String text = message5.getText().toString();
            String t = view5.getText().toString();
            message = t+ "\n"+text;

            Intent intent5= new Intent(screen5.this,MainActivity.class);
            intent5.putExtra("show",message);
            startActivity(intent5);
        });
    }
}
