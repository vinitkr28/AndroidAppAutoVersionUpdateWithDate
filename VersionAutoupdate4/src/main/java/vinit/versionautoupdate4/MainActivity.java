package vinit.versionautoupdate4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView1);

        PackageManager packageManager = getPackageManager();

        textView.setText("VERSION_NAME: " + BuildConfig.VERSION_NAME
                + "\nVERSION_CODE: " + BuildConfig.VERSION_CODE
                + "\nBUILD_TYPE: " + BuildConfig.BUILD_TYPE
                + "\nAPPLICATION_ID: " + BuildConfig.APPLICATION_ID
                + "\nAPK_FILE_NAME: " + BuildConfig.APK_FILE_NAME);

        Log.d(TAG, "onCreate: " + textView.getText().toString());
    }
}
