package com.example.conditionvariabledemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        startActivity(new Intent(MainActivity.this,MainActivity2.class));

        for(int threadnum =0; threadnum<6;threadnum++){
            createNewThread(threadnum);
        }
    }

    private void createNewThread(int threadNum){
        new Thread(){
            @Override
            public void run() {
                super.run();

                synchronized (MainActivity.this){
                    for(int count = 0; count<2000; count++){
                        Log.e("MainAcivity","threadNum = " + threadNum+"  mIndex = " + ++Constan.mIndex);
                    }
                    if(threadNum == 2){
                        startActivity(new Intent(MainActivity.this,MainActivity2.class));
                        MainActivity mainActivity=null;
                        mainActivity.onCreate(null);
                    }

                }


            }
        }.start();
    }
}