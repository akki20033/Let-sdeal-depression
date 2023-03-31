package com.example.detox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class SecondActivity extends AppCompatActivity {

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    Button signout, button3;
    TextView happy,sad,ok,playfull,textshow;
    ImageView imageView4,imageView5,imageView6,imageView7;
    public static final String SHARED_PREFS = "sharedPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_second);

        signout = findViewById(R.id.signout);
        happy = findViewById(R.id.happy);
        sad = findViewById(R.id.sad);
        playfull = findViewById(R.id.playfull);
        ok = findViewById(R.id.ok);
        textshow = findViewById(R.id.textshow);
        button3 = findViewById(R.id.button3);
        imageView7 = findViewById(R.id.imageView7);
        imageView6 = findViewById(R.id.imageView6);
        imageView5 = findViewById(R.id.imageView5);
        imageView4 = findViewById(R.id.imageView4);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("name","");
                editor.apply();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textshow.setText("Cool Bro!!\nThen Let's GO\uD83D\uDE0E");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textshow.setText("Don't be off!!\nJust Spend Time With Me\uD83D\uDE04");
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textshow.setText("Amazing Dude!!\nCommon Let's Fun Together\uD83D\uDE0E");
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textshow.setText("Don't Worry!!\nI'll cherish you\uD83D\uDE04");
            }
        });

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textshow.setText("Cool Bro!!\nThen Let's GO\uD83D\uDE0E");
            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textshow.setText("Don't be off!!\nJust Spend Time With Me\uD83D\uDE04");
            }
        });

        playfull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textshow.setText("Amazing Dude!!\nCommon Let's Fun Together\uD83D\uDE0E");
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textshow.setText("Don't Worry!!\nI'll cherish you\uD83D\uDE04");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,HomeActivity.class));
            }
        });
    }
}