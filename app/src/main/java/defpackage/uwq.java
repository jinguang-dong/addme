package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwq extends uwp {
    public final Runnable a;

    public uwq(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        String strA = ung.a(runnable);
        String strB = ung.b(runnable);
        long j = this.g;
        boolean z = this.h;
        String str = uwr.a;
        return "Task[" + strA + "@" + strB + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
