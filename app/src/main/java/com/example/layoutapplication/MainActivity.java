package com.example.layoutapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;





        import android.os.Bundle;

        import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
        import android.widget.LinearLayout;
        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ArrayList<Integer> arrayList;
    LinearLayout layout_dot;
    TextView[] dot;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        // Create a button handler and call the dialog box display method in it
        Button popupButton = findViewById(R.id.btn_showDialog);
        popupButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                PopUpClass popUpClass = new PopUpClass();
                popUpClass.showPopupWindow(v);
            }
        });



    }
    public void addDot(int page_position) {
        dot = new TextView[arrayList.size()];
        layout_dot.removeAllViews();

        for (int i = 0; i < dot.length; i++) {;
            dot[i] = new TextView(this);
            dot[i].setText(Html.fromHtml("&#9673;"));
            dot[i].setTextSize(35);
            dot[i].setTextColor(getResources().getColor(R.color.grey));
            layout_dot.addView(dot[i]);
        }
        //active dot
        dot[page_position].setTextColor(getResources().getColor(R.color.black));
    }
}