package com.thetutx.notorious.easyearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class earnMenu extends AppCompatActivity {
    InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn_menu);


        Button b = (Button) findViewById(R.id.showadsbtn);

        //set ads properties
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5750116362077600/3008781574");


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
                Toast.makeText(getApplicationContext(), "short message", Toast.LENGTH_SHORT).show();

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {

                        mInterstitialAd.show();
                    }

                    @Override
                    public void onAdOpened() {
                        Log.d("Ads","ad is running loading new ad");

                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                    @Override
                    public void onAdFailedToLoad(int i) {
                        Log.d("Ads","Loading failed ads");
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                    @Override
                    public void onAdLoaded() {
                        mInterstitialAd.show();
                    }
                });


            }
        });



    }




}
