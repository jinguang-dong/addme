package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyp implements fda {
    final /* synthetic */ szh a;
    public final /* synthetic */ fyq b;

    public fyp(fyq fyqVar, szh szhVar) {
        this.a = szhVar;
        this.b = fyqVar;
    }

    @Override // defpackage.fda
    public final syu a() {
        return this.a;
    }

    @Override // defpackage.fda
    public final syu b() {
        szh szhVar = this.b.h;
        szhVar.getClass();
        return szhVar;
    }

    @Override // defpackage.fda
    public final syu c() {
        szh szhVar = this.b.g;
        szhVar.getClass();
        return szhVar;
    }

    @Override // defpackage.fda
    public final void e() {
        fyq fyqVar = this.b;
        fyqVar.e.d.a(true);
        fyqVar.l.o(eoz.d());
    }

    @Override // defpackage.fda
    public final void f() {
        fyq fyqVar = this.b;
        gau gauVar = fyqVar.e;
        gauVar.d.a(true);
        gauVar.e.a(true);
        ((Executor) fyqVar.d.c()).execute(new fxs(this, 12));
    }

    @Override // defpackage.fda
    public final void g() {
        fyq fyqVar = this.b;
        fyqVar.e.e.a(true);
        ((Executor) fyqVar.d.c()).execute(new fxs(this, 11));
    }

    @Override // defpackage.fda
    public final void h() {
        fyq fyqVar = this.b;
        fyqVar.n.f();
        fyqVar.j(true, false, true);
    }

    @Override // defpackage.fda
    public final void i() {
        fyq fyqVar = this.b;
        fyqVar.f((mlw) fyqVar.b.c());
        fyqVar.b();
        fyqVar.n.f();
        fyqVar.j(true, true, true);
    }

    @Override // defpackage.fda
    public final void j() {
        fyq fyqVar = this.b;
        fyqVar.f((mlw) fyqVar.b.c());
        fyqVar.b();
        fyqVar.j(true, true, false);
    }

    @Override // defpackage.fda
    public final /* synthetic */ void d() {
    }
}
