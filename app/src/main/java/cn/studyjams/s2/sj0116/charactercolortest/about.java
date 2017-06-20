package cn.studyjams.s2.sj0116.charactercolortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cn.studyjams.s2.sj0116.charactercolortest.R.layout.activity_about);
    }

    public void ret(View view) {
        finish();
    }
}

