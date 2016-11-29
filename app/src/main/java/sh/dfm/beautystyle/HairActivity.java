package sh.dfm.beautystyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HairActivity extends AppCompatActivity {


    public static final String EXTRA_HAIRNOM = "hairNom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);

        //получаем ид экстра
        int hairNom = getIntent().getIntExtra(EXTRA_HAIRNOM, 0);
        Hair hair = Hair.hairs[hairNom];

        //заполняем изобрадение
        ImageView photo = (ImageView) findViewById(R.id.photo_hair);
        photo.setImageResource(hair.getImageResoutceId());
        photo.setContentDescription(hair.getName());

        //заполняем наименование
        TextView name = (TextView) findViewById(R.id.name_hair);
        name.setText(hair.getName());

        //заполняем описание
        TextView description = (TextView) findViewById(R.id.description_hair);
        description.setText(hair.getDescription());

        //Toast.makeText(HairActivity.this, "HELLOW!!", Toast.LENGTH_SHORT).show();

    }
}
