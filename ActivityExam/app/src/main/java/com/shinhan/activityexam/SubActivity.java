package com.shinhan.activityexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intentGetText = getIntent();
        String getString = intentGetText.getStringExtra("sendValue");

        EditText eidtText = (EditText)findViewById(R.id.editTextSub);
        eidtText.setText(getString);

        //Toast.makeText(SubActivity.this, getString, Toast.LENGTH_SHORT).show();

        //TextView textView = (TextView)findViewById(R.id.editTextSub);
        //textView.setText(getString);
    }

    public void onButtonCloseClicked(View view){
        Intent sendValue = new Intent();
        EditText editText = (EditText)findViewById(R.id.editTextSub);
        String result = editText.getText().toString();
        sendValue.putExtra("Result", result);
        setResult(RESULT_OK, sendValue);
        finish();
    }

}
