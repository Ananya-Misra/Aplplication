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
            , R.layout.profile, R.layout.biodata_of_man,R.layout.biodata_of_woman,R.layout.woman_biodata,R.layout.bride_biodata,R.layout.groom_biodata,R.layout.groom_profile};

    Context context;
    ArrayList<Integer> pager;
    TextView tvName;
    TextView tvAddressInfo;
    TextView tvAgeInfo;
    TextView tvBirthPlaceInfo;
    TextView tvBloodGroupInfo;
    ImageView imgProfile;
    TextView tvAboutInfo;
    TextView tvCallInfo;
    TextView tvCityInfo;
    TextView tvDOBInfo;
    TextView tvEmailInfo;

    TextView tvEducationInfo;
    TextView tvExpectationsInfo;
    TextView tvFatherNameInfo;
    TextView tvMotherNameInfo;
    TextView tvSiblingInfo;
    TextView tvOcuppationInfo;
    TextView tvReligionInfo;
    TextView tvHeightInfo;
    TextView tvHobbiesInfo;
    TextView tvLanguageInfo;
    TextView tvWeightInfo;
    TextView tvSalaryInfo;
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
        tvBirthPlaceInfo = view.findViewById(R.id.tvBirthPlaceInfo);
        tvBloodGroupInfo = view.findViewById(R.id.tvBloodGroupInfo);
        tvCallInfo = view.findViewById(R.id.tvCallInfo);
        tvCityInfo = view.findViewById(R.id.tvCityInfo);
        tvDOBInfo = view.findViewById(R.id.tvDOBInfo);
        tvEmailInfo = view.findViewById(R.id.tvEmailInfo);
        tvEducationInfo = view.findViewById(R.id.tvEducationInfo);
        tvExpectationsInfo = view.findViewById(R.id.tvExpectationsInfo);
        tvFatherNameInfo = view.findViewById(R.id.tvFatherNameInfo);
        tvHobbiesInfo = view.findViewById(R.id.tvHobbiesInfo);
        tvHeightInfo = view.findViewById(R.id.tvHeightInfo);
        tvLanguageInfo = view.findViewById(R.id.tvLanguageInfo);
        tvMotherNameInfo = view.findViewById(R.id.tvMotherNameInfo);
        tvOcuppationInfo=view.findViewById(R.id.tvOccupationInfo);
        tvWeightInfo = view.findViewById(R.id.tvWeightInfo);
        tvReligionInfo=view.findViewById(R.id.tvReligionInfo);
        tvSalaryInfo = view.findViewById(R.id.tvSalaryInfo);
        tvSiblingInfo = view.findViewById(R.id.tvSiblingInfo);
        tvTimeInfo = view.findViewById(R.id.tvTimeInfo);

        setBiodataValues();
    }

    private void setBiodataValues() {
        if (userBiodataModel!=null){
            if(!TextUtils.isEmpty(userBiodataModel.getBioName()) && tvName!=null){
                tvName.setText(userBiodataModel.getBioName());//1
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioDob()) && tvDOBInfo!=null){
                tvDOBInfo.setText(userBiodataModel.getBioDob());//2
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioTime()) && tvTimeInfo!=null){
                tvTimeInfo.setText(userBiodataModel.getBioTime());//3
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioHeight()) && tvHeightInfo!=null){
                tvHeightInfo.setText(userBiodataModel.getBioHeight());//4
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioBirthPlace()) && tvBirthPlaceInfo!=null){
                tvBirthPlaceInfo.setText(userBiodataModel.getBioBirthPlace());//5
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioCityLiving()) && tvCityInfo!=null){
                tvCityInfo.setText(userBiodataModel.getBioCityLiving());//6
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioReligion()) && tvReligionInfo!=null){
                tvReligionInfo.setText(userBiodataModel.getBioReligion());//7
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioEducation()) && tvEducationInfo!=null){
                tvEducationInfo.setText(userBiodataModel.getBioEducation());//8
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioOccupation()) && tvOcuppationInfo!=null){
                tvOcuppationInfo.setText(userBiodataModel.getBioOccupation());//9
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioSalary()) && tvSalaryInfo!=null){
                tvSalaryInfo.setText(userBiodataModel.getBioSalary());//10
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioFatherName()) && tvFatherNameInfo!=null){
                tvFatherNameInfo.setText(userBiodataModel.getBioFatherName());//11
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioMotherName()) && tvMotherNameInfo!=null){
                tvMotherNameInfo.setText(userBiodataModel.getBioMotherName());//12
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioSibling()) && tvSiblingInfo!=null){
                tvSiblingInfo.setText(userBiodataModel.getBioSibling());//13
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioAboutMe()) && tvAboutInfo!=null){
                tvAboutInfo.setText(userBiodataModel.getBioAboutMe());//14
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioContact()) && tvCallInfo!=null){
                tvCallInfo.setText(userBiodataModel.getBioContact());//15
            }
            if(!TextUtils.isEmpty(userBiodataModel.getBioLookingFor()) && tvExpectationsInfo!=null){
                tvExpectationsInfo.setText(userBiodataModel.getBioLookingFor());//16
            }
//            if(!TextUtils.isEmpty(userBiodataModel.getBioProfileImage()) && imgProfile!=null){
//                imgProfile.setImageResource(userBiodataModel.getBioProfileImage());//17
//            }
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