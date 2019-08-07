package cordova.plugin.greatdayatt

import android.app.Activity;
import android.os.Bundle;

public class AttActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("activity_att", "layout", package_name));
    }
}
