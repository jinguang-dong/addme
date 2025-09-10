package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mhh {
    OFF(0),
    AUTO(1),
    ON(2);

    public final int d;

    mhh(int i) {
        this.d = i;
    }

    public static mhh a(boolean z) {
        return !z ? OFF : AUTO;
    }

    public static boolean b(mhh mhhVar) {
        return !mhhVar.equals(OFF);
    }
}
