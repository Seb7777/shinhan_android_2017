package com.shinhan.activityexam;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonNextPageClicked(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        String myString = editText.getText().toString();
        Intent myIntent = new Intent(MainActivity.this, SubActivity.class);
        myIntent.putExtra("sendValue", myString);
        startActivityForResult(myIntent, 0);
        //startActivity(myIntent);   
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == 0){ //서브액티비티 종료
            if(resultCode == RESULT_OK){ //종료값 정상종료
                String result = data.getStringExtra("Result");
                EditText editText = (EditText)findViewById(R.id.editText);
                editText.setText(result);

                TextView textView = (TextView)findViewById(R.id.showText);
                textView.setText(result);
            }
        }
    }
}
