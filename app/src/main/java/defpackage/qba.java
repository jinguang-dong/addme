package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qba implements qbg {
    public final Context a;
    public final qai b;
    public final pwt c;
    public final pva d;
    public final pwz e;
    public final pvd f;
    public final qbq g;
    public final pvl h;
    public final int i;
    public final long j;
    public final String k;
    public final rwc l;
    public final Executor m;
    public final int n;
    public final lat o;
    private final puu p;

    public qba(Context context, qai qaiVar, lat latVar, pwt pwtVar, pva pvaVar, int i, pwz pwzVar, pvd pvdVar, qbq qbqVar, pvl pvlVar, int i2, long j, String str, rwc rwcVar, puu puuVar, Executor executor) {
        this.a = context;
        this.b = qaiVar;
        this.o = latVar;
        this.c = pwtVar;
        this.d = pvaVar;
        this.n = i;
        this.e = pwzVar;
        this.f = pvdVar;
        this.g = qbqVar;
        this.h = pvlVar;
        this.i = i2;
        this.j = j;
        this.k = str;
        this.l = rwcVar;
        this.p = puuVar;
        this.m = executor;
    }

    @Override // defpackage.qbg
    public final syu a(Uri uri) {
        int i = qbu.a;
        lat latVar = this.o;
        pvd pvdVar = this.f;
        if (!qbc.d(latVar, uri, pvdVar.e)) {
            qbu.e("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, pvdVar.e);
            tfm tfmVarA = pul.a();
            tfmVarA.b = puk.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            pul pulVarC = tfmVarA.c();
            qai qaiVar = this.b;
            pva pvaVar = this.d;
            int i2 = this.n;
            String str = pvdVar.e;
            qbq qbqVar = this.g;
            puu puuVar = this.p;
            Executor executor = this.m;
            return qdp.e(qbb.d(qaiVar, pvaVar, i2, latVar, uri, str, qbqVar, puuVar, executor)).d(IOException.class, new qaz(pulVarC, 0), executor).g(new qaz(pulVarC, 2), executor);
        }
        Uri uriAo = qsp.ao(uri);
        tpc tpcVarM = pvp.a.m();
        puz puzVar = pvdVar.g;
        if (puzVar == null) {
            puzVar = puz.a;
        }
        String str2 = puzVar.c;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        pvp pvpVar = (pvp) tphVar;
        str2.getClass();
        pvpVar.b |= 4;
        pvpVar.e = str2;
        int i3 = this.n;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        pvp pvpVar2 = (pvp) tpcVarM.b;
        pvpVar2.f = i3 - 1;
        pvpVar2.b |= 8;
        pvp pvpVar3 = (pvp) tpcVarM.l();
        syu syuVarE = this.b.e(pvpVar3);
        pyj pyjVar = new pyj(this, pvpVar3, uriAo, uri, 10);
        Executor executor2 = this.m;
        return qsz.n(qsz.n(syuVarE, pyjVar, executor2), new pzn(this, uriAo, 9, null), executor2);
    }

    @Override // defpackage.qbg
    public final syu b(pul pulVar) {
        pva pvaVar = this.d;
        String str = pvaVar.g;
        int i = qbu.a;
        if (pulVar.a.equals(puk.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return qbb.c(pvk.CORRUPTED, pvaVar, this.n, this.b, this.m);
        }
        return qbb.c(pvk.DOWNLOAD_FAILED, pvaVar, this.n, this.b, this.m);
    }
}
