package nl.marc_apps.textinputlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		// Remove this line if you don't want AndroidIDE to show this app's logs
		
        super.onCreate(savedInstanceState);
        
        // set content view to binding's root
        setContentView(R.layout.activity_main);
    }
}
