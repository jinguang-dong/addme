package defpackage;

import com.google.android.apps.camera.ui.views.ViewfinderCover;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nht implements mzx {
    final /* synthetic */ ViewfinderCover a;

    public nht(ViewfinderCover viewfinderCover) {
        this.a = viewfinderCover;
    }

    @Override // defpackage.mzx
    public final rwc b() {
        return this.a.b();
    }

    @Override // defpackage.mzx
    public final rwc c() {
        return this.a.c();
    }

    @Override // defpackage.mzx
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.mzx
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.mzx
    public final boolean g() {
        throw null;
    }

    @Override // defpackage.mzx
    public final boolean h() {
        return false;
    }

    @Override // defpackage.mzx
    public final void i() {
        ViewfinderCover viewfinderCover = this.a;
        if (viewfinderCover.t) {
            return;
        }
        viewfinderCover.o.setImageDrawable(viewfinderCover.p);
        viewfinderCover.s.m();
        viewfinderCover.p.start();
    }

    @Override // defpackage.mzx
    public final void f(nkw nkwVar) {
    }
}
