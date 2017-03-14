package com.example.box.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {

        // Do something in response to button
        TextView chatwindow = (TextView)findViewById(R.id.textView);

        EditText text = (EditText)findViewById(R.id.editText);
        if(text.getText() != null){
            String message = text.getText().toString();
            chatwindow.setText(chatwindow.getText() + System.getProperty("line.separator") + message);
            text.setText("");
            InputMethodManager manager = (InputMethodManager)this.getSystemService(Activity.INPUT_METHOD_SERVICE);
            manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

    }

}
