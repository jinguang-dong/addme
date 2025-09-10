package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqg implements job {
    volatile long a = 0;
    final /* synthetic */ joc b;
    final /* synthetic */ rwc c;

    public jqg(joc jocVar, rwc rwcVar) {
        this.b = jocVar;
        this.c = rwcVar;
    }

    @Override // defpackage.job
    public final void d(long j) {
        while (this.a < j) {
            rwc rwcVarF = this.b.f(this.a);
            if (!rwcVarF.h()) {
                return;
            }
            this.a = ((Long) rwcVarF.c()).longValue();
            ((hgj) this.c.c()).e(this.a);
        }
    }
}
