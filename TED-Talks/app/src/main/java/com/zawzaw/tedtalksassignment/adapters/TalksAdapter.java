package com.zawzaw.tedtalksassignment.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zawzaw.tedtalksassignment.R;
import com.zawzaw.tedtalksassignment.delegates.TalksDelegate;
import com.zawzaw.tedtalksassignment.viewholders.TalksViewHolder;

public class TalksAdapter extends RecyclerView.Adapter {

    private TalksDelegate mTalksDelegate;

    public TalksAdapter(TalksDelegate talksDelegate) {
        mTalksDelegate = talksDelegate;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_talks, parent, false);
        return new TalksViewHolder(view, mTalksDelegate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }

}