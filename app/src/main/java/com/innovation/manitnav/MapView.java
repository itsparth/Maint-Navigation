package com.innovation.manitnav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MapView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);; // http://example.com/image.jpg
        WebView wv = (WebView) findViewById(R.id.yourWebview);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.getSettings().setDisplayZoomControls(false);
        wv.loadDataWithBaseURL("file:///android_asset/", "<img src=\"file:///android_res/drawable/route.png\"/>", "text/html", "utf-8", null);
    }
    public void goNext(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
