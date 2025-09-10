package com.google.android.apps.camera.hdrplus.fusion.focusstack.jni;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import defpackage.ifo;
import defpackage.ifp;
import defpackage.ifq;
import defpackage.ifs;
import defpackage.ifv;
import defpackage.ifw;
import defpackage.ifx;
import defpackage.ify;
import defpackage.tow;
import defpackage.tpc;
import defpackage.tph;
import defpackage.tpz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeFusionFocusStack implements ifo {
    private static native byte[] nativeAdjustSecondaryRoi(byte[] bArr);

    private static native boolean nativeInitialize(byte[] bArr);

    private static native byte[] nativeProcess(byte[] bArr, byte[] bArr2, InterleavedU8ClientAllocator interleavedU8ClientAllocator, FusionProgressCallback fusionProgressCallback);

    private static native boolean nativeShouldTriggerFusion(byte[] bArr, byte[] bArr2);

    @Override // defpackage.ifo
    public final ifq a(ifp ifpVar) {
        try {
            byte[] bArrNativeAdjustSecondaryRoi = nativeAdjustSecondaryRoi(ifpVar.h());
            tph tphVarQ = tph.q(ifq.a, bArrNativeAdjustSecondaryRoi, 0, bArrNativeAdjustSecondaryRoi.length, tow.a());
            tph.D(tphVarQ);
            return (ifq) tphVarQ;
        } catch (tpz unused) {
            return ifq.a;
        }
    }

    @Override // defpackage.ifo
    public final ifx b(ifs ifsVar, ifw ifwVar, InterleavedU8ClientAllocator interleavedU8ClientAllocator, FusionProgressCallback fusionProgressCallback) {
        try {
            byte[] bArrNativeProcess = nativeProcess(ifsVar.h(), ifwVar.h(), interleavedU8ClientAllocator, fusionProgressCallback);
            tph tphVarQ = tph.q(ifx.a, bArrNativeProcess, 0, bArrNativeProcess.length, tow.a());
            tph.D(tphVarQ);
            return (ifx) tphVarQ;
        } catch (tpz unused) {
            tpc tpcVarM = ifx.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            ((ifx) tpcVarM.b).b = 2;
            return (ifx) tpcVarM.l();
        }
    }

    @Override // defpackage.ifo
    public final boolean c(ifv ifvVar) {
        return nativeInitialize(ifvVar.h());
    }

    @Override // defpackage.ifo
    public final boolean d(ify ifyVar, ifw ifwVar) {
        return nativeShouldTriggerFusion(ifyVar.h(), ifwVar.h());
    }
}
