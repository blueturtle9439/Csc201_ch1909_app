package com.example.eunhan.csc201_ch1909_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText input1;
    EditText input2;
    EditText input3;
    Button sortbtn;
    TextView b4;
    TextView after;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=(EditText)findViewById(R.id.input1);
        input2=(EditText)findViewById(R.id.input2);
        input3=(EditText)findViewById(R.id.input3);
        sortbtn=(Button)findViewById(R.id.sortbtn);
        b4=(TextView)findViewById(R.id.b4);
        after=(TextView)findViewById(R.id.after);
        sortbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(input1.getText().toString());
        int b = Integer.parseInt(input2.getText().toString());
        int c = Integer.parseInt(input3.getText().toString());


        ArrayList<Integer> List = getArratList(a, b, c);
        b4.setText("before sort: " + List);
        MainActivity.sort(List);
        after.setText("after sort: " + List);

    }

    public static ArrayList<Integer> getArratList(int a, int b, int c) {
        Integer[] temparray = {new Integer(a), new Integer(b), new Integer(c)};
        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(temparray));
        return List;
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);}
}
