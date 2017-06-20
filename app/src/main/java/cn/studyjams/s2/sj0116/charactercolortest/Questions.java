package cn.studyjams.s2.sj0116.charactercolortest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Questions extends AppCompatActivity {
    private static final int RB1_ID = 1;//first radio button id
    private static final int RB2_ID = 2;//second radio button id
    private static final int RB3_ID = 3;//third radio button id
    private static final int RB4_ID = 4;//third radio button id

    int count = 0;
    int yellowCount = 0;
    int redCount = 0;
    int greenCount = 0;
    int blueCount = 0;
    String[][] selections = {
            {"分析型的", "冒险的", "有活力的", "能适应的"},
            {"坚持的", "顽皮的", "有说服力的", "和平、和气的"},
            {"牺牲自我的", "意志坚强的", "顺从的", "社交的"},
            {"压抑的", "令人信服的", "竞争性的", "体贴的"},
            {"清心悦人的", "自制的", "有礼貌的", "机智的"},
            {"精神充沛的", "自主的", "敏感的", "满意的"},
            {"计划者", "发起人", "有耐心的", "肯定的"},
            {"用时间表的", "害羞的", "自动自发的", "确定的"},
            {"敢言的", "有次序地", "乐观的", "热心助人的"},
            {"有力的", "友善的", "忠心的", "有趣的"},
            {"快乐的", "有胆量的", "注意细节的", "外交的"},
            {"兴奋的", "有教养的", "有信心的", "一致的"},
            {"不冒犯人的", "独立的", "理想型的", "有灵感的"},
            {"有深度的", "圆融反讽的", "果断的", "流露感情的"},
            {"与人打成一片", "周旋者", "善于音乐的", "推动者"},
            {"深思熟虑的", "有包容力的", "健谈者", "坚持不改的"},
            {"有生气的", "忠心的", "倾听者", "领导者"},
            {"满足的", "做主的", "用图表的", "可爱的"},
            {"完美主义的", "愉悦的", "多产的", "受人欢迎的"},
            {"平衡的", "有活力的", "行为端正的", "勇敢的"},
            {"无表情的", "害羞的", "厚脸皮的", "好发号施令的"},
            {"不热心的", "不原谅人的", "没有纪律的", "缺乏同情心的"},
            {"愤慨的", "沉默寡言的", "抵抗者", "唠叨的"},
            {"挑剔的", "坦白的", "健忘的", "害怕的"},
            {"缺乏安全感的", "不果断的", "没耐心的", "打断别人的"},
            {"不受欢迎的", "不可预测的", "冷漠无情的", "不参与的"},
            {"犹豫不决的", "难以取悦的", "随便的", "顽固的"},
            {"悲观的", "骄傲的", "无装饰的", "纵容的"},
            {"无目标的", "疏远隔离的", "易动怒的", "好辩的"},
            {"天真无知的", "紧张的", "态度负面的", "不在乎的"},
            {"担扰者", "退缩的", "工作狂", "需要称赞的"},
            {"害羞者", "不圆滑的", "过分敏感的", "多言多语"},
            {"怀疑人的", "沮丧的", "专制的", "无组织的"},
            {"漠不关心的", "不包容别人的", "善变的", "内向的"},
            {"喃喃自语者", "情绪多起伏", "混乱的", "控制人的"},
            {"迟疑的", "顽固的", "好表现的", "怀疑的"},
            {"孤独的", "逞威风的", "吵闹的", "懒散的"},
            {"注意力涣散", "无生气的", "疑心重的", "急躁的"},
            {"不情愿的", "报复心强的", "好动的", "轻率的"},
            {"妥协的", "好批评人的", "善变的", "狡猾的"}
    };


    String[][] table = {
            {"blue", "yellow", "red", "green"},
            {"blue", "red", "yellow", "green"},
            {"blue", "yellow", "green", "red"},
            {"green", "red", "yellow", "blue"},
            {"red", "green", "blue", "yellow"},
            {"red", "yellow", "blue", "green"},
            {"blue", "red", "green", "yellow"},
            {"blue", "green", "red", "yellow"},
            {"yellow", "blue", "red", "green"},
            {"yellow", "green", "blue", "red"},
            {"red", "yellow", "blue", "green"},
            {"red", "blue", "yellow", "green"},
            {"green", "yellow", "blue", "red"},
            {"blue", "green", "yellow", "red"},
            {"red", "green", "blue", "yellow"},
            {"blue", "green", "red", "yellow"},
            {"red", "blue", "green", "yellow"},
            {"green", "yellow", "blue", "red"},
            {"blue", "green", "yellow", "red"},
            {"green", "red", "blue", "yellow"},
            {"green", "blue", "red", "yellow"},
            {"green", "blue", "red", "yellow"},
            {"blue", "green", "yellow", "red"},
            {"blue", "yellow", "red", "green"},
            {"blue", "green", "yellow", "red"},
            {"blue", "red", "yellow", "green"},
            {"green", "blue", "red", "yellow"},
            {"blue", "yellow", "green", "red"},
            {"green", "blue", "red", "yellow"},
            {"red", "yellow", "blue", "green"},
            {"green", "blue", "yellow", "red"},
            {"green", "yellow", "blue", "red"},
            {"green", "blue", "yellow", "red"},
            {"green", "yellow", "red", "blue"},
            {"green", "blue", "red", "yellow"},
            {"green", "yellow", "red", "blue"},
            {"blue", "yellow", "red", "green"},
            {"red", "green", "blue", "yellow"},
            {"green", "blue", "red", "yellow"},
            {"green", "blue", "red", "yellow"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cn.studyjams.s2.sj0116.charactercolortest.R.layout.activity_questions);
        //     setListener();        //设置控件的监听器
    }

    //    private void setListener() {
//        // TODO Auto-generated method stub
//        //设置所有Radiogroup的状态改变监听器
//        radioGroup.setOnCheckedChangeListener(myListener);
//
//    }
////
//    RadioGroup.OnCheckedChangeListener myListener=new RadioGroup.OnCheckedChangeListener()
//    {
//        @Override
//        public void onCheckedChanged(RadioGroup Group, int CheckId) {
//            // TODO Auto-generated method stub
//            //设置TextView的内容显示CheckBox的选择结果
//
//        }
//    };
    public void next(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.radioGroup);
        RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        String text = radioButton.getText().toString();
        //radioButton.setChecked(false);
        for (int i = 0; i < 4; i++) {
            if (text.equals(selections[count][i])) {
                String answer = table[count][i];
                switch (answer) {
                    case "yellow": {
                        yellowCount++;
                        break;
                    }
                    case "red": {
                        redCount++;
                        break;
                    }
                    case "green": {
                        greenCount++;
                        break;
                    }
                    case "blue": {
                        blueCount++;
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }
        count++;
        if (count < 40) {
            TextView number = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.number);
            number.setText((count + 1) + "/40");
            TextView questionA = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.questionA);
            questionA.setText(selections[count][0]);
            TextView questionB = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.questionB);
            questionB.setText(selections[count][1]);
            TextView questionC = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.questionC);
            questionC.setText(selections[count][2]);
            TextView questionD = (TextView) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.questionD);
            questionD.setText(selections[count][3]);
            if (count == 39) {
                Button nextButton = (Button) findViewById(cn.studyjams.s2.sj0116.charactercolortest.R.id.nextButton);
                nextButton.setText("查看结果");
            }

        } else {
            Intent intent = new Intent(this, Answers.class);
            intent.putExtra("yellow", yellowCount);
            intent.putExtra("red", redCount);
            intent.putExtra("green", greenCount);
            intent.putExtra("blue", blueCount);
            startActivity(intent);
            Log.v("Questions", "yellowCount=" + yellowCount);
            Log.v("Questions", "redCount=" + redCount);
            Log.v("Questions", "greenCount=" + greenCount);
            Log.v("Questions", "blueCount=" + blueCount);
            count = 0;
            yellowCount = 0;
            redCount = 0;
            greenCount = 0;
            blueCount = 0;
            finish();
        }
    }
}
