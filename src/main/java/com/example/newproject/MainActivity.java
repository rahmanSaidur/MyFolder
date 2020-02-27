package com.example.newproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 private EditText EditTextName,passwordEditTextId;
 private Button signIn_Button;
 private TextView signUpTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditTextName=findViewById(R.id.loginEditTextId);
        passwordEditTextId=findViewById(R.id.passEditTextId);
        signUpTextView=findViewById(R.id.sign_UpTextViewId);
        signIn_Button=findViewById(R.id.loginButtontnId);
        signIn_Button.setOnClickListener(this);
        signUpTextView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.loginButtontnId:
             Intent intent1=new Intent(getApplicationContext(),NewActivity.class);
             startActivity(intent1);
             break;
         case R.id.sign_UpTextViewId:
             Intent intent=new Intent(getApplicationContext(),SignUpActivity.class);
             startActivity(intent);
             break;
     }
    }
}
