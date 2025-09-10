package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mkq implements itk {
    final /* synthetic */ Object a;
    final /* synthetic */ qwz b;
    private final /* synthetic */ int c;

    public mkq(hti htiVar, qwz qwzVar, int i) {
        this.c = i;
        this.a = htiVar;
        this.b = qwzVar;
    }

    @Override // defpackage.itk
    public final void f(boolean z) {
        oge ogeVar;
        if (this.c == 0) {
            if (z || (ogeVar = ((mkr) this.a).K) == null) {
                return;
            }
            ogeVar.b();
            return;
        }
        if (z) {
            ((hti) this.a).H.d();
        } else {
            hti htiVar = (hti) this.a;
            htiVar.z = true;
            htiVar.H.a();
        }
        ((hti) this.a).l.G(z);
    }

    @Override // defpackage.itk
    public final void g(boolean z) {
        if (this.c != 0) {
            if (z) {
                this.b.b(true);
            }
        } else if (z) {
            this.b.b(true);
        }
    }

    @Override // defpackage.itk
    public final void h(boolean z) {
        if (this.c != 0) {
            if (z) {
                this.b.b(false);
            }
        } else if (z) {
            this.b.b(false);
        }
    }

    public mkq(mkr mkrVar, qwz qwzVar, int i) {
        this.c = i;
        this.b = qwzVar;
        this.a = mkrVar;
    }

    @Override // defpackage.itk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void c(boolean z) {
    }
}
