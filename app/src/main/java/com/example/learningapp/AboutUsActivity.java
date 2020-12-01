package com.example.learningapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @programName: AboutUsActivity.java
 * @programFunction: About Us page
 * @createDate: 2018/09/19
 * @author: AnneHan
 * @version:
 * xx.   yyyy/mm/dd   ver    author    comments
 * 01.   2018/09/19   1.00   AnneHan   New Create
 */
public class AboutUsActivity extends AppCompatActivity {
    private TextView tvAboutUs;
    private TextView tvIntroduce;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
    }
}

