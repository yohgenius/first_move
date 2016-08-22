package com.example.gigalodon.first_move;

import android.R.id;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    // Variable Declaration

    EditText edt_income, edt_outcome;
    TextView t_result;
    String evalue;
    Button b_one, b_two, b_three, b_four, b_five, b_six, b_seven, b_eight, b_nine, b_zero, b_clear, b_delete;

    double income, outcome, sum;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_income = (EditText) findViewById(R.id.edt_income);
        edt_outcome = (EditText) findViewById(R.id.edt_outcome);
        t_result = (TextView) findViewById(R.id.t_result);

        b_one = (Button) findViewById(R.id.b_one);
        b_two = (Button) findViewById(R.id.b_two);
        b_three = (Button) findViewById(R.id.b_three);
        b_four = (Button) findViewById(R.id.b_four);
        b_five = (Button) findViewById(R.id.b_five);
        b_six = (Button) findViewById(R.id.b_six);
        b_seven = (Button) findViewById(R.id.b_seven);
        b_eight = (Button) findViewById(R.id.b_eight);
        b_nine = (Button) findViewById(R.id.b_nine);
        b_zero = (Button) findViewById(R.id.b_zero);
        b_clear = (Button) findViewById(R.id.b_clear);
        b_delete = (Button) findViewById(R.id.b_delete);
        b_one.setOnClickListener(this);

        edt_income.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                evalue="1";
                return false;
            }
        });

        edt_outcome.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                evalue="2";
                return false;
            }
        });


        b_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "1"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "1"));
                    edt_outcome.setSelection(start+1);
                }
            }

        });
        b_two.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "2"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "2"));
                    edt_outcome.setSelection(start+1);
                }
            }
        });
        b_three.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "3"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "3"));
                    edt_outcome.setSelection(start+1);
                }
            }
        });
        b_four.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "4"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "4"));
                    edt_outcome.setSelection(start+1);
                }
            }
        });
        b_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "5"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "5"));
                    edt_outcome.setSelection(start+1);
                }
            }

        });
        b_six.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "6"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "6"));
                    edt_outcome.setSelection(start+1);
                }
            }
        });
        b_seven.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "7"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "7"));
                    edt_outcome.setSelection(start+1);
                }
            }
        });
        b_eight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "8"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "8"));
                    edt_outcome.setSelection(start+1);
                }
            }
        });
        b_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "9"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "9"));
                    edt_outcome.setSelection(start+1);
                }
            }

        });
        b_zero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "0"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "0"));
                    edt_outcome.setSelection(start+1);
                }
            }
        });

        b_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    String dialled_nos = edt_income.getText().toString();
                    int remove_index_position = edt_income.getSelectionStart()-1;
                    StringBuilder dialled_nos_builder = new StringBuilder(dialled_nos);
                    if(remove_index_position>=0) {
                        dialled_nos_builder.deleteCharAt(remove_index_position);
                        edt_income.setText(dialled_nos_builder.toString());
                        edt_income.setSelection(remove_index_position);
                    }

                }
                else
                {
                    String dialled_nos = edt_outcome.getText().toString();
                    int remove_index_position = edt_outcome.getSelectionStart()-1;
                    StringBuilder dialled_nos_builder = new StringBuilder(dialled_nos);
                    if(remove_index_position>=0) {
                        dialled_nos_builder.deleteCharAt(remove_index_position);
                        edt_outcome.setText(dialled_nos_builder.toString());
                        edt_outcome.setSelection(remove_index_position);
                    }

                }
            }
        });

        b_clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(evalue=="1")
                {
                    Editable editableText = edt_income.getEditableText();
                    int length = editableText.length();
                    if (length > 0) {
                        edt_income.setText("");
                    }

                }
                if(evalue=="2")
                {
                    Editable editableText = edt_outcome.getEditableText();
                    int length = editableText.length();
                    if (length > 0) {
                        edt_outcome.setText("");
                    }

                }
            }

        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                income = Double.parseDouble(edt_income.getText().toString());
                outcome = Double.parseDouble(edt_outcome.getText().toString());
                sum = income - outcome;
                t_result.setText(Double.toString(sum));
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.gigalodon.first_move/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.gigalodon.first_move/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_one:
                if(evalue=="1")
                {
                    int start = edt_income.getSelectionStart();
                    edt_income.setText(edt_income.getText().insert(start, "1"));
                    edt_income.setSelection(start+1);
                }
                else
                {
                    int start = edt_outcome.getSelectionStart();
                    edt_outcome.setText(edt_outcome.getText().insert(start, "1"));
                    edt_outcome.setSelection(start+1);
                }
                break;
        }
    }
}
