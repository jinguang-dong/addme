package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvr extends buf {
    public bvr(bug bugVar) {
        super(bugVar);
    }

    @Override // defpackage.buf
    public final int a(bwi bwiVar, bqv bqvVar) {
        bvu bvuVarY = bwiVar.y();
        bvuVarY.getClass();
        return bvuVarY.dl(bqvVar);
    }

    @Override // defpackage.buf
    protected final long b(bwi bwiVar, long j) {
        bvu bvuVarY = bwiVar.y();
        bvuVarY.getClass();
        long j2 = bvuVarY.h;
        int iA = chy.a(j2);
        int iB = chy.b(j2);
        return a.E((Float.floatToRawIntBits(iB) & 4294967295L) | (Float.floatToRawIntBits(iA) << 32), j);
    }

    @Override // defpackage.buf
    public final Map c(bwi bwiVar) {
        bvu bvuVarY = bwiVar.y();
        bvuVarY.getClass();
        return bvuVarY.G().e();
    }
}
