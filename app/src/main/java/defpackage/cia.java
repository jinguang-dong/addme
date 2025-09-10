package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class cia {
    public final long a;

    public /* synthetic */ cia(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static boolean b(long j, Object obj) {
        return (obj instanceof cia) && j == ((cia) obj).a;
    }

    public final boolean equals(Object obj) {
        return b(this.a, obj);
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
