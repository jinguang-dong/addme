package com.google.android.libraries.oliveoil.util;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class JniUtil {
    public static final /* synthetic */ int a = 0;

    static {
        a();
    }

    public static void a() {
        try {
            System.loadLibrary("oliveoil");
        } catch (UnsatisfiedLinkError e) {
            if (System.getProperty("java.vm.name").equals("Dalvik")) {
                throw e;
            }
            throw new UnsatisfiedLinkError(OPuAVreQM.wjsvY.concat(e.toString()));
        }
    }
}
