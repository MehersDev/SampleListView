package com.mehersdev.samplelistview;

/**
 * Created by Meher's Dev on 24-09-2015.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String a="One";
    String b="Two";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       //Bundle extra = getIntent().getExtras();
        Intent intent =getIntent();
        String ab=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tx= (TextView) findViewById(R.id.textview1);
        if (a.equals(ab)){
            tx.setText("This is First Item on the List");
        }else if (b.equals(ab))
        {
            tx.setText("This is Second Item on the List");
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
