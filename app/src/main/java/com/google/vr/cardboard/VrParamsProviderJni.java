package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import defpackage.snh;
import defpackage.thu;
import defpackage.tow;
import defpackage.tpc;
import defpackage.tph;
import defpackage.tpz;
import defpackage.twc;
import defpackage.tws;
import defpackage.txg;
import defpackage.txp;
import defpackage.txq;
import defpackage.txr;
import defpackage.txs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VrParamsProviderJni {
    private static void a(long j, DisplayMetrics displayMetrics, float f, int i) {
        nativeUpdateNativeDisplayParamsPointer(j, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, f, i);
    }

    private static native void nativeUpdateNativeDisplayParamsPointer(long j, int i, int i2, float f, float f2, float f3, int i3);

    private static byte[] readDeviceParams(Context context) {
        tws twsVarK = thu.k(context);
        txp txpVarB = twsVarK.b();
        twsVarK.e();
        if (txpVarB == null) {
            return null;
        }
        return txpVarB.h();
    }

    private static void readDisplayParams(Context context, long j) {
        int iA;
        int iA2;
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            a(j, Resources.getSystem().getDisplayMetrics(), thu.l(null), 0);
            return;
        }
        tws twsVarK = thu.k(context);
        txq txqVarC = twsVarK.c();
        twsVarK.e();
        Display displayN = thu.n(context);
        DisplayMetrics displayMetricsM = thu.m(displayN);
        if (txqVarC != null) {
            if ((txqVarC.b & 1) != 0) {
                displayMetricsM.xdpi = txqVarC.c;
            }
            if ((txqVarC.b & 2) != 0) {
                displayMetricsM.ydpi = txqVarC.d;
            }
        }
        float fL = thu.l(txqVarC);
        int i = twc.a;
        DisplayCutout cutout = displayN.getCutout();
        if (context.getResources().getConfiguration().orientation == 1) {
            iA = twc.a("getSafeInsetTop", cutout);
            iA2 = twc.a("getSafeInsetBottom", cutout);
        } else {
            iA = twc.a("getSafeInsetLeft", cutout);
            iA2 = twc.a("getSafeInsetRight", cutout);
        }
        a(j, displayMetricsM, fL, iA + iA2);
    }

    private static byte[] readSdkConfigurationParams(Context context) {
        snh snhVar;
        snh snhVar2 = txg.a;
        synchronized (txg.class) {
            snhVar = txg.b;
            if (snhVar == null) {
                tws twsVarK = thu.k(context);
                tpc tpcVarM = txs.a.m();
                snh snhVar3 = txg.a;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                txs txsVar = (txs) tphVar;
                snhVar3.getClass();
                txsVar.d = snhVar3;
                txsVar.b |= 2;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                txs txsVar2 = (txs) tpcVarM.b;
                txsVar2.b |= 1;
                txsVar2.c = "1.229.0";
                snh snhVarA = twsVarK.a((txs) tpcVarM.l());
                if (snhVarA == null) {
                    Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
                    snhVarA = txg.c;
                } else {
                    snhVarA.toString();
                }
                synchronized (txg.class) {
                    txg.b = snhVarA;
                }
                twsVarK.e();
                snhVar = txg.b;
            }
        }
        return snhVar.h();
    }

    private static byte[] readUserPrefs(Context context) {
        tws twsVarK = thu.k(context);
        txr txrVarD = twsVarK.d();
        twsVarK.e();
        if (txrVarD == null) {
            return null;
        }
        return txrVarD.h();
    }

    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        txp txpVar;
        tws twsVarK = thu.k(context);
        boolean zF = false;
        if (bArr != null) {
            try {
                try {
                    tph tphVarQ = tph.q(txp.a, bArr, 0, bArr.length, tow.a());
                    tph.D(tphVarQ);
                    txpVar = (txp) tphVarQ;
                } catch (tpz e) {
                    Log.w("VrParamsProviderJni", "Error parsing protocol buffer: " + e.toString());
                }
            } catch (Throwable th) {
                twsVarK.e();
                throw th;
            }
        } else {
            txpVar = null;
        }
        zF = twsVarK.f(txpVar);
        twsVarK.e();
        return zF;
    }
}
