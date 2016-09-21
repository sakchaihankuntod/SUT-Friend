package sut.lemon.sakchai.sutfriend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by lemon on 21/9/2559.
 */
public class MyAlert {

    //explicit
    private Context context;
    private int anInt;
    private String titleString, messagesString;

    public MyAlert(Context context, int anInt, String titleString, String messagesString) {
        this.context = context;
        this.anInt = anInt;
        this.titleString = titleString;
        this.messagesString = messagesString;
    }

    public void myDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(anInt);
        builder.setTitle(titleString);
        builder.setMessage(messagesString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }

}//MyAlert
