package com.google.android.apps.camera.sideline;

import android.content.BroadcastReceiver;
import defpackage.luj;
import defpackage.lwk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SidelineBroadcastReceiver extends BroadcastReceiver {
    public lwk a;
    public luj b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            ink r3 = (defpackage.ink) r3
            java.lang.Class<lvv> r0 = defpackage.lvv.class
            inm r3 = r3.d(r0)
            lvv r3 = (defpackage.lvv) r3
            r3.t(r2)
            java.lang.String r3 = r4.getAction()
            if (r3 == 0) goto L55
            int r4 = r3.hashCode()
            r0 = 798292259(0x2f94f923, float:2.7098065E-10)
            r1 = 1
            if (r4 == r0) goto L31
            r0 = 1737074039(0x6789a577, float:1.300033E24)
            if (r4 == r0) goto L27
            goto L3b
        L27:
            java.lang.String r4 = "android.intent.action.MY_PACKAGE_REPLACED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3b
            r3 = 0
            goto L3c
        L31:
            java.lang.String r4 = "android.intent.action.BOOT_COMPLETED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3b
            r3 = r1
            goto L3c
        L3b:
            r3 = -1
        L3c:
            if (r3 == 0) goto L41
            if (r3 == r1) goto L48
            goto L55
        L41:
            luj r3 = r2.b
            lus r4 = defpackage.luf.aE
            r3.c(r4)
        L48:
            lwk r3 = r2.a
            boolean r3 = r3.b()
            if (r3 == 0) goto L55
            lwk r2 = r2.a
            r2.a()
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.sideline.SidelineBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
