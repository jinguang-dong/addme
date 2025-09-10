package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gu implements cov {
    int a;
    final /* synthetic */ gv b;
    private boolean c = false;

    protected gu(gv gvVar) {
        this.b = gvVar;
    }

    @Override // defpackage.cov
    public final void a() {
        if (this.c) {
            return;
        }
        gv gvVar = this.b;
        gvVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.cov
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.cov
    public final void c() {
        this.c = true;
    }

    public final void d(ejs ejsVar, int i) {
        this.b.f = ejsVar;
        this.a = i;
    }
}
