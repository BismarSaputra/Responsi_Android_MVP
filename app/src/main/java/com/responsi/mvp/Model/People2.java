package com.responsi.mvp.Model;

import android.icu.text.IDNA;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class People2{

	@SerializedName("results")
	private List<RestResponse> results;

	@SerializedName("info")
	private IDNA.Info info;

	public void setResults(List<RestResponse> results){
		this.results = results;
	}

	public List<RestResponse> getResults(){
		return results;
	}

	public void setInfo(IDNA.Info info){
		this.info = info;
	}

	public IDNA.Info getInfo(){
		return info;
	}

	@Override
 	public String toString(){
		return 
			"People2{" + 
			"results = '" + results + '\'' + 
			",info = '" + info + '\'' + 
			"}";
		}
}