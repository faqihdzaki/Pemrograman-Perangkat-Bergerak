package faqih.nat.kampus;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardKampusAdapter extends RecyclerView.Adapter<CardKampusAdapter.ListViewHolder> {
    private ArrayList<Kampus> listKampus;
    private Context context;

    public CardKampusAdapter(Context context, ArrayList<Kampus> listKampus) {
        this.listKampus = listKampus;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_kampus,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
    final Kampus kampus = listKampus.get(position);
    Glide.with(holder.itemView.getContext())
            .load(kampus.getPhoto())
            .apply(new RequestOptions().fitCenter())
            .into(holder.imgPhoto);
    holder.tvName.setText(kampus.getName());
    holder.tvDesc.setText((kampus.getDescription()));
    holder.cv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });

    holder.cv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,DetailListKampus.class);
            intent.putExtra("kampus_id",kampus.getId());
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return listKampus.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_kampus_list);
            tvName = itemView.findViewById(R.id.nama_kampus_list);
            tvDesc = itemView.findViewById(R.id.desc_ig_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}

