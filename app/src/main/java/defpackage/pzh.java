package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzh implements qai {
    public final qbq a;
    public final qal b;
    public final pzx c;
    public final Executor d;
    public final puu e;
    private final pzx f;
    private final Uri g;
    private final Uri h;
    private final qaq i;
    private final lat j;

    public pzh(qbq qbqVar, qal qalVar, pzx pzxVar, pzx pzxVar2, Uri uri, Uri uri2, qaq qaqVar, lat latVar, Executor executor, puu puuVar) {
        this.a = qbqVar;
        this.b = qalVar;
        this.c = pzxVar;
        this.f = pzxVar2;
        this.g = uri;
        this.h = uri2;
        this.i = qaqVar;
        this.j = latVar;
        this.d = executor;
        this.e = puuVar;
    }

    private static syu j() {
        return ske.L(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void k(Uri uri) throws rcw {
        lat latVar = this.j;
        if (latVar.r(uri)) {
            latVar.p(uri);
        }
    }

    @Override // defpackage.qai
    public final syu a() {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.a() : qsz.n(b(this.b.a()), new pzl(this, 1), this.d) : this.b.a();
    }

    public final syu b(syu syuVar) {
        pzg pzgVar = new pzg(1);
        Executor executor = this.d;
        return qsz.h(qsz.m(syuVar, pzgVar, executor), Exception.class, new pzg(0), executor);
    }

    @Override // defpackage.qai
    public final syu c() {
        ptf ptfVar = new ptf(4);
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.c() : qsz.n(b(this.b.c()), new pzd(this, ptfVar, 17), this.d) : this.b.c();
    }

    @Override // defpackage.qai
    public final syu d() {
        int iOrdinal = this.i.a().ordinal();
        try {
            if (iOrdinal == 1) {
                try {
                    k(this.g);
                    return this.b.d();
                } finally {
                    k(this.h);
                }
            }
            if (iOrdinal == 2) {
                try {
                    return qsz.n(this.b.d(), new pyg(this, 20), this.d);
                } catch (IOException e) {
                    return ske.L(e);
                }
            }
            if (iOrdinal != 3) {
                return j();
            }
            try {
                k(this.g);
                return this.f.d();
            } catch (IOException e2) {
                return ske.L(e2);
            }
        } catch (IOException e3) {
            return ske.L(e3);
        }
    }

    @Override // defpackage.qai
    public final syu e(pvp pvpVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.e(pvpVar) : qsz.n(b(this.b.e(pvpVar)), new pzd((Object) this, (tph) pvpVar, 11), this.d) : this.b.e(pvpVar);
    }

    @Override // defpackage.qai
    public final syu f(scn scnVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.f(scnVar) : qsz.n(b(this.b.f(scnVar)), new pzd(this, scnVar, 13), this.d) : this.b.f(scnVar);
    }

    @Override // defpackage.qai
    public final syu g(pvp pvpVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.g(pvpVar) : qsz.n(b(this.b.g(pvpVar)), new pzd((Object) this, (tph) pvpVar, 15), this.d) : this.b.g(pvpVar);
    }

    @Override // defpackage.qai
    public final syu h(pvp pvpVar, pvr pvrVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.h(pvpVar, pvrVar) : qsz.n(b(this.b.h(pvpVar, pvrVar)), new pyu(this, pvpVar, pvrVar, 13), this.d) : this.b.h(pvpVar, pvrVar);
    }

    public final syu i(qcs qcsVar, qcs qcsVar2, int i) {
        int iN = this.e.n();
        if (qbu.a(iN)) {
            if (qcsVar.equals(qcsVar2)) {
                this.a.k(1106, iN);
            } else {
                this.a.k(i, iN);
            }
        }
        return qcsVar.a ? ske.M(qcsVar.a()) : ske.L((Throwable) qcsVar.b());
    }
}
