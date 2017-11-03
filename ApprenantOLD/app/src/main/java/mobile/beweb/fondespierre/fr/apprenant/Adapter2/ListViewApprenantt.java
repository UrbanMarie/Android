package mobile.beweb.fondespierre.fr.apprenant.Adapter2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import mobile.beweb.fondespierre.fr.apprenant.Adapter.ListApprenantsAdapter2;


public class ListViewApprenantt extends AppCompatActivity {

    ListView lv;
    Context context;


    public static String[] nomList = {
            "Bonnie","bli" ,"cookie","voili"
    };

    public static String[] prenomList = {
            "Bon","bligfh" ,"monsta","voilou"
    };

    public static String[] skillList = {
            "app","get" ,"set","suppr"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_apprenants_item);

        ListApprenantsAdapter2 adapter = new ListApprenantsAdapter2(this,nomList,prenomList,skillList);
        lv = (ListView) findViewById(R.id.la_listView_apprenants);
        lv.setAdapter(adapter);
    }


}