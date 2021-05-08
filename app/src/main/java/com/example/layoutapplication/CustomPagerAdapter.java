package com.example.layoutapplication;
        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.viewpager.widget.PagerAdapter;
        import androidx.viewpager.widget.ViewPager;

        import java.util.ArrayList;

public class CustomPagerAdapter extends PagerAdapter {

    Context context;
    ArrayList<Integer> pager;

    public CustomPagerAdapter(Context context, ArrayList<Integer> pager) {
        this.context = context;
        this.pager = pager;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    @Override
//    public  Object instantiateItem(ViewGroup container, int position) {
//        View inflater = LayoutInflater.from(context).inflate(R.layout.item_page, container, false);
//        ImageView imageView = (ImageView) view.findViewById(R.id.imgProfile);
//        TextView topic=(TextView) view.findViewById(R.id.tvAbout);
//        topic.setText(pager.get(pos))
//        imageView.setBackgroundResource(pager.get(position));
//        container.addView(view);

    public Object instantiateItem(ViewGroup collection, int position) {

        LayoutInflater inflater = (LayoutInflater) collection.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int resId = 0;
        switch (position) {
            case 0:
                resId = R.layout.profile_of_woman;
                break;
            case 1:
                resId = R.layout.profile_of_man;
                break;
            case 2:
                resId = R.layout.profile;
                break;
            case 3:
                resId = R.layout.biodata_of_man;
                break;

        }

        View view = inflater.inflate(resId, null);
        ((ViewPager) collection).addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }
}