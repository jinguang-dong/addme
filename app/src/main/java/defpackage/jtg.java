package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtg extends swn {
    private final Runnable a;

    public jtg(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.swn
    public final boolean a(Throwable th) {
        return super.a(th);
    }

    public final void b(jth jthVar) {
        super.e(jthVar);
    }

    @Override // defpackage.swn, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.run();
        return super.cancel(z);
    }
}
