package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class swh implements Runnable {
    final swn a;
    final syu b;

    public swh(swn swnVar, syu syuVar) {
        this.a = swnVar;
        this.b = syuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.valueField != this) {
            return;
        }
        if (swv.u(this.a, this, swn.l(this.b))) {
            swn.n(this.a, false);
        }
    }
}
