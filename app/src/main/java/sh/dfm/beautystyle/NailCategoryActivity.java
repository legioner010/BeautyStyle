package sh.dfm.beautystyle;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NailCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listNails = getListView();
        ArrayAdapter<Nail> listAdapter = new ArrayAdapter<Nail>(this, android.R.layout.simple_list_item_1, Nail.nails);
        listNails.setAdapter(listAdapter);
    }


    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        //super.onListItemClick(l, v, position, id);

//        Log.d("NailCategoryActivity", "listView" + listView);
//        Log.d("NailCategoryActivity", "itemView" + itemView);
//        Log.d("NailCategoryActivity", "id" + id);

        Intent intent = new Intent(NailCategoryActivity.this, NailActivity.class);
        intent.putExtra(NailActivity.EXTRA_NAILNOM, (int) id );
        startActivity(intent);
    }
}
