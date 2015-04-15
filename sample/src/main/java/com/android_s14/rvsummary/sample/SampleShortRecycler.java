package com.android_s14.rvsummary.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;

import com.android_s14.rvh.DataModel;
import com.android_s14.rvh.RecyclerViewBuilder;
import com.android_s14.rvsummary.StickySummaryDecoration;

import java.util.ArrayList;
import java.util.List;


public class SampleShortRecycler extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View rootView = getLayoutInflater().inflate(R.layout.activity_sample_summary_recycler,
		                                            null);
		RecyclerView recyclerView = new RecyclerViewBuilder(this).setData(getShortData())
		                                                         .build();
		recyclerView.addItemDecoration(new StickySummaryDecoration());
		((FrameLayout) rootView).addView(recyclerView, FrameLayout.LayoutParams.MATCH_PARENT,
		                                 FrameLayout.LayoutParams.MATCH_PARENT);
		setContentView(rootView);
	}


	private List<DataModel> getShortData() {
		List<DataModel> data = new ArrayList<>();
		data.add(new DataRecord("10"));
		data.add(new DataRecord("20"));
		data.add(new DataRecord("20"));
		data.add(new DataRecord("20"));
		data.add(new DataRecord("20"));
		data.add(new DataRecord("summary"));
		return data;
	}

}
