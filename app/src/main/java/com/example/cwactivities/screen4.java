package com.example.cwactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class screen4 extends AppCompatActivity {
    EditText message4;
    Button button4;
    TextView view4;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        message4 =findViewById(R.id.textBox4);
        button4=findViewById(R.id.button4);
        view4=findViewById(R.id.messageView4);

        Intent intent=getIntent();
        String text4 =intent.getStringExtra("show");
        view4.setText(text4);

        button4.setOnClickListener((v)-> {
            String text = message4.getText().toString();
            String t = view4.getText().toString();
            message = t+ "\n"+text;

            Intent intent4= new Intent(screen4.this,screen5.class);
            intent4.putExtra("show",message);
            startActivity(intent4);
        });
    }
}
