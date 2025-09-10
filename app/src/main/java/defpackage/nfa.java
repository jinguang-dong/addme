package defpackage;

import android.content.res.Resources;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfa implements uiv {
    final /* synthetic */ nfc a;
    final /* synthetic */ aby b;
    final /* synthetic */ ukz c;
    final /* synthetic */ bbo d;
    final /* synthetic */ bbo e;
    final /* synthetic */ bbo f;

    public nfa(nfc nfcVar, aby abyVar, ukz ukzVar, bbo bboVar, bbo bboVar2, bbo bboVar3) {
        this.a = nfcVar;
        this.b = abyVar;
        this.c = ukzVar;
        this.d = bboVar;
        this.e = bboVar2;
        this.f = bboVar3;
    }

    public static final nkx b(bbo bboVar) {
        Object objA = bboVar.a();
        objA.getClass();
        return (nkx) objA;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
        ayc aycVar = (ayc) obj2;
        ((Number) obj3).intValue();
        ((ocq) obj).getClass();
        nfb nfbVar = (nfb) this.a;
        bbo bboVarAb = byi.ab(nfbVar.b, nkx.PHOTO, aycVar);
        nkx nkxVarB = b(bboVarAb);
        aycVar.u(-1633490746);
        boolean zB = aycVar.B(bboVarAb);
        ukz ukzVar = this.c;
        boolean zB2 = zB | aycVar.B(ukzVar);
        Object objF = aycVar.f();
        if (zB2 || objF == ayb.a) {
            objF = new adp(ukzVar, bboVarAb, 14, null);
            aycVar.w(objF);
        }
        aby abyVar = this.b;
        uiq uiqVar = (uiq) objF;
        aycVar.n();
        int i = 0;
        Object[] objArr = new Object[0];
        bgb bgbVar = new bgb(new ane(4), new adp(abyVar, uiqVar, 8));
        boolean zD = aycVar.D(nkxVarB) | aycVar.D(abyVar) | aycVar.B(uiqVar);
        Object objF2 = aycVar.f();
        if (zD || objF2 == ayb.a) {
            objF2 = new auc(nkxVarB, abyVar, uiqVar, i);
            aycVar.w(objF2);
        }
        aus ausVar = (aus) bdq.p(objArr, bgbVar, (uif) objF2, aycVar, 0, 4);
        nkx nkxVarB2 = b(bboVarAb);
        aycVar.u(-1633490746);
        boolean zB3 = aycVar.B(ausVar) | aycVar.B(bboVarAb);
        Object objF3 = aycVar.f();
        if (zB3 || objF3 == ayb.a) {
            objF3 = new ve(ausVar, bboVarAb, (uhb) null, 8);
            aycVar.w(objF3);
        }
        aycVar.n();
        azb.f(nkxVarB2, (uiu) objF3, aycVar);
        List list = (List) this.e.a();
        nkx nkxVarB3 = b(bboVarAb);
        bbo bboVar = this.d;
        adt adtVar = bboVar != null ? (adt) bboVar.a() : null;
        boolean zBooleanValue = ((Boolean) nfbVar.c.a()).booleanValue();
        Object objA = this.f.a();
        objA.getClass();
        boolean zBooleanValue2 = ((Boolean) nfbVar.d.a()).booleanValue();
        long jC = qpt.bd(aycVar).c(aycVar);
        long jI = qpt.bd(aycVar).i(aycVar);
        long j = qpt.bd(aycVar).j(aycVar);
        boolean z = nfbVar.i;
        qpt.bd(aycVar).h(aycVar);
        qpt.bc(list, nkxVarB3, adtVar, zBooleanValue, (mxm) objA, (uiu) ukzVar, ausVar, zBooleanValue2, jC, jI, j, z, aycVar, 0, 0);
        return ufg.a;
    }
}
