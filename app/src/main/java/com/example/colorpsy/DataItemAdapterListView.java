package com.example.colorpsy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.colorpsy.model.DataItem;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataItemAdapterListView extends ArrayAdapter<DataItem> {
    List<DataItem> mDataItems;
    LayoutInflater mInflater;
    public DataItemAdapterListView(@NonNull Context context, @NonNull List<DataItem> objects)
    {
        super(context, R.layout.single_row, objects);


        mDataItems = objects;
        mInflater = LayoutInflater.from(context);


    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.single_row,parent,false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.sr_imageDes);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.sr_image);

        DataItem item = mDataItems.get(position);

        tvName.setText(item.getItemName());
        //imageView.setImageResource(R.drawable.angry);



        InputStream inputStream = null;
        try {
            String imageFile = item.getImage();
            inputStream = getContext().getAssets().open(imageFile);
            Drawable d = Drawable.createFromStream(inputStream,null);
            imageView.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null)
                {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




        return convertView;
    }
}
