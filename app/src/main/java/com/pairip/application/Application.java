package com.pairip.application;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.pairip.SignatureCheck;
import com.pairip.VMRunner;

/* loaded from: classes.dex */
public class Application extends CameraApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws PackageManager.NameNotFoundException {
        VMRunner.setContext(context);
        SignatureCheck.verifyIntegrity(context);
        super.attachBaseContext(context);
    }
}
