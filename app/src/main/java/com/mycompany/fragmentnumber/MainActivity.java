package com.mycompany.fragmentnumber;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager;//create an instance of fragment manager
        manager = getSupportFragmentManager();

        android.support.v4.app.FragmentTransaction transaction=manager.beginTransaction();
        transaction.commit();

    }
}
