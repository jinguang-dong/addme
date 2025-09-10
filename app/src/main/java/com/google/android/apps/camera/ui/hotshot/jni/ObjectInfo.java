package com.google.android.apps.camera.ui.hotshot.jni;

import android.graphics.RectF;
import defpackage.mxa;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ObjectInfo {
    public static mxa createBuilder(int i, float f, RectF rectF, String str, String str2) {
        mxa mxaVar = new mxa();
        mxaVar.a = i;
        mxaVar.b = f;
        mxaVar.f = (byte) 3;
        mxaVar.c = rectF;
        mxaVar.d = str;
        mxaVar.e = str2;
        mxaVar.b(0.0f);
        mxaVar.c(0.0f);
        mxaVar.d(0.0f);
        return mxaVar;
    }

    public abstract RectF bounds();

    public abstract int id();

    public abstract String label();

    public abstract String libraryDisplayName();

    public abstract Float pan();

    public abstract Float roll();

    public abstract float score();

    public abstract Float tilt();
}
