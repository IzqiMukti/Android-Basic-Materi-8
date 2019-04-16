package com.dycode.edu.auth;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {

        String refreshedToken = FirebaseInstanceId. getInstance ().getToken();

        Log.d("TOKEN: ", refreshedToken);
    }
}

