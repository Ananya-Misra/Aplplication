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

import com.example.layoutapplication.model.UserBiodataModel;

import java.util.ArrayList;

public class CustomPagerAdapter extends PagerAdapter {

    int[] bioLayouts = {R.layout.profile_of_woman, R.layout.profile_of_man
            , R.layout.profile, R.layout.biodata_of_man,R.layout.biodata_of_woman,R.layout.woman_biodata,R.layout.bride_biodata};

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
    TextView tvEmailInfo;

    TextView tvEducationInfo;
    TextView tvExpectationsInfo;
    TextView tvFamilyInfo;
    TextView tvHeightInfo;
    TextView tvHobbiesInfo;
    TextView tvLanguageInfo;
    TextView tvWeightInfo;
    TextView tvTimeInfo;
    UserBiodataModel userBiodataModel;

    public CustomPagerAdapter(Context context, ArrayList<Integer> pager,UserBiodataModel userBiodataModel) {
        this.context = context;
        this.pager = pager;
        this.userBiodataModel = userBiodataModel;
    }

    @Override
    public int getCount() {
        return bioLayouts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    public Object instantiateItem(ViewGroup collection, int position) {

        LayoutInflater inflater = (LayoutInflater) collection.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int resId = bioLayouts[position];
        View view = inflater.inflate(resId, null);
        setViews(view);

        ((ViewPager) collection).addView(view, 0);
        return view;

    }


    private void setViews(View view) {
        imgProfile = view.findViewById(R.id.imgProfile);
        tvName = view.findViewById(R.id.tvFullName);
        tvAddressInfo = view.findViewById(R.id.tvAddressInfo);
        tvAgeInfo = view.findViewById(R.id.tvAgeInfo);
        tvAboutInfo = view.findViewById(R.id.tvAboutInfo);
        tvBloodGroupInfo = view.findViewById(R.id.tvBloodGroupInfo);
        tvCallInfo = view.findViewById(R.id.tvCallInfo);
        tvDOBInfo = view.findViewById(R.id.tvDOBInfo);
        tvEmailInfo = view.findViewById(R.id.tvEmailInfo);
        tvEducationInfo = view.findViewById(R.id.tvEducationInfo);
        tvFamilyInfo = view.findViewById(R.id.tvFamilyInfo);
        tvExpectationsInfo = view.findViewById(R.id.tvExpecationsInfo);
        tvHobbiesInfo = view.findViewById(R.id.tvHobbiesInfo);
        tvHeightInfo = view.findViewById(R.id.tvHeightInfo);
        tvLanguageInfo = view.findViewById(R.id.tvLanguageInfo);
        tvWeightInfo = view.findViewById(R.id.tvWeightInfo);
        tvTimeInfo = view.findViewById(R.id.tvTimeInfo);

        setBiodataValues();
    }

    private void setBiodataValues() {
        if (userBiodataModel!=null){
            if(!TextUtils.isEmpty(userBiodataModel.getBioName())){
                tvName.setText(userBiodataModel.getBioName());
            }
        }
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