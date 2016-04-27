package is.handsome.timekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Onboarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding);
    }

    /**This switches onboarding screens by click on Next button*/
    public void changeTipFunc(View view) {

        View tipOne = findViewById(R.id.first_tip_layout);
        View tipTwo = findViewById(R.id.second_tip_layout);
        View tipThree = findViewById(R.id.third_tip_layout);
        Button nextBtn = (Button) findViewById(R.id.changeTipBtn);

        if (tipOne.getVisibility() == View.GONE && tipTwo.getVisibility() == View.VISIBLE) {

            tipTwo.setVisibility(View.GONE);
            tipThree.setVisibility(View.VISIBLE);
            nextBtn.setText("Got It!");
        }
        else {

            if (tipOne.getVisibility() == View.VISIBLE) {

                tipOne.setVisibility(View.GONE);
                tipTwo.setVisibility(View.VISIBLE);
            }
        }
    }

    /**This opens main screen by click on Got It! button*/
    public void openMainScreen(View view) {

        Intent openMainScreen = new Intent(Onboarding.this, MainScreenActivity.class);
        startActivity(openMainScreen);
        finish();
    }
}





