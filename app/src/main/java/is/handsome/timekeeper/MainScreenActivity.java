package is.handsome.timekeeper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;

import java.util.ArrayList;

public class MainScreenActivity extends Activity {
    //public class MainScreenActivity extends Activity implements AdapterView.OnItemSelectedListener {



        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_screen_activity);
        }

    private void openAddProjectScreenFunc() {

        Intent openAddProjectScreen = new Intent(this, AddProject.class);
        startActivity(openAddProjectScreen);
        finish();
    }

    public void addNewProject(View view) {

        final RelativeLayout projectsList = (RelativeLayout) findViewById(R.id.projectsList);

        final EditText newProject = new EditText(this);
        newProject.setId (R.id.newProjectField);

        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams (RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        lp.addRule (RelativeLayout.BELOW);
        newProject.setLayoutParams(lp);


        projectsList.addView(newProject);


        /*for(int i=0; i<100;i++) {


            newProject.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                public boolean onEditorAction(TextView v, int actionId,
                                              KeyEvent event) {
                    if (actionId == EditorInfo.IME_ACTION_GO) {

                        return true;
                    }
                    return false;
                }
            });
        }*/
    }
}


        /**
        for( int i = 0; i < 100; i++ )
        {

            EditText newProject = new EditText(this);       //возможно, использовать массив?
            newProject.setLayoutParams(new RelativeLayout.LayoutParams
                    (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            newProject.setEnabled(true);
            newProject.setVisibility(View.VISIBLE);
            newProject.setClickable(true);
            projectsList.addView(newProject);
            projectName = newProject.getText().toString();
        }*/


