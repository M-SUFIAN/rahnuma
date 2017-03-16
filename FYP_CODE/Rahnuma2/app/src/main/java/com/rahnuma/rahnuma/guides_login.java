package com.rahnuma.rahnuma;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;



public class guides_login extends Activity {

EditText ET_NAME,ET_PASS;
    String login_name,login_pass;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guides_login);

        ET_NAME=(EditText) findViewById(R.id.G_Login_UN_ET);
        ET_PASS=(EditText) findViewById(R.id.G_login_pass_ET);
    }
    public void user_login(View view)
    {
        login_name=ET_NAME.getText().toString();
        login_pass=ET_PASS.getText().toString();
        String method="login";
        BackgroundTask backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,login_name,login_pass);
    }
    public void login_to_signup(View view) {
        Intent intent = new Intent(guides_login.this, guides_main.class);
        startActivity(intent);
    }


}
