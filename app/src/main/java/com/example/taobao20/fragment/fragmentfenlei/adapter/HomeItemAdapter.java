package com.example.taobao20.fragment.fragmentfenlei.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.taobao20.R;
import com.example.taobao20.fragment.fragmentfenlei.bean.FenleiBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;
public class HomeItemAdapter extends BaseAdapter {

    private Context context;
    private List<FenleiBean.DataBean.DataListBean> foodDatas;

    public HomeItemAdapter(Context context, List<FenleiBean.DataBean.DataListBean> foodDatas) {
        this.context = context;
        this.foodDatas = foodDatas;
    }


    @Override
    public int getCount() {
        if (foodDatas != null) {
            return foodDatas.size();
        } else {
            return 10;
        }
    }

    @Override
    public Object getItem(int position) {
        return foodDatas.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FenleiBean.DataBean.DataListBean subcategory = foodDatas.get(position);
        ViewHold viewHold = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.fenlei_item_home_category, null);
            viewHold = new ViewHold();
            viewHold.tv_name = (TextView) convertView.findViewById(R.id.item_home_name);
            viewHold.iv_icon = (SimpleDraweeView) convertView.findViewById(R.id.item_album);
            convertView.setTag(viewHold);
        } else {
            viewHold = (ViewHold) convertView.getTag();
        }
        viewHold.tv_name.setText(subcategory.getTitle());
        Uri uri = Uri.parse(subcategory.getImgURL());
        viewHold.iv_icon.setImageURI(uri);
        return convertView;


    }

    private static class ViewHold {
        private TextView tv_name;
        private SimpleDraweeView iv_icon;
    }

}
