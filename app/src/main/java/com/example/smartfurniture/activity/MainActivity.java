package com.example.smartfurniture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.smartfurniture.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//隐藏状态栏
        getSupportActionBar().hide();//隐藏标题栏
        setContentView(R.layout.activity_main);
    }

    public void testWifiConfig(View view) {
        try {
            Intent intent = new Intent(MainActivity.this , WifiConnectActivity.class);
            startActivity(intent);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
