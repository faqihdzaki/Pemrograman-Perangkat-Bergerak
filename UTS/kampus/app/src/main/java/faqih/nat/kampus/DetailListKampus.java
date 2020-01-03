package faqih.nat.kampus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListKampus extends AppCompatActivity {

    private int kampus_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Kampus> listKampus = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_kampus);

        kampus_id = getIntent().getIntExtra("kampus_id", 0);
        tvName = findViewById(R.id.nama_kampus);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listKampus.addAll(KampusData.getListData());

        setLayout();
    }

    private void setLayout() {
        tvName.setText(listKampus.get(kampus_id).getName());
        tvDesc.setText(listKampus.get(kampus_id).getDescription());
        Glide.with(this)
                .load(listKampus.get(kampus_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
