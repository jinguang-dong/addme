package defpackage;

import com.google.android.apps.camera.bottombar.BottomBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iyp implements itk {
    final /* synthetic */ iyu a;

    public iyp(iyu iyuVar) {
        this.a = iyuVar;
    }

    @Override // defpackage.itk
    public final void a(boolean z) {
        iyu iyuVar = this.a;
        if (((BottomBar) iyuVar.j.f).o.getVisibility() == 0 && z) {
            ((moc) iyuVar.i.a()).e(false);
        }
    }

    @Override // defpackage.itk
    public final void b(boolean z) {
        if (z) {
            return;
        }
        mzz mzzVar = this.a.C;
        if (mzzVar.r()) {
            mzzVar.y(2, true);
        }
    }

    @Override // defpackage.itk
    public final void c(boolean z) {
        if (z) {
            return;
        }
        mzz mzzVar = this.a.C;
        if (mzzVar.r()) {
            mzzVar.y(1, true);
        }
    }

    @Override // defpackage.itk
    public final void f(boolean z) {
        this.a.L.v(7);
    }

    @Override // defpackage.itk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void h(boolean z) {
    }
}
