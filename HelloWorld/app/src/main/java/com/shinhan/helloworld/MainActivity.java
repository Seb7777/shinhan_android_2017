package com.shinhan.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        TextView textView = (TextView)findViewById(R.id.textview);
        textView.setText("Good Bye");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onButton2Clicked(View view){
        Button button = (Button)view;
        Toast.makeText(MainActivity.this, "Button Clicked2", Toast.LENGTH_SHORT).show();
    }

    public void onButton3Clicked(View view){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01091760915"));
        startActivity(myIntent);
    }

    public void onButton4Clicked(View view){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.shinhan.com"));
        startActivity(myIntent);
    }

}
