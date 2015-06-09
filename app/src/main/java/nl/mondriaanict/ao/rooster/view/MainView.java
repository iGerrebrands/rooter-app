package nl.mondriaanict.ao.rooster.view;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Toast;

import nl.mondriaanict.ao.rooster.R;
import nl.mondriaanict.ao.rooster.control.MainActivity;

public class MainView {

    private Activity context;

    public MainView(Activity context) {
        this.context = context;
        context.findViewById(R.id.loginButton).setOnClickListener((MainActivity) context);
    }

    public String getInputEmail(){
        EditText email = (EditText)this.context.findViewById(R.id.edit_email);
        return email.getText().toString();
    }

    public String getInputPassword(){
        EditText password = (EditText)this.context.findViewById(R.id.edit_password);
        return password.getText().toString();
    }

    public void showWarningToast(String text){
        Toast.makeText(this.context, text, Toast.LENGTH_SHORT).show();
    }
}
