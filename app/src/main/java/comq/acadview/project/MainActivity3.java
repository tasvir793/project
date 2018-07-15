package comq.acadview.project;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
    TextView timer,question, score_card,name;
    Button ops1,ops2,ops3,ops4;

    long time=30;
    int score=0;
    final int max=100;
    final int min=1;
    CountDownTimer obj=null;
    int i1,i2,i3,i4;
    int total_questions=0;
    int correct_answers=0;
    int choice_number=0;
    int score_temp;

    Random r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        timer=findViewById(R.id.timer);
        question=findViewById(R.id.question);
        score_card =findViewById(R.id.score);
        name=findViewById(R.id.name);


        final String str2 = getIntent().getStringExtra("Name");
        name.setText("Hi "+str2);

        Question();

        obj=new CountDownTimer(30000, 1000)
        {



            public void onTick(long millisUntilFinished)
            {
                timer.setText(" " + millisUntilFinished / 1000+"s");
                time=millisUntilFinished / 1000;

            }

            @Override
            public void onFinish()
            {
                timer.setText(" 00 ");
                Toast.makeText(MainActivity3.this,"Time Up!", Toast.LENGTH_LONG).show();
                Intent intent = getIntent();
//                final String player_name = getIntent().getStringExtra("Name");

                Intent intent_score=new Intent(MainActivity3.this,MainActivity4.class);
                intent_score.putExtra("Score",String.valueOf(score_temp));
                intent_score.putExtra("Name",str2);
                intent_score.putExtra("Questions",String.valueOf(total_questions));
                intent_score.putExtra("Correct",String.valueOf(correct_answers));
                startActivity(intent_score);

                MainActivity3.this.finish();
            }
        };


    }
    void Question()
    {

        ops1 =findViewById(R.id.button1);
        ops2 =findViewById(R.id.button2);
        ops3 =findViewById(R.id.button3);
        ops4=findViewById(R.id.button4);


        r=new Random();

        int m=r.nextInt((max-min)+1)+min;
        int n=r.nextInt((max-min)+1)+min;

        String ques=Integer.toString(m)+" + "+Integer.toString(n);
        question.setText(ques);

        choice_number=r.nextInt((4))+1;

        i1 = r.nextInt((max - min) + 1) ;
        i2 = r.nextInt((max - min) + 1) ;
        i3 = r.nextInt((max - min) + 1) ;
        i4 = m+n;

        switch(choice_number){

            case 1: ops1.setText(Integer.toString(i4));
                ops2.setText(Integer.toString(i1));
                ops3.setText(Integer.toString(i2));
                ops4.setText(Integer.toString(i3));
                ops1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();

                        if(time>0)
                        {

                            score_temp=score_temp+1;
                            score =score_temp;
                            total_questions=total_questions+1;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            correct_answers=correct_answers+1;
                            Question();

                        }
                        else {

                            return;
                        }

                    }
                });

                ops2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();
                        }
                        else
                            return;

                    }
                });

                ops3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();
                        }
                        else
                            return;

                    }
                });

                ops4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();
                        }
                        else
                            return;

                    }
                });
                break;

            case 2:     ops2.setText(Integer.toString(i4));
                ops1.setText(Integer.toString(i1));
                ops3.setText(Integer.toString(i2));
                ops4.setText(Integer.toString(i3));


                ops2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        if(total_questions==0)
                            obj.start();
                        if(time>0)
                        {

                            score_temp=score_temp+1;
                            score =score_temp;

                            total_questions=total_questions+1;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            correct_answers=correct_answers+1;
                            Question();

                        }
                        else{
                            return;
                        }

                    }
                });

                ops1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();

                        }
                        else
                            return;

                    }
                });

                ops3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();

                        }
                        else
                            return;

                    }
                });

                ops4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();

                        }
                        else
                            return;

                    }
                });
                break;


            case 3: ops3.setText(Integer.toString(i4));
                ops1.setText(Integer.toString(i1));
                ops2.setText(Integer.toString(i2));
                ops4.setText(Integer.toString(i3));


                ops3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0)
                        {

                            score_temp=score_temp+1;
                            score =score_temp;
                            total_questions=total_questions+1;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            correct_answers=correct_answers+1;
                            Question();

                        }
                        else{
                            return;
                        }

                    }
                });
                ops2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score=score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();

                        }
                        else
                            return;

                    }
                });

                ops1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();

                        }
                        else
                            return;

                    }
                });

                ops4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;
                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();

                        }
                        else
                            return;

                    }
                });
                break;

            case 4: ops4.setText(Integer.toString(i4));
                ops1.setText(Integer.toString(i1));
                ops2.setText(Integer.toString(i2));
                ops3.setText(Integer.toString(i3));


                ops4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View V) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0)
                        {

                            score_temp=score_temp+1;
                            score =score_temp;

                            total_questions=total_questions+1;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            correct_answers=correct_answers+1;
                            Question();

                        }
                        else{
                            return;
                        }

                    }
                });

                ops2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View V) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();

                        }
                        else
                            return;

                    }
                });

                ops3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View V) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();

                        }
                        else
                            return;

                    }
                });

                ops1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View V) {
                        if(total_questions==0)
                            obj.start();
                        if(time>0){

                            total_questions=total_questions+1;

                            score =score_temp;
                            String str1=Integer.toString(score_temp);
                            String str2=Integer.toString(total_questions);
                            score_card.setText(str1+"/"+str2);
                            Question();
                        }
                        else
                            return;

                    }
                });
                break;

        }

    }
}
