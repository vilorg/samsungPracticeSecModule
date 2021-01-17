package com.vilorg.samsung_module_two;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Test");

        TextView main = findViewById(R.id.mainText);

        TextView task1 = findViewById(R.id.firstTask);
        TextView task2 = findViewById(R.id.secondTask);
        TextView task3 = findViewById(R.id.thirdTask);
        TextView task4 = findViewById(R.id.fourthTask);

        EditText firstAnswer = findViewById(R.id.firstAnswer);

        CheckBox check1 = findViewById(R.id.check_1);
        CheckBox check2 = findViewById(R.id.check_2);

        RadioButton radio3 = findViewById(R.id.radio_3);

        EditText oneFirst = findViewById(R.id.oneFirst);
        EditText oneSecond = findViewById(R.id.oneSecond);
        EditText oneThird = findViewById(R.id.oneThird);
        EditText oneFourth = findViewById(R.id.oneFourth);
        EditText oneFifth = findViewById(R.id.oneFifth);

        Button check = findViewById(R.id.check);
        Button reset = findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneFirst.setText("");
                oneSecond.setText("");
                oneThird.setText("");
                oneFourth.setText("");
                oneFifth.setText("");
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                String a = firstAnswer.getText().toString();
                String b = oneFirst.getText().toString();
                String c = oneSecond.getText().toString();
                String d = oneThird.getText().toString();
                String e = oneFourth.getText().toString();
                String f = oneFifth.getText().toString();


                if (a.equals("4") && b.equals("1") && c.equals("2") && d.equals("4") && e.equals("8") && f.equals("16") && check1.isChecked() && check2.isChecked() && radio3.isChecked()){
                    Toast.makeText(getApplicationContext(), "That's right! Keep up the good work!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "There is an error somewhere here, please try again..(", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}