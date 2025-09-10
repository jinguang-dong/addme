package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwa implements uiw {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ uiq d;
    final /* synthetic */ float e;

    public gwa(List list, boolean z, int i, uiq uiqVar, float f) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.d = uiqVar;
        this.e = f;
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
            gvd gvdVar = (gvd) this.a.get(iIntValue);
            aycVar2.u(992348920);
            int i2 = ((i & 126) >> 3) & 14;
            if (this.b) {
                aycVar2.u(992357289);
                aycVar = aycVar2;
                gsn.R(iIntValue, iIntValue == this.c, this.d, gvdVar.a, this.e, gvdVar.b, aycVar, i2);
                aycVar.n();
            } else {
                aycVar = aycVar2;
                aycVar.u(992677581);
                gsn.S(iIntValue, iIntValue == this.c, this.d, gvdVar.a, this.e, aycVar, i2);
                aycVar.n();
            }
            aycVar.n();
        } else {
            aycVar2.r();
        }
        return ufg.a;
    }
}
