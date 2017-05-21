package com.sku.demolib;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by vikalp on 5/11/2017.
 */
public class LibraryClass {

    public void pressLog(String msg){

        Log.d("Library DEmo log==>", msg);
    }



    public void callActivity(Context _ctx){

        Intent calLIntent = new Intent(_ctx,LoginPage.class);
        _ctx.startActivity(calLIntent);
    }
}
