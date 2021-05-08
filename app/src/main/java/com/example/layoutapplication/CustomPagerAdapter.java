package com.example.layoutapplication;
        import android.content.Context;
        import android.text.TextUtils;
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
    TextView tvName;
    TextView tvAddressInfo;
    TextView tvAgeInfo;
    TextView tvBloodGroupInfo;
    ImageView imgProfile;
    TextView tvAboutInfo;
    TextView tvCallInfo;
    TextView tvDOBInfo;
    TextView tvEducationInfo;
    TextView tvExpectationsInfo;
    TextView tvFamilyInfo;
    TextView tvHeightInfo;
    TextView tvHobbiesInfo;
    TextView tvWeightInfo;
    TextView tvTimeInfo;

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
        setViews(view);

        ((ViewPager) collection).addView(view, 0);
        return view;

    }


    private void setViews(View view) {
        imgProfile=view.findViewById(R.id.imgProfile);
        tvName = view.findViewById(R.id.tvFullName);
        tvAddressInfo=view.findViewById(R.id.tvAddressInfo);
        tvAgeInfo=view.findViewById(R.id.tvAgeInfo);
        tvBloodGroupInfo=view.findViewById(R.id.tvBloodGroupInfo);//only in 2 out of 4 layouts
        tvHobbiesInfo=view.findViewById(R.id.tvHobbiesInfo);//only in 2 out of 4 layouts
        tvAboutInfo = view.findViewById(R.id.tvAboutInfo);
        tvCallInfo = view.findViewById(R.id.tvCallInfo);
        tvDOBInfo = view.findViewById(R.id.tvDOBInfo);
        tvEducationInfo=view.findViewById(R.id.tvEducationInfo);
        tvFamilyInfo=view.findViewById(R.id.tvFamilyInfo);//only in 2 out of 4 layouts
        tvExpectationsInfo=view.findViewById(R.id.tvExpecationsInfo);//only in 2 out of 4 layouts
        tvHeightInfo=view.findViewById(R.id.tvHeightInfo);
        tvWeightInfo = view.findViewById(R.id.tvWeightInfo);
        tvTimeInfo=view.findViewById(R.id.tvTimeInfo);//only in 3 out of 4 layouts



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