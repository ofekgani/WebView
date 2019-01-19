package com.example.user.idoefes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText etA, etB, etC;
    Button btn0, btn1;
    int a, b, c;
    String url="https://www.google.co.il/search?ei=DXVCXKS6LbHrxgPV-YGYDw&q=";
    String st0,st1,st2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        etA = findViewById(R.id.editTextA);
        etB = findViewById(R.id.editTextB);
        etC = findViewById(R.id.editTextC);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn0);

    }

    public void StartPage(View view) {
        st0 = etA.getText().toString();
        a= Integer.parseInt(st0);
        st1 = etB.getText().toString();
        b= Integer.parseInt(st1);
        st2 = etC.getText().toString();
        c= Integer.parseInt(st2);
        url="https://www.google.co.il/search?ei=DXVCXKS6LbHrxgPV-YGYDw&q=";
        url = url+a+"x%5E2%2B"+b+"x%2B"+c+"&oq";
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }

    public void NewSolution(View view) {
        etA.setText("");
        etB.setText("");
        etC.setText("");
        url = "";
        webView.loadUrl(url);

    }
}
