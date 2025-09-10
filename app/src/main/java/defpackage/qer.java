package defpackage;

import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qer {
    public final FileInputStream a;
    public final long b;
    final long c;
    public long d;
    long e;

    public qer(FileInputStream fileInputStream, long j, long j2) {
        rnt.H(j <= j2, "start at %s later than end at %s", j, j2);
        this.a = fileInputStream;
        this.b = j;
        this.c = j2;
        this.d = 0L;
        this.e = j2 - j;
    }

    public final long a() {
        return this.e - this.d;
    }

    public final qer b() {
        qer qerVar = new qer(this.a, this.b, this.c);
        qerVar.e(this.d);
        qerVar.d(this.e);
        return qerVar;
    }

    public final qer c() {
        long j = this.b;
        return new qer(this.a, this.d + j, j + this.e);
    }

    public final void d(long j) {
        long j2 = this.d;
        rnt.H(j >= j2, "New limit %s smaller than position ", j, j2);
        long j3 = this.b + j;
        long j4 = this.c;
        rnt.H(j3 <= j4, "New limit %s points farther than end position %s", j, j4);
        this.e = j;
    }

    public final void e(long j) {
        long j2 = this.e;
        rnt.H(j <= j2, "New position %s larger than limit %s", j, j2);
        this.d = j;
    }
}
