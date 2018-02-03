package imt3673.tomme87.no.ntnu.no.lab1a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import s2h.S2h;

public class A1 extends AppCompatActivity {
    static final String REQUEST_HASED = "A1.activity.request.hased";
    static final String REQUEST_PLAIN = "A1.activity.request.plain";
    static final String REQUEST_ALGORITHM = "A1.activity.request.algorithm";

    Spinner L1;
    EditText T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        // Initialize spinner and edittext
        this.L1 = findViewById(R.id.L1);
        this.T1 = findViewById(R.id.T1);
    }

    /**
     * When B1 button is pressed.
     * Get hash algorithm from spinner(L1), get plain data from edittext(T1).
     * Generate hash with use of hash function in Go package
     *
     * Add this to intent and launch second activity A2
     *
     * @param v
     */
    public void onB1Pressed(View v) {
        final Intent i = new Intent(this, A2.class);

        String hashAlgorithm = L1.getSelectedItem().toString(); // Hash algorithm to use
        String plainData = T1.getText().toString(); // string to hash
        String hashedData = S2h.s2h(plainData, hashAlgorithm); // hased string (in hex)

        i.putExtra(REQUEST_HASED, hashedData);
        i.putExtra(REQUEST_PLAIN, plainData);
        i.putExtra(REQUEST_ALGORITHM, hashAlgorithm);

        startActivity(i);
    }
}
