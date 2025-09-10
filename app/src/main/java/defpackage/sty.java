package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum sty implements tpk {
    UNKNOWN(0),
    SLOWEST(1),
    SLOW(2),
    LITTLE_FAST(3),
    FAST(4),
    FASTEST(5),
    AUTO(6);

    public final int h;

    sty(int i2) {
        this.h = i2;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
