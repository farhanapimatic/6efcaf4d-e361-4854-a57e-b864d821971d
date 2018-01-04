/*
 * ProductAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.www;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class Configuration {
    //The base Uri for API calls
    public static String baseUri = "http://www.example.com";


    //retains status whether we have already initialized
    private static boolean initialized = false;
    private static RequestQueue requestQueue = null;

    //Initialization of configuration
    public static void initialize(Context context){
        requestQueue = Volley.newRequestQueue(context);
    
        initialized = true;
    }

    // volley request queue needs to be initialized before use
    public static RequestQueue getRequestQueue() {
        if(!initialized)
            throw new IllegalStateException("Must initialize before accessing request queue");
        return requestQueue;
    }

}
