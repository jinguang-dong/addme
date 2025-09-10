package defpackage;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjj implements klf {
    public final pbc a;
    public final pbn b;
    public final lly c;
    public final Executor d = ojl.bW("LuckyShotEx");
    public final Rect e;
    private final klf f;
    private final lmi g;

    public kjj(pbb pbbVar, lly llyVar, kqp kqpVar, lmi lmiVar, klf klfVar, pbn pbnVar) {
        this.a = pbbVar.a("LSRprcssngIS");
        this.b = pbnVar;
        this.f = klfVar;
        this.c = llyVar;
        this.e = kqpVar.c;
        this.g = lmiVar;
    }

    @Override // defpackage.klf
    public final kle a(gga ggaVar) {
        return new kji(this, ggaVar, this.f.a(ggaVar), this.g);
    }

    @Override // defpackage.klf
    public final kle b(gga ggaVar) {
        kle kleVarB = this.f.b(ggaVar);
        kleVarB.getClass();
        return new kji(this, ggaVar, kleVarB, this.g);
    }
}
