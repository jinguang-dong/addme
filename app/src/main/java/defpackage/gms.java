package defpackage;

import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gms implements pnh {
    final /* synthetic */ gmt a;

    public gms(gmt gmtVar) {
        this.a = gmtVar;
    }

    @Override // defpackage.pnh
    public final void a(int i) {
        moa moaVar;
        gmt gmtVar = this.a;
        synchronized (gmtVar.i) {
            if (gmtVar.f.equals(gho.LOCKED) && gmtVar.b.get()) {
                int i2 = gmtVar.h;
                if (i2 == -1) {
                    gmtVar.h = i;
                    return;
                }
                int iAbs = Math.abs(i - i2);
                if (iAbs > 60 && iAbs < 300) {
                    gmtVar.c();
                    AmbientModeSupport.AmbientController ambientController = gmtVar.k;
                    if (ambientController != null) {
                        gho ghoVar = gho.DEFAULT;
                        Object obj = ambientController.a;
                        ((ghr) obj).g = false;
                        ((ghr) obj).c.a(ghoVar);
                    }
                    gmtVar.d(gmtVar.e);
                    return;
                }
                mny mnyVar = gmtVar.j;
                synchronized (mnyVar.d) {
                    moaVar = mnyVar.c;
                }
                if (iAbs <= 20 || iAbs >= 340) {
                    moa moaVar2 = moa.ACTIVE;
                    if (!moaVar.equals(moaVar2)) {
                        mnyVar.a(moaVar2);
                        gmtVar.a();
                    }
                } else {
                    moa moaVar3 = moa.d;
                    if (!moaVar.equals(moaVar3)) {
                        mnyVar.a(moaVar3);
                        gmtVar.d(gmtVar.d);
                    }
                }
            }
        }
    }
}
