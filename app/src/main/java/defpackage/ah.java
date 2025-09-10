package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ah {
    private static final Object a = new Object();

    static /* synthetic */ void b(dg dgVar, aw awVar) {
        if (ch.X(2)) {
            Objects.toString(dgVar);
        }
        dgVar.f(awVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[Catch: all -> 0x006a, TryCatch #5 {, blocks: (B:5:0x0005, B:21:0x0043, B:28:0x0054, B:30:0x005a, B:31:0x0060, B:34:0x0064, B:35:0x0067, B:36:0x0068, B:6:0x000b, B:7:0x0018, B:11:0x0022, B:17:0x002e, B:19:0x003a, B:25:0x0049), top: B:50:0x0005, inners: #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r7) {
        /*
            java.lang.Object r0 = defpackage.ah.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r7.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            r6 = 1
            if (r5 == r6) goto L41
            r6 = 3
            if (r5 != r6) goto L29
            int r5 = r3.getDepth()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            if (r5 <= r4) goto L41
            r5 = r6
        L29:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 == r6) goto L18
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
        L41:
            if (r2 == 0) goto L54
        L43:
            r2.close()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6a
            goto L54
        L47:
            r7 = move-exception
            goto L62
        L49:
            java.lang.String r3 = "AppLocalesStorageHelper"
            r4 = 0
            java.lang.String r4 = com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS.eCQrqJWMh     // Catch: java.lang.Throwable -> L47
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L54
            goto L43
        L54:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L60
            r2 = 0
            java.lang.String r2 = com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl.nJTYgnnvgsDPFdx     // Catch: java.lang.Throwable -> L6a
            r7.deleteFile(r2)     // Catch: java.lang.Throwable -> L6a
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            return r1
        L62:
            if (r2 == 0) goto L67
            r2.close()     // Catch: java.io.IOException -> L67 java.lang.Throwable -> L6a
        L67:
            throw r7     // Catch: java.lang.Throwable -> L6a
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            return r1
        L6a:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah.a(android.content.Context):java.lang.String");
    }
}
