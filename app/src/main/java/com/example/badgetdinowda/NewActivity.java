package com.example.badgetdinowda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.badgetdinowda.MainActivity;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_activity);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String groupNumber = intent.getStringExtra("groupNumber");
        String age = intent.getStringExtra("age");
        String grade = intent.getStringExtra("grade");

        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewGroupNumber = findViewById(R.id.textViewGroupNumber);
        TextView textViewAge = findViewById(R.id.textViewAge);
        TextView textViewGrade = findViewById(R.id.textViewGrade);

        textViewName.setText("Имя: " + name);
        textViewGroupNumber.setText("Номер группы: " + groupNumber);
        textViewAge.setText("Возраст: " + age);
        textViewGrade.setText("Оценка: " + grade);

        Button backButton = findViewById(R.id.button6);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(NewActivity.this, MainActivity.class);
                startActivity(backIntent);
                finish();
            }
        });
    }
}