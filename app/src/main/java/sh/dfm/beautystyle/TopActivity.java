package sh.dfm.beautystyle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;

public class TopActivity extends AppCompatActivity  implements View.OnClickListener{

    private ImageView nailIv;
    private TextView nailTv;

    private ImageView addressIv;
    private TextView addressTv;

    private ImageView hairIm;
    private TextView hairTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        nailIv = (ImageView) findViewById(R.id.im_nail);
        nailTv = (TextView) findViewById(R.id.tv_nail);

        nailTv.setOnClickListener(this);
        nailIv.setOnClickListener(this);

        ///////// адрес
        addressIv = (ImageView) findViewById(R.id.im_address);
        addressTv = (TextView) findViewById(R.id.tv_address);

        addressIv.setOnClickListener(this);
        addressTv.setOnClickListener(this);

        // hair
        hairIm = (ImageView) findViewById(R.id.im_hair);
        hairTv = (TextView) findViewById(R.id.tv_hair);
        hairIm.setOnClickListener(this);
        hairTv.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.im_nail:
                Intent intent1 = new Intent(this, NailCategoryActivity.class);
                startActivity(intent1); break;
            case R.id.tv_nail:
                Intent intent2 = new Intent(this, NailCategoryActivity.class);
                startActivity(intent2); break;
            case R.id.im_address:
                Intent intent3 = new Intent(this, AdressActivity.class);
                startActivity(intent3); break;
            case R.id.tv_address:
                Intent intent4 = new Intent(this, AdressActivity.class);
                startActivity(intent4); break;
            case R.id.im_hair:
                Intent intent5 = new Intent(this, HairCategoryActivity.class);
                startActivity(intent5); break;
            case R.id.tv_hair:
                Intent intent6 = new Intent(this, HairCategoryActivity.class);
                startActivity(intent6); break;
            default:
                break;
        }
    }
}
