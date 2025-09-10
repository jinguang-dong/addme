package defpackage;

import com.google.android.apps.camera.bottombar.BottomBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
class gjl extends gjy {
    final /* synthetic */ gjn b;

    public gjl(gjn gjnVar) {
        this.b = gjnVar;
    }

    @Override // defpackage.gjy, defpackage.mcz, defpackage.mda
    public final void a() {
        this.b.h = this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, owq] */
    @Override // defpackage.gjy, defpackage.gjw
    public void d() {
        gjn gjnVar = this.b;
        gtm gtmVar = gjnVar.j;
        gtmVar.f.a(false);
        gtmVar.c.a(fyx.REVIEW);
        BottomBar bottomBar = gjnVar.e.a;
        bottomBar.x(true);
        bottomBar.p(sbv.o(fvo.CENTER_LEFT, rwc.j(bottomBar.k()), fvo.CENTER_RIGHT, rwc.j(bottomBar.l())), true);
        gjnVar.f.aA();
        gjnVar.i.t(false);
    }

    @Override // defpackage.gjw
    public final int e() {
        return 2;
    }
}
