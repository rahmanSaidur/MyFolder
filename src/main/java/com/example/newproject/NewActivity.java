package com.example.newproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity implements View.OnClickListener {
    private Button SearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        SearchButton=findViewById(R.id.Search_Id);
        SearchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.Search_Id:
            Intent intent=new Intent(getApplicationContext(),MapActivity.class);
            startActivity(intent);
            break;
    }
    }
}
