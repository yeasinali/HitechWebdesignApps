package net.hitechwebdesign.hitechwebdesign;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	Intent home;

    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        getActionBar().hide();
        
        home = new Intent(this, Home.class);
        
        ImageView imgview = (ImageView) findViewById(R.id.imageView1);
        
        imgview.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				

				startActivity(home);
				
			}
		});
 
        
        
        
       
        
    }


   
    
}
