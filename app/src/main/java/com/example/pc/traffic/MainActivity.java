package com.example.pc.traffic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Create listview
        createLostView();


    }       //main metod

    private void createLostView() {
        MyData objMyData = new MyData();
        int[] intIcon = objMyData.icon();
        String[] strTitle = objMyData.titile();

        MyAdapter objMyAdapter  = new MyAdapter(MainActivity.this, intIcon,strTitle);
        ListView myListView = (ListView) findViewById(R.id.listView);
        myListView.setAdapter(objMyAdapter);



    } //createLostView


    public void clickAboutMe (View view) {
        Intent objTntent = new Intent(Intent.ACTION_VIEW);
        objTntent.setData(Uri.parse("http://www.csclub.ssru.ac.th/s56122201055"));
        startActivity(objTntent);
    }       //Click
}