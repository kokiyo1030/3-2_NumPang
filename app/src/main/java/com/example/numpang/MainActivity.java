package com.example.numpang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mOnClick(View view) {
        switch (view.getId()) {
            case R.id.btnOthers:
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.example.mygames");
                startActivity(intent);
                break;
            case R.id.btnStart:
                break;
            case R.id.btnPause:
                break;
        }
    }
}