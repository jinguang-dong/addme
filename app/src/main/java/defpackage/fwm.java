package defpackage;

import j$.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fwm implements itk {
    final /* synthetic */ fwn a;
    private boolean b = false;
    private boolean c = false;

    public fwm(fwn fwnVar) {
        this.a = fwnVar;
    }

    @Override // defpackage.itk
    public final void e() {
        fwn fwnVar = this.a;
        synchronized (fwnVar.q) {
            Collection.EL.stream(fwnVar.p).forEach(new fkj(6));
        }
    }

    @Override // defpackage.itk
    public final void f(boolean z) {
        fwn fwnVar = this.a;
        if (!fwnVar.d.b().r() || this.b == z) {
            return;
        }
        this.b = z;
        if (!z && this.c) {
            this.c = false;
            return;
        }
        synchronized (fwnVar.q) {
            gas gasVar = (gas) ((ovx) fwnVar.k.g).d;
            if ((!z && gasVar != gas.RECORDING_SESSION_ACTIVE) || (z && gasVar == gas.RECORDING_SESSION_ACTIVE)) {
                Iterator it = fwnVar.p.iterator();
                while (it.hasNext()) {
                    ((fyt) it.next()).k(true);
                }
                if (z) {
                    this.c = true;
                }
            }
        }
        this.a.d.G(z);
    }

    @Override // defpackage.itk
    public final void g(boolean z) {
        if (z) {
            this.a.u.b(true);
        }
    }

    @Override // defpackage.itk
    public final void h(boolean z) {
        if (z) {
            this.a.u.b(false);
        }
    }

    @Override // defpackage.itk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void c(boolean z) {
    }
}
