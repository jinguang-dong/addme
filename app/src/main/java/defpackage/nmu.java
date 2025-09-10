package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmu {
    private final int b;
    private int c = 0;
    public float a = 0.0f;

    public nmu(int i) {
        this.b = i;
    }

    public final void a(float f) {
        int i = this.c;
        int i2 = this.b;
        if (i != i2) {
            i2 = i + 1;
        }
        this.c = i2;
        float f2 = 1.0f / i2;
        this.a = (this.a * (1.0f - f2)) + (f * f2);
    }

    public final void b() {
        this.c = 0;
        this.a = 0.0f;
    }
}
