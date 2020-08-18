package com.example.loginuiapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView, textView2;
    Fragment fragment,fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         fragment = new LoginFragment();
         fragment2 = new RegisterFragment();
//
        final FragmentManager fm = getSupportFragmentManager();
        final FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment, fragment);
        ft.commit();
        textView = findViewById(R.id.text);
        textView2 =(TextView) findViewById(R.id.text2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().remove(fragment2)
                        .replace(R.id.fragment,fragment)
                        .addToBackStack(null)
                        .commit();
//                textView2.setBackgroundResource(R.color.colorGrey);
//                textView.setBackgroundResource(R.color.colorWhite);
//                textView.setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().remove(fragment)
                        .replace(R.id.fragment,fragment2)
                        .addToBackStack(null)
                        .commit();
//                textView2.setBackgroundResource(R.color.colorWhite);
//                textView2.setTextColor(getResources().getColor(R.color.colorPrimary));
//                textView.setBackgroundResource(R.color.colorGrey);
            }
        });

    }



}