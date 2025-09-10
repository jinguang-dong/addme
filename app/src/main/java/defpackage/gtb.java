package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtb extends gsz {
    public gsz a;
    private final Executor b;
    private final hbc c;
    private final gsz d;

    public gtb(Executor executor, hbc hbcVar) {
        gta gtaVar = new gta(this);
        this.d = gtaVar;
        this.b = executor;
        this.c = hbcVar;
        this.a = gtaVar;
    }

    private final void n(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // defpackage.gsz, defpackage.mcz, defpackage.mda
    public final void a() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new fnf(gszVar, 15));
    }

    @Override // defpackage.gsz
    public final void c() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new gpk(gszVar, 14));
    }

    @Override // defpackage.gsz
    public final void d() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new gpk(gszVar, 12));
    }

    @Override // defpackage.gsz
    public final void e() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new fnf(gszVar, 13));
    }

    @Override // defpackage.gsz
    public final void f() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new gpk(gszVar, 15));
    }

    @Override // defpackage.gsz
    public final void h() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new gpk(gszVar, 17));
    }

    public final void i() {
        hbc hbcVar = this.c;
        hbcVar.getClass();
        if (hbcVar.b(hbc.ENG)) {
            throw new IllegalStateException("Thread safe CvkState invoked without delegate being set");
        }
    }

    @Override // defpackage.gsz
    public final void j() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new gpk(gszVar, 13));
    }

    @Override // defpackage.gsz
    public final void k() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new fnf(gszVar, 14));
    }

    @Override // defpackage.gsz
    public final void l() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new gpk(gszVar, 16));
    }

    @Override // defpackage.gsz
    public final void m() {
        gsz gszVar = this.a;
        gszVar.getClass();
        n(new fnf(gszVar, 12));
    }
}
