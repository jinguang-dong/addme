package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzv implements fzz, gaa {
    private final fzy a;
    private final our b = new our();
    private gab c;

    public fzv(fzy fzyVar) {
        this.a = fzyVar;
    }

    @Override // defpackage.fzz
    public final gab a() {
        gab gabVar = this.c;
        gabVar.getClass();
        return gabVar;
    }

    @Override // defpackage.fzz
    public final gac b() {
        return this.a.c();
    }

    @Override // defpackage.gaa
    public final void c() {
        this.a.close();
        this.b.close();
    }

    @Override // defpackage.gaa
    public final void d() {
        this.a.g();
    }

    @Override // defpackage.gaa
    public final void e() {
        this.a.h();
    }

    @Override // defpackage.fzz
    public final void g(gab gabVar) {
        this.c = gabVar;
    }

    @Override // defpackage.fzz
    public final void h(fzh fzhVar) {
        this.a.d(fzhVar.a);
        this.b.d(fzhVar.a(this));
    }
}
