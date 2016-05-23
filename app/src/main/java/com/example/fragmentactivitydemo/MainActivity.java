package com.example.fragmentactivitydemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.button1);
        bt2 = (Button)findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragmentOne = new FragmentOne();
                android.app.FragmentManager fm = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_place, fragmentOne);
                fragmentTransaction.commit();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragmentTwo = new FragmentTwo();
                android.app.FragmentManager fm = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_place, fragmentTwo);
                fragmentTransaction.commit();

            }
        });


    }

}
