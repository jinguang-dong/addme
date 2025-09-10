package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkg implements nqe {
    final /* synthetic */ nqm a;
    final /* synthetic */ rww b;
    final /* synthetic */ mmk c;
    final /* synthetic */ mzm d;

    public nkg(nqm nqmVar, mzm mzmVar, rww rwwVar, mmk mmkVar) {
        this.a = nqmVar;
        this.d = mzmVar;
        this.b = rwwVar;
        this.c = mmkVar;
    }

    public final void a(float f) {
        if (this.a.e()) {
            this.d.d(f, true, ((mxu) this.b.fr()).a.j);
        }
    }

    @Override // defpackage.nqe
    public final void b() {
        this.d.b(true, ((mxu) this.b.fr()).a.j);
    }

    @Override // defpackage.nqe
    public final void c() {
        this.c.b(true);
        this.d.a();
    }
}
