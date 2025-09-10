package defpackage;

import androidx.compose.foundation.layout.OffsetElement;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ned implements neg {
    @Override // defpackage.neg
    public final void a(final float f, final int i, final long j, final int i2, long j2, final long j3, ayc aycVar, final int i3) {
        int i4;
        long j4;
        ayc aycVar2;
        int i5 = i3 & 6;
        ayc aycVarC = aycVar.c(1298225472);
        if (i5 == 0) {
            i4 = (true != aycVarC.y(f) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != aycVarC.z(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != aycVarC.A(j) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != aycVarC.z(i2) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            j4 = j2;
            i4 |= true != aycVarC.A(j4) ? 8192 : 16384;
        } else {
            j4 = j2;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != aycVarC.A(j3) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((74899 & i4) == 74898 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            aycVar2 = aycVarC;
            avx.a(byx.d(i, aycVarC, (i4 >> 3) & 14), clc.ae(i2, aycVarC), amd.d(bdq.z(new OffsetElement(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L))), f), j), j3, aycVar2, (i4 >> 6) & 7168, 0);
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            final long j5 = j4;
            baiVarI.d = new uiu() { // from class: nec
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ned nedVar = this.a;
                    float f2 = f;
                    int i6 = i;
                    long j6 = j;
                    int i7 = i2;
                    long j7 = j5;
                    nedVar.a(f2, i6, j6, i7, j7, j3, (ayc) obj, bay.j(i3 | 1));
                    return ufg.a;
                }
            };
        }
    }

    @Override // defpackage.neg
    public final void b(uiu uiuVar, ayc aycVar, int i) {
        int i2;
        uiu uiuVar2;
        uiuVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(201733292);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(uiuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
            uiuVar2 = uiuVar;
        } else {
            uiuVar2 = uiuVar;
            gsn.l(false, false, uiuVar2, aycVarC, ((i2 << 6) & 896) | 6, 2);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(this, uiuVar2, i, 12);
        }
    }

    @Override // defpackage.neg
    public final long c(ayc aycVar) {
        aycVar.u(-1431398635);
        long jE = byx.e(R.color.camera_protection_background_opaque, aycVar);
        aycVar.n();
        return jE;
    }

    @Override // defpackage.neg
    public final /* synthetic */ int d(ayc aycVar) {
        aycVar.u(1809548360);
        ((ayg) aycVar).Y();
        return R.dimen.background_corner_size;
    }

    @Override // defpackage.neg
    public final /* synthetic */ int e(ayc aycVar) {
        aycVar.u(-1390519310);
        ((ayg) aycVar).Y();
        return R.dimen.button_to_background_padding;
    }

    @Override // defpackage.neg
    public final /* synthetic */ int f(ayc aycVar) {
        aycVar.u(491554480);
        ((ayg) aycVar).Y();
        return R.dimen.icon_button_spacing;
    }

    @Override // defpackage.neg
    public final long g(ayc aycVar) {
        aycVar.u(-547233184);
        long j = bay.O(aycVar).q;
        aycVar.n();
        return j;
    }

    @Override // defpackage.neg
    public final /* synthetic */ void h(ayc aycVar) {
        qpt.be(aycVar);
    }

    @Override // defpackage.neg
    public final long i(ayc aycVar) {
        aycVar.u(-890991728);
        long j = bay.O(aycVar).a;
        aycVar.n();
        return j;
    }

    @Override // defpackage.neg
    public final long j(ayc aycVar) {
        aycVar.u(-1785263831);
        long j = bay.O(aycVar).b;
        aycVar.n();
        return j;
    }

    @Override // defpackage.neg
    public final /* synthetic */ aby k(ayc aycVar) {
        aycVar.u(1706884823);
        adt adtVarBg = byi.bg(200, 0, new aci(0.05f, 0.7f, 0.1f, 1.0f), 2);
        ((ayg) aycVar).Y();
        return adtVarBg;
    }

    @Override // defpackage.neg
    public final /* synthetic */ boolean l(ayc aycVar) {
        aycVar.u(1237966932);
        ((ayg) aycVar).Y();
        return false;
    }
}
