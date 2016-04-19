package is.handsome.timekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    View firstTip;
    View secondTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeTip(View view) {

        firstTip = (LinearLayout) findViewById(R.id.first_tip_layout);
        firstTip.setVisibility(View.GONE);

        secondTip = (LinearLayout) findViewById(R.id.second_tip_layout);
        secondTip.setVisibility(View.VISIBLE);
    }
}

