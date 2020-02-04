package com.rp.adapterlectureone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView objectListView;
    private String [] myData= {"RYK","Lahore","Faisalabad","Mutan","Liaqatpur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialvariable();
        creatingadapter();

    }
    private void creatingadapter()
    {
        ArrayAdapter<String> objectarrayadapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,myData );
                objectListView.setAdapter(objectarrayadapter);

        objectListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {

                Toast.makeText(MainActivity.this, arg2, Toast.LENGTH_SHORT).show();
                //Intent intent=new Intent(MainActivity.this, Information.class);
                //startActivity(intent);
                finish();
            }

        }




        );
    }

    private void initialvariable()
    {
        objectListView= findViewById(R.id.List_View);
    }

}
