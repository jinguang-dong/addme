package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ago extends bij implements bun, bvd {
    public aii a;
    public final aji b;
    public boolean c;
    public bry d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final ocq i = new ocq((short[]) null, (byte[]) null);
    public long g = 0;

    public ago(aii aiiVar, aji ajiVar, boolean z) {
        this.a = aiiVar;
        this.b = ajiVar;
        this.c = z;
    }

    private final agi p() {
        return (agi) bko.H(this, agk.b);
    }

    public final float c(agi agiVar) {
        float f;
        Object obj;
        int iCompare;
        if (a.q(this.g, 0L)) {
            return 0.0f;
        }
        bdp bdpVar = (bdp) this.i.a;
        int i = bdpVar.b - 1;
        Object[] objArr = bdpVar.a;
        if (i < objArr.length) {
            obj = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                Object objA = ((agl) objArr[i]).a.a();
                if (objA != null) {
                    long jB = ((bkg) objA).b();
                    long jG = chp.G(this.g);
                    f = 0.0f;
                    int iOrdinal = this.a.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jG & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new uet();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jG >> 32)));
                    }
                    if (iCompare <= 0) {
                        obj = objA;
                    } else if (obj == null) {
                        obj = objA;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            obj = null;
        }
        if (obj == null) {
            Object objE = this.e ? e() : null;
            if (objE == null) {
                return f;
            }
            obj = objE;
        }
        long jG2 = chp.G(this.g);
        int iOrdinal2 = this.a.ordinal();
        if (iOrdinal2 == 0) {
            bkg bkgVar = (bkg) obj;
            float f2 = bkgVar.c;
            return agiVar.a(f2, bkgVar.e - f2, Float.intBitsToFloat((int) (jG2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new uet();
        }
        bkg bkgVar2 = (bkg) obj;
        float f3 = bkgVar2.b;
        return agiVar.a(f3, bkgVar2.d - f3, Float.intBitsToFloat((int) (jG2 >> 32)));
    }

    public final long d(bkg bkgVar, long j) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jG = chp.G(j);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            agi agiVarP = p();
            float f = bkgVar.c;
            float fA = agiVarP.a(f, bkgVar.e - f, Float.intBitsToFloat((int) (jG & 4294967295L)));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new uet();
            }
            agi agiVarP2 = p();
            float f2 = bkgVar.b;
            jFloatToRawIntBits = Float.floatToRawIntBits(agiVarP2.a(f2, bkgVar.d - f2, Float.intBitsToFloat((int) (jG >> 32)))) << 32;
            jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f) & 4294967295L;
        }
        return jFloatToRawIntBits | jFloatToRawIntBits2;
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    public final bkg e() {
        if (this.w) {
            bry bryVarZ = bko.z(this);
            bry bryVar = this.d;
            if (bryVar != null) {
                if (true != bryVar.dm()) {
                    bryVar = null;
                }
                if (bryVar != null) {
                    return bryVarZ.n(bryVar, false);
                }
            }
        }
        return null;
    }

    public final void f() {
        agi agiVarP = p();
        if (this.h) {
            akg.c("launchAnimation called when previous animation was running");
        }
        ukc.C(C(), null, 4, new agn(this, new ajs(agh.a), agiVarP, null), 1);
    }

    @Override // defpackage.bvd
    public final void k(long j) {
        long j2;
        long j3;
        bkg bkgVarE;
        long j4 = this.g;
        this.g = j;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            j2 = j & 4294967295L;
            j3 = 4294967295L & j4;
        } else {
            if (iOrdinal != 1) {
                throw new uet();
            }
            j2 = j >> 32;
            j3 = j4 >> 32;
        }
        if (ujp.a((int) j2, (int) j3) >= 0 || this.h || this.e || (bkgVarE = e()) == null || !l(bkgVarE, j4)) {
            return;
        }
        this.f = true;
    }

    public final boolean l(bkg bkgVar, long j) {
        long jD = d(bkgVar, j);
        return Math.abs(Float.intBitsToFloat((int) (jD >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jD & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.bvd
    public final /* synthetic */ void dd(bry bryVar) {
    }
}
