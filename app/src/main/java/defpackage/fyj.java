package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fyj implements fda {
    final /* synthetic */ szh a;
    final /* synthetic */ fyk b;
    final /* synthetic */ ejt c;

    public fyj(fyk fykVar, szh szhVar, ejt ejtVar) {
        this.a = szhVar;
        this.c = ejtVar;
        this.b = fykVar;
    }

    @Override // defpackage.fda
    public final syu a() {
        return ske.M(new ovx(this.c.a));
    }

    @Override // defpackage.fda
    public final syu b() {
        return ske.M(new eoz());
    }

    @Override // defpackage.fda
    public final syu c() {
        return this.a;
    }

    @Override // defpackage.fda
    public final void e() {
        fyk fykVar = this.b;
        fykVar.a.d.a(true);
        fykVar.f.o(eoz.d());
    }

    @Override // defpackage.fda
    public final void f() {
        fyk fykVar = this.b;
        gau gauVar = fykVar.a;
        gauVar.d.a(true);
        gauVar.e.a(true);
        fykVar.f.o(eoz.c());
    }

    @Override // defpackage.fda
    public final void g() {
        fyk fykVar = this.b;
        fykVar.a.e.a(true);
        fykVar.f.o(eoz.e());
    }

    @Override // defpackage.fda
    public final void h() {
        this.b.b(false, true);
    }

    @Override // defpackage.fda
    public final void i() {
        this.b.b(true, true);
    }

    @Override // defpackage.fda
    public final void j() {
        this.b.b(true, false);
    }

    @Override // defpackage.fda
    public final /* synthetic */ void d() {
    }
}
