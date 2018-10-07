package com.thetutx.notorious.easyearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText email,password;
    Button loginBtn;
    Intent i;
    TextView signuptxt;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=(EditText) findViewById(R.id.loginemail);
        password=(EditText) findViewById(R.id.loginpassword);

        loginBtn=(Button) findViewById(R.id.loginbtn);

        signuptxt=(TextView) findViewById(R.id.signuptxt);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }


}
