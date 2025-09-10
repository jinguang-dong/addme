package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqe {
    private long a;
    private sbp b;
    private byte c;

    public final gqf a() {
        sbp sbpVar;
        if (this.c != 1 || (sbpVar = this.b) == null) {
            throw new IllegalStateException();
        }
        return new gqf(this.a, sbpVar);
    }

    public final void b(List list) {
        this.b = sbp.j(list);
    }

    public final void c(long j) {
        this.a = j;
        this.c = (byte) 1;
    }
}
