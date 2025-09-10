package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bvu extends bvt implements bsq {
    private Map f;
    public final bwi g;
    public long h = 0;
    public final bsp o = new bsp(this);
    public final zm p;
    private bss q;

    public bvu(bwi bwiVar) {
        this.g = bwiVar;
        int i = zn.a;
        this.p = new zm((byte[]) null);
    }

    public final void A(bss bssVar) {
        Map map;
        if (bssVar != null) {
            u((bssVar.b() << 32) | (bssVar.a() & 4294967295L));
        } else {
            u(0L);
        }
        if (!a.ao(this.q, bssVar) && bssVar != null && ((((map = this.f) != null && !map.isEmpty()) || !bssVar.e().isEmpty()) && !a.ao(bssVar.e(), this.f))) {
            ((bvx) y()).p.e();
            Map linkedHashMap = this.f;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(bssVar.e());
        }
        this.q = bssVar;
    }

    public final long B(bvu bvuVar) {
        long jD = 0;
        while (!a.ao(this, bvuVar)) {
            boolean z = this.i;
            jD = chy.d(jD, this.h);
            bwi bwiVar = this.g.w;
            bwiVar.getClass();
            this = bwiVar.y();
            this.getClass();
        }
        return jD;
    }

    @Override // defpackage.bvt
    public final long E() {
        return this.h;
    }

    @Override // defpackage.bvt
    public final bry F() {
        return this.o;
    }

    @Override // defpackage.bvt
    public final bss G() {
        bss bssVar = this.q;
        if (bssVar != null) {
            return bssVar;
        }
        bqs.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new uer();
    }

    @Override // defpackage.bvt
    public final bvm H() {
        return this.g.s;
    }

    @Override // defpackage.bvt
    public final bvt I() {
        bwi bwiVar = this.g.v;
        if (bwiVar != null) {
            return bwiVar.y();
        }
        return null;
    }

    @Override // defpackage.bvt
    public final bvt J() {
        bwi bwiVar = this.g.w;
        if (bwiVar != null) {
            return bwiVar.y();
        }
        return null;
    }

    @Override // defpackage.bvt
    public final void M() {
        df(this.h, null);
    }

    @Override // defpackage.bvt
    public final boolean O() {
        return this.q != null;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.g.a();
    }

    @Override // defpackage.chw
    public final float b() {
        return this.g.b();
    }

    public int c(int i) {
        throw null;
    }

    public int d(int i) {
        throw null;
    }

    @Override // defpackage.bte
    public final void df(long j, uiq uiqVar) {
        z(j);
        if (this.j) {
            return;
        }
        q();
    }

    @Override // defpackage.bvt, defpackage.brv
    public final boolean dt() {
        return true;
    }

    public int e(int i) {
        throw null;
    }

    public int f(int i) {
        throw null;
    }

    @Override // defpackage.bte, defpackage.bru
    public final Object g() {
        return this.g.g();
    }

    @Override // defpackage.brv
    public final cib m() {
        return this.g.m();
    }

    protected void q() {
        G().f();
    }

    public final long x() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final bug y() {
        bvx bvxVar = this.g.s.t.p;
        bvxVar.getClass();
        return bvxVar;
    }

    public final void z(long j) {
        if (!a.q(this.h, j)) {
            this.h = j;
            bvx bvxVar = H().t.p;
            if (bvxVar != null) {
                bvxVar.z();
            }
            P(this.g);
        }
        if (this.k) {
            return;
        }
        L(G());
    }
}
