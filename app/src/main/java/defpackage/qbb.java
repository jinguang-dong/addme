package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbb implements qbg {
    private final qai a;
    private final pva b;
    private final String c;
    private final qbq d;
    private final pvl e;
    private final int f;
    private final long g;
    private final String h;
    private final puu i;
    private final Executor j;
    private final int k;
    private final lat l;

    public qbb(qai qaiVar, lat latVar, pva pvaVar, int i, qbq qbqVar, pvl pvlVar, int i2, long j, String str, puu puuVar, Executor executor) {
        this.a = qaiVar;
        this.l = latVar;
        this.b = pvaVar;
        this.k = i;
        this.c = qsp.ab(pvaVar);
        this.d = qbqVar;
        this.e = pvlVar;
        this.f = i2;
        this.g = j;
        this.h = str;
        this.i = puuVar;
        this.j = executor;
    }

    public static syu c(pvk pvkVar, pva pvaVar, int i, qai qaiVar, Executor executor) {
        pvp pvpVarAt = qsp.at(pvaVar, i);
        return qdp.e(e(qaiVar, pvpVarAt, executor)).g(new qab(pvkVar, qaiVar, pvpVarAt, 2), executor).g(new qaz(pvpVarAt, 3), executor);
    }

    static syu d(qai qaiVar, pva pvaVar, int i, lat latVar, Uri uri, String str, qbq qbqVar, puu puuVar, Executor executor) {
        return qdp.e(e(qaiVar, qsp.at(pvaVar, i), executor)).g(new pwj(puuVar, str, qbqVar, latVar, uri, 5), executor);
    }

    private static syu e(qai qaiVar, pvp pvpVar, Executor executor) {
        return qsz.n(qaiVar.e(pvpVar), new qaz(pvpVar, 6), executor);
    }

    @Override // defpackage.qbg
    public final syu b(pul pulVar) {
        int i = qbu.a;
        if (pulVar.a.equals(puk.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return c(pvk.CORRUPTED, this.b, this.k, this.a, this.j);
        }
        return c(pvk.DOWNLOAD_FAILED, this.b, this.k, this.a, this.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
    
        r0 = r29.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0135, code lost:
    
        r0.m(r30, new defpackage.rdk(r16));
        r0.q(r30, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0144, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        defpackage.qbu.g(r0, "%s: Failed to apply defrag download transform for file %s.", "DownloaderCallbackImpl", r30);
        r2 = defpackage.pul.a();
        r2.b = defpackage.puk.DOWNLOAD_TRANSFORM_IO_ERROR;
        r2.d = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015c, code lost:
    
        throw r2.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0160 A[EDGE_INSN: B:160:0x0160->B:53:0x0160 BREAK  A[LOOP:0: B:42:0x0122->B:52:0x015d], EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.qbg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.syu a(android.net.Uri r30) throws defpackage.pul, java.io.IOException {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbb.a(android.net.Uri):syu");
    }
}
