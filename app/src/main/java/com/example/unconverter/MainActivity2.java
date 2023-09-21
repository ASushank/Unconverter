package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editTextNumber = findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "", Toast.LENGTH_SHORT).show();
               String s = editTextNumber.getText().toString();
               int kg = Integer.parseInt(s);
               double pound = 2.205 * kg;
                textView.setText("The Corresponding value in Pounds is " + pound);
            }
        });
    }
}