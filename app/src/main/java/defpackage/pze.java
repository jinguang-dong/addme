package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pze implements pzc {
    public final pzs a;
    public final Executor b;
    private final qbq c;
    private final qaj d;
    private final pzs e;
    private final Uri f;
    private final Uri g;
    private final puu h;
    private final qaq i;
    private final lat j;

    public pze(qbq qbqVar, qaj qajVar, pzs pzsVar, pzs pzsVar2, Uri uri, Uri uri2, qaq qaqVar, lat latVar, Executor executor, puu puuVar) {
        this.c = qbqVar;
        this.d = qajVar;
        this.e = pzsVar2;
        this.a = pzsVar;
        this.f = uri;
        this.g = uri2;
        this.i = qaqVar;
        this.j = latVar;
        this.b = executor;
        this.h = puuVar;
    }

    private static syu q() {
        return ske.L(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) throws rcw {
        lat latVar = this.j;
        if (latVar.r(uri)) {
            latVar.p(uri);
        }
    }

    @Override // defpackage.pzc
    public final syu a(pvc pvcVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.a(pvcVar) : qsz.n(n(this.d.a(pvcVar)), new pzd((Object) this, (tph) pvcVar, 7), this.b) : this.d.a(pvcVar);
    }

    @Override // defpackage.pzc
    public final syu b() {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.b() : qsz.n(n(this.d.b()), new pyg(this, 17), this.b) : this.d.b();
    }

    @Override // defpackage.pzc
    public final syu c() {
        ptf ptfVar = new ptf(3);
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.c() : qsz.n(n(this.d.c()), new pyn(this, ptfVar, 13), this.b) : this.d.c();
    }

    @Override // defpackage.pzc
    public final syu d() {
        ptf ptfVar = new ptf(2);
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.d() : qsz.n(n(this.d.d()), new pzd(this, ptfVar, 3), this.b);
        }
        return this.d.d();
    }

    @Override // defpackage.pzc
    public final syu e() {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.e() : qsz.n(n(this.d.e()), new pyg(this, 19), this.b) : this.d.e();
    }

    @Override // defpackage.pzc
    public final syu f() {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            try {
                try {
                    r(this.f);
                    r(this.g);
                    return syq.a;
                } catch (Throwable th) {
                    r(this.g);
                    throw th;
                }
            } catch (IOException e) {
                return ske.L(e);
            }
        }
        if (iOrdinal == 2) {
            try {
                r(this.g);
                return syq.a;
            } catch (IOException e2) {
                return ske.L(e2);
            }
        }
        if (iOrdinal != 3) {
            return q();
        }
        try {
            r(this.f);
            return syq.a;
        } catch (IOException e3) {
            return ske.L(e3);
        }
    }

    @Override // defpackage.pzc
    public final syu g(pvl pvlVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.g(pvlVar) : qsz.n(n(this.d.g(pvlVar)), new pzd((Object) this, (tph) pvlVar, 6), this.b) : this.d.g(pvlVar);
    }

    @Override // defpackage.pzc
    public final syu h(pvl pvlVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.h(pvlVar) : qsz.n(n(this.d.h(pvlVar)), new pzd((Object) this, (tph) pvlVar, 0), this.b) : this.d.h(pvlVar);
    }

    @Override // defpackage.pzc
    public final syu i(pvl pvlVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.i(pvlVar) : qsz.n(n(this.d.i(pvlVar)), new pzd((Object) this, (tph) pvlVar, 1), this.b) : this.d.i(pvlVar);
    }

    @Override // defpackage.pzc
    public final syu j(List list) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.j(list) : qsz.n(n(this.d.j(list)), new pzd(this, list, 4), this.b) : this.d.j(list);
    }

    @Override // defpackage.pzc
    public final syu k() {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.k() : qsz.n(n(this.d.k()), new pyg(this, 18), this.b) : this.d.k();
    }

    @Override // defpackage.pzc
    public final syu l(pvl pvlVar, pvc pvcVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.l(pvlVar, pvcVar) : qsz.n(n(this.d.l(pvlVar, pvcVar)), new pyu((Object) this, (tph) pvlVar, (tph) pvcVar, 9), this.b) : this.d.l(pvlVar, pvcVar);
    }

    @Override // defpackage.pzc
    public final syu m(List list) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.m(list) : qsz.n(n(this.d.m(list)), new pyn(this, list, 17), this.b) : this.d.m(list);
    }

    public final syu n(syu syuVar) {
        mdv mdvVar = new mdv(19);
        Executor executor = this.b;
        return qsz.h(qsz.m(syuVar, mdvVar, executor), Exception.class, new mdv(20), executor);
    }

    public final syu o(qcs qcsVar, qcs qcsVar2, int i) {
        int iN = this.h.n();
        if (qbu.a(iN)) {
            if (qcsVar.equals(qcsVar2)) {
                this.c.k(1107, iN);
            } else {
                this.c.k(i, iN);
            }
        }
        return qcsVar.a ? ske.M(qcsVar.a()) : ske.L((Throwable) qcsVar.b());
    }

    public final syu p(qcs qcsVar, qcs qcsVar2, Comparator comparator, int i) {
        int iN = this.h.n();
        if (qbu.a(iN)) {
            if (qcs.d(qcsVar, qcsVar2, comparator)) {
                this.c.k(1106, iN);
            } else {
                this.c.k(i, iN);
            }
        }
        if (qcsVar.a) {
            List list = (List) qcsVar.a();
            list.getClass();
            return ske.M(list);
        }
        Object objB = qcsVar.b();
        objB.getClass();
        return ske.L((Throwable) objB);
    }
}
