package sg.edu.rp.c346.id20018621.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnRevealQ1;
    Button btnRevealQ2;
    TextView tvQ1;
    TextView tvQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling step 2
        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);

        //Event handling step 3
        btnRevealQ1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent( MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question1", "Q1");
                startActivity(intent);
            }
        });

        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        btnRevealQ2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent( MainActivity.this, AnswerActivity2.class);
                intent.putExtra("Question2", "Q2");
                startActivity(intent);
            }
        });
    }
}