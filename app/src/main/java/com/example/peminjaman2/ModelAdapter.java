package com.example.peminjaman2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.MahasiswaViewHolder> {

    private ArrayList<ModelClass> datalist;

    public ModelAdapter (ArrayList<ModelClass> datalist) {
        this.datalist = datalist;
    }



    @Override
    public MahasiswaViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);

        return new MahasiswaViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        holder.txtNama.setText(datalist.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama;

        public MahasiswaViewHolder (View itemView){
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
        }
    }
}
