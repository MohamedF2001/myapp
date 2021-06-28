package mohamed.farid.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mohamed.farid.shopping.model.Adaptateur_Item_Mode;
import mohamed.farid.shopping.model.ItemMode;

public class Gateau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gateau);

        //listes des items
        List<ItemMode> modeItemList = new ArrayList<>();
        modeItemList.add(new ItemMode("Gateau simple","gaateau",100));
        modeItemList.add(new ItemMode("Gateau simple décoré","gateau",100));
        modeItemList.add(new ItemMode("Gateau d'anniversaire", "gateauannif",100));
        modeItemList.add(new ItemMode("Gateau au chocolat","gateauchocolat",150));
        modeItemList.add(new ItemMode("Gateau au lait","gateaulait",150));
        modeItemList.add(new ItemMode("Gateau simple 2","gateausimple",150));
        modeItemList.add(new ItemMode("Gateau simple 3","gateausimplee",150));
        modeItemList.add(new ItemMode("Gateau simple décoré 2","gateauu",150));
        modeItemList.add(new ItemMode("Petit gateau simple","gateauusimplee",150));
        modeItemList.add(new ItemMode("Gateau simple décoré 3","gateaux",150));

        //recuperer la liste view
        ListView VueListesBoutik = findViewById(R.id.shop_list_view);
        VueListesBoutik.setAdapter(new Adaptateur_Item_Mode(this, modeItemList));
    }
}