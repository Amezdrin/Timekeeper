package is.handsome.timekeeper;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainScreenActivity extends Activity {
    //public class MainScreenActivity extends Activity implements AdapterView.OnItemSelectedListener {


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_screen_activity);
            setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }

    public void showProjects (String projectName) {  /**Вызывает крэш сейчас потому что onClick для View view, а не для String. Выход - наследование?*/

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.projectsList);
        TextView projectView = new TextView(MainScreenActivity.this);

        if(projectName.length() != 0) {
            projectView.setText(projectName);

            projectView.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));

            linearLayout.addView(projectView);
        }
        else {
            projectView.setText("Nothing added here");

            projectView.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));

            linearLayout.addView(projectView);
        }
    }

    public void openAddNewProjectScreen (View view) {

        Intent openAddNewProject = new Intent(this, AddProject.class);
        startActivity(openAddNewProject);
        //finish();
    }
}

