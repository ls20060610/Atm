package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreaActivity extends AppCompatActivity {

    private String[] areas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        ListView area = (ListView) findViewById(R.id.area);
  //      areas = new String[]{"中正區","暖暖區","八堵區"};
   //     ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,areas);
  //      area.setAdapter(adapter);
   //     area.setOnItemClickListener(this);
   //

   // @Override
   // public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
   //     String[] data = null;
   //     if(position == 0){
    //        data = new String[]{}
    //    }
   }
}
