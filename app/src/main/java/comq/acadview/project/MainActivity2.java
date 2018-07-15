package comq.acadview.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1;
    EditText editText;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1 = findViewById(R.id.textView1);
        editText = findViewById(R.id.editText);
        submit = findViewById(R.id.submit);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.getText().toString();
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                String str = editText.getText().toString();
                intent.putExtra("Name",str);
                startActivity(intent);
                MainActivity2.this.finish();
            }
        });
    }
}
