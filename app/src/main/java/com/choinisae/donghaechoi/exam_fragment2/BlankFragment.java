
package com.choinisae.donghaechoi.exam_fragment2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BlankFragment extends Fragment implements View.OnClickListener {

    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private Button mBtn6;
    int aTeamScore = 0;
    int bTeamScore = 0;
    private FragmentDataListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        mBtn1 = (Button) view.findViewById(R.id.btn1); // + - reset
        mBtn2 = (Button) view.findViewById(R.id.btn2);
        mBtn3 = (Button) view.findViewById(R.id.btn3);
        mBtn4 = (Button) view.findViewById(R.id.btn4); // + - reset
        mBtn5 = (Button) view.findViewById(R.id.btn5);
        mBtn6 = (Button) view.findViewById(R.id.btn6);

        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
        mBtn6.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == mBtn1.getId()) {
            ++aTeamScore;
        } else if (v.getId() == mBtn2.getId()) {
            --aTeamScore;
        } else if (v.getId() == mBtn3.getId()) {
            aTeamScore = 0;
        } else if (v.getId() == mBtn4.getId()) {
            ++bTeamScore;
        } else if (v.getId() == mBtn5.getId()) {
            --bTeamScore;
        } else if (v.getId() == mBtn6.getId()) {
            bTeamScore = 0;
        }
        if (mListener != null) {
            mListener.dataListener(aTeamScore, bTeamScore);
        }

    }

    public void setListener(FragmentDataListener listener) {
        mListener = listener;
    }


}
