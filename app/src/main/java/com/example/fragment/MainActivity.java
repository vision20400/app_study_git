package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private AFragment fragmentA;
    private BFragment fragmentB;
    private CFragment fragmentC;
    private DFragment fragmentD;
    private FragmentTransaction transaction;
    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_homemenu:
                        setFrag(0);
                        break;
                    case R.id.action_noticboard:
                        setFrag(1);
                        break;
                    case R.id.action_timeline:
                        setFrag(2);
                        break;
                    case R.id.action_info:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        fragmentA = new AFragment();
        fragmentB = new BFragment();
        fragmentC = new CFragment();
        fragmentD = new DFragment();

        setFrag(0); //첫 화면 설정
    }

    private void setFrag(int n){
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();

        switch(n){
            case 0:
                transaction.replace(R.id.main_frame, fragmentA);
                transaction.commit();
                break;
            case 1:
                transaction.replace(R.id.main_frame, fragmentB);
                transaction.commit();
                break;
            case 2:
                transaction.replace(R.id.main_frame, fragmentC);
                transaction.commit();
                break;
            case 3:
                transaction.replace(R.id.main_frame, fragmentD);
                transaction.commit();
                break;
        }
    }

}
