package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivw implements kiz {
    public final Runnable b;
    public final int d;
    public pbp e;
    public final /* synthetic */ ivx g;
    public final szh a = new szh();
    public final szh c = new szh();
    public boolean f = false;

    public ivw(ivx ivxVar, int i, Runnable runnable) {
        this.g = ivxVar;
        this.d = i;
        this.b = runnable;
    }

    @Override // defpackage.kiz
    public final synchronized syu a() {
        this.g.d.execute(new ivi(this, 5));
        return this.a;
    }

    @Override // defpackage.kiz
    public final syu b() {
        return ske.M(false);
    }

    public final synchronized void c(boolean z) {
        e();
        this.a.e(Boolean.valueOf(z));
        if (z) {
            return;
        }
        ivx ivxVar = this.g;
        ivxVar.d.execute(new ivi(this, 6));
        this.c.cancel(true);
    }

    public final synchronized void d(Runnable runnable, Runnable runnable2) {
        szh szhVar = this.c;
        if (!szhVar.isCancelled() && !this.f) {
            ske.W(szhVar, new lso(this, runnable, runnable2, 1), sxo.a);
        } else {
            runnable2.run();
            ((sgt) ivx.a.c().M(2416)).t("Cannot execute, already cancelled %s", this.d);
        }
    }

    public final void e() {
        pbp pbpVar = this.e;
        if (pbpVar != null) {
            pbpVar.a();
        }
    }
}
