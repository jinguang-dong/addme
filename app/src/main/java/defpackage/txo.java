package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txo {
    public float a;
    public float b;
    public float c;
    public float d;

    public txo() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    public final String toString() {
        return "[x=" + this.a + ", y=" + this.b + ", z=" + this.c + ", w=" + this.d + "]";
    }

    public txo(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = 1.0f;
    }
}
