package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button euro, pound, dollar, yen, dinar, bitcoin, rubel, ausD, canD;
    TextView ans;
    EditText enterValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans = findViewById(R.id.ans);
        enterValue = findViewById(R.id.enterValue);
    }
    public void euro(View view){
        euro = findViewById(R.id.euro);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y*0.012;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }

    public void dollar(View view){
        dollar = findViewById(R.id.dollar);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y*0.014;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }

    public void pound(View view){
        pound = findViewById(R.id.pound);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y*0.0098;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }

    public void yen(View view){
        yen = findViewById(R.id.yen);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y*1.48;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }

    public void dinar(View view){
        dinar = findViewById(R.id.dinar);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y*0.0041;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }

    public void bitcoin(View view){
        bitcoin = findViewById(R.id.bitcoin);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y/2500000;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }

    public void rubel(View view){
        rubel = findViewById(R.id.rubel);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y*1.02;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }

    public void ausD(View view){
        ausD = findViewById(R.id.ausD);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y*0.018;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }

    public void canD(View view){
        canD = findViewById(R.id.canD);
        String x = enterValue.getText().toString();
        if((TextUtils.isEmpty(x))){
            enterValue.setError("Enter some value");
        }
        else{
            double y = Double.parseDouble(x);
            double z = y*0.017;
            DecimalFormat numberFormat = new DecimalFormat("#0.00");
            ans.setText(numberFormat.format(z));
        }
    }


}