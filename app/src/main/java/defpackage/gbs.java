package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbs {
    public rwc a;
    public oxh b;
    private gcc c;
    private int d;
    private byte e;

    public gbs() {
        throw null;
    }

    public final gbt a() {
        gcc gccVar;
        oxh oxhVar;
        if (this.e != 1 || (gccVar = this.c) == null || (oxhVar = this.b) == null) {
            throw new IllegalStateException();
        }
        return new gbr(gccVar, this.a, this.d, oxhVar);
    }

    public final void b(gcc gccVar) {
        gccVar.getClass();
        this.c = gccVar;
    }

    public final void c(int i) {
        this.d = i;
        this.e = (byte) 1;
    }

    public gbs(byte[] bArr) {
        this.a = rvk.a;
    }
}
