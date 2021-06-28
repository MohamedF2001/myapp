package mohamed.farid.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        mButton1 = findViewById(R.id.bouton_amuse);
        mButton2 = findViewById(R.id.bouton_croissant);
        mButton3 = findViewById(R.id.bouton_gateaux);
        mButton4 = findViewById(R.id.bouton_sandwich);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent amu_guel = new Intent(Accueil.this, Guele.class);
                startActivity(amu_guel);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent croissant = new Intent(Accueil.this, Croissant.class);
                startActivity(croissant);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gateau = new Intent(Accueil.this, Gateau.class);
                startActivity(gateau);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent snack = new Intent(Accueil.this, MainActivity.class);
                startActivity(snack);
            }
        });
    }
}