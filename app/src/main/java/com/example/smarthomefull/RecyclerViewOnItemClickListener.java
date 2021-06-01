package com.example.smarthomefull;

import android.view.View;

public interface  RecyclerViewOnItemClickListener {

    void onClick(View v, int position);

    void onClickDel(View v, int position);
}
