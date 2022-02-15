package com.example.conditionvariabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static int mIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int threadnum =0; threadnum<4;threadnum++){
            createNewThread(threadnum);
        }
    }

    private void createNewThread(int threadNum){
        new Thread(){
            @Override
            public void run() {
                super.run();

                for(int count=0; count<50;count++){
                    Log.e(MainActivity.this.getClass().getSimpleName(),"threadNum = " + threadNum+"  mIndex = " + ++Constan.mIndex);
                }
            }
        }.start();
    }
}