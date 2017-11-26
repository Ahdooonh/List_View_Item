package android.sas.ita.list_view_item;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
public class MainActivity extends AppCompatActivity {
    String[] name={"Samsong","Sony","Iphone","Nokya","BlckBarry"};
    String[] name1={"100OR","150OR","300OR","1560OR","170OR"};
    String[] name2={"Available","Available","Not Available","Available","Available"};
    int[] image={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.image5};
    int[] image1={R.drawable.image3,R.drawable.image5,R.drawable.image1,R.drawable.image2,
            R.drawable.image4};
    ListView list;
    ArrayList<HashMap<String,String>> arrayList;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList=new ArrayList<>();
        list = (ListView) findViewById(R.id.list);
         for(int i=0; i<name.length;i++)
         {HashMap<String,String> map=new HashMap<>();
             map.put("name",name[i]);
             map.put("name1",name1[i]);
             map.put("name2",name2[i]);
             map.put("image",image[i]+"");
             map.put("image1",image1[i]+"");
             arrayList.add(map);}
         String[] namekey ={"name","name1","name2","image","image1"};
        int[] listitem={R.id.text1,R.id.text2,R.id.text3, R.id.image2,R.id.image3};
        SimpleAdapter adapter = new SimpleAdapter(this,arrayList,R.layout.listview,namekey,listitem);
        list.setAdapter(adapter);
    }
}
