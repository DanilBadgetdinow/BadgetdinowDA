package com.example.badgetdinowda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextGroupNumber;
    private EditText editTextAge;
    private EditText editTextGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextGroupNumber = findViewById(R.id.editTextGroupNumber);
        editTextAge = findViewById(R.id.editTextAge);
        editTextGrade = findViewById(R.id.editTextGrade);

        Button myButton = findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve text from EditText fields
                String name = editTextName.getText().toString();
                String groupNumber = editTextGroupNumber.getText().toString();
                String age = editTextAge.getText().toString();
                String grade = editTextGrade.getText().toString();

                Intent intent = new Intent(MainActivity.this, NewActivity.class);

                intent.putExtra("name", name);
                intent.putExtra("groupNumber", groupNumber);
                intent.putExtra("age", age);
                intent.putExtra("grade", grade);

                startActivity(intent);
            }
        });
    }
}