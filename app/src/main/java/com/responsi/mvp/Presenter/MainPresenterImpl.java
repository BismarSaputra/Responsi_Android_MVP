package com.responsi.mvp.Presenter;

import com.responsi.mvp.Activity.main.MainView;
import com.responsi.mvp.Model.People2;
import com.responsi.mvp.Service.ApiService;
import com.responsi.mvp.Service.PeopleService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenterImpl implements MainPresenter {

    private MainView mainView;
    private People2 people;
    private ApiService service = new ApiService();

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void load() {
        service
                .getNetwork()
                .create(PeopleService.class)
                .getData()
                .enqueue(new Callback<People2>() {
                    @Override
                    public void onResponse(Call<People2> call, Response<People2> response) {
                        people = response.body();

                        if (people.getResults() != null) {
                            mainView.onLoad(people);
                        }
                    }

                    @Override
                    public void onFailure(Call<People2> call, Throwable t) {

                    }
                });
    }

}
