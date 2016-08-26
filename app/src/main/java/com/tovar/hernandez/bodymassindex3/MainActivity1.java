package com.tovar.hernandez.bodymassindex3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void onAddClick(View a) {
        if (a.getId()== R.id.buttoncalcular)
        {
            EditText a1 = (EditText)findViewById(R.id.TFnumber1);
            EditText a2 = (EditText)findViewById(R.id.TFnumber2);

            double num1,num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double ans = num1 / (num2*num2);

            TextView t = (TextView)findViewById(R.id.tvresult);
            t.setText(""+ans);

        }
    }


}
