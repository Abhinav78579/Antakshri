package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        textView= findViewById(R.id.textView);
        editTextText= findViewById(R.id.editTextText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Toast.makeText(MainActivity.this,"Hi click listener worked!",Toast.LENGTH_SHORT).show();
//                String s= editTextText.getText().toString();
//                int Kg=Integer.parseInt(s);
//                double pound =2.205 * Kg;
//                textView.setText("The corresponding value in Pounds is " + pound);
//
//
//            }
//        });


    }
    public void calculate(View v){
        String s= editTextText.getText().toString();
               int Kg=Integer.parseInt(s);
               double pound =2.205 * Kg;
              textView.setText("The corresponding value in Pounds is " + pound);
        Toast.makeText(MainActivity.this,"Thanks for using this app!",Toast.LENGTH_SHORT).show();

    }
}