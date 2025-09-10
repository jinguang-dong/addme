package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqm {
    public long a;
    public float b;

    public bqm(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqm)) {
            return false;
        }
        bqm bqmVar = (bqm) obj;
        return this.a == bqmVar.a && Float.compare(this.b, bqmVar.b) == 0;
    }

    public final int hashCode() {
        return (a.r(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}
