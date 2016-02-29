package com.scurrae.chris.hello_world;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button c1 = (Button)findViewById(R.id.button);
        Button c2 = (Button)findViewById(R.id.button2);
        Button c3 = (Button)findViewById(R.id.button3);
        final TextView t1 = (TextView)findViewById(R.id.textView3);

        c1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                t1.setText(R.string.answer1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                t1.setText(R.string.answer2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                t1.setText(R.string.answer3);
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
