package com.cst2335.mobilefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

/**
 * This class define fragment to be used
 */
public class EmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        Bundle dataToPass = getIntent().getExtras();
        Log.i("data", dataToPass.getString("urlF"));

        DetailsPhoto dFragment = new DetailsPhoto();
        dFragment.setArguments(dataToPass);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment,dFragment)
                .commit();

    }
}