package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE_KEY = "MESSAGE_KEY";

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate end");
    }

    public void sendMessage(View view) {
        //system.out.println("En sendMessage");
        Log.i(TAG, "Dentro de sendMessage");

        EditText editText = findViewById(R.id.editText);

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(MESSAGE_KEY, editText.getText().toString());
        startActivity(intent);
    }
}