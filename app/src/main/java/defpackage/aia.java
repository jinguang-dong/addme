package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aia {
    public final long a;
    public final long b;
    public final boolean c = false;

    public aia(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final aia a(aia aiaVar) {
        return new aia(a.E(this.a, aiaVar.a), Math.max(this.b, aiaVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aia)) {
            return false;
        }
        aia aiaVar = (aia) obj;
        if (!a.q(this.a, aiaVar.a) || this.b != aiaVar.b) {
            return false;
        }
        boolean z = aiaVar.c;
        return true;
    }

    public final int hashCode() {
        return (((a.r(this.a) * 31) + a.r(this.b)) * 31) + a.o(false);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) bkf.c(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
