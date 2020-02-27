package com.example.newproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
private TextView SignInTexView;
private Button SignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        SignInTexView=findViewById(R.id.sign_InTextViewId);
        SignUpButton=findViewById(R.id.signupBtnId);
        SignInTexView.setOnClickListener(this);
        SignUpButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.signupBtnId:
            Intent intent1=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent1);
            break;

        case R.id.sign_InTextViewId:
            Intent intent= new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            break;
    }
    }
}
