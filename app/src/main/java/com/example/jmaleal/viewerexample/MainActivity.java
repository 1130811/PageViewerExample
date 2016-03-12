package com.example.jmaleal.viewerexample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int vec [] = new int [3];
        vec [0] = R.layout.page1 ;
        vec [1] = R.layout.page2 ;
        vec [2] = R.layout.page3 ;
        PageViewerAdapter adapter = new PageViewerAdapter ( MainActivity.this,vec);
        ViewPager pager = (ViewPager) findViewById (R.id.pageviewer);
        pager.setAdapter(adapter);
        pager.setCurrentItem(0) ;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
