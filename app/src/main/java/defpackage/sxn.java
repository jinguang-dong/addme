package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sxn extends sxc {
    private sxm b;

    public sxn(sbe sbeVar, boolean z, Executor executor, sxh sxhVar) {
        super(sbeVar, z, false);
        this.b = new sxk(this, sxhVar, executor);
        v();
    }

    @Override // defpackage.sxc
    public final void j() {
        sxm sxmVar = this.b;
        if (sxmVar != null) {
            sxmVar.f();
        }
    }

    @Override // defpackage.swn
    protected final void o() {
        sxm sxmVar = this.b;
        if (sxmVar != null) {
            sxmVar.h();
        }
    }

    @Override // defpackage.sxc
    public final void x(int i) {
        super.x(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public sxn(sbe sbeVar, boolean z, Executor executor, Callable callable) {
        super(sbeVar, z, false);
        this.b = new sxl(this, callable, executor);
        v();
    }

    @Override // defpackage.sxc
    public final void h(int i, Object obj) {
    }
}
