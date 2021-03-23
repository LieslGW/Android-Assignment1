package com.example.cwactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {

    EditText message2;
    Button button2;
    TextView view2;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        message2 =findViewById(R.id.textBox2);
        button2=findViewById(R.id.button2);
        view2=findViewById(R.id.messageView2);

        Intent intent=getIntent();
        String text1 =intent.getStringExtra("show");
        view2.setText(text1);


        button2.setOnClickListener((v)-> {
            String text = message2.getText().toString();
            String t = view2.getText().toString();
            message = t+ "\n"+text;

            Intent intent2= new Intent(Screen2.this,Screen3.class);
            //intent2.putExtra("text1",t);
            //intent2.putExtra("text2",text);
            intent2.putExtra("show",message);
            startActivity(intent2);
        });
    }
}
