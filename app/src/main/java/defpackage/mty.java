package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mty {
    private boolean a;
    private boolean b;
    private boolean c;
    private owf d;
    private owf e;
    private byte f;

    public final mtz a() {
        owf owfVar;
        owf owfVar2;
        if (this.f != 7 || (owfVar = this.d) == null || (owfVar2 = this.e) == null) {
            throw new IllegalStateException();
        }
        return new mtz(this.a, this.b, this.c, owfVar, owfVar2);
    }

    public final void b(owf owfVar) {
        owfVar.getClass();
        this.e = owfVar;
    }

    public final void c(owf owfVar) {
        owfVar.getClass();
        this.d = owfVar;
    }

    public final void d(boolean z) {
        this.b = z;
        this.f = (byte) (this.f | 2);
    }

    public final void e(boolean z) {
        this.a = z;
        this.f = (byte) (this.f | 1);
    }

    public final void f(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 4);
    }
}
