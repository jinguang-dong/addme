package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum sqn implements tpk {
    UNKNOWN_STATUS(0),
    NOT_HEEDED(2),
    HEEDED(1);

    public final int d;

    sqn(int i) {
        this.d = i;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
