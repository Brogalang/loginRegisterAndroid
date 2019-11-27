package com.retaurant.galang.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import com.retaurant.galang.R;
import com.retaurant.galang.auth.LoginActivity;
import com.retaurant.galang.auth.RegisterActivity;

public class DialogUtils {
    public static ProgressDialog progressDialog;
    public static void openDialog(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading . . . ");
        progressDialog.show();
    }
    public static void closeDialog() {
        progressDialog.dismiss();
    }
}

