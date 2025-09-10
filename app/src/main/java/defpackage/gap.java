package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gap {
    private boolean a;
    private boolean b;
    private pas c;
    private byte d;

    public final gax a() {
        int i = ~this.d;
        if ((i & 1) != 0) {
            throw new IllegalStateException();
        }
        boolean z = this.a;
        boolean z2 = this.b;
        pas pasVar = this.c;
        boolean z3 = z2 & ((i & 2) == 0);
        if ((i & 8) != 0) {
            pasVar = null;
        }
        return new gax(z, z3, pasVar);
    }

    public final void b(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void c(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }

    public final void d(pas pasVar) {
        this.c = pasVar;
        this.d = (byte) (this.d | 8);
    }

    public final void e() {
        this.d = (byte) (this.d | 4);
    }
}
