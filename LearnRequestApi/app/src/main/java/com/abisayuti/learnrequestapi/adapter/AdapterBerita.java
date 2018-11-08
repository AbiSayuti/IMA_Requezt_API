package com.abisayuti.learnrequestapi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.abisayuti.learnrequestapi.R;
import com.abisayuti.learnrequestapi.model.BeritaItem;
import com.abisayuti.learnrequestapi.network.ConfigRetrofit;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterBerita extends RecyclerView.Adapter<AdapterBerita.ViewHolder> {

    // TODO: 06/11/18 todo deklarasi
    private Context ctx;
    private List<BeritaItem> dataBerita;

    // TODO: 06/11/18 create function / method constructor / wajib ada
    public AdapterBerita(Context ctx, List<BeritaItem> dataBerita) {
        this.ctx = ctx;
        this.dataBerita = dataBerita;
    }

    // TODO: 06/11/18 menyisipkan sebuah layout kedalam adapter dan recyclerview
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.item_berita, viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // TODO: 06/11/18 eksekusi data yang mau di tampilkan
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        // TODO: 06/11/18 tampug datanya ke variabel
        String judul = dataBerita.get(position).getJudulBerita();
        String images = ConfigRetrofit.IMAGES + dataBerita.get(position).getFoto();
        String posting = dataBerita.get(position).getTanggalPosting();
        String penulis = dataBerita.get(position).getPenulis();
        String content = dataBerita.get(position).getIsiBerita();

    }

    // TODO: 06/11/18 return data yang ingin ditampilkan / proses looping
    @Override
    public int getItemCount() {
        return dataBerita.size();
    }

    static

    // TODO: 06/11/18 deklarasi widget atau component nya
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_Gambar_Berita)
        ImageView ivGambarBerita;
        @BindView(R.id.tv_Judul_Berita)
        TextView tvJudulBerita;
        @BindView(R.id.tv_Tgl_Terbit)
        TextView tvTglTerbit;
        @BindView(R.id.tv_Penulis)
        TextView tvPenulis;

        // TODO: 06/11/18 casting view / hub dgn id nya masing"
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
