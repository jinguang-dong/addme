package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpj extends lpo {
    private final String b;
    private final int c;
    private final long d;

    public lpj(String str, int i, long j) {
        this.b = str;
        this.c = i;
        this.d = j;
    }

    @Override // defpackage.lpo
    public final int a() {
        return this.c;
    }

    @Override // defpackage.lpo
    public final long b() {
        return this.d;
    }

    @Override // defpackage.lpo
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lpo) {
            lpo lpoVar = (lpo) obj;
            if (this.b.equals(lpoVar.c())) {
                lpoVar.d();
                if (this.c == lpoVar.a() && this.d == lpoVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        a.aF(1);
        long j = this.d;
        return ((this.c ^ (((iHashCode * 1000003) ^ 1) * 1000003)) * 1000003) ^ ((int) j);
    }

    public final String toString() {
        return "{" + this.b + ", UNKNOWN, " + this.c + ", " + this.d + "}";
    }

    @Override // defpackage.lpo
    public final void d() {
    }
}
