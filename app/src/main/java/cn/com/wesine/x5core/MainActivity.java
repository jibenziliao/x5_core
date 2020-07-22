package cn.com.wesine.x5core;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.tencent.smtt.sdk.WebView;

import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (getSupportActionBar()!=null) getSupportActionBar().hide();
        if (getActionBar()!=null) getActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        mWebView = (com.tencent.smtt.sdk.WebView) findViewById(R.id.webView2);
        if (mWebView.getX5WebViewExtension() != null) {
            Toast.makeText(getApplicationContext(), "开启成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "开启失败", Toast.LENGTH_SHORT).show();
        }
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("file:///android_asset/web/index.html");
//        mWebView.loadUrl("http://wm-lps-test.wumart.com/web/lossGoodsTaskDetail?currentUserAccount=0047&currentUserName=%E6%9D%8E%E5%AF%8C%E8%80%80&id=357215");
    }
}