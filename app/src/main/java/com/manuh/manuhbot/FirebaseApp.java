package com.manuh.manuhbot;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by manuh on 4/30/18.
 */

public class FirebaseApp extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
