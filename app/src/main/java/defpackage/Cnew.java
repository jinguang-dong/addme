package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: new, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cnew implements uiw {
    final /* synthetic */ List a;
    final /* synthetic */ nkx b;
    final /* synthetic */ boolean c;
    final /* synthetic */ uiu d;
    final /* synthetic */ mxm e;
    final /* synthetic */ adt f;
    final /* synthetic */ aus g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;
    final /* synthetic */ float j;
    final /* synthetic */ int k;

    public Cnew(List list, nkx nkxVar, boolean z, uiu uiuVar, mxm mxmVar, adt adtVar, aus ausVar, long j, long j2, float f, int i) {
        this.a = list;
        this.b = nkxVar;
        this.c = z;
        this.d = uiuVar;
        this.e = mxmVar;
        this.f = adtVar;
        this.g = ausVar;
        this.h = j;
        this.i = j2;
        this.j = f;
        this.k = i;
    }

    @Override // defpackage.uiw
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ayc aycVar;
        byz byzVar = (byz) obj;
        int iIntValue = ((Number) obj2).intValue();
        ayc aycVar2 = (ayc) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != aycVar2.B(byzVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != aycVar2.z(iIntValue) ? 16 : 32;
        }
        if (aycVar2.H((i & 147) != 146, i & 1)) {
            nkx nkxVar = (nkx) this.a.get(iIntValue);
            aycVar2.u(794298595);
            aycVar2.u(856906528);
            if (nkxVar != nkx.UNINITIALIZED) {
                boolean z = nkxVar == this.b;
                if (nkxVar == nkx.PHOTO) {
                    aycVar2.u(794455516);
                    boolean z2 = this.c;
                    boolean z3 = z;
                    uiu uiuVar = this.d;
                    mxm mxmVar = this.e;
                    adt adtVar = this.f;
                    aus ausVar = this.g;
                    long j = this.h;
                    long j2 = this.i;
                    int i2 = this.k;
                    aycVar = aycVar2;
                    qpt.aY(nkxVar, z2, z3, uiuVar, mxmVar, adtVar, ausVar, j, j2, (Float.floatToRawIntBits(this.j + byx.c(i2, aycVar2)) << 32) | (Float.floatToRawIntBits(byx.c(i2, aycVar2)) & 4294967295L), 0L, null, aycVar, 0, 0, 3072);
                    aycVar.n();
                } else {
                    boolean z4 = z;
                    aycVar2.u(794866235);
                    boolean z5 = this.c;
                    uiu uiuVar2 = this.d;
                    mxm mxmVar2 = this.e;
                    adt adtVar2 = this.f;
                    aus ausVar2 = this.g;
                    long j3 = this.h;
                    long j4 = this.i;
                    float f = this.j;
                    int i3 = this.k;
                    aycVar = aycVar2;
                    qpt.aY(nkxVar, z5, z4, uiuVar2, mxmVar2, adtVar2, ausVar2, j3, j4, (Float.floatToRawIntBits((-f) + byx.c(i3, aycVar2)) << 32) | (Float.floatToRawIntBits(byx.c(i3, aycVar2)) & 4294967295L), 0L, null, aycVar, 0, 0, 3072);
                    aycVar.n();
                }
            } else {
                aycVar = aycVar2;
            }
            aycVar.n();
            aycVar.n();
        } else {
            aycVar2.r();
        }
        return ufg.a;
    }
}
