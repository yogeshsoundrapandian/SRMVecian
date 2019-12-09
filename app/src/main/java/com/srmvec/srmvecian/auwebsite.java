package com.srmvec.srmvecian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class auwebsite extends AppCompatActivity {
    private WebView wv;
    private WebSettings ws;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auwebsite);
        wv=(WebView)findViewById(R.id.webView);
        ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://www.annauniv.edu/");
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK)&&wv.canGoBack())
        {
            wv.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
