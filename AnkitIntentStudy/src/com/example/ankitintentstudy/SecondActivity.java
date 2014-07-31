package com.example.ankitintentstudy;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

	TextView tvName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		tvName = (TextView) findViewById(R.id.textView2);

		Intent obtainedIntent = getIntent();
		String obName = obtainedIntent.getStringExtra("USERNAME");

		tvName.setText(obName);

		int obAge = obtainedIntent.getIntExtra("AGE", 0);

		Toast.makeText(getBaseContext(), "Age " + obAge, Toast.LENGTH_LONG)
				.show();

		Bundle obBag1 = obtainedIntent.getBundleExtra("BAG1");
		String obCom = obBag1.getString("COMICS");
		double obWt = obBag1.getDouble("WEIGHT");

		Toast.makeText(getBaseContext(), "Comics " + obCom, Toast.LENGTH_LONG)
				.show();
		Toast.makeText(getBaseContext(), "Wt " + obWt, Toast.LENGTH_LONG)
				.show();

		Bundle obBag2 = obtainedIntent.getBundleExtra("BAG2");
		ArrayList<String> obFavWords = obBag2.getStringArrayList("FAV_WORDS");

		Toast.makeText(getBaseContext(), "FAV Words", Toast.LENGTH_LONG).show();
		for (String s : obFavWords) {
			Toast.makeText(getBaseContext(), s, Toast.LENGTH_LONG).show();
		}

	}
}
