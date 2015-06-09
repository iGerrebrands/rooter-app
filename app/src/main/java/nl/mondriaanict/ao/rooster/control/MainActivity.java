package nl.mondriaanict.ao.rooster.control;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import nl.mondriaanict.ao.rooster.R;
import nl.mondriaanict.ao.rooster.model.Student;
import nl.mondriaanict.ao.rooster.view.MainView;


public class MainActivity extends Activity implements View.OnClickListener {

    private MainView view;
    private Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.view = new MainView(this);
    }

    @Override
    public void onClick(View v) {
        if(view.getInputEmail().length() <1 || view.getInputPassword().length() < 1){
            view.showWarningToast("Please fill in all fields!");
            return;
        }
        // TODO json script thingies Action code if statement
        // TODO json script thingie getJson make student form Json
    }
}
