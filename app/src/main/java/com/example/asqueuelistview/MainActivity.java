package com.example.asqueuelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    /*
    ListView one;
    String elements[] = {"Bro", "moment", "AHHHHHHHHH"}; */

    ListView listViewAdapter;
    Queue queue = new Queue();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        queue.enqueue("Sofia");
        queue.enqueue("Yo");

        String[] queueArray = new String[queue.getSize()];

//        for (int i = 0; i < queue.getSize(); i++)
//        {
//
//        }

//        listViewAdapter = findViewById(R.id.listview);
//        ArrayAdapter<String> array = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);


        /*
        one = findViewById(R.id.listview);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, elements);
        one.setAdapter(arr); */


    }
}