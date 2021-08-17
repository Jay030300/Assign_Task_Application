package util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CommonFunctions {

    public static void changeActivity(final Activity activity, Class cls, Bundle bundle, boolean isfinish, boolean isClearTop) {
        final Intent intent = new Intent(activity, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }

        activity.runOnUiThread(() -> activity.startActivity(intent));

        if (isfinish) {
            activity.finish();
        }

        if (isClearTop) {
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        }
    }
}
