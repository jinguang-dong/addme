package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeu extends bij implements buu, bwm {
    public long a;
    public blp b;
    public blh c;
    private long d = 9205357640488583168L;
    private cib e;
    private blh f;
    private blp g;

    public aeu(long j, blp blpVar) {
        this.a = j;
        this.b = blpVar;
    }

    @Override // defpackage.buu
    public final void cS(bvo bvoVar) {
        blh blhVar;
        bvo bvoVar2;
        bkn bknVar;
        if (this.b != bll.a) {
            if (a.q(bvoVar.m(), this.d) && bvoVar.n() == this.e && a.ao(this.g, this.b)) {
                blhVar = this.f;
                blhVar.getClass();
            } else {
                amo.k(this, new aet(this, bvoVar, 0));
                blhVar = this.c;
                this.c = null;
            }
            this.f = blhVar;
            this.d = bvoVar.m();
            this.e = bvoVar.n();
            this.g = this.b;
            blhVar.getClass();
            if (a.q(this.a, bkv.f)) {
                bvoVar2 = bvoVar;
            } else {
                long j = this.a;
                boolean z = blhVar instanceof blf;
                bmx bmxVar = bmx.a;
                if (z) {
                    bkg bkgVar = ((blf) blhVar).a;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(bkgVar.b);
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(bkgVar.c);
                    long jFloatToRawIntBits3 = (Float.floatToRawIntBits(bkgVar.e - r11) & 4294967295L) | (Float.floatToRawIntBits(bkgVar.d - r2) << 32);
                    bvoVar2 = bvoVar;
                    bvoVar2.r(j, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), jFloatToRawIntBits3, 1.0f, bmxVar, null, 3);
                } else {
                    bvoVar2 = bvoVar;
                    if (blhVar instanceof blg) {
                        blg blgVar = (blg) blhVar;
                        bknVar = blgVar.b;
                        if (bknVar == null) {
                            bkh bkhVar = blgVar.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (bkhVar.h >> 32));
                            long jFloatToRawIntBits4 = Float.floatToRawIntBits(bkhVar.a);
                            long jFloatToRawIntBits5 = Float.floatToRawIntBits(bkhVar.b);
                            float fB = bkhVar.b();
                            float fA = bkhVar.a();
                            long j2 = jFloatToRawIntBits4 << 32;
                            bvoVar2.s(j, j2 | (jFloatToRawIntBits5 & 4294967295L), (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), bmxVar, 3);
                        }
                    } else {
                        if (!(blhVar instanceof ble)) {
                            throw new uet();
                        }
                        bknVar = ((ble) blhVar).a;
                    }
                    bvoVar2.u(bknVar, j, bmxVar);
                }
            }
        } else if (a.q(this.a, bkv.f)) {
            bvoVar2 = bvoVar;
        } else {
            bvoVar2 = bvoVar;
            bvoVar2.r(this.a, 0L, (62 & 4) != 0 ? a.ac(bvoVar2.m(), 0L) : 0L, (62 & 8) != 0 ? 1.0f : 0.0f, (62 & 16) != 0 ? bmx.a : null, (62 & 32) != 0 ? null : null, (62 & 64) != 0 ? 3 : 0);
        }
        bvoVar2.p();
    }

    @Override // defpackage.bwm
    public final void k() {
        this.d = 9205357640488583168L;
        this.e = null;
        this.f = null;
        this.g = null;
        bko.x(this);
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
