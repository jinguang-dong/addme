package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ano {
    public static ano d;
    public long a;
    public long b;
    public int c;

    public ano() {
        this.c = -1;
    }

    public static final long a(long j, long j2) {
        return j2 == 0 ? j : ((j2 / 4) * 3) + (j / 4);
    }

    public final void b(long j, double d2, double d3) {
        double d4 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = Math.sin(d4) * 0.03341960161924362d;
        double dSin2 = Math.sin(r2 + r2) * 3.4906598739326E-4d;
        double dSin3 = Math.sin(r2 * 3.0f) * 5.236000106378924E-6d;
        double d5 = (-d3) / 360.0d;
        float fRound = Math.round((r1 - 9.0E-4f) - d5);
        double dSin4 = Math.sin(d4) * 0.0053d;
        double d6 = d4 + dSin + dSin2 + dSin3 + 1.796593063d + 3.141592653589793d;
        double dSin5 = Math.sin(d6 + d6) * (-0.0069d);
        double dAsin = Math.asin(Math.sin(d6) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d2;
        double dSin6 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(dAsin))) / (Math.cos(d7) * Math.cos(dAsin));
        int i = 1;
        if (dSin6 < 1.0d) {
            if (dSin6 > -1.0d) {
                double d8 = fRound + 9.0E-4f + d5 + dSin4 + dSin5;
                double dAcos = (float) (Math.acos(dSin6) / 6.283185307179586d);
                this.b = Math.round((d8 + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((d8 - dAcos) * 8.64E7d) + 946728000000L;
                this.a = jRound;
                if (jRound < j && this.b > j) {
                    i = 0;
                }
                this.c = i;
                return;
            }
            i = 0;
        }
        this.c = i;
        this.b = -1L;
        this.a = -1L;
    }

    public ano(byte[] bArr) {
    }
}
