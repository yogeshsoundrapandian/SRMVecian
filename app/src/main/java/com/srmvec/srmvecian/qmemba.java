package com.srmvec.srmvecian;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class qmemba extends AppCompatActivity {
    private WebView wv;
    private WebSettings ws;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qb);
        wv=(WebView)findViewById(R.id.webView);
        ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.loadUrl("http://www.srmvalliammai.ac.in/questionbank-mba.html");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
