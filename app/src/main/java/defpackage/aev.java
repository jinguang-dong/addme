package defpackage;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aev implements uiv {
    final /* synthetic */ afn a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cbk c;
    final /* synthetic */ uif d;
    private final /* synthetic */ int e;

    public aev(afn afnVar, boolean z, cbk cbkVar, uif uifVar, int i) {
        this.e = i;
        this.a = afnVar;
        this.b = z;
        this.c = cbkVar;
        this.d = uifVar;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            ayc aycVar = (ayc) obj2;
            ((Number) obj3).intValue();
            aycVar.u(-1525724089);
            Object objF = aycVar.f();
            if (objF == ayb.a) {
                objF = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aycVar.w(objF);
            }
            ocq ocqVar = (ocq) objF;
            bik bikVarCM = afo.a(bik.c, ocqVar, this.a).cM(new ClickableElement(ocqVar, null, false, this.b, null, this.c, this.d));
            aycVar.n();
            return bikVarCM;
        }
        ayc aycVar2 = (ayc) obj2;
        ((Number) obj3).intValue();
        aycVar2.u(-1525724089);
        Object objF2 = aycVar2.f();
        if (objF2 == ayb.a) {
            objF2 = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            aycVar2.w(objF2);
        }
        ocq ocqVar2 = (ocq) objF2;
        bik bikVarCM2 = afo.a(bik.c, ocqVar2, this.a).cM(new CombinedClickableElement(ocqVar2, null, this.b, this.c, this.d));
        aycVar2.n();
        return bikVarCM2;
    }
}
