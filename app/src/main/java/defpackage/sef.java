package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class sef implements sec {
    public final boolean equals(Object obj) {
        if (obj instanceof sec) {
            sec secVar = (sec) obj;
            if (a() == secVar.a() && a.K(b(), secVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object objB = b();
        return a() ^ (objB == null ? 0 : objB.hashCode());
    }

    @Override // defpackage.sec
    public final String toString() {
        String strValueOf = String.valueOf(b());
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
