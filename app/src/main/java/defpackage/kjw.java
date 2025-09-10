package defpackage;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
class kjw implements klf {
    public static final sgv a = sgv.g("kjw");
    public final lly b;
    public final Rect c;
    public final Executor d = ojl.bZ("BckndYuvEx");
    private final ejt e;

    public kjw(lly llyVar, kqp kqpVar, ejt ejtVar) {
        this.b = llyVar;
        this.e = ejtVar;
        this.c = kqpVar.c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lss] */
    @Override // defpackage.klf
    public final kle a(gga ggaVar) {
        ?? r2 = ggaVar.b;
        pao paoVarB = pao.b(r2.e());
        return new kjk(new kjv(this, r2, paoVarB, new kjy(r2, paoVarB), new kks(this.e.a, kkq.SW_JPEG)), 0);
    }

    @Override // defpackage.klf
    public final kle b(gga ggaVar) {
        return a(ggaVar);
    }
}
