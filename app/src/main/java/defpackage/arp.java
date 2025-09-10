package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arp {
    public final long a;
    private final long b;

    public arp(long j, long j2) {
        this.b = j;
        this.a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arp)) {
            return false;
        }
        long j = this.b;
        arp arpVar = (arp) obj;
        long j2 = arpVar.b;
        long j3 = bkv.a;
        return a.q(j, j2) && a.q(this.a, arpVar.a);
    }

    public final int hashCode() {
        long j = bkv.a;
        return (a.r(this.b) * 31) + a.r(this.a);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) bkv.g(this.b)) + ", selectionBackgroundColor=" + ((Object) bkv.g(this.a)) + ')';
    }
}
