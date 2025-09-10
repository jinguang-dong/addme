package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rca {
    public static final Logger a = Logger.getLogger("XmpUtil");

    private static boolean b(byte[] bArr, String str) {
        byte[] bArr2;
        if (bArr.length < str.length()) {
            return false;
        }
        try {
            bArr2 = new byte[str.length()];
            System.arraycopy(bArr, 0, bArr2, 0, str.length());
        } catch (UnsupportedEncodingException unused) {
        }
        return new String(bArr2, "UTF-8").equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        r12 = (byte[]) r0.a;
        r5 = r12.length - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        if (r5 <= 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r2 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
    
        if (r12[r5] != 62) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        if (r12[r2] == 63) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        r5 = r12.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c4, code lost:
    
        r5 = r5 - 29;
        r12 = new byte[r5];
        java.lang.System.arraycopy(r0.a, 29, r12, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cf, code lost:
    
        r0 = defpackage.edy.a;
        r12 = defpackage.eel.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        defpackage.rca.a.logp(java.util.logging.Level.WARNING, "com.google.android.libraries.social.xmp.XmpUtil", "parseFirstValidXMPSection", "Unexpected exception when parsing XMP", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
    
        defpackage.rca.a.logp(java.util.logging.Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI.EIhBqD, "XMP parse error", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.edw a(java.io.InputStream r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rca.a(java.io.InputStream):edw");
    }
}
