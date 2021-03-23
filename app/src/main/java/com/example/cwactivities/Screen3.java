package com.example.cwactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {

    EditText message3;
    Button button3;
    TextView view3;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        message3 =findViewById(R.id.textBox3);
        button3=findViewById(R.id.button3);
        view3=findViewById(R.id.messageView3);

        Intent intent=getIntent();
        String text3 =intent.getStringExtra("show");
        view3.setText(text3);

        button3.setOnClickListener((v)-> {
            String text = message3.getText().toString();
            String t = view3.getText().toString();
            message = t+ "\n"+text;

            Intent intent3= new Intent(Screen3.this,screen4.class);
            intent3.putExtra("show",message);
            startActivity(intent3);
        });
    }
}
