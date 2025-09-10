package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kwh implements kvy {
    private static final sgv a = sgv.g("kwh");
    private final owf b;
    private final pfu c;

    public kwh(owf owfVar, pfu pfuVar) {
        this.b = owfVar;
        this.c = pfuVar;
    }

    @Override // defpackage.kvy
    public final boolean b() {
        return true;
    }

    @Override // defpackage.kvy
    public final kvx c(pfz pfzVar) {
        d(pfzVar, true);
        return new kwg(this, pfzVar);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [sgt, shi] */
    public final void d(pfz pfzVar, boolean z) {
        try {
            owf owfVar = this.b;
            owfVar.dL();
            Integer numValueOf = Integer.valueOf(z ? ((ixq) owfVar.dL()).equals(ixq.INACTIVE) ? 2 : 128 : 0);
            pfu pfuVar = this.c;
            pdi pdiVarV = pfu.v();
            ((pey) pdiVarV).e = 1;
            ((pey) pdiVarV).g = numValueOf;
            pfuVar.r(new pex((pey) pdiVarV));
            pdi pdiVarA = pfzVar.a();
            ((phd) pdiVarA).c = 1;
            ((phd) pdiVarA).e = numValueOf;
            ((swn) pfzVar.b(((phd) pdiVarA).c())).s();
        } catch (InterruptedException | CancellationException | ExecutionException | pco e) {
            if (e instanceof pco) {
                ((sgt) a.c().M(3533)).v("Couldn't set the torch state to %b", Boolean.valueOf(z));
            } else {
                ((sgt) ((sgt) a.b().i(e)).M((char) 3532)).v("Couldn't set the torch state to %b", Boolean.valueOf(z));
            }
        }
    }

    @Override // defpackage.kvy
    public final void a() {
    }
}
