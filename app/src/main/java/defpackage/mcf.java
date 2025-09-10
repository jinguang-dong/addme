package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcf {
    public int a;
    public int b;
    public double c;
    public byte d;
    public int e;

    public final void a(double d) {
        this.c = d;
        this.d = (byte) (this.d | 4);
    }

    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void c(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }
}
