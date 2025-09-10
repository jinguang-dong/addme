package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxc implements AutoCloseable, cwf {
    public final cxb a;
    public boolean b;
    private final String c;

    public cxc(String str, cxb cxbVar) {
        this.c = str;
        this.a = cxbVar;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        if (cwaVar == cwa.ON_DESTROY) {
            this.b = false;
            cwhVar.getLifecycle().c(this);
        }
    }

    public final void b(det detVar, cwc cwcVar) {
        if (this.b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.b = true;
        cwcVar.a(this);
        detVar.b(this.c, this.a.a());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
