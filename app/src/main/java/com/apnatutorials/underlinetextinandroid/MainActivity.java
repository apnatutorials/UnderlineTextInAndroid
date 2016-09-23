package com.apnatutorials.underlinetextinandroid;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSpannableDemo, tvsetPaintFlagsDemo, tvfromHtmlDemo, tvStringResourceDemo, tvSrikeTextDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSpannableDemo = (TextView) findViewById(R.id.tvSpannableDemo);
        tvsetPaintFlagsDemo = (TextView) findViewById(R.id.tvsetPaintFlagsDemo);
        tvfromHtmlDemo = (TextView) findViewById(R.id.tvfromHtmlDemo);
        tvStringResourceDemo = (TextView) findViewById(R.id.tvStringResourceDemo);
        tvSrikeTextDemo = (TextView) findViewById(R.id.tvSrikeTextDemo);


        // SpannableString demo
        String underlineData = "This is underline text";
        String strikeData = "This is Strike text demo";
        SpannableString content = new SpannableString(underlineData);
        content.setSpan(new UnderlineSpan(), 0, underlineData.length(), 0);
        // 0 specify start index and underlineData.length() specify end index of styling
        tvSpannableDemo.setText(content);
        // End of SpannableString demo

        // setPaintFlags demo
        tvsetPaintFlagsDemo.setPaintFlags(tvsetPaintFlagsDemo.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tvSrikeTextDemo.setPaintFlags(tvsetPaintFlagsDemo.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        tvsetPaintFlagsDemo.setText(underlineData);
        tvSrikeTextDemo.setText(strikeData);

        // Paint.STRIKE_THRU_TEXT_FLAG ;
        // Paint.SUBPIXEL_TEXT_FLAG ;

        // Html.fromHtml(htmlString)
        String htmlString = "<u>This text will be underlined</u>";
        tvfromHtmlDemo.setText(Html.fromHtml(htmlString));

    }
}
