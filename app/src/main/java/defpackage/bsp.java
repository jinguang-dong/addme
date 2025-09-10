package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsp implements bry {
    private final bvu a;

    public bsp(bvu bvuVar) {
        this.a = bvuVar;
    }

    private final long b() {
        bvu bvuVarL = bqs.l(this.a);
        return a.ac(q(bvuVarL.o, 0L), a().q(bvuVarL.g, 0L));
    }

    public final bwi a() {
        return this.a.g;
    }

    @Override // defpackage.bry
    public final boolean dm() {
        return a().dm();
    }

    @Override // defpackage.bry
    public final long h() {
        bvu bvuVar = this.a;
        return (bvuVar.a << 32) | (bvuVar.b & 4294967295L);
    }

    @Override // defpackage.bry
    public final long i(bry bryVar, long j) {
        return q(bryVar, j);
    }

    @Override // defpackage.bry
    public final long j(long j) {
        return a().j(a.E(0L, b()));
    }

    @Override // defpackage.bry
    public final long k(long j) {
        throw null;
    }

    @Override // defpackage.bry
    public final long l(long j) {
        return a().l(a.E(j, b()));
    }

    @Override // defpackage.bry
    public final bkg n(bry bryVar, boolean z) {
        return a().n(bryVar, z);
    }

    @Override // defpackage.bry
    public final bry o() {
        bvu bvuVarY;
        if (!dm()) {
            bqs.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        bwi bwiVar = a().s.o().w;
        if (bwiVar == null || (bvuVarY = bwiVar.y()) == null) {
            return null;
        }
        return bvuVarY.o;
    }

    @Override // defpackage.bry
    public final long q(bry bryVar, long j) {
        if (!(bryVar instanceof bsp)) {
            bvu bvuVarL = bqs.l(this.a);
            long jQ = q(bvuVarL.o, j);
            long j2 = bvuVarL.h;
            int iA = chy.a(j2);
            int iB = chy.b(j2);
            long jAc = a.ac(jQ, (4294967295L & Float.floatToRawIntBits(iB)) | (Float.floatToRawIntBits(iA) << 32));
            bwi bwiVar = bvuVarL.g;
            if (!bwiVar.dm()) {
                bqs.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            bwiVar.ae();
            bwi bwiVar2 = bwiVar.w;
            if (bwiVar2 != null) {
                bwiVar = bwiVar2;
            }
            return a.E(jAc, bwiVar.q(bryVar, 0L));
        }
        bvu bvuVar = ((bsp) bryVar).a;
        bwi bwiVar3 = bvuVar.g;
        bwiVar3.ae();
        bvu bvuVarY = a().X(bwiVar3).y();
        if (bvuVarY != null) {
            long jC = chy.c(chy.d(bvuVar.B(bvuVarY), chp.I(j)), this.a.B(bvuVarY));
            return (Float.floatToRawIntBits(chy.b(jC)) & 4294967295L) | (Float.floatToRawIntBits(chy.a(jC)) << 32);
        }
        bvu bvuVarL2 = bqs.l(bvuVar);
        long jD = chy.d(chy.d(bvuVar.B(bvuVarL2), bvuVarL2.h), chp.I(j));
        bvu bvuVar2 = this.a;
        bvu bvuVarL3 = bqs.l(bvuVar2);
        long jC2 = chy.c(jD, chy.d(bvuVar2.B(bvuVarL3), bvuVarL3.h));
        long jFloatToRawIntBits = Float.floatToRawIntBits(chy.a(jC2));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(chy.b(jC2)) & 4294967295L;
        bwi bwiVar4 = bvuVarL3.g.w;
        bwiVar4.getClass();
        bwi bwiVar5 = bvuVarL2.g.w;
        bwiVar5.getClass();
        return bwiVar4.q(bwiVar5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }
}
