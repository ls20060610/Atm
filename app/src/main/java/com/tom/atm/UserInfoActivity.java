package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void confirm(View view){
        EditText edname = (EditText) findViewById(R.id.name);
        EditText edphone = (EditText) findViewById(R.id.phone);
        String name = edname.getText().toString();
        String phone = edphone.getText().toString();
        getIntent().putExtra("nick name" , name);
        getIntent().putExtra("phonenumber" , phone);
        setResult(RESULT_OK , getIntent());
        finish();
    }





}
