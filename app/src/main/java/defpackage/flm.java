package defpackage;

import android.content.res.Resources;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class flm extends flg {
    final /* synthetic */ fln a;

    public flm(fln flnVar) {
        this.a = flnVar;
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        Duration duration = fln.a;
        fln flnVar = this.a;
        flnVar.f.g();
        flnVar.g.a(true);
        flnVar.o.g();
        flnVar.d.h();
        mzz mzzVar = flnVar.c;
        mzzVar.w(false);
        mzzVar.m(false);
        flnVar.m.k();
        flnVar.n.g(fln.class);
        ndj ndjVar = flnVar.e;
        ndjVar.R();
        ndjVar.L(0, 1000L, true, false, true, Optional.empty(), Optional.of(40));
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void b() {
        Duration duration = fln.a;
        this.a.e.x();
    }

    @Override // defpackage.flg
    public void d() {
        Duration duration = fln.a;
        fln flnVar = this.a;
        flnVar.g.a(false);
        flnVar.h();
    }

    @Override // defpackage.flg
    public void e() {
        this.a.g.a(false);
    }

    @Override // defpackage.flg
    public void c() {
    }
}
