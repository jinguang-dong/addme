package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import defpackage.txv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VrCoreUtils {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r4) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "com.google.vr.vrcore"
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 == 0) goto Le
            return r2
        Le:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            boolean r0 = r0.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            if (r0 == 0) goto L53
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            r3 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            android.content.pm.Signature r3 = defpackage.txu.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            android.content.pm.Signature[] r3 = new android.content.pm.Signature[]{r3}     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            boolean r3 = defpackage.txu.a(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            if (r3 == 0) goto L31
            goto L4f
        L31:
            java.lang.Boolean r3 = defpackage.thu.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            if (r3 == 0) goto L3c
            java.lang.Boolean r3 = defpackage.thu.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            boolean r3 = r3.booleanValue()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            goto L40
        L3c:
            boolean r3 = defpackage.thu.h(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
        L40:
            if (r3 == 0) goto L50
            android.content.pm.Signature r3 = defpackage.txu.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            android.content.pm.Signature[] r3 = new android.content.pm.Signature[]{r3}     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            boolean r4 = defpackage.txu.a(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            if (r4 != 0) goto L4f
            goto L50
        L4f:
            return r2
        L50:
            r4 = 9
            return r4
        L53:
            r4 = 2
            return r4
        L55:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.RuntimeException -> L62
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch: java.lang.RuntimeException -> L62
            java.util.List r0 = r0.getAllSessions()     // Catch: java.lang.RuntimeException -> L62
            goto L73
        L62:
            r0 = move-exception
            java.lang.String r2 = "Failure querying package installer sessions: "
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "VrCoreUtils"
            android.util.Log.w(r2, r0)
            r0 = 0
        L73:
            r2 = 3
            if (r0 == 0) goto L91
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r0.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L7a
            return r2
        L91:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r0 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La0
            boolean r4 = r4.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La0
            if (r4 == 0) goto La0
            return r2
        La0:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.vrcore.base.api.VrCoreUtils.a(android.content.Context):int");
    }

    public static int getVrCoreClientApiVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (!applicationInfo.enabled) {
                throw new txv(2);
            }
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new txv(a(context));
        }
    }
}
