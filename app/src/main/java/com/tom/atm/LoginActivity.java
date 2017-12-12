package com.tom.atm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText edUserid;
    private EditText edpasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUserid = (EditText) findViewById(R.id.userid);
        edpasswd = (EditText) findViewById(R.id.passwd);
        String userid = getSharedPreferences("atm" , MODE_PRIVATE)
                .getString("USERID","");
        edUserid.setText(userid);
    }

    public void login(View view) {

        String userid = edUserid.getText().toString();
        String passwd = edpasswd.getText().toString();
        if("jack".equals(userid) && "1234".equals(passwd)){
            Toast.makeText(this,"登入成功",Toast.LENGTH_SHORT).show();
            getIntent().putExtra("LOGIN_USERID",userid);
            getIntent().putExtra("LOGIN_PASSWD",passwd);
            setResult(RESULT_OK,getIntent());
            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("登入")
                    .setMessage("登入失敗")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }
    public void cancel(View view){



    }

}
