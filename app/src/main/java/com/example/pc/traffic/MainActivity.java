package com.example.pc.traffic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }       //main metod
    public void clickAboutMe (View view) {
        Intent objTntent = new Intent(Intent.ACTION_VIEW);
        objTntent.setData(Uri.parse("http://www.csclub.ssru.ac.th/s56122201055"));
        startActivity(objTntent);
    }       //Click
}