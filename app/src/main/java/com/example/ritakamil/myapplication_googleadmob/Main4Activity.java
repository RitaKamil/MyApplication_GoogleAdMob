package com.example.ritakamil.myapplication_googleadmob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;


public class Main4Activity extends AppCompatActivity {

    //declarations
    private RewardedVideoAd mRewardedVideoAd;
    private Button mbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        MobileAds.initialize(this, "ca-app-pub-8172242174540054~4208542245");

        // Use an activity context to get the rewarded video instance.
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.loadAd("ca-app-pub-8172242174540054/8044679620",
                new AdRequest.Builder().build());

        mbutton=findViewById(R.id.buttonVideo);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRewardedVideoAd.show();
            }
        });
    }
}
