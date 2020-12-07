package vinit.versionautoupdate1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView1);

        PackageManager packageManager = getPackageManager();

        textView.setText("VERSION_NAME: " + BuildConfig.VERSION_NAME
                + "\nVERSION_CODE: " + BuildConfig.VERSION_CODE
                + "\nBUILD_TYPE: " + BuildConfig.BUILD_TYPE);
    }
}