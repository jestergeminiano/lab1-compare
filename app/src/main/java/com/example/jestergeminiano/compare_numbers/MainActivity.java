package com.example.jestergeminiano.compare_numbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = (Button) findViewById(R.id.pressButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputeditText1 = (EditText) findViewById(R.id.integer1);
                EditText inputeditText2 = (EditText) findViewById(R.id.integer2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int firstNum, secondNum;

                firstNum = Integer.parseInt(inputeditText1.getText().toString());
                secondNum = Integer.parseInt(inputeditText2.getText().toString());

                if(firstNum>secondNum){
                    resultTextView.setText("First Number is greater.");
                }
                else if(secondNum>firstNum){
                    resultTextView.setText("Second Number is greater");
                }
                else {
                    resultTextView.setText("No greater value.");
                }


            }
        });
    }
}
