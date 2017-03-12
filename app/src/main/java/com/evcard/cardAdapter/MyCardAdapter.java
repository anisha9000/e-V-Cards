package com.evcard.cardAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evcard.Dashboard;
import com.evcard.R;
import com.evcard.utils.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by anisha on 3/10/17.
 */

public class MyCardAdapter extends RecyclerView.Adapter<MyCardViewHolder> {

    private static final String TAG = "MyCardAdapter";
    JSONArray cardList;
    Context context;

    public MyCardAdapter(Dashboard dashboard, JSONArray cardList) {
        this.cardList = cardList;
        context = dashboard;
        Log.e(TAG, "Constructor:"+cardList);
    }

    @Override
    public MyCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_card_layout,
                parent, false);
        return new MyCardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyCardViewHolder holder, int position) {
        try {
            JSONObject myCardInfo = cardList.getJSONObject(position);
            holder.tvName.setText(myCardInfo.getString(Constants.CARD_NAME));
            holder.tvJobTitle.setText(myCardInfo.getString(Constants.CARD_JOB_TITLE) + ", "+
                    myCardInfo.getString(Constants.CARD_COMPANY));
            holder.tvPhoneNumber.setText(myCardInfo.getString(Constants.CARD_PHONE_NUMBER));
        } catch (JSONException e) {
            Log.e(TAG,"Exception:"+e.toString());
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        Log.e(TAG, "Item count:"+ cardList.length());
        return cardList.length();
    }
}
