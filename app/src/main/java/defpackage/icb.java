package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class icb implements Runnable {
    final /* synthetic */ icc a;
    private final boolean b;

    public icb(icc iccVar, boolean z) {
        this.a = iccVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        icc iccVar = this.a;
        synchronized (iccVar) {
            iccVar.a = this.b;
        }
    }
}
