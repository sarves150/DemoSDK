package com.sku.demolib;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by vikalp on 5/11/2017.
 */
public class LoginPage extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_page);

        final EditText loginEdit = (EditText) findViewById(R.id.loginEdit);

        Button loginBtn = (Button)  findViewById(R.id.loginBtn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(LoginPage.this,loginEdit.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
