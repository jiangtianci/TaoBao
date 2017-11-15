package com.example.taobao20.fragment.fragmentshouye.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.taobao20.R;
import com.example.taobao20.fragment.fragmentshouye.bean.SYBean;

import java.util.ArrayList;
import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Context context;
    List<SYBean.GoodsListBean> list = new ArrayList<>();

    public MyAdapter(Context context, List<SYBean.GoodsListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.fragment_shouye_item, null);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(context).load(list.get(position).image_url).into(holder.sy_img);
        holder.sy_title.setText(list.get(position).goods_name);
        holder.sy_price.setText(list.get(position).normal_price+"");
        holder.sy_num.setText(list.get(position).quantity+"人付款");
    }



    @Override
    public int getItemCount() {
        return list.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView sy_img;
        public TextView sy_title;
        public TextView sy_price;
        public TextView sy_num;

        public ViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.sy_img = (ImageView) rootView.findViewById(R.id.sy_img);
            this.sy_title = (TextView) rootView.findViewById(R.id.sy_title);
            this.sy_price = (TextView) rootView.findViewById(R.id.sy_price);
            this.sy_num = (TextView) rootView.findViewById(R.id.sy_num);
        }

    }
}
