package com.example.koliva.gammatheta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;


public class GammaThetaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamma_theta);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gamma_theta, menu);
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

    public void buttonOnClick(View v){
        Button btn = (Button) v;
        switch (btn.getId()) {
            case R.id.buttonAbout:
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                break;
            case R.id.buttonBrothers:
                startActivity(new Intent(getApplicationContext(), BrothersActivity.class));
                break;
            case R.id.buttonEvents:
                startActivity(new Intent(getApplicationContext(), EventsActivity.class));
                break;
            case R.id.buttonContact:
                startActivity(new Intent(getApplicationContext(), ContactActivity.class));
                break;
            default: break;
        }
    }
}
