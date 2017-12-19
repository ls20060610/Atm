package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {

    private static final String TAG = UserInfoActivity.class.getSimpleName();
    private EditText edname;
    private EditText edphone;
    private Spinner ages;

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

        ages = (Spinner) findViewById(R.id.ages);
        ArrayList<String> data = new ArrayList<>();
    //    for(int i = 15 ; i<=40 ; i++){
    //        data.add(i+"");
     //   }
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this , R.array.ages, android.R.layout.simple_list_item_1);
                ages.setAdapter(adapter);
    }
    public void confirm(View view){
        Log.d(TAG,"ok" + ages.getSelectedItem().toString());
        int age = Integer.parseInt(ages.getSelectedItem().toString());
        String name = edname.getText().toString();
        String phone = edphone.getText().toString();
        getIntent().putExtra("nick name" , name);
        getIntent().putExtra("phonenumber" , phone);
        setResult(RESULT_OK , getIntent());
        finish();
    }





}
