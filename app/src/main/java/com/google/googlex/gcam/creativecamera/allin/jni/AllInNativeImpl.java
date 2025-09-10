package com.google.googlex.gcam.creativecamera.allin.jni;

import defpackage.sgt;
import defpackage.sgv;
import defpackage.shx;
import defpackage.tfq;
import defpackage.tga;
import defpackage.tow;
import defpackage.tph;
import defpackage.tpz;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AllInNativeImpl implements tfq {
    public long b = 0;
    private static final AtomicBoolean c = new AtomicBoolean();
    public static final sgv a = sgv.g("com.google.googlex.gcam.creativecamera.allin.jni.AllInNativeImpl");

    public AllInNativeImpl() {
        if (c.compareAndSet(false, true)) {
            init();
        }
    }

    public static tga a(byte[] bArr) {
        try {
            tph tphVarQ = tph.q(tga.a, bArr, 0, bArr.length, tow.a());
            tph.D(tphVarQ);
            return (tga) tphVarQ;
        } catch (tpz e) {
            ((sgt) ((sgt) ((sgt) a.b().h(shx.a, "AllInNativeProcessor")).i(e)).M(5873)).s("Unable to parse response.");
            return tga.a;
        }
    }

    private static native void init();

    public native byte[] createImpl(byte[] bArr);

    public native byte[] delete(long j);

    public native byte[] endSessionImpl(long j, int i);

    public native byte[] getPersonFiguresImpl(long j, int i, long j2, byte[] bArr);

    public native byte[] mergeSecondImageImpl(long j, int i, long j2, long j3, byte[] bArr, byte[] bArr2, boolean z, Runnable runnable);

    public native byte[] processFirstFullResImageImpl(long j, int i, long j2, long j3, Runnable runnable);

    public native byte[] startSessionImpl(long j, int i);
}
