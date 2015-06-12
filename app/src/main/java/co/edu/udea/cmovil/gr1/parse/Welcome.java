package co.edu.udea.cmovil.gr1.parse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.parse.ParseUser;

public class Welcome extends Activity{

    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ParseUser currentUser = ParseUser.getCurrentUser();
        String struser =  currentUser.getUsername().toString();

        TextView txtUser = (TextView)findViewById(R.id.txtuser);
        txtUser.setText("Estas conectado! "+ "\n" +struser);
        logout=(Button)findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ParseUser.logOut();
                finish();
            }
        });
    }
}

