package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ren {
    public final String a;
    public final rrp b;
    public final Object c;
    public List d;
    public final rel e;
    private final syu f;
    private final sxy g;
    private final rrp h;

    public ren(rel relVar, syu syuVar) {
        rem remVar = new rem(this);
        sxo sxoVar = sxo.a;
        this.h = new rrp(remVar, sxoVar);
        this.c = new Object();
        this.d = new ArrayList();
        this.e = relVar;
        this.f = syuVar;
        this.a = relVar.a;
        this.b = new rrp(new gea(relVar, 18), sxoVar);
        this.g = new sxy();
        c(new red(this, 7));
    }

    public final syu a() {
        syu syuVarJ;
        rwu.b(rvj.a);
        rrp rrpVar = this.h;
        if (rrpVar.c.isDone()) {
            syuVarJ = this.e.a();
        } else {
            rsf rsfVarU = qsz.u("Get ".concat(String.valueOf(this.a)));
            try {
                syuVarJ = swz.j(rrpVar.c(), rsx.c(new red(this, 8)), sxo.a);
                rsfVarU.a(syuVarJ);
                rsfVarU.close();
            } catch (Throwable th) {
                try {
                    rsfVarU.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ske.N(this.f);
        return ske.N(syuVarJ);
    }

    public final syu b(rvu rvuVar, Executor executor) {
        sxi sxiVarC = rsx.c(new red(rvuVar, 6));
        rwu.b(rvj.a);
        rsf rsfVarU = qsz.u("Update ".concat(String.valueOf(this.a)));
        try {
            syu syuVarC = this.h.c();
            sxy sxyVar = this.g;
            gea geaVar = new gea(syuVarC, 20);
            sxo sxoVar = sxo.a;
            sxyVar.b(geaVar, sxoVar);
            syu syuVarB = sxyVar.b(rsx.b(new pwf(this, syuVarC, sxiVarC, executor, 7)), sxoVar);
            syuVarB.getClass();
            if (!syuVarC.isDone()) {
                if (syuVarB.isDone()) {
                    ske.X(syuVarB, syuVarC);
                } else {
                    syh syhVar = new syh(syuVarB, syuVarC, 0);
                    syuVarB.c(syhVar, sxoVar);
                    syuVarC.c(syhVar, sxoVar);
                }
            }
            ske.N(this.f);
            syu syuVarF = qsy.f(syuVarB);
            rsfVarU.a(syuVarF);
            rsfVarU.close();
            return syuVarF;
        } finally {
        }
    }

    public final void c(sxi sxiVar) {
        synchronized (this.c) {
            this.d.add(sxiVar);
        }
    }
}
