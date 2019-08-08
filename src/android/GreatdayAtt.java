package cordova.plugin.greatdayatt;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class GreatdayAtt extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")) {
            this.test(args, callbackContext);
            return true;

            //            String message = args.getString(0);
//            this.coolMethod(message, callbackContext);
//            return true;
        } else if (action.equals("test")) {
            this.test(args, callbackContext);
            return true;
        }
        return false;
    }

//    private void coolMethod(String message, CallbackContext callbackContext) {
//        if (message != null && message.length() > 0) {
//            callbackContext.success(message);
//        } else {
//            callbackContext.error("Expected one non-empty string argument.");
//        }
//    }

    private void add(JSONArray args, CallbackContext callback) {
        if (args != null) {
            try {
//                int p1 = Integer.parse(args.getJSONObject(0).getString("param1"));
//                int p2 = Integer.parse(args.getJSONObject(0).getString("param2"));
                int p1 = 1;
                int p2 = 4;
                callback.success("" + (p1 + p2));
            } catch (Exception ex) {
                callback.error("something wrong" + ex);
            }
        } else {
            callback.error("not value");
        }
    }

    private void test(JSONArray args, CallbackContext callback) {
        if (args != null) {
            try {
                int p1 = 1;
                int p2 = 2;
                callback.success("" + (p1 + p2));
            } catch (Exception ex) {
                callback.error("something wrong" + ex);
            }
        } else {
            callback.error("not value");
        }
    }
}

