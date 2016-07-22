package com.example.pratikratnaparkhi.session4assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=(ListView)findViewById(R.id.listView);

        BaseAdaptorLearn learnadaptor=new BaseAdaptorLearn(MainActivity.this);

        listview.setAdapter(learnadaptor);
    }

    public class listItems{
        String name, phno;
    }
    public List<listItems> getItems(){
        List<listItems> items=new ArrayList<listItems>();
        for(i=0;i<10;i++){
            listItems ob=new listItems();
            ob.name="Name"+i;
            ob.phno="PhoneNumber"+i;
            items.add(ob);
        }
        return items;
    }
}