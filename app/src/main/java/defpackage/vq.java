package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vq implements AutoCloseable {
    public final vj a;
    public final wh b;
    private final int c;
    private final ocq d;

    public vq(vj vjVar, wh whVar, ocq ocqVar) {
        vjVar.getClass();
        this.a = vjVar;
        this.b = whVar;
        this.d = ocqVar;
        this.c = vr.a.b();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d.a) {
        }
        this.a.b();
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.c;
    }
}
