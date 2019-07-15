package com.jwhh.jim.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALCActivity extends AppCompatActivity {

    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        {


            if (getActionBar() != null) getActionBar().setDisplayHomeAsUpEnabled(true);

            webView = findViewById(R.id.webView);
            WebSettings webSettings = webView.getSettings();


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            }

            webSettings.setJavaScriptEnabled(true);


            webView.setWebViewClient(new WebViewClient() {
                @Override
                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {

                    handler.proceed();
                }
            });


            webView.loadUrl("https://andela.com/alc/");
        }
    }

    ;

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        }
    }

    {
        finish();
    }
}
