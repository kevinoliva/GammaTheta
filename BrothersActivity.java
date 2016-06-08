package com.example.koliva.gammatheta;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.Toast;

import java.util.*;


public class BrothersActivity extends ActionBarActivity {

    LinkedHashMap<String, List<String>> brothersHashMap;
    List<String> brothersList;
    ExpandableListView expList;
    DropDownAdapter adapt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brothers);
        expList = (ExpandableListView) findViewById(R.id.brotherList);
        brothersHashMap = DataProvider.getInfo();
        brothersList = new ArrayList<>(brothersHashMap.keySet());
        adapt = new DropDownAdapter(this, brothersHashMap, brothersList);
        expList.setAdapter(adapt);

        expList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            //method to be used by ChildClickListener
            public boolean setViews(String[] arr, String lineName, String hTown, String mjr, int pic) {
                TextView v = (TextView) findViewById(R.id.name);
                String tmp = arr[2];
                if (lineName.equals("")) {
                    for (int i = 3; i < arr.length; i++) {
                        tmp = tmp + " " + arr[i];
                    }
                }
                else {
                    tmp = tmp +" \"" + lineName + "\"\n";
                    for (int i = 3; i < arr.length; i++) {
                        tmp = tmp + " " + arr[i];
                    }
                }
                v.setText(tmp);

                v = (TextView) findViewById(R.id.hometown);
                if (hTown.equals("")) {v.setText("Hometown:");}
                else {v.setText(hTown);}

                v = (TextView) findViewById(R.id.major);
                if (mjr.equals("")) {v.setText("Major:");}
                else{v.setText(mjr);}

                ImageView img = (ImageView) findViewById(R.id.headshot);
                if (pic == 0) {img.setImageResource(R.drawable.anonymous);}
                else {img.setImageResource(pic);}
                return false;
            }
            //TODO: read in data fromm external source
            public boolean onChildClick(ExpandableListView parent, View v, int group, int child, long l) {
                TextView text = (TextView) findViewById(R.id.semester);
                String temp;
                String arr[];
                text.setText(brothersList.get(group));
                text = (TextView) findViewById(R.id.number);
                temp = brothersHashMap.get(brothersList.get(group)).get(child);
                arr = temp.split(" ");
                text.setText(arr[0]);
                if (arr[2].equals("Gilmar") && arr[3].equals("Valencia")) setViews(arr, "OMNI", "Los Angeles, CA", "", R.drawable.al1);
                if (arr[2].equals("Richard") && arr[3].equals("Montez")) setViews(arr, "CLAVO", "San Antonio, TX", "", R.drawable.al3);
                if (arr[2].equals("Santos") && arr[3].equals("Barrientes")) setViews(arr, "UBICANDO", "San Antonio, TX", "", R.drawable.al4);
                if (arr[2].equals("Cesar") && arr[3].equals("Diaz")) setViews(arr, "HULK", "", "", R.drawable.al5);
                if (arr[2].equals("Andres") && arr[3].equals("Chihuahua")) setViews(arr, "CUE", "Los Angeles, CA", "", R.drawable.bl1);
                if (arr[2].equals("Luis") && arr[3].equals("Flores")) setViews(arr, "TANK", "", "", R.drawable.bl2);
                if (arr[2].equals("John") && arr[3].equals("Gutierrez")) setViews(arr, "RAPTOR", "Milwaukee, WI", "", R.drawable.bl3);
                if (arr[2].equals("Andrew") && arr[3].equals("Diaz")) setViews(arr, "QUAKE", "Los Angeles, CA", "", R.drawable.bl4);
                if (arr[2].equals("David") && arr[3].equals("Perez")) setViews(arr, "PELIGROSO", "", "", R.drawable.anonymous);
                if (arr[2].equals("Anthony") && arr[3].equals("Hernandez")) setViews(arr, "ARDOROSO", "Miami, FL", "", R.drawable.gl2);
                if (arr[2].equals("Steve") && arr[3].equals("Pereira")) setViews(arr, "RESISTENTE", "San Antonio, TX", "Counseling Psychology", R.drawable.gl3);
                if (arr[2].equals("Hugo") && arr[3].equals("Vergara")) setViews(arr, "EXORCISTA", "Los Angeles, CA", "", R.drawable.dl2);
                if (arr[2].equals("Bruno") && arr[3].equals("Rodriguez")) setViews(arr, "ASIDUO", "Los Angeles, CA", "", R.drawable.dl3);
                if (arr[2].equals("Jaime") && arr[3].equals("Rogero")) setViews(arr, "FEROZ", "Los Angeles, CA", "", R.drawable.dl4);
                if (arr[2].equals("Klinsmann") && arr[3].equals("Gutierrez")) setViews(arr, "PHENOM", "Los Angeles, CA", "", R.drawable.el1);
                if (arr[2].equals("Eliezer") && arr[3].equals("Campos")) setViews(arr, "PHOENIX", "Milwaukee, WI", "", R.drawable.el2);
                if (arr[2].equals("Johnathan") && arr[3].equals("Martinez")) setViews(arr, "REVERENTE", "Bronx, NY", "Counseling Psychology", R.drawable.el3);
                if (arr[2].equals("Luis") && arr[3].equals("Aldana")) setViews(arr, "VALIENTE", "Los Angeles, CA", "", R.drawable.el4);
                if (arr[2].equals("Andrew") && arr[3].equals("Thomas")) setViews(arr, "REDEMPTION", "Minneapolis, MN", "Theater", R.drawable.el5);
                if (arr[2].equals("Erick") && arr[3].equals("Gutierrez")) setViews(arr, "TORRIDO", "Madison, WI", "", R.drawable.zl1);
                if (arr[2].equals("Joseph") && arr[3].equals("Mendoza")) setViews(arr, "ARDIENTE", "Chicago, IL", "History", R.drawable.zl2);
                if (arr[2].equals("Alexis") && arr[3].equals("Valladares")) setViews(arr, "VIGOROSO", "Los Angeles, CA", "", R.drawable.zl4);
                if (arr[2].equals("Arturo") && arr[3].equals("Diaz")) setViews(arr, "RESILIENCE", "Racine, WI", "", R.drawable.hl1);
                if (arr[2].equals("Carlos") && arr[3].equals("Bustamante")) setViews(arr, "GUERRERO", "Los Angeles, CA", "Kinesiology", R.drawable.hl2);
                if (arr[2].equals("Bryan") && arr[3].equals("Grajeda")) setViews(arr, "THRESHOLD", "Los Angeles, CA", "Economics", R.drawable.hl3);
                if (arr[2].equals("Eduardo") && arr[3].equals("De")) setViews(arr, "AMPLIFY", "Milwaukee, WI", "Economics", R.drawable.tl1);
                if (arr[2].equals("Christian") && arr[3].equals("Hernandez")) setViews(arr, "PRODIGY", "Milwaukee, WI", "", R.drawable.tl2);
                if (arr[2].equals("Ryan") && arr[3].equals("Aranda")) setViews(arr, "DIESEL", "Madison, WI", "", R.drawable.tl3);
                if (arr[2].equals("Jonatan") && arr[3].equals("Encarnacion")) setViews(arr, "NOTORIOUS", "Milwaukee, WI", "Computer Science", R.drawable.tl4);
                if (arr[2].equals("Bryant") && arr[3].equals("Robles")) setViews(arr, "AUDACIOUS", "Milwaukee, WI", "", R.drawable.tl5);
                if (arr[2].equals("Kevin") && arr[3].equals("Oliva")) setViews(arr, "ETERNO", "Los Angeles, CA", "Computer Science", R.drawable.tl6);
                if (arr[2].equals("Dorian") && arr[3].equals("Gonzalez")) setViews(arr, "ARDOR", "Los Angeles, CA", "", R.drawable.il1);
                if (arr[2].equals("Devon") && arr[3].equals("Hamilton")) setViews(arr, "MARVEL", "Los Angeles, CA", "", R.drawable.il2);
                if (arr[2].equals("Jose") && arr[3].equals("Escobar")) setViews(arr, "DESAFIANTE", "Los Angeles, CA", "", R.drawable.il3);
                if (arr[2].equals("Ron") && arr[3].equals("Rivera")) setViews(arr, "VISCEROUS", "River Grove, IL", "Social Work", R.drawable.kl1);
                if (arr[2].equals("Cameron") && arr[3].equals("Perra")) setViews(arr, "THE AMBASSADOR", "St. Paul, MN", "", R.drawable.kl2);
                if (arr[2].equals("Anthony") && arr[3].equals("Gomez")) setViews(arr, "GAMBIT", "Los Angeles, CA", "Chemical Engineering", R.drawable.ll1);
                if (arr[2].equals("Bryan") && arr[3].equals("Suzan")) setViews(arr, "LAGRIMA", "Racine, WI", "Computer Science", R.drawable.ll2);
                if (arr[2].equals("Francisco") && arr[3].equals("Penaloza")) setViews(arr, "ALTERADO", "Chicago, IL", "", R.drawable.ll3);
                if (arr[2].equals("Jose") && arr[3].equals("Madrigal")) setViews(arr, "TENAZ", "Milwaukee, WI", "Civil Engineering", R.drawable.ll4);
                if (arr[2].equals("Ricardo") && arr[3].equals("Rangel")) setViews(arr, "COMANDANTE", "Chicago, IL", "", R.drawable.ml1);
                if (arr[2].equals("Jesus") && arr[3].equals("Del")) setViews(arr, "JOKER", "Aurora, IL", "", R.drawable.ml2);
                if (arr[2].equals("Remington") && arr[3].equals("Finn")) setViews(arr, "SAMURAI", "Madison, WI", "", R.drawable.ml3);
                if (arr[2].equals("Ulices") && arr[3].equals("Montoya")) setViews(arr, "TLAHUICOLE", "Chicago, IL", "Nursing", R.drawable.ml4);
                return false;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brothers, menu);
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
