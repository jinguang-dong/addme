package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum sui implements tpk {
    NO_STABILIZATION(0),
    STEADY_FACE(1),
    STANDARD(2),
    d(3),
    LOCKED(4),
    ACTIVE(5);

    public final int g;

    sui(int i) {
        this.g = i;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
