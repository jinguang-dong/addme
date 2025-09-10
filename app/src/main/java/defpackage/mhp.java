package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mhp {
    COLD(6),
    NORMAL(1),
    HEAT_LIGHT(7),
    HEAT_MODERATE(8),
    HEAT_SEVERE(2),
    HEAT_CRITICAL(3),
    HEAT_EMERGENCY(4),
    HEAT_SHUTDOWN(9),
    i(5);

    public final int j;

    mhp(int i2) {
        this.j = i2;
    }

    public final boolean a(mhp mhpVar) {
        mhp mhpVar2 = i;
        return (this == mhpVar2 || mhpVar == mhpVar2 || ordinal() < mhpVar.ordinal()) ? false : true;
    }
}
