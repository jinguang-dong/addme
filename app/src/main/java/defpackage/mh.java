package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mh extends cow {
    final /* synthetic */ int a;
    final /* synthetic */ mi b;
    private boolean c = false;

    public mh(mi miVar, int i) {
        this.b = miVar;
        this.a = i;
    }

    @Override // defpackage.cow, defpackage.cov
    public final void a() {
        if (this.c) {
            return;
        }
        mi miVar = this.b;
        miVar.a.setVisibility(this.a);
    }

    @Override // defpackage.cow, defpackage.cov
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.cow, defpackage.cov
    public final void c() {
        this.c = true;
    }
}
