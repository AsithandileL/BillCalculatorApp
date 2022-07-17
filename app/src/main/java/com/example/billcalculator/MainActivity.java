package com.example.billcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Find;
    public TextView savingV, originalV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Find = (Button) findViewById(R.id.Btn1);


        Find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result();
            }
        });

    }

    public void result(){

        EditText numLights = (EditText) findViewById(R.id.Edit1);
        EditText lightHrs = (EditText) findViewById(R.id.Edit2);
        EditText numConditioners = (EditText) findViewById(R.id.Edit3);
        EditText ConditionersHrs = (EditText) findViewById(R.id.Edit4);

        savingV = findViewById(R.id.Stext1);
        originalV = findViewById(R.id.Stext2);

        int numLts = Integer.parseInt(numLights.getText().toString());

        int LtsHrs = Integer.parseInt(lightHrs.getText().toString());

        int numCon = Integer.parseInt(numConditioners.getText().toString());

        int ConsHrs = Integer.parseInt(ConditionersHrs.getText().toString());

        double saving = (numLts*LtsHrs*0.1*250)+(numLts*30)+(numCon*ConsHrs*1*250)+(numCon*2000);
        double original = (numLts*LtsHrs*0.5*250)+(numLts*10)+(numCon*ConsHrs*1.2*250)+(numCon*1500);

        savingV.setText("The energy saving option will cost: R"+(int) saving);
        originalV.setText("The original option will cost: R"+(int) original);

    }

}