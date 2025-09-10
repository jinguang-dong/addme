package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oeg {
    public static volatile Set a;
    public static volatile Set b;
    private static oeg e;
    public final Context c;
    public volatile Object d;

    public oeg(Context context, byte[] bArr) {
        this.c = context;
    }

    public static oeg a(Context context) {
        ojl.ay(context);
        synchronized (oeg.class) {
            if (e == null) {
                ody.b(context);
                e = new oeg(context);
            }
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r11 == 0) goto L28
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L21
        L1f:
            r11 = r0
            goto L28
        L21:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1f
            r11 = r1
        L28:
            if (r11 == 0) goto L2d
            sbp r2 = defpackage.odx.b     // Catch: java.lang.IllegalArgumentException -> La4
            goto L2f
        L2d:
            sbp r2 = defpackage.odx.a     // Catch: java.lang.IllegalArgumentException -> La4
        L2f:
            int r3 = defpackage.ojg.a     // Catch: java.lang.IllegalArgumentException -> La4
            defpackage.rnt.L(r1)     // Catch: java.lang.IllegalArgumentException -> La4
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch: java.lang.IllegalArgumentException -> La4
            if (r3 == 0) goto L65
            boolean r4 = r3.hasMultipleSigners()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L65
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L45
            goto L65
        L45:
            int r4 = defpackage.sbp.d     // Catch: java.lang.IllegalArgumentException -> La4
            sbk r4 = new sbk     // Catch: java.lang.IllegalArgumentException -> La4
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> La4
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La4
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La4
            r6 = r0
        L52:
            if (r6 >= r5) goto L60
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La4
            r4.h(r7)     // Catch: java.lang.IllegalArgumentException -> La4
            int r6 = r6 + 1
            goto L52
        L60:
            sbp r3 = r4.g()     // Catch: java.lang.IllegalArgumentException -> La4
            goto L69
        L65:
            int r3 = defpackage.sbp.d     // Catch: java.lang.IllegalArgumentException -> La4
            sbp r3 = defpackage.sex.a     // Catch: java.lang.IllegalArgumentException -> La4
        L69:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L9c
            sbp r3 = r3.fB()     // Catch: java.lang.IllegalArgumentException -> La4
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La4
            r5 = r0
        L78:
            if (r5 >= r4) goto L9b
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La4
            sgk r7 = r2.iterator()     // Catch: java.lang.IllegalArgumentException -> La4
        L84:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La4
            int r9 = r5 + 1
            if (r8 == 0) goto L99
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La4
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r8 == 0) goto L84
            return r1
        L99:
            r5 = r9
            goto L78
        L9b:
            return r0
        L9c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r3 = "Unable to obtain package certificate history."
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La4
            throw r2     // Catch: java.lang.IllegalArgumentException -> La4
        La4:
            if (r11 == 0) goto Lad
            oif[] r11 = defpackage.odx.c
            oif r10 = c(r10, r11)
            goto Lb9
        Lad:
            oif[] r11 = new defpackage.oif[r1]
            oif[] r2 = defpackage.odx.c
            r2 = r2[r0]
            r11[r0] = r2
            oif r10 = c(r10, r11)
        Lb9:
            if (r10 == 0) goto Lbc
            return r1
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oeg.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    private static oif c(PackageInfo packageInfo, oif... oifVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            odv odvVar = new odv(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < oifVarArr.length; i++) {
                if (oifVarArr[i].equals(odvVar)) {
                    return oifVarArr[i];
                }
            }
        }
        return null;
    }

    public oeg(Context context) {
        this.c = context.getApplicationContext();
    }
}
