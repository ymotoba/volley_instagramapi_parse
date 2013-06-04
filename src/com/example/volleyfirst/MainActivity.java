package com.example.volleyfirst;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// set listener
		findViewById(R.id.jsonParseButton).setOnClickListener(new View.OnClickListener() {
			/* (non-Javadoc)
			 * @see android.view.View.OnClickListener#onClick(android.view.View)
			 */
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(), JsonParseTestActivity.class));
			}
		});
	}
}
