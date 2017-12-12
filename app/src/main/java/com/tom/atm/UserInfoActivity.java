package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    private EditText edname;
    private EditText edphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        edname = (EditText) findViewById(R.id.name);
        edphone = (EditText) findViewById(R.id.phone);
        String name =  getSharedPreferences("info" , MODE_PRIVATE)
                .getString("Name" , "");
        String phone = getSharedPreferences("info" , MODE_PRIVATE)
                .getString("Number" , "");
        edname.setText(name);
        edphone.setText(phone);
    }
    public void confirm(View view){

        String name = edname.getText().toString();
        String phone = edphone.getText().toString();
        getIntent().putExtra("nick name" , name);
        getIntent().putExtra("phonenumber" , phone);
        setResult(RESULT_OK , getIntent());
        finish();
    }





}
