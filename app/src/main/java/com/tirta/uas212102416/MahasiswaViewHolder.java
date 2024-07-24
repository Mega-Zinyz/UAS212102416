package com.tirta.uas212102416;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
    public TextView _jkTextView, _namaTextView, _nimTextView;


    public MahasiswaViewHolder(@NonNull View itemView) {
        super(itemView);

        _jkTextView = itemView.findViewById(R.id.jkTextView);
        _namaTextView = itemView.findViewById(R.id.namaTextView);
        _nimTextView = itemView.findViewById(R.id.nimTextView);
    }
}
