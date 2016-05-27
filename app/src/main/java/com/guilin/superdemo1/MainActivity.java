package com.guilin.superdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private long listTime;

    @Override
    public void onBackPressed() {
        long ct=System.currentTimeMillis();
        if (ct-listTime>2000)
        {
            Toast.makeText(this, "再次点击后退退出", Toast.LENGTH_SHORT).show();
            listTime=ct;
        }else {
            super.onBackPressed();
        }
    }
}
