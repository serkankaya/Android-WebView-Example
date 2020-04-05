package net.serkankaya.webviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.webView);
        editText=findViewById(R.id.editText);
        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.serkankaya.net");
    }

    public void fncGo(View view){
        webView.loadUrl("http://"+editText.getText().toString());
    }
    public void fncStop(View view){
        webView.stopLoading();
    }
    public void fncBack(View view){
        webView.goBack();
    }
    public void fncHome(View view){
        webView.loadUrl("http://www.serkankaya.net");
    }
}
