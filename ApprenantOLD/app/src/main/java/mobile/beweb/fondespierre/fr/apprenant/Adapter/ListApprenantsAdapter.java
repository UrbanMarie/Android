//package mobile.beweb.fondespierre.fr.apprenant.Adapter;
//
///**
// * Created by marie-urbano on 11/07/17.
// */
//
//import android.app.Activity;
//import android.view.View;
//import android.widget.TextView;
//import android.widget.ArrayAdapter;
//import android.view.ViewGroup;
//import mobile.beweb.fondespierre.fr.apprenant.R;
//
//
//public class ListApprenantsAdapter extends ArrayAdapter {
//    String[] identity;
//    public ListApprenantsAdapter(Activity context, String[] xmlidentity){
//        super(context, xmlidentity, 0);
//        identity= xmlidentity;
//    }
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//            if (convertView==null) {
//            convertView = LayoutInFlatter.from(getContext()).inflate(
//                    R.layout.layout, parent, false);
//            }
    // On indique le layout qui affiche l'objet
//    private final int ressource = R.layout.list_apprenants_item;
//    private Resources resources;
//    private final
//    public ListApprenantsAdapter(@NonNull Activity activity, @LayoutRes int resource) {
//        super(activity.getApplicationContext(), resource);
//        this.act = activity;
      //  this.apprenant = ;
        // le constructeur
//    public View getView(View convertView,ViewGroup parent, int position){
//        // l'objet infaltter construit tout les elements dans le layout pour retourner l'objet a la position spécifié
//        LayoutInflater inflater =act.getLayoutInflater();
//        convertView = inflater.inflate(ressource, null);
        // attribut les textes au layout en fonction de leur id
//        TextView nomT = (TextView) convertView.findViewById(R.id.laItem_textview_prenom);  // on recup par id
//        nomT.setText(tabNom[position]);
//
//        TextView prenomT = (TextView)convertView.findViewById(R.id.laItem_textview_nom);
//        prenomT.setText(tabPrenom[position]);
//
//        TextView skillT = (TextView)convertView.findViewById(R.id.laItem_textview_skill);
////        ImageView detail = (ImageView) convertView.findViewById(R.id.laItem_imagebutton_detail);
//        skillT.setText(tabSkill[position]);
//                /* find a way to find a array */
//
////        Resources tableau = act.getResources();
////        String[] nomination = tableau.getStringArray(R.array.prenom);
////        String[] nom = tableau.getStringArray(R.array.nom);
////        String[] skill = tableau.getStringArray(R.array.skill);
////
////        firstName.setText(nomination[position]);
////        lastName.setText(nom[position]);
////        competences.setText(skill[position]);
//        return convertView;
//
//    }
//        // on retourne les apprenants tant que  il y en a
//        @Override
////        public int getCount(){
////            return apprenant.lenght;
//        }
//}













