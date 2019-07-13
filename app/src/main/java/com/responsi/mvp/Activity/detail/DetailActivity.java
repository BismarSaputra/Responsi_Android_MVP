package com.responsi.mvp.Activity.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import com.responsi.mvp.R;

public class DetailActivity extends AppCompatActivity {

    private String nama ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        nama = getIntent().getStringExtra("nama");
        TextView text = findViewById(R.id.tvTest);
        text.setText(nama);
    }
}
