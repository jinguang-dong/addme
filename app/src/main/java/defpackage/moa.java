package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum moa {
    HIDDEN(0.0f, 255, 255, 255),
    IDLE(0.16f, 255, 255, 255),
    ACTIVE(0.72f, 255, 255, 255),
    d(0.86f, 217, 48, 37);

    public final int e;
    public final int f;
    public final int g;
    private final float i;

    moa(float f, int i, int i2, int i3) {
        this.i = f;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final int a() {
        return (int) (this.i * 255.0f);
    }
}
