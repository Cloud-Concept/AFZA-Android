package utilities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.cloudconcept.R;
import com.salesforce.androidsdk.app.SalesforceSDKManager;
import com.salesforce.androidsdk.rest.ClientManager;
import com.salesforce.androidsdk.rest.RestClient;
import com.salesforce.androidsdk.rest.RestRequest;
import com.salesforce.androidsdk.rest.RestResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import custom.DWCRoundedImageView;
import custom.customdialog.Effectstype;
import custom.customdialog.NiftyDialogBuilder;
import model.Attachment;
import model.FormField;
import restAPI.RelatedServiceType;

/**
 * Utilities is factory class that defines a set of methods that perform common, often re-used functions. define most of these common methods under static scope.
 */
public class Utilities {

    public static String contactEmail = "";
    static ProgressBar mProgressBar;
    public static ProgressDialog _progress;
    private static String Amount;
    private static String TotalAmount;
    private static Pattern pattern;
    private static Matcher matcher;
    private static View lineView;
    private static RestRequest restRequest;
    private static JSONObject jsonObject1;
    private static String _nameReservationAmount;

//    /**
//     * Email pattern
//     */
//
//    private static final String EMAIL_PATTERN =
//            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//
//    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
//            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    /**
     * @param title:title               of dialog
     * @param act:container             activity that want this diaog to be shown
     * @param listenerPositive:listener for positive button ( listener for Ok)
     *                                  Show Custom dialog with two buttons  (Ok ,cancel) and handle ok by listenerPositive attribute
     */
    @SuppressWarnings("deprecation")
    public static NiftyDialogBuilder showNiftyDialog(String title, Activity act,
                                                     OnClickListener listenerPositive) {

        final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder
                .getInstance(act);

        dialogBuilder
                .withTitle(title)
                .withTitleColor("#FFFFFF")
                .withDividerColor("#22b2bd")
                .withMessage(act.getResources().getString(R.string.sf__passcode_logout_confirmation))
                .withMessageColor("#FFFFFFFF")
                .withDialogColor(act.getResources().getColor(R.color.light_green))
                .withIcon(
                        act.getResources().getDrawable(R.mipmap.dwc_launcher))
                .withDuration(300).withEffect(Effectstype.Newspager)
                .withButton1Text("OK").withButton2Text("Cancel")
                .isCancelableOnTouchOutside(true)
                .setButton1Click(listenerPositive)
                .setButton2Click(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
        return dialogBuilder;
    }

    /**
     * @param title:title               of dialog
     * @param act:container             activity that want this diaog to be shown
     * @param Text:Message              displayed inside dialog
     * @param listenerPositive:listener for positive button ( listener for Ok)
     *                                  Show Custom dialog with two buttons with custom text (Ok ,cancel) and handle ok by listenerPositive attribute
     */
    public static NiftyDialogBuilder showCustomNiftyDialog(String title, Activity act, OnClickListener listenerPositive, String Text) {
        final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder
                .getInstance(act);
        dialogBuilder
                .withTitle(title)
                .withTitleColor("#FFFFFF")
                .withDividerColor(act.getResources().getColor(R.color.light_green))
                .withMessage(Text)
                .withMessageColor("#FFFFFFFF")
                .withDialogColor(act.getResources().getColor(R.color.light_green))
                .withIcon(
                        act.getResources().getDrawable(R.mipmap.dwc_launcher))
                .withDuration(300).withEffect(Effectstype.Slidetop)
                .withButton1Text("OK").withButton2Text("Cancel")
                .isCancelableOnTouchOutside(true)
                .setButton1Click(listenerPositive)
                .setButton2Click(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
        return dialogBuilder;
    }
    /**
     * check whether progress is showing to user or not
     */
    public static boolean getIsProgressLoading() {
        if (_progress != null) {
            return _progress.isShowing();
        } else {
            return false;
        }
    }

    /**
     * @param activity:container activity that want this diaog to be shown
     * @param text:text          displayed within loading dialog
     *                           Show Loading dialog which is called all over the application.
     */
    public static void showloadingDialog(Activity activity, String text) {
        _progress = new ProgressDialog(activity);
        _progress.setMessage(text);
        _progress.setCancelable(false);
        _progress.show();
    }

    /**
     * dismiss current shown loading dialog
     */
    public static void dismissLoadingDialog() {
        _progress.dismiss();
    }

    /**
     * @param act:container activity that want this message to be shown
     * @param message:the   message to be shown within toast
     *                      Show short message indicating what message want to be displayed to user
     */
    public static void showToast(Activity act, String message) {
        Toast.makeText(act, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * @param act:container activity that want this message to be shown
     * @param message:the   message to be shown within toast
     *                      Show long message indicating what message want to be displayed to user
     */
    public static void showLongToast(Activity act, String message) {
        Toast.makeText(act, message, Toast.LENGTH_LONG).show();
    }

    /**
     * @param act:container           activity that want this message to be shown
     * @param attachmentId:salesforce user attachment id
     * @param smartImageView:custom   rounded image to set the photo after downloading from salesforce
     *                                Check if file is already downloaded ,get from external storage and set to bitmap .If not exists and attachment id not null ,download attachment using  DownloadAttachment method.
     */
    public static synchronized void setUserPhoto(Activity act, final String attachmentId, final DWCRoundedImageView smartImageView) {
        boolean isFound = false;
        String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
        File folder = new File(extStorageDirectory, "attachment-export");
        if (folder.exists()) {
            ArrayList<String> files = getListOfAttachments();
            for (int i = 0; i < files.size(); i++) {
                if (files.get(i).equals(attachmentId)) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                String path = Environment.getExternalStorageDirectory() + "/attachment-export/" + attachmentId;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bitmap = BitmapFactory.decodeFile(path, options);
                smartImageView.setImageBitmap(bitmap);
            } else {
                DownloadAttachment(act, attachmentId, smartImageView);
            }
        } else {
            DownloadAttachment(act, attachmentId, smartImageView);
        }
    }

    /**
     * @param act:container           activity that want this message to be shown
     * @param attachmentId:salesforce user attachment id
     * @param smartImageView:custom   rounded image to set the photo after downloading from salesforce
     *                                Download user photo using attachment id as bitmap and set to rounded image view
     */
    public static void DownloadAttachment(final Activity act, final String attachmentId, final DWCRoundedImageView smartImageView) {
        if (!attachmentId.equals("") && attachmentId != null) {
            List<String> fieldList = new ArrayList<String>();
            fieldList.add("Id");
            fieldList.add("Body");

            try {
                final RestRequest restRequest = RestRequest.getRequestForRetrieve(act.getApplicationContext().getResources().getString(R.string.api_version), "Attachment", attachmentId, fieldList);
                new ClientManager(act, SalesforceSDKManager.getInstance().getAccountType(), SalesforceSDKManager.getInstance().getLoginOptions(), SalesforceSDKManager.getInstance().shouldLogoutWhenTokenRevoked()).getRestClient(act, new ClientManager.RestClientCallback() {
                    @Override
                    public void authenticatedRestClient(final RestClient client) {
                        if (client == null) {
                            act.finish();
                        } else {
                            client.sendAsync(restRequest, new RestClient.AsyncRequestCallback() {
                                @Override
                                public void onSuccess(RestRequest request, RestResponse response) {
                                    try {
                                        final JSONObject json = new JSONObject(response.toString());
                                        final Attachment attachment = new Attachment();
                                        attachment.setID(json.getString("Id"));
                                        attachment.setBody(json.getString("Body"));
                                        try {
                                            new DownloadAttachmentBodyForRoundedImage(client, attachment, smartImageView).execute().get();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        } catch (ExecutionException e) {
                                            e.printStackTrace();
                                        }

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }

                                @Override
                                public void onError(Exception exception) {

                                }
                            });
                        }
                    }
                });
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            smartImageView.setImageDrawable(act.getResources().getDrawable(R.mipmap.avatar));
        }
    }

    /**
     * @param act:container           activity that want this message to be shown
     * @param attachmentId:salesforce user attachment id
     * @param smartImageView:custom   rounded image to set the photo after downloading from salesforce
     *                                Download user photo using attachment id as bitmap and set to normal image view
     */
    public static synchronized void setUserPhoto(final Activity act, final String attachmentId, final ImageView smartImageView) {

        if (!attachmentId.equals("") && attachmentId != null) {
            List<String> fieldList = new ArrayList<String>();
            fieldList.add("Id");
            fieldList.add("Body");
            try {
                final RestRequest restRequest = RestRequest.getRequestForRetrieve(act.getApplicationContext().getResources().getString(R.string.api_version), "Attachment", attachmentId, fieldList);
                new ClientManager(act, SalesforceSDKManager.getInstance().getAccountType(), SalesforceSDKManager.getInstance().getLoginOptions(), SalesforceSDKManager.getInstance().shouldLogoutWhenTokenRevoked()).getRestClient(act, new ClientManager.RestClientCallback() {
                    @Override
                    public void authenticatedRestClient(final RestClient client) {
                        if (client == null) {
                            act.finish();
                        } else {
                            client.sendAsync(restRequest, new RestClient.AsyncRequestCallback() {
                                @Override
                                public void onSuccess(RestRequest request, RestResponse response) {
                                    try {
                                        final JSONObject json = new JSONObject(response.toString());
                                        final Attachment attachment = new Attachment();
                                        attachment.setID(json.getString("Id"));
                                        attachment.setBody(json.getString("Body"));
                                        try {
                                            new DownloadAttachmentBody(client, attachment, smartImageView).execute().get();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        } catch (ExecutionException e) {
                                            e.printStackTrace();
                                        }

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }

                                @Override
                                public void onError(Exception exception) {

                                }
                            });
                        }
                    }
                });
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            smartImageView.setImageDrawable(act.getResources().getDrawable(R.mipmap.avatar));
        }
    }

    public static void setupUI(View view, final Activity act) {

        //Set up touch listener for non-text box views to hide keyboard.
        if (!(view instanceof EditText)) {

            view.setOnTouchListener(new View.OnTouchListener() {

                public boolean onTouch(View v, MotionEvent event) {
                    Utilities.hideSoftKeyboard(act);
                    return false;
                }

            });
        }

        //If a layout container, iterate over children and seed recursion.
        if (view instanceof ViewGroup) {

            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {

                View innerView = ((ViewGroup) view).getChildAt(i);

                setupUI(innerView, act);
            }
        }
    }


    /**
     * @param filterItem:View statement filter item
     * @return array of start date and end date according to view statement filter item
     * filter start date and end date of according to chosen view statement filter item and define which quarter that user is working on
     */
    public static Date[] formatStartAndEndDate(String filterItem) {

        Date startDate = null, endDate = null;
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentYear = calendar.get(Calendar.YEAR);
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        Calendar calendar1 = null;
        try {
            calendar1 = getDateCalendar(currentYear, currentMonth, currentDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (currentMonth >= 1 && currentMonth <= 3) {
            calendar1.set(currentYear, 1, 1);
        } else if (currentMonth >= 4 && currentMonth <= 6) {
            calendar1.set(currentYear, 3, 1);
        } else if (currentMonth >= 7 && currentMonth <= 9) {
            calendar1.set(currentYear, 6, 1);
        } else if (currentMonth >= 10 && currentMonth <= 12) {
            calendar1.set(currentYear, 9, 1);
        }

        if (filterItem.equals("Current Quarter")) {
            startDate = calendar1.getTime();
            calendar1.add(Calendar.MONTH, 3);
            endDate = calendar1.getTime();
        } else if (filterItem.equals("Last Quarter")) {
            endDate = calendar1.getTime();
            calendar1.add(Calendar.MONTH, -3);
            startDate = calendar1.getTime();
        } else if (filterItem.equals("Current Year")) {
            startDate = calendar1.getTime();
            calendar1.add(Calendar.YEAR, 1);
            endDate = calendar1.getTime();

        } else if (filterItem.equals("Last Year")) {
            endDate = calendar1.getTime();
            calendar1.add(Calendar.YEAR, -1);
            startDate = calendar1.getTime();
        }
        return new Date[]{startDate, endDate};
    }

    public static Calendar getDateCalendar(int year, int month, int day) throws ParseException {
        Calendar calendar = Calendar.getInstance();
//        cal.set(Calendar.YEAR, year);
//        cal.set(Calendar.MONTH, month);
//        cal.set(Calendar.DAY_OF_MONTH, day);
//        cal.set(Calendar.HOUR_OF_DAY, 0);
//        cal.set(Calendar.MINUTE, 0);
//        cal.set(Calendar.SECOND, 0);
//        cal.set(Calendar.MILLISECOND, 0);
        calendar.clear();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar;
    }

    private static Date getDate(int currentYear, int month, int day) {
        Date date = new Date();
        date.setYear(currentYear);
        date.setMonth(month);
        date.setDate(day);
        return date;
    }

    /**
     * @param s:date as string
     * @return string indicating the date after formatting
     * Get date and format it like this (01-oct-2015)
     */
    public static String formatVisitVisaDate(String s) {
        if (s == null || s.equals("")) {
            return "";
        } else {
            String[] date = s.split("-");
            if (date[1].equals("01")) {
                return date[2] + "-Jan-" + date[0];
            } else if (date[1].equals("02")) {
                return date[2] + "-Feb-" + date[0];
            } else if (date[1].equals("03")) {
                return date[2] + "-Mar-" + date[0];
            } else if (date[1].equals("04")) {
                return date[2] + "-Apr-" + date[0];
            } else if (date[1].equals("05")) {
                return date[2] + "-May-" + date[0];
            } else if (date[1].equals("06")) {
                return date[2] + "-Jun-" + date[0];
            } else if (date[1].equals("07")) {
                return date[2] + "-Jul-" + date[0];
            } else if (date[1].equals("08")) {
                return date[2] + "-Aug-" + date[0];
            } else if (date[1].equals("09")) {
                return date[2] + "-Sep-" + date[0];
            } else if (date[1].equals("10")) {
                return date[2] + "-Oct-" + date[0];
            } else if (date[1].equals("11")) {
                return date[2] + "-Nov-" + date[0];
            } else if (date[1].equals("12")) {
                return date[2] + "-Dec-" + date[0];
            } else {
                return "";
            }
        }
    }

    /**
     * background task to download image and set to indicated rounded image
     */
    private static class DownloadAttachmentBodyForRoundedImage extends AsyncTask<Void, Void, Void> {


        private final RestClient client;
        private final Attachment attachment;
        String path;
        DWCRoundedImageView smartImageView;
        boolean isFound = false;

        public DownloadAttachmentBodyForRoundedImage(RestClient client, Attachment attachment, DWCRoundedImageView smartImageView) {
            this.client = client;
            this.attachment = attachment;
            this.smartImageView = smartImageView;
        }

        @Override
        protected Void doInBackground(Void... params) {
            String attUrl = client.getClientInfo().resolveUrl(attachment.getBody()).toString();
            HttpClient tempClient = new DefaultHttpClient();
            URI theUrl = null;
            try {
                String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
                File folder = new File(extStorageDirectory, "attachment-export");
                if (!folder.exists()) {
                    folder.mkdir();
                }

                ArrayList<String> filesname = getListOfAttachments();
                for (int i = 0; i < filesname.size(); i++) {
                    if (filesname.get(i).equals(attachment.getID())) {
                        isFound = true;
                        break;
                    }
                }

                if (!isFound) {
                    theUrl = new URI(attUrl);
                    HttpGet getRequest = new HttpGet();
                    getRequest.setURI(theUrl);
                    getRequest.setHeader("Authorization", "Bearer " + client.getAuthToken());
                    HttpResponse httpResponse = null;
                    try {
                        httpResponse = tempClient.execute(getRequest);
                        StatusLine statusLine = httpResponse.getStatusLine();
                        if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
                            FileOutputStream fos = null;
                            fos = new FileOutputStream(new File(Environment.getExternalStorageDirectory(), "/attachment-export/" + attachment.getID()));
                            path = Environment.getExternalStorageDirectory() + "/attachment-export/" + attachment.getID();
                            HttpEntity entity = httpResponse.getEntity();
                            entity.writeTo(fos);
                            entity.consumeContent();
                            fos.flush();
                            fos.close();
                        } else {
                            httpResponse.getEntity().getContent().close();
                            throw new IOException(statusLine.getReasonPhrase());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    path = Environment.getExternalStorageDirectory() + "/attachment-export/" + attachment.getID();
                }
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap bitmap = BitmapFactory.decodeFile(path, options);
            smartImageView.setImageBitmap(bitmap);
        }
    }

    /**
     * background task to download image and set to indicated image
     */
    private static class DownloadAttachmentBody extends AsyncTask<Void, Void, Void> {


        private final RestClient client;
        private final Attachment attachment;
        String path;
        ImageView smartImageView;
        boolean isFound = false;

        public DownloadAttachmentBody(RestClient client, Attachment attachment, ImageView smartImageView) {
            this.client = client;
            this.attachment = attachment;
            this.smartImageView = smartImageView;
        }

        @Override
        protected Void doInBackground(Void... params) {
            String attUrl = client.getClientInfo().resolveUrl(attachment.getBody()).toString();
            HttpClient tempClient = new DefaultHttpClient();
            URI theUrl = null;
            try {
                String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
                File folder = new File(extStorageDirectory, "attachment-export");
                if (!folder.exists()) {
                    folder.mkdir();
                }

                ArrayList<String> filesname = getListOfAttachments();
                for (int i = 0; i < filesname.size(); i++) {
                    if (filesname.get(i).equals(attachment.getID())) {
                        isFound = true;
                        break;
                    }
                }

                if (!isFound) {
                    theUrl = new URI(attUrl);
                    HttpGet getRequest = new HttpGet();
                    getRequest.setURI(theUrl);
                    getRequest.setHeader("Authorization", "Bearer " + client.getAuthToken());
                    HttpResponse httpResponse = null;
                    try {
                        httpResponse = tempClient.execute(getRequest);
                        StatusLine statusLine = httpResponse.getStatusLine();
                        if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
                            FileOutputStream fos = null;
                            fos = new FileOutputStream(new File(Environment.getExternalStorageDirectory(), "/attachment-export/" + attachment.getID()));
                            path = Environment.getExternalStorageDirectory() + "/attachment-export/" + attachment.getID();
                            HttpEntity entity = httpResponse.getEntity();
                            entity.writeTo(fos);
                            entity.consumeContent();
                            fos.flush();
                            fos.close();
                        } else {
                            httpResponse.getEntity().getContent().close();
                            throw new IOException(statusLine.getReasonPhrase());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    path = Environment.getExternalStorageDirectory() + "/attachment-export/" + attachment.getID();
                }
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap bitmap = BitmapFactory.decodeFile(path, options);
            smartImageView.setImageBitmap(bitmap);
        }
    }

    /**
     * @return list of string represents downloaded attachments
     * connect to storage ,get list of files and return them as list of strings
     */
    public static ArrayList<String> getListOfAttachments() {
        File sdCardRoot = Environment.getExternalStorageDirectory();

        File yourDir = new File(sdCardRoot, "attachment-export");
        ArrayList<String> filesname = new ArrayList<String>();
        for (File f : yourDir.listFiles()) {
            if (f.isFile()) {
                filesname.add(f.getName());
            }
        }

        return filesname;
    }

    /**
     * @param expiryDate:expiry date of visa ,passport ...etc or any date.
     * @return number of days between current date and parameter one
     * Get Current date and get the actual difference between today and expiryDate paramter
     */
    public static long daysDifference(String expiryDate) {

        String ActualExpiryDate = "";
        long diffSeconds;
        long diffMinutes;
        long diffHours;
        long diffDays = 0;
        String[] expiry_date_array = {"2015", "07", "20"};
        try {
            expiry_date_array = expiryDate.split("-");
        } catch (NullPointerException e) {

        }
        long diff = 0;

        ActualExpiryDate = expiry_date_array[1] + "/" + expiry_date_array[2] + "/" + expiry_date_array[0] + " 09:29:58";

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        String today = format.format(cal.getTime());
        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(ActualExpiryDate);
            d2 = format.parse(today);
            diff = d1.getTime() - d2.getTime();
//            diffSeconds = diff / 1000 % 60;
//            diffMinutes = diff / (60 * 1000) % 60;
//            diffHours = diff / (60 * 60 * 1000) % 24;
            diffDays = diff / (24 * 60 * 60 * 1000);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return diffDays;
    }

    /**
     * @param s:string check if string is null ,it returns empty string.If not null ,it returns the same string
     */
    public static String stringNotNull(String s) {
        return s == null ? "" : s;
    }


    public static String getValueFromJson(List<String> key, JSONObject json) {
        String result = null;
        for (int i = 0; i < key.size(); i++) {
            if (i == (key.size() - 1)) {
                try {
                    result = json.getString(key.get(i));

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                JSONObject jsonObject = json.optJSONObject(key.get(i));
                key.remove(i);
                result = getValueFromJson(key, jsonObject);
            }
        }
        return result;
    }

    /**
     * @param image:bitmap object
     * @return encoded string of bitmap image
     */
    public static String encodeTobase64(Bitmap image) {
        Bitmap immagex = image;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        immagex.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] b = baos.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);
        Log.e("LOOK", imageEncoded);
        return imageEncoded;
    }

    /**
     * @param f:file       object needed to be decoded
     * @param WIDTH:width
     * @param HIGHT:height
     * @return bitmap of encoding file
     */
    public static Bitmap decodeFile(File f, int WIDTH, int HIGHT) {
        try {
            //Decode image size
            BitmapFactory.Options o = new BitmapFactory.Options();
            o.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(f), null, o);

            //The new size we want to scale to
            final int REQUIRED_WIDTH = WIDTH;
            final int REQUIRED_HIGHT = HIGHT;
            //Find the correct scale value. It should be the power of 2.
            int scale = 1;
            while (o.outWidth / scale / 2 >= REQUIRED_WIDTH && o.outHeight / scale / 2 >= REQUIRED_HIGHT)
                scale *= 2;

            //Decode with inSampleSize
            BitmapFactory.Options o2 = new BitmapFactory.Options();
            o2.inSampleSize = scale;
            return BitmapFactory.decodeStream(new FileInputStream(f), null, o2);
        } catch (FileNotFoundException e) {
        }
        return null;
    }



    public static String convertJsonStringToString(JSONArray jsonArray) {
        String result = "";
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                result += jsonArray.getString(i);
                if (i != (jsonArray.length() - 1))
                    result += ",";
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * @param d1 first date
     * @param d2 second date
     * @return number of days between two dates
     */
    public static int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

    /**
     * @param email email string
     * @return true if email valid ,false if email not valid
     */
    public static boolean isEmailValid(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    /**
     * @param Amount :amount
     * @return string indicating amount after formatting,Called for any processing for any amount value
     */
    public static String processAmount(String Amount) {
        if (!Amount.equals("")) {
            int length = Amount.length();
            if (length > 3) {
                NumberFormat format = NumberFormat.getCurrencyInstance();
                Amount = format.format(Double.valueOf(Amount));
                return Amount.substring(1, Amount.length() - 1);
            } else {
                return Amount;
            }
        } else {
            return "";
        }
    }

    public static int daysBetween(Date d1, long d2) {
        return (int) ((d1.getTime() - d2) / (1000 * 60 * 60 * 24));
    }

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        try {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        } catch (NullPointerException e) {

        }
    }

    public static String getCurrentDate() {
        long yourmilliseconds = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date resultdate = new Date(yourmilliseconds);
        return sdf.format(resultdate);
    }

    public static void switchToArabicLanguage(Activity activity){
        Resources res = activity.getApplicationContext().getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        android.content.res.Configuration conf = res.getConfiguration();
        conf.locale = new Locale("ar".toLowerCase());
        res.updateConfiguration(conf, dm);
    }

    public static void switchToEnglishLanguage(Activity activity){
        Resources res = activity.getApplicationContext().getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        android.content.res.Configuration conf = res.getConfiguration();
        conf.locale = new Locale("en".toLowerCase());
        res.updateConfiguration(conf, dm);
    }


 /*   public static View DrawPayAndSubmitView(final Activity activity, RelatedServiceType relatedServiceType, final String personName, final String RefNumber, final String Date, final String Status, final String TotalAmount, ArrayList<FormField> formFields) {

        LayoutInflater li = (LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View convertView = li.inflate(R.layout.layout_pay_and_submit, null, false);

        InitializePayAndSubmitView(convertView);

        if (relatedServiceType == RelatedServiceType.RelatedServiceTypeNameReservation) {
            drawableService.setImageResource(R.mipmap.name_reservation);
        } else {
            if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCancelCard || relatedServiceType == RelatedServiceType.RelatedServiceTypeNewCard || relatedServiceType == RelatedServiceType.RelatedServiceTypeReplaceCard) {
                DrawCardDetailsLayout(activity.getApplicationContext(), linearLayout, formFields, card_management__c);
            } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeNewCompanyNOC || relatedServiceType == RelatedServiceType.RelatedServiceTypeNewEmployeeNOC) {
                DrawNOCdetailsLayout(activity.getApplicationContext(), linearLayout, formFields, noc__c);
            } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeRenewVisa || relatedServiceType == RelatedServiceType.RelatedServiceTypeRenewPassport) {
                DrawRenewVisaDetailsLayout(activity, linearLayout);
            } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeRenewPassport) {
                DrawRenewPassportDetailsLayout(activity, linearLayout);
            } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCancelVisa) {
                DrawCancelVisaDetailsLayout(activity, linearLayout);
            } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCompanyAddressChange || relatedServiceType == RelatedServiceType.RelatedServiceTypeCompanyNameChange || relatedServiceType == RelatedServiceType.RelatedServiceTypeCapitalChange || relatedServiceType == RelatedServiceType.RelatedServiceTypeDirectorRemoval || relatedServiceType == RelatedServiceType.RelatedServiceTypeEstablishmentCard) {
                if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCompanyAddressChange) {
                    DrawAddressChangeLayoutDetails(activity, linearLayout);
                } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCompanyNameChange) {
                    DrawNameChangeLayoutDetails(activity, linearLayout);
                } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCapitalChange) {
                    DrawCapitalChangeLayoutDetails(activity, linearLayout);
                } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeDirectorRemoval) {
                    DrawDirectorRemovalLayoutDetails(activity, linearLayout);
                } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeEstablishmentCard) {
                    if (((ChangeAndRemovalActivity) activity).getServiceIdentifier().equals("Establishment Card Renewal Fee")) {
                        tvTitle.setText("Renew Card Service");
                        drawableService.setImageResource(R.mipmap.renew_card);
                    } else if (((ChangeAndRemovalActivity) activity).getServiceIdentifier().equals("Establishment Card Lost Fee")) {
                        tvTitle.setText("Lost Card Service");
                        drawableService.setImageResource(R.mipmap.replace_card);
                    } else if (((ChangeAndRemovalActivity) activity).getServiceIdentifier().equals("Establishment Card Cancellation Fee")) {
                        tvTitle.setText("Cancel Card Service");
                        drawableService.setImageResource(R.mipmap.cancel_card);
                    }
                    lineView.setVisibility(View.GONE);
                }
            } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeDocumentTrueCopy) {
                DrawRequestTrueCopyDetailsLayout(activity, linearLayout, formFields);
            } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeShareTransfer) {
                DrawShareTransferDetailsLayout(activity, linearLayout);
                lineView.setVisibility(View.GONE);
            }
            ManageTopLayoutVisibillity(personName, RefNumber, Date, Status, TotalAmount);
            ManageTitleAndDrawableImage(relatedServiceType);
        }

        return convertView;
    }*/

//    private static void ManageTitleAndDrawableImage(RelatedServiceType relatedServiceType) {
//        if (relatedServiceType == RelatedServiceType.RelatedServiceTypeNewEmployeeNOC || relatedServiceType == RelatedServiceType.RelatedServiceTypeRenewPassport) {
//            drawableService.setImageResource(R.mipmap.noc_service_image);
//            tvTitle.setText("Noc Services");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeNewCard) {
//            drawableService.setImageResource(R.mipmap.new_card);
//            tvTitle.setText("Card Services");
//            tvTitle.setVisibility(View.VISIBLE);
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeRenewCard) {
//            drawableService.setImageResource(R.mipmap.renew_card);
//            tvTitle.setText("Card Services");
//            tvTitle.setVisibility(View.VISIBLE);
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCancelCard) {
//            drawableService.setImageResource(R.mipmap.cancel_card);
//            tvTitle.setText("Card Services");
//            tvTitle.setVisibility(View.VISIBLE);
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeReplaceCard) {
//            drawableService.setImageResource(R.mipmap.replace_card);
//            tvTitle.setText("Card Services");
//            tvTitle.setVisibility(View.VISIBLE);
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeNewVisa || relatedServiceType == RelatedServiceType.RelatedServiceTypeRenewVisa) {
//            drawableService.setImageResource(R.mipmap.renew_visa);
//            tvTitle.setText("Visa Services");
//            tvTitle.setVisibility(View.VISIBLE);
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCancelVisa) {
//            drawableService.setImageResource(R.mipmap.cancel_visa);
//            tvTitle.setText("Visa Services");
//            tvTitle.setVisibility(View.VISIBLE);
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeContractRenewal) {
//            drawableService.setImageResource(R.mipmap.notification_leasing);
//            tvTitle.setText("Renew Contract");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeLicenseRenewal) {
//            drawableService.setImageResource(R.mipmap.renew_license);
//            tvTitle.setText("Renew License Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeNewCompanyNOC) {
//            drawableService.setImageResource(R.mipmap.company_noc);
//            tvTitle.setText("New Company NOC Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCompanyAddressChange) {
//            drawableService.setImageResource(R.mipmap.address_change_service);
//            tvTitle.setText("Address Change Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCompanyNameChange || relatedServiceType == RelatedServiceType.RelatedServiceTypeLicenseCancelation) {
//            drawableService.setImageResource(R.mipmap.name_change_service);
//            tvTitle.setText("Name Change Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeContractCancelation) {
//            drawableService.setImageResource(R.mipmap.cancel_contract);
//            tvTitle.setText("Cancel Contract Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeNameReservation) {
//            drawableService.setImageResource(R.mipmap.name_reservation);
//            tvTitle.setText("Reserve Name Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeDirectorRemoval) {
//            drawableService.setImageResource(R.mipmap.remove_directory);
//            tvTitle.setText("Remove Director Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeCapitalChange) {
//            drawableService.setImageResource(R.mipmap.capital_change);
//            tvTitle.setText("Capital Change Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeLicenseRenewActivityChange) {
//            drawableService.setImageResource(R.mipmap.renew_license_activity);
//            tvTitle.setText("Renew License Activity Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeLicenseChangeActivityChange) {
//            drawableService.setImageResource(R.mipmap.change_license_activity);
//            tvTitle.setText("Change License Activity Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeShareTransfer) {
//            drawableService.setImageResource(R.mipmap.share_transfer);
//            tvTitle.setText("Share Transfer Service");
//        } else if (relatedServiceType == RelatedServiceType.RelatedServiceTypeDocumentTrueCopy) {
//            drawableService.setImageResource(R.mipmap.copy);
//            tvTitle.setText("Request True Copy Service");
//        }
//    }
}