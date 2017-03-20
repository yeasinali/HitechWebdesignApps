package net.hitechwebdesign.hitechwebdesign;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends Activity{

	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_activity);
		
		getActionBar().hide();
		
		WebView view = (WebView) findViewById(R.id.webView1);
		
		view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/view/about.html");
	}

	
	
	
}
