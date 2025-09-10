package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adk implements bbo {
    public boolean a;
    public ace b;
    final /* synthetic */ ado c;
    private final azr d;
    private final acy e;
    private final azr f;
    private final azr g;
    private final azr h;
    private final azr i;
    private boolean j;
    private final acn k;
    private final bbb l;
    private final bbf m;
    private final byz n;

    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, uiq] */
    public adk(ado adoVar, Object obj, ace aceVar, byz byzVar) {
        this.c = adoVar;
        this.n = byzVar;
        bap bapVar = bap.c;
        this.d = new azz(obj, bapVar);
        Object objA = null;
        acy acyVarBf = byi.bf(0.0f, 0.0f, null, 7);
        this.e = acyVarBf;
        this.f = new azz(acyVarBf, bapVar);
        this.g = new azz(new adf(d(), byzVar, obj, f(), aceVar), bapVar);
        this.h = new azz(true, bapVar);
        this.l = new azv(-1.0f);
        this.i = new azz(obj, bapVar);
        this.b = aceVar;
        this.m = new azx(e().a());
        Float f = (Float) aef.a.get(byzVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            ace aceVar2 = (ace) byzVar.a.a(obj);
            int iB = aceVar2.b();
            for (int i = 0; i < iB; i++) {
                aceVar2.e(i, fFloatValue);
            }
            objA = this.n.b.a(aceVar2);
        }
        this.k = byi.bf(0.0f, 0.0f, objA, 3);
    }

    private final void q(adf adfVar) {
        this.g.b(adfVar);
    }

    @Override // defpackage.bbo
    public final Object a() {
        return this.i.a();
    }

    public final float b() {
        return this.l.e();
    }

    public final long c() {
        return this.m.e();
    }

    public final acn d() {
        return (acn) this.f.a();
    }

    public final adf e() {
        return (adf) this.g.a();
    }

    public final Object f() {
        return this.d.a();
    }

    public final void g(acn acnVar) {
        this.f.b(acnVar);
    }

    public final void h(long j) {
        this.m.h(j);
    }

    public final void i(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void j(float f) {
        this.l.i(f);
    }

    public final void k(Object obj) {
        this.d.b(obj);
    }

    public final void l(Object obj) {
        this.i.b(obj);
    }

    public final void m(Object obj, boolean z) {
        if (a.ao(null, f())) {
            q(new adf(this.k, this.n, obj, obj, this.b.c()));
            this.a = true;
            h(e().a());
            return;
        }
        aby abyVarD = (!z || this.j || (d() instanceof acy)) ? d() : this.k;
        ado adoVar = this.c;
        long jMax = 0;
        q(new adf(adoVar.b() > 0 ? new acz(abyVarD, adoVar.b()) : abyVarD, this.n, obj, f(), this.b));
        h(e().a());
        this.a = false;
        adoVar.n(true);
        if (adoVar.r()) {
            bgz bgzVar = adoVar.c;
            int iA = bgzVar.a();
            for (int i = 0; i < iA; i++) {
                adk adkVar = (adk) bgzVar.get(i);
                jMax = Math.max(jMax, adkVar.c());
                adkVar.p();
            }
            adoVar.n(false);
        }
    }

    public final void n(Object obj, Object obj2, acn acnVar) {
        k(obj2);
        g(acnVar);
        if (a.ao(e().b, obj) && a.ao(e().a, obj2)) {
            return;
        }
        m(obj, false);
    }

    public final boolean o() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final void p() {
        if (b() == -1.0f) {
            this.j = true;
            if (a.ao(e().a, e().b)) {
                l(e().a);
            } else {
                l(e().d(0L));
                this.b = e().b(0L);
            }
        }
    }

    public final String toString() {
        return "current value: " + a() + ", target: " + f() + ", spec: " + d();
    }
}
