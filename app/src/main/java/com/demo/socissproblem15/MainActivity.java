package com.demo.socissproblem15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static final String EXTRA_POS = "MAIN.POSITION";
    public static final String EXTRA_LIST = "MAIN.LIST";
    ListView listView;
    ArrayList<String> list;
    String province;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        customListView();
    }
    void customListView(){

        controllerList();
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);


    }
    void controllerList(){
        list = new ArrayList<String>();
        list.add("An Giang");
        list.add("Ba Ria Vung Tau");
        list.add("Bac Giang");
        list.add("Bac Kan");
        list.add("Bac Lieu");
        list.add("Bac Ninh");
        list.add("Ben Tre");
        list.add("Binh Dinh");
        list.add("Binh Duong");
        list.add("Binh Phuoc");
        list.add("Binh Thuan");
        list.add("Ca Mau");
        list.add("Cao Bang");
        list.add("Dak Lak");
        list.add("Dak Nong");
        list.add("Dien Bien");
        list.add("Dong Nai");
        list.add("Dong Thap");
        list.add("Gia Lai");
        list.add("Ha Giang");
        list.add("Ha Nam");
        list.add("Ha Tinh");
        list.add("Hai Duong");
        list.add("Hau Giang");
        list.add("Hoa Binh");
        list.add("Hung Yen");
        list.add("Khanh Hoa");
        list.add("Kien Giang");
        list.add("Kon Tum");
        list.add("Lai Chau");
        list.add("Lam Dong");
        list.add("Lang Son");
        list.add("Lao Cai");
        list.add("Long An");
        list.add("Nam Dinh");
        list.add("Nghe An");
        list.add("Ninh Binh");
        list.add("Ninh Thuan");
        list.add("Phu Tho");
        list.add("Quang Binh");
        list.add("Quang Nam");
        list.add("Quang Ngai");
        list.add("Quang Ninh");
        list.add("Quang Tri");
        list.add("Soc Trang");
        list.add("Son La");
        list.add("Tay Ninh");
        list.add("Thai Binh");
        list.add("Thai Nguyen");
        list.add("Thanh Hoa");
        list.add("Thua Thien Hue");
        list.add("Tien Giang");
        list.add("Tra Vinh");
        list.add("Tuyen Quang");
        list.add("Vinh Long");
        list.add("Vinh Phuc");
        list.add("Yen Bai");
        list.add("Phu Yen");
        list.add("Can Tho");
        list.add("Da Nang");
        list.add("Hai Phong");
        list.add("Ha Noi");
        list.add("TP HCM");

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Object o = listView.getItemAtPosition(i);
        province = (String)o;
        position = i;

        Intent intent = new Intent(this, ProvinceActivity.class);
        intent.putExtra(EXTRA_LIST, list);
        intent.putExtra(EXTRA_POS, position);

        startActivity(intent);
    }
}
