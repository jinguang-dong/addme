package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpp {
    public rwc a;
    public rwc b;
    private long c;
    private float d;
    private float e;
    private byte f;

    public hpp() {
        throw null;
    }

    public final hpq a() {
        if (this.f == 7) {
            return new hpq(this.c, this.a, this.d, this.b, this.e);
        }
        throw new IllegalStateException();
    }

    public final void b(float f) {
        this.e = f;
        this.f = (byte) (this.f | 4);
    }

    public final void c(float f) {
        this.d = f;
        this.f = (byte) (this.f | 2);
    }

    public final void d(long j) {
        this.c = j;
        this.f = (byte) (this.f | 1);
    }

    public hpp(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.a = rvkVar;
        this.b = rvkVar;
    }
}
