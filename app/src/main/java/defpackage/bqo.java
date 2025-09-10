package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqo {
    public long a;
    private final bqn b = new bqn(1, 1);
    private final bqn c = new bqn(1, 1);

    public final long a() {
        return b(a.t(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long b(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f || Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f) {
            String strA = cif.a(j);
            Objects.toString(strA);
            bqs.c("maximumVelocity should be a positive value. You specified=".concat(strA));
        }
        return a.t(this.b.b(Float.intBitsToFloat((int) (j >> 32))), this.c.b(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public final void c(long j, long j2) {
        this.b.c(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.c.c(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void d() {
        this.b.d();
        this.c.d();
        this.a = 0L;
    }
}
