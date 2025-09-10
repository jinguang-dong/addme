package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmf {
    public final Instant a;
    public final foy b;

    public fmf(foy foyVar, Instant instant) {
        this.b = foyVar;
        this.a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmf)) {
            return false;
        }
        fmf fmfVar = (fmf) obj;
        return a.ao(this.b, fmfVar.b) && a.ao(this.a, fmfVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SessionWithInsertionTime(session=" + this.b + ", insertionTime=" + this.a + ")";
    }
}
