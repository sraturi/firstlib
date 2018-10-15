package com.example.mfirstlib;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

/**
 * Created by Sachin on 2018-10-14.
 */

public class MathLib extends AppCompatActivity {
    private Context context;
    public MathLib (Context context){
        this.context = context;
    }
    public static int getRandom(){
        return new Random().nextInt();
    }
    public void getActivity(){
        Intent intent = new Intent(context,MainActivity.class);
        startActivity(intent);
    }
}
