package com.example.koliva.gammatheta;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class ContactActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contact, menu);
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

    public void imageOnClick(View v){
        ImageView img = (ImageView) v;
        Uri resource;
        Intent appIntent;
        switch (img.getId()) {
            case R.id.fb:
                //TODO: if app exists, open app, else:
                resource = Uri.parse("http://www.facebook.com/gammatheta.chapter/");
                appIntent = new Intent(Intent.ACTION_VIEW, resource);
                startActivity(appIntent);
                break;
            case R.id.ig:
                resource = Uri.parse("http://www.instagram.com/gtlambdas/");
                appIntent = new Intent(Intent.ACTION_VIEW, resource);
                startActivity(appIntent);
                break;
            case R.id.twit:
                resource = Uri.parse("http://www.twitter.com/GT_Lambda");
                appIntent = new Intent(Intent.ACTION_VIEW, resource);
                startActivity(appIntent);
                break;
            case R.id.snap:
                resource = Uri.parse("http://www.snapchat.com");
                appIntent = new Intent(Intent.ACTION_VIEW, resource);
                startActivity(appIntent);
                break;
            case R.id.envelope:
                appIntent = new Intent(Intent.ACTION_SEND);
                appIntent.setType("message/rfc822");
                appIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"gtlambdas@gmail.com"});
                appIntent.putExtra(Intent.EXTRA_SUBJECT, "Interest in Lambda Theta Phi");
                try {
                    startActivity(Intent.createChooser(appIntent, "Send email with:"));
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(ContactActivity.this, "Please set up an email client.",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            default: break;
        }
    }
}
