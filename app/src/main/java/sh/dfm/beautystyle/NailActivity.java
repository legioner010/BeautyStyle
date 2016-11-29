package sh.dfm.beautystyle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NailActivity extends AppCompatActivity {

    public static final String EXTRA_NAILNOM = "nailNom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nail);

        //получаем ид экстра
            int nailNom = getIntent().getIntExtra(EXTRA_NAILNOM, 0);
            Nail nail = Nail.nails[nailNom];

            //заполняем изобрадение
            ImageView photo = (ImageView) findViewById(R.id.photo);
            photo.setImageResource(nail.getImageresourceId());
            photo.setContentDescription(nail.getName());

            //заполняем наименование
            TextView name = (TextView) findViewById(R.id.name);
            name.setText(nail.getName());

            //заполняем описание
            TextView description = (TextView) findViewById(R.id.description);
            description.setText(nail.getDescription());
    }
}
