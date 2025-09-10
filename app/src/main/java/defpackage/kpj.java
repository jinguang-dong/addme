package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kpj implements kpr {
    final /* synthetic */ kpk a;
    private final rwd b;
    private boolean c;

    public kpj(kpk kpkVar, rwd rwdVar) {
        this.a = kpkVar;
        this.b = rwdVar;
    }

    @Override // defpackage.kpr
    public final rwd a() {
        return this.b;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        kpk kpkVar = this.a;
        synchronized (kpkVar.b) {
            if (this.c) {
                return;
            }
            boolean z = true;
            this.c = true;
            int i = kpkVar.j;
            if (i > 0) {
                kpkVar.j = i - 1;
            } else {
                ((sgt) kpk.a.c().M(3360)).s("Metering lock was invalid.");
            }
            if (kpkVar.j != 0 || !kpkVar.k) {
                z = false;
            }
            if (z) {
                kpkVar.c();
            }
        }
    }
}
