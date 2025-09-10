package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmy {
    private final long[] b;
    public final Object a = new Object();
    private int c = 0;
    private int d = 0;

    public hmy(int i) {
        this.b = new long[i];
    }

    private final int i(long j) {
        synchronized (this.a) {
            int iD = d() - 1;
            int i = 0;
            while (i <= iD) {
                int i2 = (i + iD) >>> 1;
                long j2 = this.b[e(i2)];
                if (j2 < j) {
                    i = i2 + 1;
                } else {
                    if (j2 <= j) {
                        return i2;
                    }
                    iD = i2 - 1;
                }
            }
            return i;
        }
    }

    public final int a(long j) {
        boolean z;
        int i;
        Object obj = this.a;
        synchronized (obj) {
            if (!h()) {
                synchronized (obj) {
                    rnt.M(!h(), "Attempting to get latest timestamp on empty buffer!");
                    z = j > g(d() + (-1));
                }
            }
            rnt.B(z, "Attempting to insert earlier timestamp into buffer!");
            i = this.c;
            long[] jArr = this.b;
            this.c = (i + 1) % jArr.length;
            jArr[i] = j;
            this.d++;
        }
        return i;
    }

    public final int b(long j) {
        synchronized (this.a) {
            if (!h()) {
                int i = i(j);
                if (i >= 0 && i < d() && g(i) == j) {
                    return i;
                }
                if (i != 0) {
                    return i - 1;
                }
            }
            return -1;
        }
    }

    public final int c(long j) {
        synchronized (this.a) {
            int i = -1;
            if (h()) {
                return -1;
            }
            int i2 = i(j);
            if (i2 >= 0 && i2 < d()) {
                i = i2;
            }
            return i;
        }
    }

    public final int d() {
        int iMin;
        synchronized (this.a) {
            iMin = Math.min(this.d, this.b.length);
        }
        return iMin;
    }

    public final int e(int i) {
        int i2;
        synchronized (this.a) {
            i2 = h() ? -1 : this.d >= this.b.length ? this.c : 0;
        }
        return (i2 + i) % d();
    }

    public final int f(long j) {
        int i;
        synchronized (this.a) {
            i = i(j);
            if (i < 0 || i >= d() || g(i) != j) {
                i = -1;
            }
        }
        if (i >= 0) {
            return e(i);
        }
        return -1;
    }

    public final long g(int i) {
        long j;
        synchronized (this.a) {
            if (i >= 0) {
                if (i < d()) {
                    j = this.b[e(i)];
                }
            }
            throw new IndexOutOfBoundsException(a.bv(i, "Attempting to access illegal index "));
        }
        return j;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.d == 0;
        }
        return z;
    }
}
