package com.example.alaraozbir.seg2505_lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private enum op {none, add, minus, multiply, divide, equals}
    private boolean hasDot=false;
    private boolean needsCleaning=false;
    private op opp = op.none;
    private double data01=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn01Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "1");
    }
    public void btn02Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "2");
    }
    public void btn03Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "3");
    }
    public void btn04Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "4");
    }
    public void btn05Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "5");
    }
    public void btn06Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "6");
    }
    public void btn07Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "7");
    }
    public void btn08Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "8");
    }
    public void btn09Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "9");
    }
    public void btn00Click(View view){
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ "0");
    }
    public void btnDotClick(View view){
        if (hasDot==true){return;}
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+ ".");
        hasDot=true;
    }
    public void btnAddClick(View view){
        opp=op.add;
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        data01 = Double.parseDouble(editText.getText().toString());
        editText.setText("");
    }
    public void btnMinusClick(View view){
        opp= op.minus;
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        data01=  Double.parseDouble(editText.getText().toString());
        editText.setText("");
    }
    public void btnMultiplyClick(View view){
        opp = op.multiply;
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        data01= Double.parseDouble(editText.getText().toString());
        editText.setText("");
    }
    public void btnDivideClick(View view){
        opp = op.divide;
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        data01= Double.parseDouble(editText.getText().toString());
        editText.setText("");
    }
    public void btnClearClick(View view){
        opp = op.none;
        EditText editText= (EditText) findViewById(R.id.resultEdit);
        data01= 0;
        hasDot=false;
        editText.setText("");
    }
    public void btnResultClick(View view) {
        if (opp != op.none) {
            EditText resultTextView = (EditText) findViewById(R.id.resultEdit);
            double data02 = Double.parseDouble(resultTextView.getText().toString());
            double result = 0;
            switch (opp) {
                case add:
                    result = data01 + data02;
                    break;
                case minus:
                    result = data01 - data02;
                    break;
                case multiply:
                    result = data01 * data02;
                    break;
                case divide:
                    result = data01 / data02;
                    break;
                default:
//Nothing is done (edge case)
                    break;
            }
            if ((result - (int)result) != 0) {
                resultTextView.setText(String.valueOf(result));
                hasDot = true;
            } else {
                resultTextView.setText(String.valueOf((int)result));
                hasDot = false;
            }
        }
    }
}
