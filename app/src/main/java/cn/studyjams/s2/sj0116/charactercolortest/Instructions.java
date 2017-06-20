package cn.studyjams.s2.sj0116.charactercolortest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cn.studyjams.s2.sj0116.charactercolortest.R.layout.activity_instructions);
    }

    public void ret(View view) {
        finish();
    }
}
