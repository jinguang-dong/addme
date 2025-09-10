package com.google.android.apps.camera.legacy.app.activity.main;

import defpackage.fdo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CameraVoiceActivity extends CameraActivity {
    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity, defpackage.ixt, defpackage.jhl, defpackage.bp, android.app.Activity
    protected final void onPause() {
        fdo.e(getIntent());
        super.onPause();
    }

    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity
    protected final boolean t() {
        return true;
    }
}
