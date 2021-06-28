package mohamed.farid.shopping.model;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import mohamed.farid.shopping.R;
import mohamed.farid.shopping.finalisation;
import mohamed.farid.shopping.model.ItemMode;

/**
 * Créé par M.Farid le 24/11/2020
 */
public class Adaptateur_Item_Mode extends BaseAdapter {
    //attributs
    private Context mContext;
    private List<ItemMode> mModeItemList;
    private LayoutInflater mInflater;

    //constructeurs
    public Adaptateur_Item_Mode(Context context, List<ItemMode> modeItemList) {
        mContext = context;
        mModeItemList = modeItemList;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return mModeItemList.size();
    }

    @Override
    public ItemMode getItem(int position)
    {
        return mModeItemList.get(position);
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = mInflater.inflate(R.layout.adaptateur_d_item, null);
        //recuperer les infos
        ItemMode itemCourant = getItem(i);
        final String nomItem = itemCourant.getNom();
        String indicee = itemCourant.getIndice();
        final int prixItem = itemCourant.getPrix();

        //recuperer l'indice
        ImageView indiceImage = view.findViewById(R.id.item_icone);
        String nomRessourses = "m_"+indicee+"_g";
        int resId = mContext.getResources().getIdentifier(nomRessourses, "drawable",mContext.getPackageName());
        indiceImage.setImageResource(resId);

        //recuperer le nom avec la vue
        TextView itemVue = view.findViewById(R.id.nom_item);
        itemVue.setText(nomItem);

        //recuperer le prix avec la vue
        TextView prixVue = view.findViewById(R.id.prix_item);
        prixVue.setText(prixItem + "$");

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"Vous essayer d'acheter "+ nomItem+
                        " pour le prix de "+prixItem+ "$",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
