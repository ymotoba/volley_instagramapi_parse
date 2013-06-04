package com.example.volleyfirst;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

/**
 * jsonパースのテストアクティビティ
 */
public class JsonParseTestActivity extends Activity {
	private RequestQueue mQueue;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_json_parse_test);
		mQueue = Volley.newRequestQueue(getApplicationContext());
		// JsonObjectRequest
		String url = "https://api.instagram.com/v1/media/popular?client_id=080a3d99d3f64953b63ff690d77085b6";
//		mQueue.add(new JsonObjectRequest(Method.GET, url, null,
//				new Listener<JSONObject>() {
//					/**
//					 * @param response
//					 */
//					@Override
//					public void onResponse(JSONObject response) {
//						Log.d("", "response : " + response.toString());
//					}
//				},
//				new ErrorListener() {
//					/* (non-Javadoc)
//					 * @see com.android.volley.Response.ErrorListener#onErrorResponse(com.android.volley.VolleyError)
//					 */
//					@Override
//					public void onErrorResponse(VolleyError error) {
//						System.out.println(error.toString());
//					}
//				}));
//		mQueue.start();
		// StringRequest
		mQueue.add(new StringRequest(Method.GET, url,
				new Listener<String>() {
					/**
					 * @param response
					 */
					@Override
					public void onResponse(String response) {
						long start = System.currentTimeMillis();
						Gson gson = new Gson();
						InstagramResponse instagramResponse = gson.fromJson(response, InstagramResponse.class);
						long end = System.currentTimeMillis();
						System.out.println(Long.toString(end - start));
					}
				},
				new ErrorListener() {
					/* (non-Javadoc)
					 * @see com.android.volley.Response.ErrorListener#onErrorResponse(com.android.volley.VolleyError)
					 */
					@Override
					public void onErrorResponse(VolleyError error) {
						System.out.println(error.toString());
					}
				}));
		mQueue.start();
	}
}
