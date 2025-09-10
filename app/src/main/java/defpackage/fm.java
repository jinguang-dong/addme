package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fm extends cow {
    final /* synthetic */ fn a;
    private boolean b = false;
    private int c = 0;

    public fm(fn fnVar) {
        this.a = fnVar;
    }

    @Override // defpackage.cow, defpackage.cov
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        fn fnVar = this.a;
        if (i == fnVar.a.size()) {
            cov covVar = fnVar.b;
            if (covVar != null) {
                covVar.a();
            }
            this.c = 0;
            this.b = false;
            fnVar.c = false;
        }
    }

    @Override // defpackage.cow, defpackage.cov
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        cov covVar = this.a.b;
        if (covVar != null) {
            covVar.b();
        }
    }
}
