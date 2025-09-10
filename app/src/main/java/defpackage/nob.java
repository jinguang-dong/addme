package defpackage;

import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class nob extends noa {
    final /* synthetic */ nod a;

    public nob(nod nodVar) {
        this.a = nodVar;
    }

    @Override // defpackage.noa, defpackage.mcz, defpackage.mda
    public final void a() {
        Object objA = this.a.a.a();
        nox noxVar = (nox) objA;
        noxVar.n = false;
        ViewPropertyAnimator viewPropertyAnimatorAlpha = noxVar.l.animate().alpha(0.0f);
        long j = noxVar.e;
        viewPropertyAnimatorAlpha.setDuration(j).withEndAction(new nhp(objA, 13)).start();
        noxVar.g.animate().alpha(0.0f).setDuration(j).withEndAction(new nhp(objA, 14)).start();
        noxVar.h.animate().alpha(0.0f).setDuration(j).withEndAction(new nhp(objA, 15)).start();
    }

    @Override // defpackage.noa
    public void c() {
    }

    @Override // defpackage.noa
    public void e() {
    }
}
