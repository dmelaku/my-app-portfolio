package app.com.example.android.demoapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.content.Context;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * I don't think I need any meny items for this app since the user
     * can simply back out of it any time they want. So returning false.
     * @param menu
     * @return boolean
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when there is an onClick event when user touches the buttons
     * on main view, as the apps are built the click button can call
     * different programs I created.
     *
     * @param view
     */
    public void sendMessage(View view) {
        //Get the test for the button clicked
        Button btn = (Button) view;
        String buttonText = btn.getText().toString();

        CharSequence text = getString(R.string.toastMsg) + " " + buttonText ;
        Context context = getApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
