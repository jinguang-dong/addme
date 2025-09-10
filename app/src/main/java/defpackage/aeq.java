package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeq implements afy {
    public long a = 9205357640488583168L;
    public final afe b;
    public final azr c;
    public long d;
    public long e;
    private final chq f;
    private boolean g;
    private final buo h;
    private final bql i;

    public aeq(Context context, chq chqVar, long j) {
        this.f = chqVar;
        afe afeVar = new afe(context, bko.h(j));
        this.b = afeVar;
        this.c = new azz(ufg.a, bap.b);
        this.d = 0L;
        this.e = -1L;
        aep aepVar = new aep(this);
        bpp bppVar = bqh.a;
        bql bqlVar = new bql(null, null, aepVar);
        this.i = bqlVar;
        this.h = new age(bqlVar, this, afeVar);
    }

    private final float i(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.d & 4294967295L));
        float f = 1.0f - fIntBitsToFloat;
        EdgeEffect edgeEffectA = this.b.a();
        return acv.d(edgeEffectA) == 0.0f ? (-acv.e(edgeEffectA, -fIntBitsToFloat2, f)) * Float.intBitsToFloat((int) (this.d & 4294967295L)) : Float.intBitsToFloat(i);
    }

    private final float j(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.d >> 32));
        float f = 1.0f - fIntBitsToFloat;
        EdgeEffect edgeEffectC = this.b.c();
        return acv.d(edgeEffectC) == 0.0f ? acv.e(edgeEffectC, fIntBitsToFloat2, f) * Float.intBitsToFloat((int) (this.d >> 32)) : Float.intBitsToFloat(i);
    }

    private final float k(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.d >> 32));
        EdgeEffect edgeEffectE = this.b.e();
        return acv.d(edgeEffectE) == 0.0f ? (-acv.e(edgeEffectE, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.d >> 32)) : Float.intBitsToFloat(i);
    }

    private final float l(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.d & 4294967295L));
        EdgeEffect edgeEffectG = this.b.g();
        return acv.d(edgeEffectG) == 0.0f ? acv.e(edgeEffectG, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (4294967295L & this.d)) : Float.intBitsToFloat(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[PHI: r20
      0x00ab: PHI (r20v1 float) = (r20v0 float), (r20v2 float) binds: [B:47:0x00d6, B:36:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119 A[PHI: r5
      0x0119: PHI (r5v6 float) = (r5v4 float), (r5v8 float) binds: [B:71:0x0143, B:60:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.afy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r23, int r25, defpackage.uiq r26) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeq.a(long, int, uiq):long");
    }

    public final long b() {
        long jQ = this.a;
        if ((9223372034707292159L & jQ) == 9205357640488583168L) {
            jQ = bko.q(this.d);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ >> 32)) / Float.intBitsToFloat((int) (this.d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ & 4294967295L)) / Float.intBitsToFloat((int) (this.d & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // defpackage.afy
    public final /* synthetic */ bik c() {
        return bik.c;
    }

    @Override // defpackage.afy
    public final buo d() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r13.a(r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        if (r14 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.afy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r11, defpackage.uiu r13, defpackage.uhb r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeq.e(long, uiu, uhb):java.lang.Object");
    }

    public final void f() {
        boolean z;
        afe afeVar = this.b;
        EdgeEffect edgeEffect = afeVar.b;
        boolean z2 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = afeVar.c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = afeVar.d;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = afeVar.e;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            g();
        }
    }

    public final void g() {
        this.c.b(ufg.a);
    }

    @Override // defpackage.afy
    public final boolean h() {
        afe afeVar = this.b;
        EdgeEffect edgeEffect = afeVar.b;
        if (edgeEffect != null && acv.d(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = afeVar.c;
        if (edgeEffect2 != null && acv.d(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = afeVar.d;
        if (edgeEffect3 != null && acv.d(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = afeVar.e;
        return (edgeEffect4 == null || acv.d(edgeEffect4) == 0.0f) ? false : true;
    }
}
