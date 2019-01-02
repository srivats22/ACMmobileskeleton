package com.example.android.acmmobile;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Projects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        Intent intent = getIntent();
    }

    public void signup(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(
                "https://docs.google.com/forms/d/1mVgIwUTGt0YKCCtGA6BvOiQzMyMgR-dkt8ZvNL4CY14/viewform?edit_requested=true"));
        startActivity(intent);
    }

    public void Android(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(
                "https://docs.google.com/forms/d/1mVgIwUTGt0YKCCtGA6BvOiQzMyMgR-dkt8ZvNL4CY14/viewform?edit_requested=true"));
        startActivity(intent);
    }
}
