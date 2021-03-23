package com.example.cwactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText message;
    Button button;
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message =findViewById(R.id.textBox1);
        button=findViewById(R.id.button1);
        view=findViewById(R.id.messageView1);

        Intent intent1=getIntent();
        String text1 =intent1.getStringExtra("show");
        view.setText(text1);


        button.setOnClickListener((v)-> {
            String text = message.getText().toString();

            Intent intent= new Intent(MainActivity.this,Screen2.class);
            intent.putExtra("show",text);
            startActivity(intent);
        });

    }
}
