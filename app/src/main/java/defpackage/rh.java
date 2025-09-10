package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class rh {
    public final int a;

    public /* synthetic */ rh(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return a.bv(i, "Stream-");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rh) && this.a == ((rh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
