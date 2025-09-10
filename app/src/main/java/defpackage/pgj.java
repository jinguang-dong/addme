package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgj {
    private final long a;
    private final int b;

    public pgj(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static scn f(int i) {
        return i == 1 ? scn.H(0, 3) : g(i) ? scn.J(0, 1, 2, 6) : new sfm(0);
    }

    private static boolean g(int i) {
        return i == 4 || i == 3;
    }

    public final pel a(CaptureResult.Key key, scn scnVar) {
        return new pel(key, scnVar, this.a, this.b);
    }

    final pgt b(pdj pdjVar, boolean z, boolean z2, boolean z3) {
        HashSet hashSet = new HashSet();
        hashSet.add(a(CaptureResult.CONTROL_AF_MODE, new sfm(pdjVar.b())));
        if (z) {
            hashSet.add(a(CaptureResult.CONTROL_AF_STATE, f(pdjVar.b().intValue())));
        }
        hashSet.add(a(CaptureResult.CONTROL_AE_MODE, new sfm(pdjVar.a())));
        if (z2) {
            hashSet.add(a(CaptureResult.CONTROL_AE_STATE, pdjVar.a().intValue() != 0 ? scn.K(0, 1, 2, 4, 5) : new sfm(0)));
        }
        hashSet.add(a(CaptureResult.CONTROL_AWB_MODE, new sfm(pdjVar.c())));
        if (z3) {
            hashSet.add(a(CaptureResult.CONTROL_AWB_STATE, pdjVar.c().intValue() != 0 ? scn.I(0, 1, 2) : new sfm(0)));
        }
        hashSet.add(a(CaptureResult.FLASH_MODE, new sfm(pdjVar.e())));
        if (pdjVar.e().intValue() == 2) {
            hashSet.add(a(CaptureResult.FLASH_STATE, scn.H(3, 0)));
        } else if (pdjVar.e().intValue() == 0) {
            hashSet.add(a(CaptureResult.FLASH_STATE, scn.H(2, 0)));
        }
        return new pgt(scn.F(hashSet));
    }

    final pgt c(pdj pdjVar, boolean z, boolean z2, boolean z3) {
        HashSet hashSet = new HashSet();
        hashSet.add(a(CaptureResult.CONTROL_AF_MODE, new sfm(pdjVar.b())));
        if (z) {
            CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
            int iIntValue = pdjVar.b().intValue();
            hashSet.add(a(key, iIntValue == 1 ? f(1) : g(iIntValue) ? scn.I(0, 2, 6) : new sfm(0)));
        }
        hashSet.add(a(CaptureResult.CONTROL_AE_MODE, new sfm(pdjVar.a())));
        if (z2) {
            hashSet.add(a(CaptureResult.CONTROL_AE_STATE, pdjVar.a().intValue() != 0 ? scn.H(2, 4) : new sfm(0)));
        }
        hashSet.add(a(CaptureResult.CONTROL_AWB_MODE, new sfm(pdjVar.c())));
        if (z3) {
            hashSet.add(a(CaptureResult.CONTROL_AWB_STATE, pdjVar.c().intValue() == 1 ? new sfm(2) : new sfm(0)));
        }
        return new pgt(scn.F(hashSet));
    }

    final pgt d(pdj pdjVar, boolean z, boolean z2, boolean z3) {
        return new pgt(scn.F(e(pdjVar, z, z2, z3)));
    }

    public final Set e(pdj pdjVar, boolean z, boolean z2, boolean z3) {
        HashSet hashSet = new HashSet();
        hashSet.add(a(CaptureResult.CONTROL_AF_MODE, new sfm(pdjVar.b())));
        if (z) {
            hashSet.add(a(CaptureResult.CONTROL_AF_STATE, pdjVar.b().intValue() == 0 ? new sfm(0) : scn.H(4, 5)));
        }
        hashSet.add(a(CaptureResult.CONTROL_AE_MODE, new sfm(pdjVar.a())));
        if (z2) {
            hashSet.add(a(CaptureResult.CONTROL_AE_STATE, pdjVar.a().intValue() == 0 ? new sfm(0) : new sfm(3)));
        }
        hashSet.add(a(CaptureResult.CONTROL_AWB_MODE, new sfm(pdjVar.c())));
        if (z3) {
            hashSet.add(a(CaptureResult.CONTROL_AWB_STATE, pdjVar.c().intValue() == 0 ? new sfm(0) : new sfm(3)));
        }
        return hashSet;
    }
}
