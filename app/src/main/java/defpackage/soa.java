package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum soa implements tpk {
    UNKNOWN_CAMERA_DIRECTION(0),
    FRONT(1),
    BACK(2);

    public final int d;

    soa(int i) {
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
