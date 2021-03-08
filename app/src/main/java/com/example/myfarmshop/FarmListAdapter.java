package com.example.myfarmshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FarmListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Farm> mList;
    public FarmListAdapter( List<Farm> list, Context context){
        super();
        mList = list;
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextId;
        public TextView mTextName;
        public TextView mTextAddress;
        public TextView mTextCity;
        public TextView mTextProvince;
        public TextView mTextPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextId = (TextView) itemView.findViewById(R.id.textId);
            mTextName = (TextView) itemView.findViewById(R.id.textName);
            mTextAddress = (TextView) itemView.findViewById(R.id.textAddress);
            mTextCity = (TextView) itemView.findViewById(R.id.textCity);
            mTextProvince = (TextView) itemView.findViewById(R.id.textProvince);
            mTextPhone = (TextView) itemView.findViewById(R.id.textPhone);
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.record_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Farm farmAdapter = mList.get(position);
        ((ViewHolder) holder).mTextId.setText(Integer.toString(farmAdapter.getId()));
        ((ViewHolder) holder).mTextName.setText(farmAdapter.getName());
        ((ViewHolder) holder).mTextAddress.setText(farmAdapter.getAddress());
        ((ViewHolder) holder).mTextCity.setText(farmAdapter.getCity());
        ((ViewHolder) holder).mTextProvince.setText(farmAdapter.getPhone());
        ((ViewHolder) holder).mTextPhone.setText(farmAdapter.getPhone());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
