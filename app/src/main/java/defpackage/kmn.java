package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmn implements kmm {
    public final lss a;
    private final out b;
    private final Object c = new Object();
    private final ggg d = new ggg((byte[]) null, (char[]) null);

    public kmn(lss lssVar, out outVar) {
        this.a = lssVar;
        this.b = outVar;
    }

    @Override // defpackage.kmm
    public final void a(nmt nmtVar, float f) {
        synchronized (this.c) {
            this.b.execute(new jbj(this, this.d.i(nmtVar, f), 3));
        }
    }
}
