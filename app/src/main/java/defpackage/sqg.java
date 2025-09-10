package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum sqg implements tpk {
    UNKNOWN_ANIMATION_STAGE(0),
    IDLE(1),
    HINT(2),
    SURPRISE(3);

    public final int e;

    sqg(int i) {
        this.e = i;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
