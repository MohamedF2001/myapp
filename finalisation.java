package mohamed.farid.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class finalisation extends AppCompatActivity {

    private ImageView home;
    private ImageView back;
    private ImageView tel;
    private ImageView gmail;
    private ImageView whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalisation);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(finalisation.this, Accueil.class);
                startActivity(home);
            }
        });
    }
}