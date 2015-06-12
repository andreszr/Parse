package co.edu.udea.cmovil.gr1.parse;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ParseApp extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.initialize(this,"ttrN0NaoF0pnwXbcXDjv3zCz0R5XWQQwC6beQvTg", "JtAeVRIiOQfvyYDzEXkUScdFVmrGyoivbVpWnb6u");//(this, aplicationID, clientkey)

        ParseUser.enableAutomaticUser();
        ParseACL defauAcl = new ParseACL();
        defauAcl.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defauAcl,true);

    }
}

