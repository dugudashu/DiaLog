package com.example.dialogdemo2;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by wmm on 2017/10/17.
 */

public class DialogUtils {


    public static void showDialog(final Context context, String title, String message) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("你最近好么?");
        builder.setPositiveButton("好", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context, "我也是醉了", Toast.LENGTH_SHORT).show();


            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


                Toast.makeText(context, "我呵呵一笑", Toast.LENGTH_SHORT).show();

            }
        });
        builder.show();


    }
}
