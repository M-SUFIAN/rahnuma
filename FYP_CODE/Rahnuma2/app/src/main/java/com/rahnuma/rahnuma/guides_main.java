package com.rahnuma.rahnuma;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class guides_main extends Activity {

    EditText ET_NAME, ET_USER_NAME, ET_PASS;
    String name, user_name, user_pass;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guides_main);
        ET_NAME = (EditText) findViewById(R.id.G_name_ET);
        ET_USER_NAME = (EditText) findViewById(R.id.G_user_name_ET);
        ET_PASS = (EditText) findViewById(R.id.G_pass_ET);

    }

    public void user_reg(View view) {
        name = ET_NAME.getText().toString();
        user_name = ET_USER_NAME.getText().toString();
        user_pass = ET_PASS.getText().toString();
        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, name, user_name, user_pass);
    }

    public void user_login(View view) {
        Intent intent = new Intent(guides_main.this, guides_login.class);
        startActivity(intent);
    }


}
