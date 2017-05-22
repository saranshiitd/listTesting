package saransh.menutesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ListView listItems;
    private ListView selectedThings;
    private List<menuItem> items = new ArrayList<>();
    private List<selectedItems> order = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //    Log.d(TAG, "onCreate: i was here");
        listItems = (ListView) findViewById(R.id.xmlListview);
        selectedThings = (ListView) findViewById(R.id.selectedView);


        order.add(new selectedItems("pizza","2","600"));
        items.add(new menuItem("pizza","300"));
        items.add(new menuItem("burger","100"));

        selectedThings.setAdapter(new SelectAdapter(MainActivity.this,R.layout.activity_selected,order));

        //Log.d(TAG, "onCreate: i am batman");




        listItems.setAdapter(new MenuAdapter(MainActivity.this,R.layout.activity_layout_menu,items));



//        Log.d(TAG, "onCreate: dadada");

    }


    //List<menuItem> items = new arrayList<menuItem>()









}
