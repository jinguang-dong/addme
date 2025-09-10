package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ado {
    public final String a;
    public final azr b;
    public final bgz c;
    public final bgz d;
    public final byz e;
    private final ado f;
    private final azr g;
    private final azr h;
    private final azr i;
    private final bbf j;
    private final bbf k;

    public ado(byz byzVar, ado adoVar, String str) {
        this.e = byzVar;
        this.f = adoVar;
        this.a = str;
        Object objD = d();
        bap bapVar = bap.c;
        this.g = new azz(objD, bapVar);
        this.h = new azz(new adj(d(), d()), bapVar);
        this.j = new azx(0L);
        this.k = new azx(Long.MIN_VALUE);
        this.b = new azz(false, bapVar);
        this.c = new bgz();
        this.d = new bgz();
        this.i = new azz(false, bapVar);
        ne neVar = new ne(this, 17);
        pmg pmgVar = bbj.a;
        new ayv(neVar, null);
    }

    private final void u(adj adjVar) {
        this.h.b(adjVar);
    }

    public final long a() {
        bgz bgzVar = this.c;
        int iA = bgzVar.a();
        long jMax = 0;
        for (int i = 0; i < iA; i++) {
            jMax = Math.max(jMax, ((adk) bgzVar.get(i)).c());
        }
        bgz bgzVar2 = this.d;
        int iA2 = bgzVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            jMax = Math.max(jMax, ((ado) bgzVar2.get(i2)).a());
        }
        return jMax;
    }

    public final long b() {
        ado adoVar = this.f;
        return adoVar != null ? adoVar.b() : this.j.e();
    }

    public final long c() {
        return this.k.e();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bbo, java.lang.Object] */
    public final Object d() {
        return this.e.a.a();
    }

    public final Object e() {
        return this.g.a();
    }

    public final void f(final Object obj, ayc aycVar, final int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1493585151);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? aycVarC.B(obj) : aycVarC.D(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(this) ? 16 : 32;
        }
        if (!aycVarC.H((i2 & 19) != 18, i2 & 1)) {
            aycVarC.r();
        } else if (r()) {
            aycVarC.u(467781377);
            ((ayg) aycVarC).Y();
        } else {
            aycVarC.u(466120769);
            o(obj);
            int i6 = i2 & ScriptIntrinsicBLAS.TRANSPOSE;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            byte[] bArr = null;
            if (i6 == 32 || objR == ayb.a) {
                ne neVar = new ne(this, i5);
                pmg pmgVar = bbj.a;
                ayv ayvVar = new ayv(neVar, null);
                aygVar.ac(ayvVar);
                objR = ayvVar;
            }
            if (((Boolean) ((bbo) objR).a()).booleanValue()) {
                aycVarC.u(466528884);
                Object objR2 = aygVar.R();
                Object obj2 = ayb.a;
                if (objR2 == obj2) {
                    objR2 = azb.a(uhg.a, aycVarC);
                    aygVar.ac(objR2);
                }
                und undVar = (und) objR2;
                boolean zD = aycVarC.D(undVar) | (i6 == 32);
                Object objR3 = aygVar.R();
                if (zD || objR3 == obj2) {
                    objR3 = new adp(undVar, this, i4, bArr);
                    aygVar.ac(objR3);
                }
                azb.b(undVar, this, (uiq) objR3, aycVarC);
                aygVar.Y();
            } else {
                aycVarC.u(467771457);
                aygVar.Y();
            }
            aygVar.Y();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: adg
                @Override // defpackage.uiu
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    ado adoVar = this.a;
                    int i7 = i;
                    adoVar.f(obj, (ayc) obj3, bay.j(i7 | 1));
                    return ufg.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bbo, java.lang.Object] */
    public final void g(long j, boolean z) {
        if (c() == Long.MIN_VALUE) {
            i(j);
        } else {
            byz byzVar = this.e;
            if (!((Boolean) byzVar.b.a()).booleanValue()) {
                byzVar.p(true);
            }
        }
        n(false);
        bgz bgzVar = this.c;
        int iA = bgzVar.a();
        boolean zAo = true;
        for (int i = 0; i < iA; i++) {
            adk adkVar = (adk) bgzVar.get(i);
            if (!adkVar.o()) {
                long jA = z ? adkVar.e().a() : j;
                adkVar.l(adkVar.e().d(jA));
                adkVar.b = adkVar.e().b(jA);
                if (byi.bh(adkVar.e(), jA)) {
                    adkVar.i(true);
                }
            }
            zAo &= adkVar.o();
        }
        bgz bgzVar2 = this.d;
        int iA2 = bgzVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ado adoVar = (ado) bgzVar2.get(i2);
            if (!a.ao(adoVar.e(), adoVar.d())) {
                adoVar.g(j, z);
            }
            zAo &= a.ao(adoVar.e(), adoVar.d());
        }
        if (zAo) {
            h();
        }
    }

    public final void h() {
        l(Long.MIN_VALUE);
        byz byzVar = this.e;
        byzVar.q(e());
        j(0L);
        byzVar.p(false);
        bgz bgzVar = this.d;
        int iA = bgzVar.a();
        for (int i = 0; i < iA; i++) {
            ((ado) bgzVar.get(i)).h();
        }
    }

    public final void i(long j) {
        l(j);
        this.e.p(true);
    }

    public final void j(long j) {
        if (this.f == null) {
            this.j.h(j);
        }
    }

    public final void k(boolean z) {
        this.i.b(Boolean.valueOf(z));
    }

    public final void l(long j) {
        this.k.h(j);
    }

    public final void m(Object obj) {
        this.g.b(obj);
    }

    public final void n(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void o(Object obj) {
        if (a.ao(e(), obj)) {
            return;
        }
        u(new adj(e(), obj));
        if (!a.ao(d(), e())) {
            this.e.q(e());
        }
        m(obj);
        if (!q()) {
            n(true);
        }
        bgz bgzVar = this.c;
        int iA = bgzVar.a();
        for (int i = 0; i < iA; i++) {
            ((adk) bgzVar.get(i)).j(-2.0f);
        }
    }

    public final boolean p() {
        bgz bgzVar = this.c;
        int iA = bgzVar.a();
        for (int i = 0; i < iA; i++) {
        }
        bgz bgzVar2 = this.d;
        int iA2 = bgzVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            if (((ado) bgzVar2.get(i2)).p()) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        return c() != Long.MIN_VALUE;
    }

    public final boolean r() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final adj s() {
        return (adj) this.h.a();
    }

    public final void t(Object obj, Object obj2) {
        l(Long.MIN_VALUE);
        byz byzVar = this.e;
        byzVar.p(false);
        if (!r() || !a.ao(d(), obj) || !a.ao(e(), obj2)) {
            if (!a.ao(d(), obj)) {
                byzVar.q(obj);
            }
            m(obj2);
            k(true);
            u(new adj(obj, obj2));
        }
        bgz bgzVar = this.d;
        int iA = bgzVar.a();
        for (int i = 0; i < iA; i++) {
            ado adoVar = (ado) bgzVar.get(i);
            adoVar.getClass();
            if (adoVar.r()) {
                adoVar.t(adoVar.d(), adoVar.e());
            }
        }
        bgz bgzVar2 = this.c;
        int iA2 = bgzVar2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            ((adk) bgzVar2.get(i2)).p();
        }
    }

    public final String toString() {
        bgz bgzVar = this.c;
        int iA = bgzVar.a();
        String str = "Transition animation values: ";
        for (int i = 0; i < iA; i++) {
            str = str + ((adk) bgzVar.get(i)) + ", ";
        }
        return str;
    }
}
