package defpackage;

import android.view.ViewParent;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzq implements bwq {
    public uiu a;
    private bmz b;
    private final bxv c;
    private uif d;
    private boolean f;
    private float[] h;
    private boolean i;
    private int m;
    private blh o;
    private boolean p;
    private boolean q;
    private boolean s;
    private final byz u;
    private long e = 9223372034707292159L;
    private final float[] g = bld.d();
    private chq j = new chr(1.0f, 1.0f);
    private cib k = cib.a;
    private final bmt l = new bmt();
    private long n = blt.a;
    private boolean r = true;
    private final uiq t = new aal(this, 18);

    public bzq(bmz bmzVar, byz byzVar, bxv bxvVar, uiu uiuVar, uif uifVar) {
        this.b = bmzVar;
        this.u = byzVar;
        this.c = bxvVar;
        this.a = uiuVar;
        this.d = uifVar;
    }

    private final void l(boolean z) {
        if (z != this.i) {
            this.i = z;
            bxv bxvVar = this.c;
            if (!z) {
                if (bxvVar.p) {
                    return;
                }
                bxvVar.n.remove(this);
                List list = bxvVar.o;
                if (list != null) {
                    list.remove(this);
                    return;
                }
                return;
            }
            if (!bxvVar.p) {
                bxvVar.n.add(this);
                return;
            }
            List arrayList = bxvVar.o;
            if (arrayList == null) {
                arrayList = new ArrayList();
                bxvVar.o = arrayList;
            }
            arrayList.add(this);
        }
    }

    private final void m() {
        bxv bxvVar = this.c;
        ViewParent parent = bxvVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(bxvVar, bxvVar);
        }
    }

    private final float[] n() {
        float[] fArrD = this.h;
        if (fArrD == null) {
            fArrD = bld.d();
            this.h = fArrD;
        }
        if (this.q) {
            this.q = false;
            float[] fArrO = o();
            if (this.r) {
                return fArrO;
            }
            if (!clc.ah(fArrO, fArrD)) {
                fArrD[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrD[0])) {
            return null;
        }
        return fArrD;
    }

    private final float[] o() {
        if (this.p) {
            bmz bmzVar = this.b;
            long jQ = bmzVar.l;
            if ((9223372034707292159L & jQ) == 9205357640488583168L) {
                jQ = bko.q(chp.G(this.e));
            }
            float[] fArr = this.g;
            int i = (int) (4294967295L & jQ);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat(i);
            bna bnaVar = bmzVar.n;
            float f = bnaVar.i;
            float f2 = bnaVar.j;
            float f3 = bnaVar.n;
            float f4 = bnaVar.g;
            float f5 = bnaVar.h;
            float fSin = (float) Math.sin(0.0d);
            float fCos = (float) Math.cos(0.0d);
            float f6 = f2 * fCos;
            float fSin2 = (float) Math.sin(0.0d);
            float fCos2 = (float) Math.cos(0.0d);
            float f7 = f * fCos2;
            float f8 = -f;
            double d = f3 * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d);
            float fCos3 = (float) Math.cos(d);
            float f9 = fSin * fSin2;
            float f10 = ((fCos3 * fCos2) + (fSin3 * f9)) * f4;
            float f11 = fSin3 * fCos * f4;
            float f12 = fSin * fCos2;
            float f13 = -fSin2;
            float f14 = ((fCos3 * f13) + (fSin3 * f12)) * f4;
            float f15 = -fSin3;
            float f16 = ((f15 * fCos2) + (f9 * fCos3)) * f5;
            float f17 = fCos * fCos3 * f5;
            float f18 = ((f15 * f13) + (fCos3 * f12)) * f5;
            fArr[0] = f10;
            fArr[1] = f11;
            fArr[2] = f14;
            fArr[3] = 0.0f;
            fArr[4] = f16;
            fArr[5] = f17;
            fArr[6] = f18;
            fArr[7] = 0.0f;
            fArr[8] = fCos * fSin2;
            fArr[9] = -fSin;
            fArr[10] = fCos * fCos2;
            fArr[11] = 0.0f;
            float f19 = -fIntBitsToFloat;
            float f20 = (f2 * fSin) + fCos;
            fArr[12] = ((f10 * f19) - (f16 * fIntBitsToFloat2)) + f7 + (f20 * fSin2) + fIntBitsToFloat;
            fArr[13] = ((f11 * f19) - (fIntBitsToFloat2 * f17)) + (f6 - fSin) + fIntBitsToFloat2;
            fArr[14] = ((f19 * f14) - (f18 * fIntBitsToFloat2)) + (f8 * fSin2) + (f20 * fCos2);
            fArr[15] = 1.0f;
            this.p = false;
            this.r = byi.Z(fArr);
        }
        return this.g;
    }

    @Override // defpackage.bwq
    public final long a(long j, boolean z) {
        float[] fArrO;
        if (z) {
            fArrO = n();
            if (fArrO == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrO = o();
        }
        return this.r ? j : bld.a(fArrO, j);
    }

    @Override // defpackage.bwq
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        l(false);
        byz byzVar = this.u;
        if (byzVar != null) {
            byzVar.k(this.b);
            bxv bxvVar = this.c;
            byz byzVar2 = bxvVar.N;
            byzVar2.b();
            ((bdp) byzVar2.b).n(new WeakReference(this, (ReferenceQueue) byzVar2.a));
            bxvVar.n.remove(this);
        }
    }

    @Override // defpackage.bwq
    public final void c(bku bkuVar, bmz bmzVar) {
        h();
        this.s = this.b.b() > 0.0f;
        bmt bmtVar = this.l;
        bms bmsVar = bmtVar.b;
        bmsVar.e(bkuVar);
        bmsVar.a = bmzVar;
        byi.G(bmtVar, this.b);
    }

    @Override // defpackage.bwq
    public final void d(bke bkeVar, boolean z) {
        float[] fArrN = z ? n() : o();
        if (this.r) {
            return;
        }
        if (fArrN == null) {
            bkeVar.b(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            bld.b(fArrN, bkeVar);
        }
    }

    @Override // defpackage.bwq
    public final void e(long j) {
        bxv bxvVar = this.c;
        if (bxvVar.f) {
            bxvVar.o(-4.0f);
        }
        bmz bmzVar = this.b;
        if (!a.q(bmzVar.j, j)) {
            bmzVar.j = j;
            bmzVar.j(j, bmzVar.k);
        }
        m();
    }

    @Override // defpackage.bwq
    public final void f(long j) {
        if (a.q(j, this.e)) {
            return;
        }
        bxv bxvVar = this.c;
        if (bxvVar.f) {
            bxvVar.o(-4.0f);
        }
        this.e = j;
        invalidate();
    }

    @Override // defpackage.bwq
    public final void g(uiu uiuVar, uif uifVar) {
        byz byzVar = this.u;
        if (byzVar == null) {
            bqs.a("currently reuse is only supported when we manage the layer lifecycle");
            throw new uer();
        }
        if (!this.b.i) {
            bqs.b("layer should have been released before reuse");
        }
        this.b = byzVar.j();
        this.f = false;
        this.a = uiuVar;
        this.d = uifVar;
        this.p = false;
        this.q = false;
        this.r = true;
        bld.c(this.g);
        float[] fArr = this.h;
        if (fArr != null) {
            bld.c(fArr);
        }
        this.n = blt.a;
        this.s = false;
        this.e = 9223372034707292159L;
        this.o = null;
        this.m = 0;
    }

    @Override // defpackage.bwq
    public final void h() {
        if (this.i) {
            if (!a.q(this.n, blt.a)) {
                bmz bmzVar = this.b;
                if (!a.q(bmzVar.k, this.e)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (this.n >> 32)) * ((int) (this.e >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.n & 4294967295L)) * ((int) (this.e & 4294967295L));
                    bmzVar.i((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                }
            }
            bmz bmzVar2 = this.b;
            chq chqVar = this.j;
            cib cibVar = this.k;
            long j = this.e;
            uiq uiqVar = this.t;
            if (!a.q(bmzVar2.k, j)) {
                bmzVar2.k = j;
                bmzVar2.j(bmzVar2.j, j);
                if (bmzVar2.e == 9205357640488583168L) {
                    bmzVar2.d = true;
                    bmzVar2.d();
                }
            }
            bmzVar2.a = chqVar;
            bmzVar2.b = cibVar;
            bmzVar2.c = uiqVar;
            bna bnaVar = bmzVar2.n;
            bmzVar2.g();
            l(false);
        }
    }

    @Override // defpackage.bwq
    public final void i(blm blmVar) {
        int i;
        uif uifVar;
        int i2 = blmVar.a | this.m;
        this.k = blmVar.r;
        this.j = blmVar.q;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.n = blmVar.l;
        }
        if ((i2 & 1) != 0) {
            bmz bmzVar = this.b;
            float f = blmVar.b;
            bna bnaVar = bmzVar.n;
            if (bnaVar.g != f) {
                bnaVar.g = f;
                bnaVar.b.setScaleX(f);
            }
        }
        if ((i2 & 2) != 0) {
            bmz bmzVar2 = this.b;
            float f2 = blmVar.c;
            bna bnaVar2 = bmzVar2.n;
            if (bnaVar2.h != f2) {
                bnaVar2.h = f2;
                bnaVar2.b.setScaleY(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.b.h(blmVar.d);
        }
        if ((i2 & 8) != 0) {
            bmz bmzVar3 = this.b;
            float f3 = blmVar.e;
            bna bnaVar3 = bmzVar3.n;
            if (bnaVar3.i != f3) {
                bnaVar3.i = f3;
                bnaVar3.b.setTranslationX(f3);
            }
        }
        if ((i2 & 16) != 0) {
            bmz bmzVar4 = this.b;
            float f4 = blmVar.f;
            bna bnaVar4 = bmzVar4.n;
            if (bnaVar4.j != f4) {
                bnaVar4.j = f4;
                bnaVar4.b.setTranslationY(f4);
            }
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            bmz bmzVar5 = this.b;
            float f5 = blmVar.g;
            bna bnaVar5 = bmzVar5.n;
            if (bnaVar5.k != f5) {
                bnaVar5.k = f5;
                bnaVar5.b.setElevation(f5);
                bmzVar5.d = true;
                bmzVar5.d();
            }
            if (blmVar.g > 0.0f && !this.s && (uifVar = this.d) != null) {
                uifVar.a();
            }
        }
        if ((i2 & 64) != 0) {
            bmz bmzVar6 = this.b;
            long j = blmVar.h;
            bna bnaVar6 = bmzVar6.n;
            long j2 = bnaVar6.l;
            long j3 = bkv.a;
            if (!a.q(j, j2)) {
                bnaVar6.l = j;
                bnaVar6.b.setAmbientShadowColor(bko.h(j));
            }
        }
        if ((i2 & 128) != 0) {
            bmz bmzVar7 = this.b;
            long j4 = blmVar.i;
            bna bnaVar7 = bmzVar7.n;
            long j5 = bnaVar7.m;
            long j6 = bkv.a;
            if (!a.q(j4, j5)) {
                bnaVar7.m = j4;
                bnaVar7.b.setSpotShadowColor(bko.h(j4));
            }
        }
        if ((i2 & 1024) != 0) {
            bmz bmzVar8 = this.b;
            float f6 = blmVar.j;
            bna bnaVar8 = bmzVar8.n;
            if (bnaVar8.n != f6) {
                bnaVar8.n = f6;
                bnaVar8.b.setRotationZ(f6);
            }
        }
        if ((i2 & 2048) != 0) {
            bmz bmzVar9 = this.b;
            float f7 = blmVar.k;
            bna bnaVar9 = bmzVar9.n;
            if (bnaVar9.o != f7) {
                bnaVar9.o = f7;
                bnaVar9.b.setCameraDistance(f7);
            }
        }
        if (i3 != 0) {
            if (a.q(this.n, blt.a)) {
                this.b.i(9205357640488583168L);
            } else {
                bmz bmzVar10 = this.b;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.n >> 32)) * ((int) (this.e >> 32));
                bmzVar10.i((Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.n & 4294967295L)) * ((int) (this.e & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            }
        }
        if ((i2 & 16384) != 0) {
            bmz bmzVar11 = this.b;
            boolean z2 = blmVar.n;
            if (bmzVar11.m != z2) {
                bmzVar11.m = z2;
                bmzVar11.d = true;
                bmzVar11.d();
            }
        }
        if ((131072 & i2) != 0) {
            bmz bmzVar12 = this.b;
            if (!a.ao(null, null)) {
                bmzVar12.n.b.setRenderEffect(null);
            }
        }
        if ((262144 & i2) != 0) {
            bmz bmzVar13 = this.b;
            if (!a.ao(null, null)) {
                bna bnaVar10 = bmzVar13.n;
                bnaVar10.a().setColorFilter(null);
                bnaVar10.d();
            }
        }
        if ((524288 & i2) != 0) {
            bmz bmzVar14 = this.b;
            int i4 = blmVar.s;
            bna bnaVar11 = bmzVar14.n;
            if (!a.p(bnaVar11.f, i4)) {
                bnaVar11.f = i4;
                bnaVar11.a().setBlendMode(bko.p(i4));
                bnaVar11.d();
            }
        }
        if ((32768 & i2) != 0) {
            bmz bmzVar15 = this.b;
            int i5 = blmVar.o;
            if (a.p(i5, 0)) {
                i = 0;
            } else if (a.p(i5, 1)) {
                i = 1;
            } else {
                i = 2;
                if (!a.p(i5, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            bna bnaVar12 = bmzVar15.n;
            if (!a.p(bnaVar12.p, i)) {
                bnaVar12.p = i;
                bnaVar12.d();
            }
        }
        if ((i2 & 7963) != 0) {
            this.p = true;
            this.q = true;
        }
        if (a.ao(this.o, blmVar.t)) {
            z = false;
        } else {
            blh blhVar = blmVar.t;
            this.o = blhVar;
            if (blhVar != null) {
                bmz bmzVar16 = this.b;
                if (blhVar instanceof blf) {
                    bkg bkgVar = ((blf) blhVar).a;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(bkgVar.b);
                    float f8 = bkgVar.c;
                    bmzVar16.k((jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(bkgVar.d - r10) << 32) | (Float.floatToRawIntBits(bkgVar.e - f8) & 4294967295L), 0.0f);
                } else if (blhVar instanceof ble) {
                    bmzVar16.l(((ble) blhVar).a);
                } else {
                    if (!(blhVar instanceof blg)) {
                        throw new uet();
                    }
                    blg blgVar = (blg) blhVar;
                    bkn bknVar = blgVar.b;
                    if (bknVar != null) {
                        bmzVar16.l(bknVar);
                    } else {
                        bkh bkhVar = blgVar.a;
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(bkhVar.a);
                        float fB = bkhVar.b();
                        float fA = bkhVar.a();
                        bmzVar16.k((Float.floatToRawIntBits(bkhVar.b) & 4294967295L) | (jFloatToRawIntBits2 << 32), (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), Float.intBitsToFloat((int) (bkhVar.h >> 32)));
                    }
                }
                z = true;
            }
        }
        this.m = blmVar.a;
        if (i2 != 0 || z) {
            m();
            bxv bxvVar = this.c;
            if (bxvVar.f) {
                bxvVar.o(0.0f);
            }
        }
    }

    @Override // defpackage.bwq
    public final void invalidate() {
        if (this.i || this.f) {
            return;
        }
        this.c.invalidate();
        l(true);
    }

    @Override // defpackage.bwq
    public final boolean j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        bmz bmzVar = this.b;
        if (!bmzVar.m) {
            return true;
        }
        blh blhVarC = bmzVar.c();
        if (blhVarC instanceof blf) {
            bkg bkgVar = ((blf) blhVarC).a;
            return bkgVar.b <= fIntBitsToFloat && fIntBitsToFloat < bkgVar.d && bkgVar.c <= fIntBitsToFloat2 && fIntBitsToFloat2 < bkgVar.e;
        }
        if (!(blhVarC instanceof blg)) {
            if (blhVarC instanceof ble) {
                return blb.w(((ble) blhVarC).a, fIntBitsToFloat, fIntBitsToFloat2);
            }
            throw new uet();
        }
        bkh bkhVar = ((blg) blhVarC).a;
        float f = bkhVar.a;
        if (fIntBitsToFloat >= f) {
            float f2 = bkhVar.c;
            if (fIntBitsToFloat < f2) {
                float f3 = bkhVar.b;
                if (fIntBitsToFloat2 >= f3) {
                    float f4 = bkhVar.d;
                    if (fIntBitsToFloat2 >= f4) {
                        return false;
                    }
                    long j2 = bkhVar.e;
                    long j3 = bkhVar.f;
                    int i = (int) (j3 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= bkhVar.b()) {
                        long j4 = bkhVar.h;
                        long j5 = bkhVar.g;
                        int i3 = (int) (j5 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= bkhVar.b()) {
                            int i5 = (int) (j4 & 4294967295L);
                            int i6 = (int) (j2 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= bkhVar.a()) {
                                long j6 = j3 & 4294967295L;
                                int i7 = (int) (j5 & 4294967295L);
                                int i8 = (int) j6;
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= bkhVar.a()) {
                                    float fIntBitsToFloat3 = f + Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i6) + f3;
                                    float fIntBitsToFloat5 = f2 - Float.intBitsToFloat(i);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i8) + f3;
                                    float fIntBitsToFloat7 = f2 - Float.intBitsToFloat(i3);
                                    float fIntBitsToFloat8 = f4 - Float.intBitsToFloat(i7);
                                    float fIntBitsToFloat9 = f4 - Float.intBitsToFloat(i5);
                                    float fIntBitsToFloat10 = f + Float.intBitsToFloat(i4);
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        return blb.v(fIntBitsToFloat, fIntBitsToFloat2, j2, fIntBitsToFloat3, fIntBitsToFloat4);
                                    }
                                    if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        return blb.v(fIntBitsToFloat, fIntBitsToFloat2, j4, fIntBitsToFloat10, fIntBitsToFloat9);
                                    }
                                    if (fIntBitsToFloat > fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        return blb.v(fIntBitsToFloat, fIntBitsToFloat2, j3, fIntBitsToFloat5, fIntBitsToFloat6);
                                    }
                                    if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) {
                                        return true;
                                    }
                                    return blb.v(fIntBitsToFloat, fIntBitsToFloat2, j5, fIntBitsToFloat7, fIntBitsToFloat8);
                                }
                            }
                        }
                    }
                    bkn bknVar = new bkn((byte[]) null);
                    blb.i(bknVar, bkhVar);
                    return blb.w(bknVar, fIntBitsToFloat, fIntBitsToFloat2);
                }
            }
        }
        return false;
    }

    @Override // defpackage.bwq
    public final float[] k() {
        return o();
    }
}
