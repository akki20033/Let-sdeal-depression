package com.example.detox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private String [] questions = {"1. Little interest or pleasure in doing things" , "2. Feeling down, depressed or hopeless", "3. Trouble falling asleep, staying asleep, or sleeping too much","4. Feeling tired or having little energy","5. Poor appetite or overeating","6. Feeling bad about yourself - or that you're a failure or have let yourself or your family down","7. Trouble concentrating on things, such as reading newspaper or watching television","8. Moving or speaking so slowly that other people could have noticed. Or, the opposite - being so fidgety or restless that you have been moving around a lot more than usual","9. Thoughts that you would be better off dead or of hurting yourself in some way","10. difficult have those problems made it for you to Do your work, take care of things at home, or get along with other people?" };
    private int res = 0;
    private int index = 0;
    Button one, two, three, four;
    TextView question, output;
    public static final String EXTRA_NAME = "com.example.detox.extra.NAME";
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_quiz);

        question = findViewById(R.id.question);
        output = findViewById(R.id.output);
        submit = findViewById(R.id.submit);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length - 1){
                    res += 0;
                    index++;
                    if(index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else{
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if(res<=9){
                                    output.setText("Total score is: "+ res +"/"+30+"."+" Minimal Symptoms has been observed"+" Don't Worry just follow daily routine schedule!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else if (res>10 && res<=14) {
                                    output.setText("Total score is: "+ res +"/"+30+"."+" mild/minor depression has been observed"+" follow daily routine"+" if needed antidepressant should be taken!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else if (res>=15){
                                    output.setText("Total score is: "+ res +"/"+30+"."+" major/moderately depression severe observed"+" antidepressant or psychotherapy should taken if needed"+" follow daily routine to feel better!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else{
                                    output.setText("Total score is: "+ res +"/"+30+"."+" major depression, severe observed"+" need of antidepressant and psychotherapy"+" follow daily routine you'd feel better!"+" Take care of yourself\uD83E\uDD17");
                                }
                            }
                        });
                    }
                }
                else{
                    Toast.makeText(QuizActivity.this, "Click On Submit", Toast.LENGTH_SHORT).show();
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length - 1){
                    res += 1;
                    index++;
                    if(index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else{
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if(res<=9){
                                    output.setText("Total score is: "+ res +"/"+30+"."+" Minimal Symptoms has been observed"+" Don't Worry just follow daily routine schedule!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else if (res>10 && res<=14) {
                                    output.setText("Total score is: "+ res +"/"+30+"."+" mild/minor depression has been observed"+" follow daily routine"+" if needed antidepressant should be taken!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else if (res>=15){
                                    output.setText("Total score is: "+ res +"/"+30+"."+" major/moderately depression severe observed"+" antidepressant or psychotherapy should taken if needed"+" follow daily routine to feel better!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else{
                                    output.setText("Total score is: "+ res +"/"+30+"."+" major depression, severe observed"+" need of antidepressant and psychotherapy"+" follow daily routine you'd feel better!"+" Take care of yourself\uD83E\uDD17");
                                }
                            }
                        });
                    }
                }
                else{
                    Toast.makeText(QuizActivity.this, "Click On Submit", Toast.LENGTH_SHORT).show();
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length - 1){
                    res += 2;
                    index++;
                    if(index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else{
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if(res<=9){
                                    output.setText("Total score is: "+ res +"/"+30+"."+" Minimal Symptoms has been observed"+" Don't Worry just follow daily routine schedule!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else if (res>10 && res<=14) {
                                    output.setText("Total score is: "+ res +"/"+30+"."+" mild/minor depression has been observed"+" follow daily routine"+" if needed antidepressant should be taken!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else if (res>=15){
                                    output.setText("Total score is: "+ res +"/"+30+"."+" major/moderately depression severe observed"+" antidepressant or psychotherapy should taken if needed"+" follow daily routine to feel better!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else{
                                    output.setText("Total score is: "+ res +"/"+30+"."+" major depression, severe observed"+" need of antidepressant and psychotherapy"+" follow daily routine you'd feel better!"+" Take care of yourself\uD83E\uDD17");
                                }

                            }
                        });
                    }
                }
                else{
                    Toast.makeText(QuizActivity.this, "Click On Submit", Toast.LENGTH_SHORT).show();
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length - 1){
                    res += 3;
                    index++;
                    if(index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else{
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if(res<=9){
                                    output.setText("Total score is: "+ res +"/"+30+"."+" Minimal Symptoms has been observed"+" Don't Worry just follow daily routine schedule!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else if (res>10 && res<=14) {
                                    output.setText("Total score is: "+ res +"/"+30+"."+" mild/minor depression has been observed"+" follow daily routine"+" if needed antidepressant should be taken!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else if (res>=15){
                                    output.setText("Total score is: "+ res +"/"+30+"."+" major/moderately depression severe observed"+" antidepressant or psychotherapy should taken if needed"+" follow daily routine to feel better!"+" Take care of yourself\uD83E\uDD17");
                                }
                                else{
                                    output.setText("Total score is: "+ res +"/"+30+"."+" major depression, severe observed"+" need of antidepressant and psychotherapy"+" follow daily routine you'd feel better!"+" Take care of yourself\uD83E\uDD17");
                                }
                            }
                        });
                    }
                }
                else{
                    Toast.makeText(QuizActivity.this, "Click On Submit", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}