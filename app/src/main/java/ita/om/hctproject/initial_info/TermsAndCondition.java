package ita.om.hctproject.initial_info;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;

import ita.om.hctproject.MainActivity;
import ita.om.hctproject.R;

public class TermsAndCondition extends AppCompatActivity {
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);
        WebView webView= (WebView) findViewById(R.id.WebView);
        webView.loadUrl("file:///android_asset/terms_conditions.abc");
        checkBox= (CheckBox) findViewById(R.id.checkBox);

    }
    public void acceptTermAndCondition( View view){
        if(!checkBox.isChecked()){
            return;
        }
        else{
            Intent intent = new Intent(TermsAndCondition.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
