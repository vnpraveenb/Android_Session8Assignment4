package com.praveen.session8assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AndroidOSInfo> androidOSInfoList;
    AndroidOSInfoObjectAdapter androidOSInfoObjectAdapter;
    GridView androidOSInfoGridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidOSInfoGridView = findViewById(R.id.androidOSInfoGridView);

        androidOSInfoList = new ArrayList<AndroidOSInfo>();
        androidOSInfoList.add(new AndroidOSInfo(R.drawable.gingerbread, "GingerBread"));
        androidOSInfoList.add(new AndroidOSInfo(R.drawable.honeycomb, "HoneyComb"));
        androidOSInfoList.add(new AndroidOSInfo(R.drawable.icecreamsandwich,"IceCreamSandwich"));
        androidOSInfoList.add(new AndroidOSInfo(R.drawable.jellybean, "JellyBean"));
        androidOSInfoList.add(new AndroidOSInfo(R.drawable.kitkat, "KitKat"));
        androidOSInfoList.add(new AndroidOSInfo(R.drawable.lollipop, "Lollipop"));

        androidOSInfoObjectAdapter = new AndroidOSInfoObjectAdapter(getApplicationContext(), androidOSInfoList);

        androidOSInfoGridView.setAdapter(androidOSInfoObjectAdapter);

        androidOSInfoGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You clicked on : " +androidOSInfoList.get(position).getAndroidOSName() + " OS Image",Toast.LENGTH_LONG).show();
            }
        });


    }
}
