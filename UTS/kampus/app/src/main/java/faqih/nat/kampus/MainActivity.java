package faqih.nat.kampus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKampus;
    private ArrayList<Kampus> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item_about) {
            startActivity(new Intent(this, Aboutme.class));
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKampus = findViewById(R.id.rv_kampus);
        rvKampus.setHasFixedSize(true);

        list.addAll(KampusData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKampus.setLayoutManager(new LinearLayoutManager(this));
        CardKampusAdapter cardKampusAdapter = new CardKampusAdapter(this, list);
        rvKampus.setAdapter(cardKampusAdapter);
    }
}
