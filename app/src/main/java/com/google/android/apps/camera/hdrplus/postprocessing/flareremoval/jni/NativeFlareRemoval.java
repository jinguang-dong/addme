package com.google.android.apps.camera.hdrplus.postprocessing.flareremoval.jni;

import com.pairip.VMRunner;
import defpackage.iif;
import defpackage.iig;
import defpackage.iih;
import defpackage.iii;
import defpackage.pbn;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeFlareRemoval {
    private static final sgv a = sgv.g("com.google.android.apps.camera.hdrplus.postprocessing.flareremoval.jni.NativeFlareRemoval");
    private final pbn b;

    public NativeFlareRemoval(pbn pbnVar) {
        this.b = pbnVar;
    }

    private static native void initializeNative(byte[] bArr);

    private static native byte[] processNative(byte[] bArr, byte[] bArr2);

    public iii a(iif iifVar, iih iihVar) {
        return (iii) VMRunner.invoke("rBXAj5NZ2weUVJVW", new Object[]{this, iifVar, iihVar});
    }

    public final synchronized void b(iig iigVar) {
        initializeNative(iigVar.h());
    }
}
