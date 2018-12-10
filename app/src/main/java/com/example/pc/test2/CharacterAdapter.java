package com.example.pc.test2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CharacterAdapter extends ArrayAdapter<CharacterItem> {

    private int resource;

    public CharacterAdapter(Context context, int resource, List<CharacterItem> objects) {
        super(context, resource, objects);
        this.resource = resource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(resource, null);
        }

        ImageView genderImageView = convertView.findViewById(R.id.genderImageView);
        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        CharacterItem item = getItem(position);
        int gender = item.getGender();
        String title = item.getTitle();
        String name = item.getName();

        if(gender == G.MAN) {
            genderImageView.setImageResource(R.drawable.male);
        } else {
            genderImageView.setImageResource(R.drawable.female);
        }

        titleTextView.setText(title);
        nameTextView.setText(name);
        return convertView;
    }


}
