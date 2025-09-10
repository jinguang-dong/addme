package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rel {
    public final String a;
    public final syu b;
    public final Executor c;
    public final rwc d;
    public final lat g;
    private final res i;
    public final Object e = new Object();
    private final sxy h = new sxy();
    public syu f = null;

    public rel(String str, syu syuVar, res resVar, Executor executor, lat latVar, rwc rwcVar) {
        this.a = str;
        this.b = ske.N(syuVar);
        this.i = resVar;
        this.c = new szg(executor);
        this.g = latVar;
        this.d = rwcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0033, B:16:0x0035), top: B:21:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.syu a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            syu r1 = r4.f     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L16
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L16
            syu r1 = r4.f     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L37
            defpackage.ske.U(r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L37
            goto L16
        L13:
            r1 = 0
            r4.f = r1     // Catch: java.lang.Throwable -> L37
        L16:
            syu r1 = r4.f     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L33
            sxy r1 = r4.h     // Catch: java.lang.Throwable -> L37
            gea r2 = new gea     // Catch: java.lang.Throwable -> L37
            r3 = 19
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L37
            sxh r2 = defpackage.rsx.b(r2)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.Executor r3 = r4.c     // Catch: java.lang.Throwable -> L37
            syu r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L37
            syu r1 = defpackage.ske.N(r1)     // Catch: java.lang.Throwable -> L37
            r4.f = r1     // Catch: java.lang.Throwable -> L37
        L33:
            syu r4 = r4.f     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r4
        L37:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rel.a():syu");
    }

    public final Object b(Uri uri) throws IOException {
        try {
            try {
                rsf rsfVarU = qsz.u("Read " + this.a);
                try {
                    InputStream inputStream = (InputStream) this.g.m(uri, new rdn());
                    try {
                        res resVar = this.i;
                        Object objC = resVar.a.w().c(inputStream, resVar.b);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        rsfVarU.close();
                        return objC;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        rsfVarU.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                if (this.g.r(uri)) {
                    throw e;
                }
                return this.i.a;
            }
        } catch (IOException e2) {
            throw qsy.q(this.g, uri, e2, this.a);
        }
    }

    public final void c(Uri uri, Object obj) throws IOException {
        Uri uriE = qsz.e(uri, ".tmp");
        try {
            rsf rsfVarU = qsz.u("Write " + this.a);
            try {
                sdy sdyVar = new sdy(null);
                try {
                    lat latVar = this.g;
                    rdr rdrVar = new rdr();
                    rdrVar.a = new sdy[]{sdyVar};
                    OutputStream outputStream = (OutputStream) latVar.m(uriE, rdrVar);
                    try {
                        ((tqr) obj).g(outputStream);
                        sdyVar.d();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        rsfVarU.close();
                        this.g.q(uriE, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw qsy.q(this.g, uri, e, this.a);
                }
            } finally {
            }
        } catch (IOException e2) {
            lat latVar2 = this.g;
            if (latVar2.r(uriE)) {
                try {
                    latVar2.p(uriE);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public final syu d(sxi sxiVar, Executor executor) {
        return this.h.b(rsx.b(new pwf(this, a(), sxiVar, executor, 6)), sxo.a);
    }
}
