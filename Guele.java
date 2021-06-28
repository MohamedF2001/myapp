package mohamed.farid.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mohamed.farid.shopping.model.Adaptateur_Item_Mode;
import mohamed.farid.shopping.model.ItemMode;

public class Guele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guele);

        //listes des items
        List<ItemMode> croissantItemList = new ArrayList<>();
        croissantItemList.add(new ItemMode("Atchomon", "amuseguele", 100));
        croissantItemList.add(new ItemMode("amuse gueles en plat", "amuseguelee", 100));
        croissantItemList.add(new ItemMode("amuse gueles en plat 2", "amusseguele", 100));
        croissantItemList.add(new ItemMode("amuse gueles", "amusseguelee", 100));

        //récupérer la liste view
        ListView shopListView = findViewById(R.id.shop_list_view);
        shopListView.setAdapter(new Adaptateur_Item_Mode(this,croissantItemList));
    }
}