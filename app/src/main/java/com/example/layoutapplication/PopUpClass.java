package com.example.layoutapplication;


import android.content.Context;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.example.layoutapplication.model.UserBiodataModel;

import java.util.ArrayList;

public class PopUpClass {

    //PopupWindow display method
    ViewPager viewPager;
    ArrayList<Integer> arrayList;
    LinearLayout layout_dot;
    TextView[] dot;

    public void showPopupWindow(final View view, Context context) {


        //Create a View object yourself through inflater
        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.pager_view, null);

        //Specify the length and width through constants
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;

        //Make Inactive Items Outside Of PopupWindow
        boolean focusable = true;

        //Create a window with our parameters
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        //Set the location of the window on the screen
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);



        //Handler for clicking on the inactive zone of the window

        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                //Close the window when clicked
                popupWindow.dismiss();
                return true;
            }
        });


        //view pager area

        viewPager = popupView.findViewById(R.id.viewpager);
        layout_dot = popupView.findViewById(R.id.layout_dot);
        arrayList = new ArrayList<>();

        UserBiodataModel userBiodataModel = getUserNameModel();
        CustomPagerAdapter pagerAdapter = new CustomPagerAdapter(context, arrayList,userBiodataModel);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setPageMargin(10);
        addDot(0, context,pagerAdapter.getCount());


        // whenever the page changes
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                addDot(i, context,pagerAdapter.getCount());
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    private UserBiodataModel getUserNameModel() {

        // Set all values
        UserBiodataModel userBiodataModel = new UserBiodataModel();

        userBiodataModel.setBioName("Sara Bellum");//1
        userBiodataModel.setBioDob("15/06/2010");//2
        userBiodataModel.setBioTime("5:30 PM");//3
        userBiodataModel.setBioHeight("5'5");//4
        userBiodataModel.setBioAge("23 Years");//5
        userBiodataModel.setBioAddress("Street 14,Cape Town");//6
        userBiodataModel.setBioEmail("abracadabra@gmail.com");//7
        userBiodataModel.setBioWeight("69kg");//8
        userBiodataModel.setBioHobbies("Photography and Skating");//9
        userBiodataModel.setBioLanguage("French,Spanish,English and Hindi");//10
        userBiodataModel.setBioBloodGroup("O+");//11
        userBiodataModel.setBioBirthPlace("Srinagar");//12
        userBiodataModel.setBioCityLiving("Jaipur");//13
        userBiodataModel.setBioReligion("Christianity");//14
        userBiodataModel.setBioEducation("Post Graduation in the field of something");//15
        userBiodataModel.setBioOccupation("Doctor");//16
        userBiodataModel.setBioSalary("6 lakh per annum");//17
        userBiodataModel.setBioFatherName("Mr Unknown");//18
        userBiodataModel.setBioMotherName("Mrs Unknown");//19
        userBiodataModel.setBioSibling("Miss Prema Prasad and Mr Harim Prasad");//20
        userBiodataModel.setBioAboutMe("Well I don't know much about myself I will tell you once I myself have figured that out.This text just need to be 3 lines long, I am trying to just do that.");//21
        userBiodataModel.setBioContact("929299299292");//22
        userBiodataModel.setBioLookingFor("This doesn't need to make sense the only requirement for this field is to be long enough so bla bla bla bla bla. ");//23
        userBiodataModel.setBioProfileImage("R.drawable.character");//24
        return userBiodataModel;
    }

    public void addDot(int page_position, Context context,int count) {
        dot = new TextView[count];
        layout_dot.removeAllViews();

        for (int i = 0; i < dot.length; i++) {
            ;
            dot[i] = new TextView(context);
            dot[i].setText(Html.fromHtml("&#9673;"));
            dot[i].setTextSize(35);
            dot[i].setTextColor(context.getResources().getColor(R.color.grey));
            layout_dot.addView(dot[i]);
        }
        //active dot
        dot[page_position].setTextColor(context.getResources().getColor(R.color.black));
    }

}