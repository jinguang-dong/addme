package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class chc {
    public final int a;

    public /* synthetic */ chc(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return a.p(i, 1) ? "Left" : a.p(i, 2) ? "Right" : a.p(i, 3) ? "Center" : a.p(i, 4) ? "Justify" : a.p(i, 5) ? "Start" : a.p(i, 6) ? "End" : a.p(i, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof chc) && this.a == ((chc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
