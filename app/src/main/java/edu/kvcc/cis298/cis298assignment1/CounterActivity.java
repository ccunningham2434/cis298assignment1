package edu.kvcc.cis298.cis298assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {

    private TextView mCounterTextView;
    private Button mIncrementButton;
    private Button mDecrementButton;

    private int mCounterValue = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        // >Use findViewById to get a reference to the textview in the layout.
        mCounterTextView = (TextView) findViewById(R.id.counter_text_view);
       // >Change the counter view.
        updateCounterView();

        // >Get a reference to the increment button and set it's onclicklistener.
        mIncrementButton = (Button) findViewById(R.id.increment_button);
        mIncrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCounter();
            }
        });
        // >Get a reference to the decrement button and set it's onclicklistener.
        mDecrementButton = (Button) findViewById(R.id.decrement_button);
        mDecrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementCounter();
            }
        });

    }

    // >Change the text view to the current counter value.
    private void updateCounterView() {
        mCounterTextView.setText(Integer.toString(mCounterValue));
    }

    // >Increment the counter.
    private void incrementCounter() {
        mCounterValue++;
        updateCounterView();
        if (mCounterValue == 21) {
            Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
        }
    }
    // >Decrement the counter.
    private void decrementCounter() {
        mCounterValue--;
        updateCounterView();
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
}
