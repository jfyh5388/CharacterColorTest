package cn.studyjams.s2.sj0116.charactercolortest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;


public class Answers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cn.studyjams.s2.sj0116.charactercolortest.R.layout.activity_answers);
        Intent intent = getIntent();
        int yellowAnwInt = intent.getIntExtra("yellow", -1);
        int redAnwInt = intent.getIntExtra("red", -1);
        int greenAnwInt = intent.getIntExtra("green", -1);
        int blueAnwInt = intent.getIntExtra("blue", -1);

        String yellowAnwStr = "黄\n" + yellowAnwInt;
        String redAnwStr = "红\n" + redAnwInt;
        String greenAnwStr = "绿\n" + greenAnwInt;
        String blueAnwStr = "蓝\n" + blueAnwInt;

        TextView yellowAnw = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.yellow);
        yellowAnw.setText(yellowAnwStr);
        TextView redAnw = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.red);
        redAnw.setText(redAnwStr);
        TextView greenAnw = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.green);
        greenAnw.setText(greenAnwStr);
        TextView blueAnw = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.blue);
        blueAnw.setText(blueAnwStr);

        TextView textAns = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.textAns);
        TextView analysisAns = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.analysisAns);

        if (redAnwInt < 9 && greenAnwInt < 9 && blueAnwInt < 9) {
            textAns.setText(textAns.getText() + "黄");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisYellow + "");
        } else if (yellowAnwInt < 9 && greenAnwInt < 9 && blueAnwInt < 9) {
            textAns.setText(textAns.getText() + "红");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisRed + "");
        } else if (yellowAnwInt < 9 && redAnwInt < 9 && blueAnwInt < 9) {
            textAns.setText(textAns.getText() + "绿");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisGreen);
        } else if (yellowAnwInt < 9 && redAnwInt < 9 && greenAnwInt < 9) {
            textAns.setText(textAns.getText() + "蓝");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisBlue);
        } else if (greenAnwInt < 8 && blueAnwInt < 8 && yellowAnwInt > 10 && redAnwInt > 10 && (yellowAnwInt >= redAnwInt)) {
            textAns.setText(textAns.getText() + "黄+红");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisYellowRed);
        } else if (greenAnwInt < 8 && blueAnwInt < 8 && yellowAnwInt > 10 && redAnwInt > 10 && yellowAnwInt < redAnwInt) {
            textAns.setText(textAns.getText() + "红+黄");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisRedYellow);
        } else if (greenAnwInt < 8 && redAnwInt < 8 && yellowAnwInt > 10 && blueAnwInt > 10 && yellowAnwInt >= blueAnwInt) {
            textAns.setText(textAns.getText() + "黄+蓝");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisYellowBlue);
        } else if (greenAnwInt < 8 && redAnwInt < 8 && yellowAnwInt > 10 && blueAnwInt > 10 && yellowAnwInt < blueAnwInt) {
            textAns.setText(textAns.getText() + "蓝+黄");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisBlueYellow);
        } else if (yellowAnwInt < 8 && blueAnwInt < 8 && redAnwInt > 10 && greenAnwInt > 10 && redAnwInt >= greenAnwInt) {
            textAns.setText(textAns.getText() + "红+绿");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisRedGreen);
        } else if (yellowAnwInt < 8 && blueAnwInt < 8 && redAnwInt > 10 && greenAnwInt > 10 && redAnwInt < greenAnwInt) {
            textAns.setText(textAns.getText() + "绿+红");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisGreenRed);
        } else if (yellowAnwInt < 8 && redAnwInt < 8 && greenAnwInt > 10 && blueAnwInt > 10 && greenAnwInt >= blueAnwInt) {
            textAns.setText(textAns.getText() + "绿+蓝");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisGreenBlue);
        } else if (yellowAnwInt < 8 && redAnwInt < 8 && greenAnwInt > 10 && blueAnwInt > 10 && greenAnwInt < blueAnwInt) {
            textAns.setText(textAns.getText() + "蓝+绿");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisBlueGreen);
        } else if (redAnwInt < 8 && blueAnwInt < 8 && yellowAnwInt > 10 && greenAnwInt > 10 && yellowAnwInt >= greenAnwInt) {
            textAns.setText(textAns.getText() + "黄+绿");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisContradict);
        } else if (redAnwInt < 8 && blueAnwInt < 8 && yellowAnwInt > 10 && greenAnwInt > 10 && yellowAnwInt < greenAnwInt) {
            textAns.setText(textAns.getText() + "绿+黄");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisContradict);
        } else if (yellowAnwInt < 8 && greenAnwInt < 8 && redAnwInt > 10 && blueAnwInt > 10 && redAnwInt >= blueAnwInt) {
            textAns.setText(textAns.getText() + "红+蓝");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisContradict);
        } else if (yellowAnwInt < 8 && greenAnwInt < 8 && redAnwInt > 10 && blueAnwInt > 10 && redAnwInt < blueAnwInt) {
            textAns.setText(textAns.getText() + "蓝+红");
            analysisAns.setText(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisContradict);
        } else {
            textAns.setText(textAns.getText() + "大于两种颜色");
            analysisAns.setText(getString(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisOthers) + "\n" + getString(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisYellow) + "\n" + getString(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisRed) + "\n" + getString(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisGreen) + "\n" + getString(cn.studyjams.s2.sj0116.charactercolortest.R.string.analysisBlue));

        }

    }

    public void retMain(View view) {
        TextView textAns = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.textAns);
        textAns.setText("您的结果：");
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem item1 = menu.add(0, 0, 1, "分享");
        MenuItem item2 = menu.add(0, 1, 2, "关于");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 0: {
                TextView textAns = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.textAns);
                TextView analysisAns = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.analysisAns);
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
                intent.putExtra(Intent.EXTRA_TEXT, textAns.getText().toString() + "\n" + analysisAns.getText().toString());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent.createChooser(intent, getTitle()));
            }
            return true;
            case 1: {
                Intent intentAbout = new Intent(this, about.class);
                startActivity(intentAbout);
                return true;
            }
            default:
                return false;
        }
    }

    public void allAns(View view) {
        Intent intent = new Intent(this, allAns.class);
        startActivity(intent);
    }

    public void ret(View view) {
        finish();
    }

}
