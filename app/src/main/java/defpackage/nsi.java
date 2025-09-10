package defpackage;

import androidx.wear.ambient.WearableControllerProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsi implements uiv {
    final /* synthetic */ nrx a;
    final /* synthetic */ nsk b;
    final /* synthetic */ Integer c;

    public nsi(nrx nrxVar, nsk nskVar, Integer num) {
        this.a = nrxVar;
        this.b = nskVar;
        this.c = num;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((akx) obj).getClass();
        if ((iIntValue & 17) == 16 && aycVar.G()) {
            aycVar.r();
        } else {
            dlq dlqVar = dmg.a;
            Object[] objArr = new Object[0];
            bgb bgbVar = dme.l;
            boolean z = aycVar.z(0) | aycVar.z(0);
            Object objF = aycVar.f();
            if (z || objF == ayb.a) {
                objF = new agx(16);
                aycVar.w(objF);
            }
            dme dmeVar = (dme) bdq.p(objArr, bgbVar, (uif) objF, aycVar, 0, 4);
            WearableControllerProvider.i(dmeVar, null, null, null, null, bdq.k(-1241378812, new nsh(this.a, this.b, dmeVar, this.c), aycVar), aycVar, 1572864);
        }
        return ufg.a;
    }
}
