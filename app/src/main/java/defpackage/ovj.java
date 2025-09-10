package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovj implements paq {
    public final ovi a;
    public Runnable d;
    public final Object c = new Object();
    public final Runnable b = new ooc(this, 9, null);

    public ovj(ovi oviVar) {
        this.a = oviVar;
    }

    public final void a() {
        synchronized (this.c) {
            this.d = null;
            this.a.b();
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
            }
        }
        this.a.close();
    }
}
