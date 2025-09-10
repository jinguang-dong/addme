package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.BottomBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
class mrw extends mru {
    final /* synthetic */ mrx b;

    public mrw(mrx mrxVar) {
        this.b = mrxVar;
    }

    @Override // defpackage.mru, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        mrx mrxVar = this.b;
        BottomBar bottomBar = mrxVar.d.a;
        bottomBar.p(sbv.n(fvo.CENTER_LEFT, rwc.j(bottomBar.k())), true);
        mrxVar.e.ax();
        mrxVar.h.k();
        mrxVar.i.t(false);
        jjn jjnVar = mrxVar.g;
        if (jjnVar.A()) {
            jjnVar.q();
        }
    }

    @Override // defpackage.mru, defpackage.mcz, defpackage.mda
    public final void b() throws Resources.NotFoundException {
        mrx mrxVar = this.b;
        fvu fvuVar = mrxVar.d;
        fvuVar.a.p(sbv.n(fvo.CENTER_RIGHT, rwc.j(fvuVar.b)), true);
        mrxVar.e.E();
        mrxVar.h.j();
        mrxVar.i.t(true);
    }

    @Override // defpackage.mru
    public void d() {
    }
}
