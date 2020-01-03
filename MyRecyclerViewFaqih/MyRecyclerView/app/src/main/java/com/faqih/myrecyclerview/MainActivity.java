package com.faqih.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMakanan;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("MAKANAN HITS INDONESIA ");
        }

        rvMakanan = findViewById(R.id.rv_makanan);
        rvMakanan.setHasFixedSize(true);

        list.addAll(getListMakanan());
        showRecycleList();
    }

    public ArrayList<Makanan> getListMakanan() {
        String[] dataName = getResources().getStringArray(R.array.data_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_description);
        String[] dataPhoto = getResources().getStringArray(R.array.photo);

        ArrayList<Makanan> listMakanan = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++){
            Makanan makanan = new Makanan();
            makanan.setName(dataName[i]);
            makanan.setDescription(dataDescription[i]);
            makanan.setPhoto(dataPhoto[i]);

            listMakanan.add(makanan);
        }
        return listMakanan;
    }

    private void showRecycleList(){
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listMakananAdapter = new ListMakananAdapter(list);
        rvMakanan.setAdapter(listMakananAdapter);
    }
}
