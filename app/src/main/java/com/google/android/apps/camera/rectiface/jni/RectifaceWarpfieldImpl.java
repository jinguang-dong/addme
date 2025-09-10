package com.google.android.apps.camera.rectiface.jni;

import defpackage.loz;
import defpackage.lpa;
import defpackage.paq;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RectifaceWarpfieldImpl implements loz, paq {
    public static final sgv a = sgv.g("com.google.android.apps.camera.rectiface.jni.RectifaceWarpfieldImpl");
    public long b = 0;

    static {
        lpa.a();
    }

    public static native long initializeImpl();

    private static native void releaseImpl(long j);

    @Override // defpackage.loz
    public final long a() {
        return this.b;
    }

    @Override // defpackage.loz, java.lang.AutoCloseable, defpackage.paq
    public final void close() {
        long j = this.b;
        if (j != 0) {
            releaseImpl(j);
            this.b = 0L;
        }
    }
}
