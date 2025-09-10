package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffe {
    private float a;
    private float b;
    private float c;
    private byte d;

    public final fff a() {
        if (this.d == 7) {
            return new fff(this.a, this.b, this.c);
        }
        throw new IllegalStateException();
    }

    public final void b(float f) {
        this.a = f;
        this.d = (byte) (this.d | 1);
    }

    public final void c(float f) {
        this.b = f;
        this.d = (byte) (this.d | 2);
    }

    public final void d(float f) {
        this.c = f;
        this.d = (byte) (this.d | 4);
    }
}
