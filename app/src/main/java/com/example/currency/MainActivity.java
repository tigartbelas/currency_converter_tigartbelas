package com.example.currency;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    void convertUsdToIdr()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  idr=(EditText) findViewById(R.id.idr);
        idr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*14.223;
        idr.setText(String.valueOf(result));

    }

    void convertIdrToUsd()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  idr=(EditText) findViewById(R.id.idr);
        idr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(idr.getText().toString());
        double result=a/14.223;
        usd.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertUsdToIdr();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);

        EditText usd= (EditText) findViewById(R.id.usd);
        EditText idr=(EditText) findViewById(R.id.idr);

        usd.setText("");
        idr.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertIdrToUsd();
    }

}