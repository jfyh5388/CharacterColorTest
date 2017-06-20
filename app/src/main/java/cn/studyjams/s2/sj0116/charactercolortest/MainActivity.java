package cn.studyjams.s2.sj0116.charactercolortest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cn.studyjams.s2.sj0116.charactercolortest.R.layout.activity_main);
    }


    public void instructions(View view) {
        Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }

    public void start(View view) {
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }

}
