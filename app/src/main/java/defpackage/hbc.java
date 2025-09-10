package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum hbc {
    ENG,
    FISHFOOD,
    DOGFOOD,
    RELEASE;

    public final boolean a(hbc hbcVar) {
        return ordinal() > hbcVar.ordinal();
    }

    public final boolean b(hbc hbcVar) {
        return ordinal() <= hbcVar.ordinal();
    }
}
