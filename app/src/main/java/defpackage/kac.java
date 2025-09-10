package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kac implements kbq {
    final /* synthetic */ kag a;
    public final /* synthetic */ kai b;

    public kac(kai kaiVar, kag kagVar) {
        this.a = kagVar;
        this.b = kaiVar;
    }

    @Override // defpackage.kbq
    public final void a() {
        this.b.n.post(new jnw(this, this.a, 18, null));
    }

    @Override // defpackage.kbq
    public final void b(Throwable th) {
        this.b.n.post(new jnw(this, this.a, 17, null));
    }

    @Override // defpackage.kbq
    public final void c(poj pojVar) {
        d(pojVar, false, false);
    }

    @Override // defpackage.kbq
    public final void d(final poj pojVar, final boolean z, final boolean z2) {
        final kag kagVar = this.a;
        this.b.n.post(new Runnable() { // from class: kab
            @Override // java.lang.Runnable
            public final void run() {
                kag kagVar2 = kagVar;
                poj pojVar2 = pojVar;
                boolean z3 = z;
                boolean z4 = z2;
                kai kaiVar = this.a.b;
                synchronized (kaiVar) {
                    kagVar2.a = false;
                    kagVar2.b = rwc.j(new pkf(pojVar2));
                    kagVar2.g = rwc.j(Long.valueOf(System.currentTimeMillis()));
                    kagVar2.j = z3;
                    kagVar2.k = z4;
                    kaiVar.n();
                }
            }
        });
    }
}
