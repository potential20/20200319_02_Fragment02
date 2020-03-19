package kr.co.tjoeun.a20200319_02_fragment02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import kr.co.tjoeun.a20200319_02_fragment02.R;
import kr.co.tjoeun.a20200319_02_fragment02.datas.ChickenStore;

public class ChickenStoreAdapter extends ArrayAdapter<ChickenStore> {

    Context mContext;
    List<ChickenStore> mList;
    LayoutInflater inf;

    public ChickenStoreAdapter(@NonNull Context context, int resource, @NonNull List<ChickenStore> objects) {
        super(context, resource, objects);
        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.chicken_store_list_item,null);
        }

        ChickenStore data = mList.get(position);
        TextView storeNameTxt = row.findViewById(R.id.storeNameTxt);
        storeNameTxt.setText(data.getStoreName());
        return row;
    }
}
