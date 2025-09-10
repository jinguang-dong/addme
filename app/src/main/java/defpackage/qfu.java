package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfu implements Runnable {
    private final syu a;

    public qfu(syu syuVar) {
        this.a = syuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ske.V(this.a);
        } catch (szp e) {
            throw rxa.a(qgg.a(e.getCause()));
        }
    }
}
