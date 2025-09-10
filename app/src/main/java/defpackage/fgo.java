package defpackage;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgo implements npn {
    private fgy a;
    private final fga b;

    public fgo(fga fgaVar) {
        this.b = fgaVar;
    }

    @Override // defpackage.npn
    public final synchronized npl a(npj npjVar) {
        fgy fgyVar;
        fgy fgyVar2 = this.a;
        if (fgyVar2 != null) {
            fgyVar2.close();
        }
        shl shlVar = shx.a;
        fga fgaVar = this.b;
        qin qinVarF = npjVar.f();
        Context context = fgaVar.a;
        fgn fgnVar = fgaVar.g;
        fgq fgqVar = fgaVar.b;
        fgyVar = new fgy(qinVarF, context, fgnVar, rwc.j(fgqVar), fgaVar.c, new fgz(context, qinVarF), fgaVar.d, fgaVar.e, fgaVar.f);
        this.a = fgyVar;
        return fgyVar;
    }

    public final synchronized void b() {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.g();
        }
    }

    public final synchronized void c() {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.h();
        }
    }

    public final synchronized void d() {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.i();
        }
    }

    public final synchronized void e(poj pojVar, RectF rectF, boolean z) {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.j(pojVar, rectF, z);
        } else {
            shl shlVar = shx.a;
        }
    }

    public final synchronized void f() {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.k();
        }
    }

    public final synchronized void g(mxj mxjVar) {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.l(mxjVar);
        }
    }

    public final synchronized void h(kuf kufVar) {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.m(kufVar);
        }
    }

    public final synchronized void i(int i) {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.n(i);
        }
    }

    public final synchronized void j(mxm mxmVar) {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.o(mxmVar);
        }
    }

    public final synchronized void k(fhd fhdVar) {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.p(fhdVar);
        }
    }

    public final synchronized void l(mye myeVar) {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            fgyVar.r(myeVar);
        }
    }
}
