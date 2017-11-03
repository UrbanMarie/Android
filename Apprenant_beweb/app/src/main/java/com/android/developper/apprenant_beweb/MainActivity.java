package com.android.developper.apprenant_beweb;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.android.developper.apprenant_beweb.Adapter.ListApprenantsAdapter;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;





        Resources tableau = getResources();
        String[] identity = tableau.getStringArray(R.array.identity);
        final ListView listApprenants = (ListView)findViewById(R.id.la_listview_apprenants);
        ListApprenantsAdapter adapter = new ListApprenantsAdapter(this, identity);
        listApprenants.setAdapter(adapter);


    }
}
