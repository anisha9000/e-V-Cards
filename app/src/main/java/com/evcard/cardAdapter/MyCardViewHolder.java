package com.evcard.cardAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.evcard.R;

/**
 * Created by anisha on 3/11/17.
 */

public class MyCardViewHolder extends RecyclerView.ViewHolder {

    protected TextView tvName;
    protected TextView tvJobTitle;
    protected TextView tvPhoneNumber;
    protected ImageView ivLogo;

    public MyCardViewHolder(View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.name);
        tvJobTitle = (TextView) itemView.findViewById(R.id.job_title);
        tvPhoneNumber = (TextView) itemView.findViewById(R.id.phone);
        ivLogo = (ImageView) itemView.findViewById(R.id.logo);

    }
}
