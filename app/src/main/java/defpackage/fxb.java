package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxb implements fwk {
    private static final sgv a = sgv.g("fxb");
    private fxd b;
    private final jod c;

    public fxb(jod jodVar) {
        this.c = jodVar;
    }

    @Override // defpackage.fwk
    public final fxm a() {
        throw null;
    }

    @Override // defpackage.fwk
    public final void c(gnm gnmVar) {
        gnmVar.getClass();
        jod jodVar = this.c;
        izh izhVar = (izh) jodVar.a;
        tzx tzxVar = izhVar.jb;
        tzx tzxVar2 = izhVar.ja;
        izm izmVar = (izm) jodVar.b;
        fxd fxdVar = (fxd) tzs.c(new fia(izhVar.nQ, izhVar.jF, izhVar.hG, izhVar.ig, izhVar.ie, izhVar.gR, tzs.c(new hsq(tzxVar, tzxVar2, izmVar.ny, izmVar.xt, izhVar.hB, 1, (byte[]) null)), izmVar.yL, 3, (short[]) null)).a();
        if (fxdVar.m == fyv.a) {
            fxdVar.a(fyv.b);
            our ourVar = fxdVar.j;
            fxe fxeVar = fxdVar.b;
            ourVar.d(fxeVar);
            gav gavVar = fxdVar.c;
            ourVar.d(gavVar);
            ourVar.d(fxdVar.d);
            fxdVar.f = fxeVar.a();
            fxdVar.g = gavVar.a();
            jod jodVar2 = fxdVar.s;
            gaw gawVar = fxdVar.f;
            if (gawVar == null) {
                ujp.c("config");
                gawVar = null;
            }
            fxdVar.i = jodVar2.e(gawVar);
            fxdVar.h = ukc.C(ung.j(fxdVar.e), null, 0, new fxc(fxdVar, null), 3);
        }
        this.b = fxdVar;
    }

    @Override // defpackage.fwk
    public final void e() {
        throw new ueu("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, uem] */
    @Override // defpackage.fwk
    public final void g(boolean z) {
        gaw gawVar;
        fxd fxdVar = this.b;
        if (fxdVar == null) {
            return;
        }
        int iOrdinal = fxdVar.m.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 4) {
                ((sgt) a.c().M(472)).v("Ignore shutter button click with state: %s", fxdVar.m);
                return;
            }
            if (fxdVar.m == fyv.e) {
                fxdVar.a(fyv.f);
                fxa fxaVar = fxdVar.p;
                if (fxaVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ukc.C(ung.j(fxdVar.e), null, 0, new dee(fxaVar, z, fxdVar, (uhb) null, 2), 3);
                return;
            }
            return;
        }
        if (fxdVar.m == fyv.c) {
            fxdVar.a(fyv.d);
            gdv gdvVarA = fxdVar.k;
            if (gdvVarA == null || gdvVarA.a()) {
                fyc fycVar = fxdVar.d;
                gaw gawVar2 = fxdVar.f;
                if (gawVar2 == null) {
                    ujp.c("config");
                    gawVar2 = null;
                }
                gdvVarA = fycVar.a(gawVar2);
                if (gdvVarA == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                fxdVar.k = gdvVarA;
            }
            gdv gdvVar = gdvVarA;
            hkk hkkVar = fxdVar.r;
            lbj lbjVar = fxdVar.o;
            if (lbjVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            gaw gawVar3 = fxdVar.f;
            if (gawVar3 == null) {
                ujp.c("config");
                gawVar = null;
            } else {
                gawVar = gawVar3;
            }
            ?? r1 = hkkVar.e;
            Object obj = hkkVar.a;
            Object obj2 = hkkVar.d;
            Object obj3 = hkkVar.b;
            ?? r0 = hkkVar.c;
            Object objA = r1.a();
            gdm gdmVarA = ((gdn) obj).a();
            uhf uhfVarB = ((frl) obj2).b();
            uhf uhfVarB2 = ((frl) obj3).b();
            cxb cxbVar = (cxb) r0.a();
            cxbVar.getClass();
            gawVar.getClass();
            ukc.C(ung.j(fxdVar.e), null, 0, new crq(new fxa((mfd) objA, gdmVarA, uhfVarB, uhfVarB2, cxbVar, gdvVar, lbjVar, gawVar), fxdVar, (uhb) null, 7), 3);
        }
    }

    @Override // defpackage.fwk
    public final void h() {
        throw new ueu("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.fwk
    public final void i() {
        throw new ueu("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.fwk
    public final void l(boolean z) {
        c(gnm.b);
    }

    @Override // defpackage.fwk
    public final void m() {
        fxd fxdVar = this.b;
        if (fxdVar != null) {
            fxdVar.close();
        }
        this.b = null;
    }

    @Override // defpackage.fwk
    public final boolean n() {
        throw new ueu("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.fwk
    public final boolean o() {
        throw new ueu("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.fwk
    public final boolean p() {
        throw new ueu("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.fwk
    public final boolean q() {
        throw new ueu("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.fwk
    public final void d() {
    }

    @Override // defpackage.fwk
    public final void b(fyt fytVar) {
    }

    @Override // defpackage.fwk
    public final void f(int i) {
    }

    @Override // defpackage.fwk
    public final void j(boolean z) {
    }

    @Override // defpackage.fwk
    public final void k(fyt fytVar) {
    }
}
