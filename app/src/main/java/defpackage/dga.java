package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dga extends dgq {
    boolean a = false;
    final ViewGroup b;

    public dga(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void a(dgp dgpVar) {
        this.b.suppressLayout(false);
        this.a = true;
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void b(dgp dgpVar) {
        if (!this.a) {
            this.b.suppressLayout(false);
        }
        dgpVar.F(this);
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void c() {
        this.b.suppressLayout(false);
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void d() {
        this.b.suppressLayout(true);
    }
}
