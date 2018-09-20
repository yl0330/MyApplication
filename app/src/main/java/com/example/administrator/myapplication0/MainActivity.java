package com.example.administrator.myapplication0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        EditText input = (EditText) findViewById(R.id.editText);
        String str = input.getText().toString();
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Hello "+ str);
    }
}
