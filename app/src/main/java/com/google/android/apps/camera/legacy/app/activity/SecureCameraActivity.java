package com.google.android.apps.camera.legacy.app.activity;

import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import defpackage.fdo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SecureCameraActivity extends CameraActivity {
    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity, defpackage.ixt, defpackage.jhl, defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isVoiceInteractionRoot()) {
            return;
        }
        fdo.e(getIntent());
    }
}
