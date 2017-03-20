package net.hitechwebdesign.hitechwebdesign;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Home extends Activity{
	
	Intent ab, fea, pho, soc, cont;

	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.home);
		
		getActionBar().hide();
		
		
		ImageView about, feature, photo, social, call, contact;
		
		ab = new Intent(this, About.class);
		fea = new Intent(this, Feature.class);
		pho = new Intent(this, Photos.class);
		soc = new Intent(this, Social.class);
		cont = new Intent(this, Contact.class);
		
		about = (ImageView) findViewById(R.id.aboutus);
		call = (ImageView) findViewById(R.id.callus);
		feature = (ImageView) findViewById(R.id.features);
		photo = (ImageView) findViewById(R.id.photos);
		social = (ImageView) findViewById(R.id.social);
		contact = (ImageView) findViewById(R.id.contact);
		
		
		
		about.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(ab);
			}
		});
		
		
		call.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
			    callIntent.setData(Uri.parse("tel:+01733928438"));
			    startActivity(callIntent);
				
			}
		});
		
		feature.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(fea);
				
			}
		});
		
		
		photo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(pho);
				
			}
		});
		
		social.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(soc);
				
			}
		});
		
		contact.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(cont);
				
			}
		});
		
		
		
		
	}
	
	
	

}
