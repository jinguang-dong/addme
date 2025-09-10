package com.google.android.apps.camera.jni.serengeti;

import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import defpackage.acr;
import defpackage.snd;
import defpackage.uhb;
import defpackage.uhf;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SerengetiNative {
    public final InterleavedU8ClientAllocator a;
    public final uhf b;
    private final uiq c = new snd(new acr(this, (uhb) null, 4));

    public SerengetiNative(InterleavedU8ClientAllocator interleavedU8ClientAllocator, uhf uhfVar) {
        this.a = interleavedU8ClientAllocator;
        this.b = uhfVar;
    }

    public static final native void nativeInitialize(InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    private static final native byte[] nativeOnSerengetiEvent(byte[] bArr);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.iof r5, defpackage.uhb r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ioh
            if (r0 == 0) goto L13
            r0 = r6
            ioh r0 = (defpackage.ioh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ioh r0 = new ioh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            iof r5 = r0.d
            defpackage.rnt.aN(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.rnt.aN(r6)
            uiq r4 = r4.c
            r0.d = r5
            r0.c = r3
            java.lang.Object r4 = r4.a(r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            byte[] r4 = r5.h()
            byte[] r4 = nativeOnSerengetiEvent(r4)
            iom r5 = defpackage.iom.a
            int r6 = r4.length
            tow r0 = defpackage.tow.a
            tra r0 = defpackage.tra.a
            tow r0 = defpackage.tow.a
            r1 = 0
            tph r4 = defpackage.tph.q(r5, r4, r1, r6, r0)
            defpackage.tph.D(r4)
            iom r4 = (defpackage.iom) r4
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.jni.serengeti.SerengetiNative.a(iof, uhb):java.lang.Object");
    }
}
