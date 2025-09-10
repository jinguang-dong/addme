package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmn extends pmo {
    pmx a = null;
    private final uem b;

    public pmn(uem uemVar) {
        this.b = uemVar;
    }

    @Override // defpackage.pmo
    public final void a(Object obj, pmr pmrVar) {
        synchronized (this) {
            if (this.a == null) {
                this.a = (pmx) this.b.a();
            }
            this.a.a(obj);
        }
    }

    @Override // defpackage.pmo
    public final void b(sxy sxyVar, pmv pmvVar) {
        pmx pmxVar;
        synchronized (this) {
            pmxVar = this.a;
            this.a = null;
        }
        if (pmxVar != null) {
            sxyVar.c(pmvVar);
            pmxVar.b(sxyVar, (Object[]) pmvVar.b);
        }
    }
}
