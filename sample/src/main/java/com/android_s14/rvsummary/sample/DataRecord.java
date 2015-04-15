package com.android_s14.rvsummary.sample;

import android.graphics.drawable.Drawable;

import com.android_s14.rvh.DataModel;

public class DataRecord implements DataModel {

	private String value;

	public DataRecord(String value) {
		this.value = value;
	}

	@Override
	public String getTextField(int i) {
		return value;
	}

	@Override
	public int getTextFieldsNumber() {
		return 1;
	}

	@Override
	public Drawable getImageField(int i) {
		return null;
	}

	@Override
	public int getImageFieldsNumber() {
		return 0;
	}
}
