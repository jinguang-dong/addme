package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjq implements klf {
    public final Executor a;
    private final hbj b;

    public kjq(Executor executor, hbj hbjVar) {
        this.a = executor;
        this.b = hbjVar;
    }

    private final kjp d(lss lssVar) {
        ppx ppxVar;
        String str;
        lme lmeVar = new lme(lssVar);
        hbj hbjVar = this.b;
        lsw lswVarK = lssVar.k();
        if (hbjVar.p(haj.a)) {
            ppxVar = ppx.PICTURES;
            str = "RAW images";
        } else {
            ppxVar = ppx.DCIM;
            str = "Camera";
        }
        pos posVarD = lswVarK.h().d(1, ppxVar, str, "dng");
        posVarD.h("ORIGINAL");
        kjp kjpVar = new kjp(this, lmeVar, posVarD);
        ((lrw) lssVar).b.i().a(lmeVar);
        return kjpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lss] */
    @Override // defpackage.klf
    public final kle a(gga ggaVar) {
        ?? r2 = ggaVar.b;
        r2.l();
        r2.k().h();
        return d(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lss] */
    @Override // defpackage.klf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final kjp b(gga ggaVar) {
        ?? r2 = ggaVar.b;
        r2.l();
        r2.k().h();
        return d(r2);
    }
}
