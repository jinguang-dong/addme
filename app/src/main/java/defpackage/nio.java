package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nio implements uiu {
    final /* synthetic */ float a;
    final /* synthetic */ nhx b;

    public nio(float f, nhx nhxVar) {
        this.a = f;
        this.b = nhxVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
            aycVar.r();
        } else {
            bik bikVarZ = bdq.z(bik.c, this.a);
            ayp aypVar = bze.c;
            Object objE = aycVar.e(aypVar);
            nhx nhxVar = this.b;
            Size size = nhxVar.c;
            avx.a(byx.d(nhxVar.a, aycVar, 0), nhxVar.b, amd.b(amd.e(bikVarZ, ((chq) objE).di(size.getWidth())), ((chq) aycVar.e(aypVar)).di(size.getHeight())), bko.i(nhxVar.d), aycVar, 0, 0);
        }
        return ufg.a;
    }
}
