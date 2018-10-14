package com.works.derrickchung.asteriatedgrail;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "helloWorld";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = this.<EditText>findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
