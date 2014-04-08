package edu.cs.virginia.ghosthunters;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

//		if (savedInstanceState == null) {
//			getSupportFragmentManager().beginTransaction()
//					.add(R.id.container, new PlaceholderFragment()).commit();
//		}
		Typeface font = Typeface.createFromAsset(getAssets(), "fonts/GHOSTBUS.TTF");
		
		TextView text = (TextView)this.findViewById(R.id.textTitle);
		TextView mac = (TextView)this.findViewById(R.id.mac);
		TextView brooke = (TextView)this.findViewById(R.id.brooke);
		TextView daniel = (TextView)this.findViewById(R.id.daniel);
		TextView bei = (TextView)this.findViewById(R.id.bei);
		TextView loadButton = (TextView)this.findViewById(R.id.loadButton);
		TextView newButton = (TextView)this.findViewById(R.id.newButton);
		
		text.setTypeface(font);
		mac.setTypeface(font);
		brooke.setTypeface(font);
		daniel.setTypeface(font);
		bei.setTypeface(font);
		loadButton.setTypeface(font);
		newButton.setTypeface(font);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
