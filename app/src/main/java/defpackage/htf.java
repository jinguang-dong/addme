package defpackage;

import android.graphics.PointF;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htf implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public htf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        nbb nbbVar;
        int i = this.b;
        byte b = 0;
        int i2 = 1;
        if (i == 0) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            obj2.getClass();
            Object obj3 = list.get(1);
            obj3.getClass();
            ((hti) this.a).r.a(new huw((mxm) obj2, ((Boolean) obj3).booleanValue()));
            return;
        }
        if (i == 1) {
            mmf mmfVar = (mmf) obj;
            mmi mmiVar = mmfVar.a;
            mmi mmiVar2 = mmi.OFF;
            if (mmiVar != mmiVar2) {
                return;
            }
            Object obj4 = this.a;
            rnt.M(mmiVar == mmiVar2, "Tracking session not end yet.");
            PointF pointFH = fyq.h(mmfVar);
            long j = mmfVar.f;
            fyq fyqVar = (fyq) obj4;
            fyqVar.m.c(false, pointFH, j, mmfVar.e, mmfVar.b.ordinal());
            szh szhVar = fyqVar.h;
            szhVar.getClass();
            szhVar.e(new eoz());
            boolean zD = fyqVar.a.d(fyqVar.f);
            if (j > 2000) {
                fyqVar.j.run();
                return;
            } else if (zD) {
                fyqVar.c(2000 - j, true);
                return;
            } else {
                fyqVar.d();
                return;
            }
        }
        int i3 = 3;
        if (i != 2) {
            if (i != 3) {
                ((jlp) this.a).a();
                return;
            } else {
                ((jlp) this.a).a();
                return;
            }
        }
        List list2 = (List) obj;
        if (((muj) list2.get(1)).b == 5 && (nbbVar = ((ipk) this.a).w) != null) {
            nbbVar.dismiss();
        }
        sbv sbvVar = (sbv) DesugarArrays.stream(iqh.values()).collect(ryv.a(new idv(8), new fmu(this, list2, i3)));
        list2.get(0);
        list2.get(2);
        ipk ipkVar = (ipk) this.a;
        owf owfVar = ipkVar.s;
        owfVar.dL();
        owf owfVar2 = ipkVar.f;
        owfVar2.dL();
        ipkVar.E.dL();
        ipkVar.F.dL();
        ArrayList arrayList = ipkVar.t;
        if (Collection.EL.stream(arrayList).allMatch(new fme(sbvVar, 16))) {
            return;
        }
        owq owqVar = ipkVar.q;
        iqh iqhVar = (iqh) owqVar.dL();
        iqh iqhVar2 = iqh.SATURN;
        if ((iqhVar.equals(iqhVar2) || ((iqh) owqVar.dL()).equals(iqh.URANUS)) && ((Boolean) ipkVar.m.dL()).booleanValue() && Objects.equals(sbvVar.get(owqVar.dL()), Boolean.FALSE)) {
            if (ipkVar.d.dL() != nkw.PHOTO) {
                i3 = 4;
            } else if (((muj) ipkVar.e.dL()).b != 4) {
                i3 = 5;
            } else if (!((Boolean) owfVar.dL()).booleanValue()) {
                i3 = ((Boolean) owfVar2.dL()).booleanValue() ? 6 : 1;
            }
            if (ipkVar.h(iqhVar2)) {
                ipkVar.B.ifPresent(new iph(i3, b == true ? 1 : 0));
            } else if (ipkVar.h(iqh.URANUS)) {
                ipkVar.k.ifPresent(new iph(i3, i2));
            }
            ipkVar.f();
        }
        List.EL.replaceAll(arrayList, new nfz(sbvVar, 1));
        nbc nbcVar = ipkVar.x;
        if (nbcVar != null) {
            Iterable$EL.forEach(arrayList, new hyq(nbcVar, 18));
        }
    }
}
