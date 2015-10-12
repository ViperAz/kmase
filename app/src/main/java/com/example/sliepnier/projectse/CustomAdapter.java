package com.example.sliepnier.projectse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sliepnier.projectse.R;

import org.w3c.dom.Text;

/**
 * Created by Sliepnier on 10/13/2015.
 */
public class CustomAdapter extends ArrayAdapter<String>{

    String[] str2;
    public CustomAdapter(Context context, String[] str,String[] a) {
        super(context, R.layout.custom_row ,str);
        str2 = a;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);

        String text = getItem(position);
        TextView text1 = (TextView)customView.findViewById(R.id.textView);
        String text2 = str2[position];
        TextView text3 = (TextView)customView.findViewById(R.id.textView2);

        ImageView image = (ImageView)customView.findViewById(R.id.imageView1);

        text1.setText(text);
        text3.setText(text2);
        image.setImageResource(R.drawable.ic_action_search);

        return customView;
    }
}
