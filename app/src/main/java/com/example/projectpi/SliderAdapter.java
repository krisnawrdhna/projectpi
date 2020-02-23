package com.example.projectpi;//package com.example.one.myapplication;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.v4.view.PagerAdapter;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//
//import com.example.one.myapplication.R;
//
//public class SliderAdapter extends PagerAdapter {
//
//
//    Context context;
//    LayoutInflater layoutInflater;
//
//    public SliderAdapter(Context context) {
//        this.context = context;
//    }
//
//    public int[] slide_image = {R.drawable.jakarta, R.drawable.bedugul}
//
//    public String[] slide_isi = {
//            "1. test\n" + "2.jakarta\n",
//            "1. test\n" + "2.bali"
//    };
//
//    @Override
//    public int getCount() {
//        return slide_isi.length;
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view == object;
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
//        View view = layoutInflater.inflate
//    }
//}
//
//
//
//
//
