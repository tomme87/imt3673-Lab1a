package imt3673.tomme87.no.ntnu.no.lab1a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class A2 extends AppCompatActivity {
    TextView T2;
    TextView T3;
    TextView labelHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        // Initialise textviews
        this.T2 = findViewById(R.id.T2);
        this.T3 = findViewById(R.id.T3);
        this.labelHash = findViewById(R.id.labelHash);

        // Get intent and populate textviews
        final Intent i = getIntent();
        this.T3.setText(i.getStringExtra(A1.REQUEST_HASED)); // hased string to T3
        this.T2.setText(i.getStringExtra(A1.REQUEST_PLAIN)); // plain string to T2
        this.labelHash.setText(i.getStringExtra(A1.REQUEST_ALGORITHM)); // Algo
    }

    /**
     * Exit the application when B2 is pressed
     *
     * @param v
     */
    public void onB2Pressed(View v) {
        finishAffinity();
    }
}
