package com.example.conditionvariabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        for(int threadnum =6; threadnum<11;threadnum++){
            createNewThread(threadnum);
        }
    }

    private void createNewThread(int threadNum){
        new Thread(){
            @Override
            public void run() {
                super.run();

                synchronized (MainActivity2.this){
                    for(int count = 0; count<2000; count++){
                        Log.e("MainAcivity2","threadNum = " + threadNum+"  mIndex = " + ++Constan.mIndex);
                    }
                }
            }
        }.start();
    }
}