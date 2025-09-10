package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dbs {
    final int a;
    final int b;
    final long c;
    final long d;

    public dbs(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof dbs)) {
            dbs dbsVar = (dbs) obj;
            if (this.b == dbsVar.b && this.c == dbsVar.c && this.a == dbsVar.a && this.d == dbsVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.a), Long.valueOf(this.d));
    }
}
