package com.example.mainactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterPlaneta extends ArrayAdapter<Planeta> {
        Context lcontext;

    public AdapterPlaneta(@NonNull Context context, int resource, @NonNull List<Planeta> objects) {
        super(context, resource, objects);
        lcontext=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(lcontext);
        View view=inflater.inflate(R.layout.item,parent,false);

        TextView tvNome =view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView tvMassa=view.findViewById(R.id.tvMassa);
        Planeta p =getItem(position);
        tvNome.setText(p.nome);
        imageView.setImageResource(p.foto);
        tvMassa.setText(p.massa);

        return view;
    }
}

