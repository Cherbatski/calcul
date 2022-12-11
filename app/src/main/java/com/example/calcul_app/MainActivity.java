package com.example.calcul_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Script;

import java.io.Reader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
 TextView textView,ResultView,temTextView;
 String tem="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        textView=findViewById(R.id.textview);
        ResultView=findViewById(R.id.resultview);

    }
    public void  SetTem( String v){
        tem=tem+v;
        textView.setText(tem);

    }
    public void equalOnclick(View v)
    {
            Double result=null;
        ScriptEngine engine=new ScriptEngineManager().getEngineByName("rhino");

        try{
          result=(Double) engine.eval(tem);
        }catch(ScriptException e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
     if(result!=null)
     {
         ResultView.setText(String.valueOf(result.doubleValue()));
     }



    }
    public void clearOnclick(View v)
    {
        SetTem("");
        tem="";
        textView.setText("");
        ResultView.setText("");
    }
    public void bracketsOnclick(View v)
    {

    }

    public void powerOnclick(View v)
    {

    }
    public void divideOnclick(View v)
    {
      SetTem("/");
    }
    public void oneOnclick(View v){
        SetTem("1");
    }
    public void twoOnclick(View v){
        SetTem("2");
    }
    public void threeOnclick(View v){
        SetTem("3");
    }
    public void fourOnclick(View v){
        SetTem("4");
    }
    public void fiveOnclick(View v){
        SetTem("5");
    }
    public void sixOnclick(View v){
        SetTem("6");
    }
    public void sevenOnclick(View v){

        SetTem("7");
    }
    public void eightOnClick(View v){

        SetTem("8");
    }
    public void nineOnclick(View v){
        SetTem("9");
    }
    public void plusOnclick(View v){
        SetTem("+");
    }
    public void minusOnclick(View v){
        SetTem("-");
    }
    public void timesOnclick(View v){
        SetTem("*");
    }

    public void zeroOnclick(View v){
        SetTem("0");
    }
    public void pointOnclick(View v){
        SetTem(".");
    }

}