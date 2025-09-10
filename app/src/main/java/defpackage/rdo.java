package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdo implements rch {
    public boolean a;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: IOException -> 0x0051, TRY_ENTER, TryCatch #0 {IOException -> 0x0051, blocks: (B:3:0x0008, B:5:0x000e, B:20:0x0049, B:16:0x0031, B:17:0x0039, B:19:0x003f, B:22:0x004d), top: B:28:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(defpackage.lat r3, android.net.Uri r4, java.util.List r5) {
        /*
            r2 = this;
            rdl r0 = new rdl
            r0.<init>()
            r0.c()
            boolean r1 = r3.s(r4)     // Catch: java.io.IOException -> L51
            if (r1 == 0) goto L4d
            boolean r1 = r2.a     // Catch: java.io.IOException -> L51
            if (r1 == 0) goto L31
            java.lang.Object r0 = r3.m(r4, r0)     // Catch: java.lang.Exception -> L31
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L31
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L31
            if (r1 != 0) goto L21
            goto L31
        L21:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L31
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch: java.lang.Exception -> L31
            int r0 = r0.st_mode     // Catch: java.lang.Exception -> L31
            int r1 = android.system.OsConstants.S_IFLNK     // Catch: java.lang.Exception -> L31
            r0 = r0 & r1
            if (r0 == 0) goto L31
            goto L49
        L31:
            java.lang.Iterable r0 = r3.l(r4)     // Catch: java.io.IOException -> L51
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L51
        L39:
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L51
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()     // Catch: java.io.IOException -> L51
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.io.IOException -> L51
            r2.b(r3, r1, r5)     // Catch: java.io.IOException -> L51
            goto L39
        L49:
            r3.o(r4)     // Catch: java.io.IOException -> L51
            return
        L4d:
            r3.p(r4)     // Catch: java.io.IOException -> L51
            return
        L51:
            r2 = move-exception
            r5.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdo.b(lat, android.net.Uri, java.util.List):void");
    }

    @Override // defpackage.rch
    public final /* bridge */ /* synthetic */ Object a(rcg rcgVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        b((lat) rcgVar.a, (Uri) rcgVar.f, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        IOException iOException = new IOException("Failed to delete one or more files");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iOException.addSuppressed((IOException) it.next());
        }
        throw iOException;
    }
}
