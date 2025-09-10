package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twd {
    public static final String a = "twd";

    /* JADX WARN: Can't wrap try/catch for region: R(9:43|5|6|(1:8)(2:9|(1:11)(5:12|(1:14)|45|21|(1:35)(3:53|36|37)))|47|20|45|21|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.tqr a(defpackage.tqq r6, java.lang.String r7, int r8, boolean r9, android.content.Context r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error reading parameters: "
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L69
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L69
            java.io.File r7 = b(r7, r10)     // Catch: java.lang.Throwable -> L69
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L69
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L69
            r7 = 8
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            byte[] r10 = r7.array()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            byte[] r3 = r7.array()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            int r3 = r3.length     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            r4 = 0
            int r10 = r2.read(r10, r4, r3)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            java.lang.String r3 = "Error parsing param record: end of stream."
            r5 = -1
            if (r10 != r5) goto L30
            java.lang.String r7 = defpackage.twd.a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            android.util.Log.e(r7, r3)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            goto L64
        L30:
            int r10 = r7.getInt()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            int r7 = r7.getInt()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r10 == r8) goto L42
            java.lang.String r7 = defpackage.twd.a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            java.lang.String r8 = "Error parsing param record: incorrect sentinel."
            android.util.Log.e(r7, r8)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            goto L64
        L42:
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            int r7 = r2.read(r8, r4, r7)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r7 != r5) goto L65
            java.lang.String r7 = defpackage.twd.a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            android.util.Log.e(r7, r3)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            goto L64
        L50:
            r7 = move-exception
            goto L6b
        L52:
            r7 = move-exception
            java.lang.String r8 = defpackage.twd.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r0.concat(r7)     // Catch: java.lang.Throwable -> L50
            android.util.Log.w(r8, r7)     // Catch: java.lang.Throwable -> L50
        L64:
            r8 = r1
        L65:
            r2.close()     // Catch: java.lang.IllegalStateException -> L71 java.io.FileNotFoundException -> L81 java.io.IOException -> L88
            goto L88
        L69:
            r7 = move-exception
            r2 = r1
        L6b:
            if (r2 == 0) goto L70
            r2.close()     // Catch: java.io.IOException -> L70 java.lang.IllegalStateException -> L71 java.io.FileNotFoundException -> L81
        L70:
            throw r7     // Catch: java.lang.IllegalStateException -> L71 java.io.FileNotFoundException -> L81
        L71:
            r7 = move-exception
            java.lang.String r8 = defpackage.twd.a
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r0.concat(r7)
            android.util.Log.w(r8, r7)
        L7f:
            r8 = r1
            goto L88
        L81:
            r7 = move-exception
            if (r9 == 0) goto L7f
            r7.toString()
            goto L7f
        L88:
            if (r8 != 0) goto L8b
            return r1
        L8b:
            tqq r6 = r6.d(r8)     // Catch: defpackage.tpz -> L94
            tqr r6 = r6.l()     // Catch: defpackage.tpz -> L94
            return r6
        L94:
            r6 = move-exception
            java.lang.String r7 = defpackage.twd.a
            java.lang.String r8 = "Error reading params from ContentProvider"
            android.util.Log.e(r7, r8, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twd.a(tqq, java.lang.String, int, boolean, android.content.Context):tqr");
    }

    public static File b(String str, Context context) {
        File file = new File(context.getFilesDir(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            throw new IllegalStateException(file.toString().concat(" already exists as a file, but is expected to be a directory."));
        }
        return new File(file, str);
    }
}
