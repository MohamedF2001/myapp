package mohamed.farid.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mohamed.farid.shopping.model.Adaptateur_Item_Mode;
import mohamed.farid.shopping.model.ItemMode;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.bouton_de_commande);

        //listes des items
        List<ItemMode> modeItemList = new ArrayList<>();
        modeItemList.add(new ItemMode("Sandwich", "sandwich",100));
        modeItemList.add(new ItemMode("Pain Sandwich","painsandwich",150));
        modeItemList.add(new ItemMode("Sandwich Viande","sandwichviande",100));
        modeItemList.add(new ItemMode("Sandwich Garnies","sandwichgarnies",100));
        modeItemList.add(new ItemMode("Snacking","snacking",100));

        //recuperer la liste view
        ListView VueListesBoutik = findViewById(R.id.shop_list_view);
        VueListesBoutik.setAdapter(new Adaptateur_Item_Mode(this, modeItemList));

    }
}