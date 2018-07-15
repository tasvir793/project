package comq.acadview.project;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    ImageView imageView1;
    ProgressBar progressBar1;
    TextView textView1;
    private static int time_out = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        imageView1 = findViewById(R.id.imageView1);
        progressBar1 = findViewById(R.id.progressBar1);
        textView1=findViewById(R.id.textView1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        }, time_out);
    }
}



