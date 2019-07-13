package com.responsi.mvp.Activity.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.responsi.mvp.Adapter.RV_Adapter;
import com.responsi.mvp.Model.People2;
import com.responsi.mvp.Model.RestResponse;
import com.responsi.mvp.Presenter.MainPresenterImpl;
import com.responsi.mvp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    private RecyclerView rv;
    private RV_Adapter adapter = new RV_Adapter();
    private MainPresenterImpl presenter;
    private List<RestResponse> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        findView();
    }

    private void findView() {
        rv = findViewById(R.id.rvMain);
        rv.setAdapter(adapter);
    }

    private void init() {
        presenter = new MainPresenterImpl(this);
        presenter.load();
        adapter.setAct(this);
    }

    @Override
    public void onLoad(People2 people) {
        item.addAll(people.getResults());
        adapter.setData(item);
        adapter.notifyDataSetChanged();
    }


}
