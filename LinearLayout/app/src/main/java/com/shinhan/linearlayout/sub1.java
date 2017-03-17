package com.shinhan.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sub1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
    }
    public void onButtonClicked(View view){
        ImageView imageView1 = (ImageView)findViewById(R.id.imageview1);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageview2);
        Button button = (Button)view;
        if(button.getId() == R.id.button1){
            imageView1.setBackgroundResource(R.drawable.pound_coin);
            imageView2.setImageResource(R.drawable.dollor_bill);
            //imageView2.setImageResource(R.drawable.dollor_bill);
        }else{
            imageView1.setBackgroundResource(R.drawable.krw_bill);
            imageView2.setBackgroundResource(R.drawable.pound_coin);
        }
    }
}
