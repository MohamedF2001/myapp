package mohamed.farid.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mohamed.farid.shopping.model.Adaptateur_Item_Mode;
import mohamed.farid.shopping.model.ItemMode;

public class Croissant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_croissant);

        //listes des items
        List<ItemMode> modeItemList = new ArrayList<>();
        modeItemList.add(new ItemMode("Crepes","crepes",100));
        modeItemList.add(new ItemMode("Croissant","croissant",100));
        modeItemList.add(new ItemMode("Croissant au chocolat", "croissantchocolat",100));
        modeItemList.add(new ItemMode("Croissant a la viande hachee","croissantviandehachee",150));

        //recuperer la liste view
        ListView VueListesBoutik = findViewById(R.id.shop_list_view);
        VueListesBoutik.setAdapter(new Adaptateur_Item_Mode(this, modeItemList));

    }
}