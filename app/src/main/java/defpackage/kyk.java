package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kyk implements kmz {
    private static final sgv a = sgv.g("kyk");
    private final lcu b;
    private final owf c;
    private final kuw d;
    private final kyu e;
    private final pbn f;
    private final pen g;
    private final our h;
    private final pfu i;
    private final hbj j;

    public kyk(pfu pfuVar, lcu lcuVar, owf owfVar, kuw kuwVar, pbn pbnVar, kyu kyuVar, hbj hbjVar, our ourVar) {
        this.i = pfuVar;
        this.b = lcuVar;
        this.c = owfVar;
        this.d = kuwVar;
        this.f = pbnVar;
        this.e = kyuVar;
        this.j = hbjVar;
        this.h = ourVar;
        pem pemVarA = pen.a();
        pemVarA.b(3);
        pemVarA.c(4);
        pemVarA.e(1);
        pemVarA.d(true);
        this.g = pemVarA.a();
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.c;
    }

    @Override // defpackage.kmz
    public final owf b() {
        return new owi(qpt.cl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pdv] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kml] */
    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        pfz pfzVarU;
        ?? Fr = this.b.fr();
        pbn pbnVar = this.f;
        pbnVar.f("pckFlashHdr#sessionAnd3A");
        boolean z = false;
        try {
            pfzVarU = this.i.u();
        } catch (hht e) {
            if (0 == 0) {
                ((sgt) a.b().M(3725)).s("Error capturing image.");
                ggaVar.a.f();
                ?? r12 = ggaVar.b;
                if (this.h.b()) {
                    r12.b(new hhr(e));
                } else {
                    r12.F(nfo.a, e);
                }
            }
        } catch (Throwable th) {
            if (0 == 0) {
                ((sgt) a.b().M(3726)).s("Error capturing image.");
                ggaVar.a.f();
                ?? r122 = ggaVar.b;
                if (this.h.b()) {
                    r122.b(new hhr((Throwable) null));
                } else {
                    r122.F(nfo.a, new hht("Image capture failed. Aborting capture!"));
                }
            }
            kmyVar.close();
            this.f.g();
            throw th;
        }
        try {
            kgd kgdVarB = this.d.b(pfzVarU, this.g);
            try {
                ((kfl) ggaVar.d).f.a(false);
                pbnVar.h("pckFlashHdr#submitCaptureRequest");
                pfg pfgVarF = pfzVarU.f();
                pfgVarF.c(Fr);
                ezh.S(this.j, pfgVarF);
                pfy pfyVarG = pfzVarU.g(pfgVarF.b());
                ggaVar.a.c().h();
                kmyVar.close();
                kgdVarB.close();
                pfzVarU.close();
                pbnVar.h("pckFlashHdr#getFrame");
                pdk pdkVarA = pfyVarG.a(Fr);
                pfyVarG.close();
                if (pdkVarA != null) {
                    ojl.by(pdkVarA);
                    pbnVar.h("pckFlashHdr#process");
                    this.e.h(sbp.l(pdkVarA), new kyj(0), ggaVar);
                    z = true;
                }
                kgdVarB.close();
                pfzVarU.close();
                if (!z) {
                    ((sgt) a.b().M(3724)).s("Error capturing image.");
                    ggaVar.a.f();
                    ?? r123 = ggaVar.b;
                    if (this.h.b()) {
                        r123.b(new hhr((Throwable) null));
                    } else {
                        r123.F(nfo.a, new hht("Image capture failed. Aborting capture!"));
                    }
                }
                kmyVar.close();
                this.f.g();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                pfzVarU.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
