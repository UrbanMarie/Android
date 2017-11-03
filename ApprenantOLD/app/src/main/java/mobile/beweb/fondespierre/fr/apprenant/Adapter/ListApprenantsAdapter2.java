package mobile.beweb.fondespierre.fr.apprenant.Adapter;

/**
 * Created by marie-urbano on 11/07/17.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import mobile.beweb.fondespierre.fr.apprenant.R;


public class ListApprenantsAdapter2 extends ArrayAdapter <String> {
    private final Activity context;
    private final String[] nomList;
    private final String[] prenomList;
    private final String[] skillList;


    public ListApprenantsAdapter2(Activity context, String[] nomList, String[] prenomList, String[] skillList){
        super(context,R.layout.list_apprenants_item,nomList);
        this.context = context;
        this.nomList = nomList;
        this.prenomList = prenomList;
        this.skillList = skillList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_apprenants_item, null, true);
        TextView txtNom = (TextView) rowView.findViewById(R.id.laItem_textview_nom);
        TextView txtPrenom = (TextView) rowView.findViewById(R.id.laItem_textview_prenom);
        TextView txtSkill = (TextView) rowView.findViewById(R.id.laItem_textview_skill);

        txtNom.setText(nomList[position]);
        txtPrenom.setText(prenomList[position]);
        txtSkill.setText(skillList[position]);

        return super.getView(position, convertView, parent);
    }
}












