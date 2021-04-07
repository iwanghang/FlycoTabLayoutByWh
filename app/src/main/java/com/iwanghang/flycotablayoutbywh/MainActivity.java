package com.iwanghang.flycotablayoutbywh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void v1click(View view) {
        Intent intent = new Intent(view.getContext(), MainActivityV1.class);
        startActivity(intent);
    }

    public void v2click(View view) {
        Intent intent = new Intent(view.getContext(), MainActivityV2.class);
        startActivity(intent);
    }

}