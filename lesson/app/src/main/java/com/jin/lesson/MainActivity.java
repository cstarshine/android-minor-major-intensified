package com.jin.lesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

import static com.loopj.android.http.AsyncHttpClient.log;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.error);
        String getServerData = "{" +
                " 'books': [" +
                " { 'language':'Java' , 'edition':'second' }," +
                " { 'language':'C++' , 'lastName':'sung' }" +
                " ]" +
                "}";
        try {
            JSONObject jsonObject = new JSONObject(getServerData);
            JSONArray books = jsonObject.getJSONArray("books");
            String language1 = books.getJSONObject(0).getString("language");
            String edition1 = books.getJSONObject(0).getString("edition");
            String language2 = books.getJSONObject(1).getString("language");
            String lastName = books.getJSONObject(1).getString("lastName");
            textView.setText("language1 = " + language1 + "\nedition1 ="
                    + edition1 + "\nlanguage2 = " + language2 + "\nlastName=" + lastName);
        } catch (JSONException e) {
            e.printStackTrace();
        }


//        client.get("http://skpla.net/ggqME", new AsyncHttpResponseHandler() {
//            @Override
//            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
//                String getServerData = new String(responseBody);
//                try {
//                    JSONObject jsonObject = new JSONObject(getServerData);
//                    String a = jsonObject.getString("a");
//                    String b = jsonObject.getString("b");
//                    String c = jsonObject.getString("c");
//                    Log.i("json Test", "a = "+a+", b = "+b+", c = "+c);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
////                Log.d("sunrin result = ",new String(responseBody));
////                textView.setText(new String(responseBody));
//            }
//            @Override
//            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
//                Log.e("sunrin result = ",statusCode+"");
//                //textView.setText(statusCode);
//            }
//        });
//        String getServerData = "{domino:'100',pizza:'맛있다'}";
//
//        try {
//            JSONObject jsonObject = new JSONObject(getServerData);
//
//            String a = jsonObject.getString("domino");
//            String b = jsonObject.getString("pizza");
//
//            Log.i("json Test", "a = "+a+", b = "+b);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }
}
