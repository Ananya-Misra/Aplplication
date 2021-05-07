package com.example.layoutapplication;



        import android.content.Context;
        import android.text.Html;
        import android.view.Gravity;
        import android.view.LayoutInflater;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.Button;
        import android.widget.LinearLayout;
        import android.widget.PopupWindow;
        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.viewpager.widget.ViewPager;

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
        View popupView = inflater.inflate(R.layout.activity_main2, null);

        //Specify the length and width through constants
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;

        //Make Inactive Items Outside Of PopupWindow
        boolean focusable = true;

        //Create a window with our parameters
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        //Set the location of the window on the screen
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        //Initialize the elements of our window, install the handler

//        TextView test2 = popupView.findViewById(R.id.titleText);
//        test2.setText(R.string.textTitle);

//        ViewPager buttonEdit = popupView.findViewById(R.id.view_pager);
//        buttonEdit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //As an example, display the message
//                Toast.makeText(view.getContext(), "Wow, popup action button", Toast.LENGTH_SHORT).show();
//
//            }
//        });



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

        arrayList.add(R.color.blue);
        arrayList.add(R.color.black);
        arrayList.add(R.color.dark_blue);
        arrayList.add(R.color.sea_green);

        CustomPagerAdapter pagerAdapter = new CustomPagerAdapter(context, arrayList);
        viewPager.setAdapter(pagerAdapter);
//        viewPager.setPageMargin(20);
        addDot(0,context);

        // whenever the page changes
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }
            @Override
            public void onPageSelected(int i) {
                addDot(i,context);
            }
            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
    public void addDot(int page_position,Context context) {
        dot = new TextView[arrayList.size()];
        layout_dot.removeAllViews();

        for (int i = 0; i < dot.length; i++) {;
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