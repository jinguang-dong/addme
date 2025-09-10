package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class liz {
    private float a;
    private int b;
    private boolean c;
    private byte d;

    public liz() {
    }

    public final lja a() {
        if (this.d == 7) {
            return new lja(this.a, this.b, this.c);
        }
        throw new IllegalStateException();
    }

    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void c(float f) {
        this.a = f;
        this.d = (byte) (this.d | 1);
    }

    public final void d(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public liz(lja ljaVar) {
        this.a = ljaVar.a;
        this.b = ljaVar.b;
        this.c = ljaVar.c;
        this.d = (byte) 7;
    }
}
