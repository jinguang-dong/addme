package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bor {
    public final int a;

    public /* synthetic */ bor(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bor) && this.a == ((bor) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a.p(i, 1) ? "Touch" : a.p(i, 2) ? "Keyboard" : "Error";
    }
}
