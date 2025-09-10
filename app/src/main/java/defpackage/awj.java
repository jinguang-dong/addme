package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awj {
    public final long a;
    private final ava b = null;

    public awj(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awj)) {
            return false;
        }
        long j = this.a;
        awj awjVar = (awj) obj;
        long j2 = awjVar.a;
        long j3 = bkv.a;
        if (!a.q(j, j2)) {
            return false;
        }
        ava avaVar = awjVar.b;
        return a.ao(null, null);
    }

    public final int hashCode() {
        long j = bkv.a;
        return a.r(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) bkv.g(this.a)) + ", rippleAlpha=null)";
    }
}
