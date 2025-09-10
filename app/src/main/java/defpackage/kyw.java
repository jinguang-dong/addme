package defpackage;

import com.google.android.build.data.JKx.wzgaYJqO;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kyw implements kmz {
    private static final sgv a = sgv.g("kyw");
    private final let b;
    private final kmz c;
    private final Set d;
    private final pbn e;
    private final kwr f;

    public kyw(let letVar, kmz kmzVar, Set set, pbn pbnVar, kwr kwrVar) {
        this.b = letVar;
        this.c = kmzVar;
        this.d = set;
        this.e = pbnVar;
        this.f = kwrVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kml] */
    private static final void e(kmz kmzVar, List list, kmy kmyVar, gga ggaVar) {
        kwp.a(list);
        ggaVar.b.o().f();
        ggaVar.a.h();
        kmzVar.c(kmyVar, ggaVar);
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.c.a();
    }

    @Override // defpackage.kmz
    public final owf b() {
        return new owi(qpt.cj(ujp.aB(this.d)));
    }

    protected abstract boolean d(List list, kmy kmyVar, gga ggaVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kml] */
    @Override // defpackage.kmz
    public void c(kmy kmyVar, gga ggaVar) {
        kmz kmzVar;
        boolean zD;
        pbn pbnVar = this.e;
        pbnVar.f("pckZsl#lockBuffer");
        let letVar = this.b;
        les lesVarA = letVar.a();
        letVar.m("Initial");
        try {
            pbnVar.h("pckZsl#getFrames");
            List listK = letVar.k();
            lesVarA.a();
            pbnVar.g();
            ?? r5 = ggaVar.b;
            boolean z = false;
            r5.G(true, false);
            int i = ((sex) listK).c;
            if (i <= 0) {
                ((sgt) a.b().M(3787)).w("Can't execute command, not enough ZSL images. Required: %d, got: %d", 1, i);
                e(this.c, listK, kmyVar, ggaVar);
            } else {
                pbnVar.f(wzgaYJqO.lfekKaqIdNIWf);
                ?? r8 = ggaVar.a;
                if (r8.d() == null) {
                    r8.c().h();
                }
                pbnVar.h("pckZsl#afMetadata");
                this.f.a(r5);
                pbnVar.h("pckZsl#filterFrames");
                sbp sbpVarI = letVar.i(listK);
                pbnVar.g();
                try {
                    try {
                        pbnVar.f("pckZsl#processZslFrames");
                        zD = d(sbpVarI, kmyVar, ggaVar);
                        this.e.g();
                        this.b.m("Final");
                    } catch (hht e) {
                        if (e instanceof hhq) {
                            ((sgt) ((sgt) a.b().i(e)).M(3786)).s(GAQqzWiWWcYOgy.CAaZsA);
                        } else {
                            ((sgt) ((sgt) a.b().i(e)).M(3785)).s(JvFFEwFNdCrxf.hBwcPAOdGaFvU);
                            z = true;
                        }
                        this.e.g();
                        this.b.m("Final");
                        if (z) {
                            kmzVar = this.c;
                        } else {
                            ggaVar.a.f();
                            ggaVar.b.F(nfo.a, e);
                        }
                    }
                    if (!zD) {
                        kmzVar = this.c;
                        e(kmzVar, sbpVarI, kmyVar, ggaVar);
                    }
                } catch (Throwable th) {
                    this.e.g();
                    this.b.m("Final");
                    e(this.c, sbpVarI, kmyVar, ggaVar);
                    throw th;
                }
            }
        } finally {
            lesVarA.a();
        }
    }
}
