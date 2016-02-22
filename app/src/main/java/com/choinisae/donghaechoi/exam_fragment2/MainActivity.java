

package com.choinisae.donghaechoi.exam_fragment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FragmentDataListener {


    private BlankFragment frag1;
    private TextView mAteamTxt;
    private TextView mBteamTxt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag1 = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.frag1);
        mAteamTxt = (TextView) findViewById(R.id.ateam_txt);
        mBteamTxt = (TextView) findViewById(R.id.bteam_txt);
        frag1.setListener(this);
    }


    @Override
    public void dataListener(int aTeam, int bTeam) {
        mAteamTxt.setText(String.valueOf(aTeam));
        mBteamTxt.setText(String.valueOf(bTeam));
    }
}