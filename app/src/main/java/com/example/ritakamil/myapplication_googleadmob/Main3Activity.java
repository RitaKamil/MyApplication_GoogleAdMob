package com.example.ritakamil.myapplication_googleadmob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class Main3Activity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Button buttonInterstitial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        MobileAds.initialize(this, "ca-app-pub-8172242174540054~4208542245");


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-8172242174540054/6285693632");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        buttonInterstitial = (Button)findViewById(R.id.buttonInterstitial);
        buttonInterstitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });


    }
}
