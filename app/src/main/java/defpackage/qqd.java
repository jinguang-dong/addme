package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqd {
    public final uxx a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final uxn f;
    public final String g;
    public final uyd h;
    public final Integer i;

    public qqd(uxx uxxVar, Long l, Long l2, Long l3, Long l4, uxn uxnVar, String str, uyd uydVar, Integer num) {
        this.a = uxxVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = uxnVar;
        this.g = str;
        this.h = uydVar;
        this.i = num;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
