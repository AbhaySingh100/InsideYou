package com.insideyouapp.insideyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText username,email,pass,cpass;
    String mname,memail,mpass,mcpass,emailpattern;
    Button button;

    //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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = findViewById(R.id.name);
        email = findViewById(R.id.mail);
        pass = findViewById(R.id.password);
        cpass = findViewById(R.id.cpassword);
        button = findViewById(R.id.btnsignup);

        mname = username.getText().toString().trim();
        memail = email.getText().toString().trim();
        mpass = pass.getText().toString().trim();
        mcpass = cpass.getText().toString().trim();








        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailpattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if(mname.isEmpty()){ Toast.makeText(getApplicationContext(),"Enter Name",Toast.LENGTH_SHORT).show(); }
                if(memail.isEmpty()){ Toast.makeText(getApplicationContext(),"Enter Email",Toast.LENGTH_SHORT).show(); }
                if(mpass.isEmpty()){ Toast.makeText(getApplicationContext(),"Enter Password",Toast.LENGTH_SHORT).show(); }
                if(mcpass.isEmpty()){ Toast.makeText(getApplicationContext(),"Enter Password to confirm",Toast.LENGTH_SHORT).show(); }
                if(!mpass.matches(emailpattern)){ Toast.makeText(getApplicationContext(),"Email is invalid",Toast.LENGTH_SHORT).show(); }
                if(!mcpass.matches(emailpattern)){ Toast.makeText(getApplicationContext(),"Email is invalid",Toast.LENGTH_SHORT).show(); }
                if(!mcpass.matches(mpass)){ Toast.makeText(getApplicationContext(),"Password is not matching",Toast.LENGTH_SHORT).show(); }

                //I will add code after getting API

            }
        });

    }
}