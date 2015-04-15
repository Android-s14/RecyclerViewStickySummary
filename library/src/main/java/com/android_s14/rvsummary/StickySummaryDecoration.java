package com.android_s14.rvsummary;

import android.graphics.Canvas;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class StickySummaryDecoration extends RecyclerView.ItemDecoration {

	@Override
	public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
		int childCount = parent.getAdapter().getItemCount();
		int lastVisibleItemPosition =
				((LinearLayoutManager) parent.getLayoutManager()).findLastVisibleItemPosition();
		int firstVisiblePosition =
				((LinearLayoutManager) parent.getLayoutManager())
						.findFirstCompletelyVisibleItemPosition();
		if ((firstVisiblePosition == 0) && (lastVisibleItemPosition == (childCount - 1))) {
			View summaryView = parent.getChildAt(parent.getChildCount() - 1);
			int topOffset = parent.getHeight() - summaryView.getHeight();
			int leftOffset =
					((RecyclerView.LayoutParams) summaryView.getLayoutParams()).leftMargin;
			c.save();
			c.translate(leftOffset, topOffset);
			summaryView.draw(c);
			c.restore();
			summaryView.setVisibility(View.GONE);
		}
	}

}
