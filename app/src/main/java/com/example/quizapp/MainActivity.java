package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String [] questions ={"Java is a person", "Java was introduced in 1233", "Java was created using python",
            "Java has abstract classes ?","Java Supports interfaces"};
    private boolean [] answers ={false,false,false,true,true};
    private int score =0;
    Button yes;
    Button no;
    private int index =0;
    Button button;
    Button button2;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.questions);
        question.setText(questions[index]); // our first question will show
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //                if arrays not going out of bound
                if(index<=questions.length-1){ //if this is false then do nothing
                    //if answer is correct
                    if(answers[index] == true){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{ // inside if
                        Toast.makeText(MainActivity.this, "Your Score is " + score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to start again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if arrays not going out of bound
                if(index<=questions.length-1){ //if this is false then do nothing
                    //if answer is correct
                    if(answers[index] == false){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                            question.setText(questions[index]);
                    }
                    else{ // else inside if not outside
                        Toast.makeText(MainActivity.this, "Your Score is " + score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to start again", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}