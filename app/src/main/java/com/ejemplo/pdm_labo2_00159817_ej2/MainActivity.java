package com.ejemplo.pdm_labo2_00159817_ej2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;
    ArrayList <Integer> lister = new ArrayList<Integer>();
    ArrayList <Integer> listeg = new ArrayList<Integer>();
    ArrayList <Integer> listeb = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        Log.i("id",viewId + "");
        switch (viewId){
            case R.id.btn1:
                agregarR();
                btn1.setBackgroundColor(getResources().getColor(lister.get((int)(Math.random()*6))));
                break;
            case R.id.btn2:
                agregarG();
                btn2.setBackgroundColor(getResources().getColor(listeg.get((int)(Math.random()*6))));
                break;
            case R.id.btn3:
                agregarB();
                btn3.setBackgroundColor(getResources().getColor(listeb.get((int)(Math.random()*6))));
                break;
        }
    }

    public void agregarR(){
        lister.add(R.color.red);
        lister.add(R.color.red1);
        lister.add(R.color.red2);
        lister.add(R.color.red3);
        lister.add(R.color.red4);
        lister.add(R.color.red5);
    }
    public void agregarG(){
        listeg.add(R.color.green);
        listeg.add(R.color.green1);
        listeg.add(R.color.green2);
        listeg.add(R.color.green3);
        listeg.add(R.color.green4);
        listeg.add(R.color.green5);
    }
    public void agregarB(){
        listeb.add(R.color.blue);
        listeb.add(R.color.blue1);
        listeb.add(R.color.blue2);
        listeb.add(R.color.blue3);
        listeb.add(R.color.blue4);
        listeb.add(R.color.blue5);
    }
}
