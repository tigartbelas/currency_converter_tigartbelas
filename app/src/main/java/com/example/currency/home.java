package com.example.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class home extends AppCompatActivity {
    float b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    void convertThbtoIdr(){
        EditText thb=findViewById(R.id.edithb);
        thb.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText idr=findViewById(R.id.editidr);
        idr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double b=Integer.parseInt(thb.getText().toString());
        double result=b*455;
        idr.setText(String.valueOf(result));
    }

    void convertIdrtoThb(){
        EditText thb=findViewById(R.id.edithb);
        thb.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText idr=findViewById(R.id.editidr);
        idr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double b=Integer.parseInt(idr.getText().toString());
        double result=b/455;
        thb.setText(String.valueOf(result));
    }


    public void klik1(View view) {
        convertThbtoIdr();
        Button bb1 = findViewById(R.id.tombol1);
        bb1.setEnabled(false);
    }


    public void klik2(View view) {
        convertIdrtoThb();
        Button bb2 = findViewById(R.id.tombol2);
        bb2.setEnabled(false);
    }


    public void klikreset(View view) {
        Button bb1 = findViewById(R.id.tombol1);
        bb1.setEnabled(true);
        Button bb2 = findViewById(R.id.tombol2);
        bb2.setEnabled(true);

        EditText thb = findViewById(R.id.edithb);
        EditText idr = findViewById(R.id.editidr);

        thb.setText("");
        idr.setText("");
    }
}
