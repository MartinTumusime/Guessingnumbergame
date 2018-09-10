package com.example.tumusime.randomnumberguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int min = 1;
    int max = 20;
    int number;

    public void guessButton(View view){
        EditText editText = (EditText)findViewById(R.id.edtText);
        TextView textView = (TextView)findViewById(R.id.textView3);

        int num = Integer.parseInt(editText.getText().toString());


        if( num > number){

            textView.setText("Correct");
        }
        else if(num < number){
            textView.setText("Wrong");

        }else {
            textView.setText("Try agian");
            Random r = new Random();
            int number = r.nextInt(max - min + 1) + min;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        int number = r.nextInt(max - min + 1) + min;
    }
}
