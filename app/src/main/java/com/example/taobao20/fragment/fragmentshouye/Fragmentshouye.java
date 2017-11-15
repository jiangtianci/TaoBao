package com.example.taobao20.fragment.fragmentshouye;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.taobao20.R;
import com.example.taobao20.fragment.fragmentshouye.adapter.MyAdapter;
import com.example.taobao20.fragment.fragmentshouye.api.APi;
import com.example.taobao20.fragment.fragmentshouye.bean.Bann;
import com.example.taobao20.fragment.fragmentshouye.bean.SYBean;
import com.example.taobao20.fragment.fragmentshouye.persenter.Persenter;
import com.example.taobao20.fragment.fragmentshouye.view.Iview;
import com.example.taobao20.view.UpMarqueeView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Fragmentshouye extends Fragment implements Iview {
    private View view;
    private RecyclerView recycler;
    private List<Bann> bann = new ArrayList<>();
    private com.nostra13.universalimageloader.core.ImageLoader universalImageloader = com.nostra13.universalimageloader.core.ImageLoader.getInstance();
    private ImageView imag;
    private EditText edit;
    private ImageView huiyuanma;
    private LinearLayout hander;
    private Banner banner;
    private GridView gview;
    private List<String> data;
    private UpMarqueeView upview1;
    private ScrollView scrollview;
    private RelativeLayout relativeLayout;
    private GridLayoutManager glide;
    private List<View> views = new ArrayList();
    private List<Map<String, Object>> data_list;
    private SimpleAdapter sim_adapter;
    private Persenter persenter;
    private ImageLoaderConfiguration configuration;
    private DisplayImageOptions options;
    private int[] icon = {R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6, R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10}; // 图片封装为一个数组
    private String[] iconName = {"天猫超市", "农资农具", "天猫优品", "陶乡甜", "全部分类", "户外", "居家日用", "食品干货", "流行男鞋", "品质男装"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shouye, null);
        initView(view);
        recycler = (RecyclerView) view.findViewById(R.id.recycler);
        banner = (Banner) view.findViewById(R.id.banner);
        scrollview = (ScrollView) view.findViewById(R.id.scrollview);
        glide = new GridLayoutManager(getActivity(), 2);
        recycler.setLayoutManager(glide);
        persenter = new Persenter(this);
        persenter.getok(APi.SY);
        banner();
        data_list = new ArrayList<>();
        //获取数据
        getData();
        //新建适配器
        String [] from ={"image","text"};
        int [] to = {R.id.image,R.id.text};
        sim_adapter = new SimpleAdapter(getActivity(), data_list, R.layout.fragment_shouye_glive_item, from, to);
        //配置适配器
        gview.setAdapter(sim_adapter);
        initUV();
        return view;


    }
    private void initUV() {
        upview1 = (UpMarqueeView) view.findViewById(R.id.upview1);
        /**
         * 初始化数据
         */
        initUVDatas();
        /**
         * 初始化界面程序
         */
        initiew();
    }
    private void initiew() {
        for (int i = 0; i < data.size(); i = i + 2) {
            //设置滚动的单个布局
            LinearLayout moreView = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.paoma, null);
            //初始化布局的控件
            TextView tv1 = (TextView) moreView.findViewById(R.id.tv1);
            TextView tv2 = (TextView) moreView.findViewById(R.id.tv2);
            //进行对控件赋值
            tv1.setText(data.get(i).toString());
            if (data.size() > i + 1) {
                //因为淘宝那儿是两条数据，但是当数据是奇数时就不需要赋值第二个，所以加了一个判断，还应该把第二个布局给隐藏掉
                tv2.setText(data.get(i + 1).toString());
            } else {
                moreView.findViewById(R.id.rl2).setVisibility(View.GONE);
            }
            //添加到循环滚动数组里面去
            views.add(moreView);
        }
        upview1.setViews(views);
    }
    private void initUVDatas() {
        data = new ArrayList<>();
        data.add("锄禾日当午，老蔡一米五。");
        data.add("文能挂机喷队友，武能越塔送人头。");
        data.add("进可孤身一挑五，退可坐等二十投。");
        data.add("前能飞脚救残敌，后能放墙堵队友。");
        data.add("静则百年不见人，动则千里送超神。");
        data.add("英勇闪现送一血，卖起队友不回头。");
        data.add("顺风浪，逆风投。");
        data.add("问君能有几多愁，恰似五人四坑二十投。");
    }
    private void banner() {
        bann.add(new Bann("https://img.alicdn.com/simba/img/TB1AhFnPVXXXXa.XFXXSutbFXXX.jpg_q50.jpg") );
        bann.add(new Bann("https://gw.alicdn.com/imgextra/i2/118/TB22AjYg7qvpuFjSZFhXXaOgXXa_!!118-0-yamato.jpg_q50.jpg"));
        bann.add(new Bann("https://gw.alicdn.com/imgextra/i1/34/TB2Kea5fYVkpuFjSspcXXbSMVXa_!!34-0-yamato.jpg_q50.jpg"));
        bann.add(new Bann("https://gw.alicdn.com/imgextra/i1/101/TB2Dz1ScYtlpuFjSspoXXbcDpXa_!!101-0-yamato.jpg_q50.jpg"));
        bann.add(new Bann("https://gw.alicdn.com/imgextra/i4/140/TB2lWFJgmFjpuFjSspbXXXagVXa_!!140-0-yamato.jpg_q50.jpg"));
        bann.add(new Bann("https://aecpm.alicdn.com/tps/i4/TB1pgxYJXXXXXcAXpXXrVZt0FXX-640-200.jpg_q50.jpg"));
        bann.add(new Bann("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3158096104,1111233434&fm=27&gp=0.jpg"));
        bann.add(new Bann("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1900928020," + "1421879848&fm=27&gp=0.jpg"));
        configuration = ImageLoaderConfiguration.createDefault(getContext());
        universalImageloader.init(configuration);
        //内存缓存
//磁盘缓存
        options = new DisplayImageOptions.Builder()
                .cacheInMemory(true)//内存缓存
                .cacheOnDisk(true)//磁盘缓存
                .build();
              banner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                universalImageloader.displayImage(((Bann) path).url, imageView, options);
            }
        });
        banner.setImages(bann);
        banner.setDelayTime(3000);
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        banner.setBannerAnimation(Transformer.ScaleInOut);
        banner.start();
    }
    @Override
    public void error(String rr) {

    }
    @Override
    public void showsuccess(List<SYBean.GoodsListBean> list) {
        MyAdapter adapter = new MyAdapter(getContext(), list);

        recycler.setAdapter(adapter);
    }
    private void initView(View view) {
        imag = (ImageView) view.findViewById(R.id.imag);
        edit = (EditText) view.findViewById(R.id.edit);
        huiyuanma = (ImageView) view.findViewById(R.id.huiyuanma);
        hander = (LinearLayout) view.findViewById(R.id.hander);
        gview = (GridView) view.findViewById(R.id.gview);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.relativeLayout);
    }
    public List<Map<String, Object>> getData(){
        //cion和iconName的长度是相同的，这里任选其一都可以
        for(int i=0;i<icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }

        return data_list;
    }
}

