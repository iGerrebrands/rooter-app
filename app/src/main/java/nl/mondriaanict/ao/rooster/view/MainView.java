package nl.mondriaanict.ao.rooster.view;

import android.app.Activity;

import nl.mondriaanict.ao.rooster.R;
import nl.mondriaanict.ao.rooster.control.MainActivity;

public class MainView {

    public MainView(Activity context) {
        context.findViewById(R.id.loginButton).setOnClickListener((MainActivity) context);
    }
}
