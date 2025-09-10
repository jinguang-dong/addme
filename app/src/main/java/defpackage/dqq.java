package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class dqq {
    public final int a;

    public /* synthetic */ dqq(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dqq) && this.a == ((dqq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a.p(i, 0) ? "New" : a.p(i, 1) ? "Idle" : a.p(i, 2) ? "Scrolling" : "Unknown";
    }
}
