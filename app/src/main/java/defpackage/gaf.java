package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gaf {
    private static final sgv a = sgv.g("gaf");
    private final int b;
    private final int c;
    private boolean d;
    private long e = Long.MIN_VALUE;
    private long f = Long.MIN_VALUE;
    private int g;

    public gaf(int i, int i2) {
        a.I(i > 0);
        a.I(i2 > 0);
        this.b = i;
        this.c = i2;
    }

    public final synchronized long a(int i) {
        long j;
        rnt.B(i <= this.g, String.format("The polled length %s is greater than total length %s. [%x]", Integer.valueOf(i), Integer.valueOf(this.g), Integer.valueOf(hashCode())));
        j = this.e;
        long j2 = this.f - j;
        int i2 = this.g;
        long j3 = ((j2 * i) / i2) + j;
        if (i == i2) {
            this.e = Long.MIN_VALUE;
            this.f = Long.MIN_VALUE;
            this.g = 0;
        } else {
            this.e = j3;
            this.g = i2 - i;
        }
        return j;
    }

    public final synchronized void b(long j, int i) {
        a.I(i > 0);
        if (!this.d) {
            hashCode();
            this.d = true;
        }
        int i2 = this.g + i;
        if (i2 > this.c) {
            ((sgt) a.c().M(646)).s("The size offered is over the capacity.");
            return;
        }
        if (this.e == Long.MIN_VALUE) {
            this.e = j;
        }
        this.f = j + ((i * 8000000000L) / this.b);
        this.g = i2;
    }
}
