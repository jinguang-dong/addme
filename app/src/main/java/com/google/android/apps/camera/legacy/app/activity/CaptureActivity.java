package com.google.android.apps.camera.legacy.app.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import defpackage.fdo;
import defpackage.sgt;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CaptureActivity extends CameraActivity {
    private static final sgv z = sgv.g("com.google.android.apps.camera.legacy.app.activity.CaptureActivity");

    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity, defpackage.ixt, defpackage.jhl, defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Uri uri;
        String authority;
        ProviderInfo providerInfoResolveContentProvider;
        super.onCreate(bundle);
        Intent intent = getIntent();
        fdo.e(intent);
        intent.putExtra("include_location_in_exif", false);
        String callingPackage = getCallingPackage();
        PackageManager packageManager = getPackageManager();
        Bundle extras = intent.getExtras();
        if (extras != null && (uri = (Uri) extras.getParcelable("output")) != null && (authority = uri.getAuthority()) != null && (providerInfoResolveContentProvider = packageManager.resolveContentProvider(authority, 0)) != null) {
            callingPackage = providerInfoResolveContentProvider.packageName;
        }
        if (callingPackage != null) {
            int iCheckPermission = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", callingPackage);
            int iCheckPermission2 = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", callingPackage);
            if (iCheckPermission != 0 && iCheckPermission2 != 0) {
                ((sgt) z.c().M(2520)).v("Package %s doesn't have location permissions, location info won't be included in EXIF", callingPackage);
            } else {
                ((sgt) z.c().M(2519)).s("Allowing location in intent");
                intent.putExtra("include_location_in_exif", true);
            }
        }
    }
}
