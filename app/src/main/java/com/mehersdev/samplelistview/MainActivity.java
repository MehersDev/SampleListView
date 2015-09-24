package com.mehersdev.samplelistview;

/**
 * Created by Meher's Dev on 24-09-2015.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView ls;
    String[] list;
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls=(ListView)findViewById(R.id.listView);
        list= getResources().getStringArray(R.array.ListNo);
        ArrayAdapter<String> ap = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        ls.setAdapter(ap);
        ls.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o;
                if (position == 0) {
                    Intent in = new Intent(MainActivity.this, SecondActivity.class);
                    in.putExtra(EXTRA_MESSAGE, "One");
                    startActivity(in);

                }
                if (position==1)
                {
                    Intent in = new Intent(MainActivity.this,SecondActivity.class);
                    in.putExtra(EXTRA_MESSAGE,"Two");
                    startActivity(in);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
