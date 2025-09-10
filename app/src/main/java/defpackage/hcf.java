package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import j$.nio.file.Path;
import j$.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hcf {
    private final ContentResolver f;
    private final String g;
    private final hbj h;
    private static final sgv e = sgv.g(VnmwoBe.ZWezKvJOUUavwS);
    static final String a = String.format(Locale.US, "CASE WHEN %s IS NULL THEN %s ELSE %s / 1000 END DESC, %s DESC", "datetaken", "date_modified", "datetaken", "_id");
    static final String b = String.format(Locale.US, "%s LIKE ? AND (%s > ? OR (%s > ? AND (%s = ? OR %s / 1000 = ? / 1000)))", zflNUOOzDfM.XXwRa, "datetaken", "date_modified", "datetaken", "datetaken");
    public static final String[] c = {"_id", "title", "mime_type", "datetaken", "date_modified", "orientation", "width", UvOvSgfD.Gpwi, "is_pending"};
    static final String[] d = {"_id"};

    public hcf(ContentResolver contentResolver, ppj ppjVar, hbj hbjVar) {
        this.f = contentResolver;
        this.g = Path.CC.of(Environment.DIRECTORY_DCIM, ppjVar.p, "%").toString();
        this.h = hbjVar;
    }

    public static Uri a(long j, boolean z) {
        return (z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI).buildUpon().appendPath(String.valueOf(j)).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.hce c(android.net.Uri r7, defpackage.ltd r8) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String[] r0 = defpackage.hcf.c
            android.content.ContentResolver r1 = r6.f
            r2 = 0
            android.database.Cursor r0 = r1.query(r7, r0, r2, r2)
            r1 = 0
            if (r0 == 0) goto L1d
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1d
            int r3 = r0.getCount()     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            if (r3 != r4) goto L1d
            r1 = r4
            goto L1d
        L1b:
            r6 = move-exception
            goto L59
        L1d:
            java.lang.String r3 = "null"
            if (r0 != 0) goto L23
            r4 = r3
            goto L2b
        L23:
            int r4 = r0.getCount()     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1b
        L2b:
            if (r0 != 0) goto L2e
            goto L37
        L2e:
            java.lang.String[] r2 = r0.getColumnNames()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = java.util.Arrays.toString(r2)     // Catch: java.lang.Throwable -> L1b
            r2 = r0
        L37:
            java.lang.String r5 = "Uri %s for shot(%s) not found in MediaStore. ContentResolver returned the cursor with count=%s, columns=%s"
            if (r1 == 0) goto L49
            hcd r6 = r6.b(r0)     // Catch: java.lang.Throwable -> L57
            r6.a = r8     // Catch: java.lang.Throwable -> L57
            hce r6 = r6.a()     // Catch: java.lang.Throwable -> L57
            r0.close()
            return r6
        L49:
            rxd r6 = new rxd     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8, r4, r3}     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = defpackage.rnt.z(r5, r7)     // Catch: java.lang.Throwable -> L57
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L57
        L57:
            r6 = move-exception
            r0 = r2
        L59:
            if (r0 == 0) goto L63
            r0.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r7 = move-exception
            r6.addSuppressed(r7)
        L63:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcf.c(android.net.Uri, ltd):hce");
    }

    public final List d(Uri uri, String[] strArr, long j, long j2, int i, Function function) {
        boolean z = true;
        if (strArr != d && strArr != c) {
            z = false;
        }
        rnt.B(z, "Invalid projection specified.");
        Cursor cursorQuery = this.f.query(uri, strArr, b, new String[]{this.g, Long.toString(j), Long.toString(j2), Long.toString(j), Long.toString(j)}, a);
        try {
            int i2 = sbp.d;
            sbk sbkVar = new sbk();
            if (cursorQuery != null) {
                int i3 = i;
                while (i3 > 0 && cursorQuery.moveToNext()) {
                    int i4 = i3 - 1;
                    try {
                        sbkVar.h(function.apply(cursorQuery));
                    } catch (rxd e2) {
                        ((sgt) ((sgt) e.b().i(e2)).M(1153)).s("QueryAfter gets exception in transforming a cursor.");
                        gzi gziVar = gzo.a;
                    }
                    i3 = i4;
                }
            }
            sbp sbpVarG = sbkVar.g();
            int i5 = ((sex) sbpVarG).c;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return sbpVarG;
        } finally {
        }
    }

    final List e(Instant instant, Instant instant2, boolean z) {
        return d(z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, d, instant.minusMillis(1L).toEpochMilli(), instant2.minusSeconds(1L).getEpochSecond(), Integer.MAX_VALUE, new ndt(z, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Type inference failed for: r6v2, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hcd b(android.database.Cursor r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcf.b(android.database.Cursor):hcd");
    }
}
