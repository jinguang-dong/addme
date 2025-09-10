package defpackage;

import android.graphics.Rect;
import android.os.VibrationEffect;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fhy implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ fhy(int i) {
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                break;
            case 2:
                List list2 = (List) obj;
                VibrationEffect vibrationEffect = fje.a;
                boolean zBooleanValue = ((Boolean) list2.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                if (!zBooleanValue && !zBooleanValue2) {
                    z2 = true;
                }
                break;
            case 5:
                List list3 = (List) obj;
                nkw nkwVar = (nkw) list3.get(0);
                pka pkaVar = (pka) list3.get(1);
                if (nkw.PHOTO.equals(nkwVar) && pka.FRONT.equals(pkaVar)) {
                    z = true;
                }
                break;
            case 6:
                pld pldVar = (pld) obj;
                rnt.x(pldVar);
                tpc tpcVarM = rgi.a.m();
                long j = pldVar.e;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                rgi rgiVar = (rgi) tpcVarM.b;
                rgiVar.b |= 1;
                rgiVar.e = j;
                tpc tpcVarM2 = rgj.a.m();
                float f = pldVar.f;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                rgj rgjVar = (rgj) tphVar;
                rgjVar.b = 1 | rgjVar.b;
                rgjVar.c = f;
                float f2 = pldVar.g;
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                tph tphVar2 = tpcVarM2.b;
                rgj rgjVar2 = (rgj) tphVar2;
                rgjVar2.b |= 2;
                rgjVar2.d = f2;
                float f3 = pldVar.h;
                if (!tphVar2.C()) {
                    tpcVarM2.o();
                }
                rgj rgjVar3 = (rgj) tpcVarM2.b;
                rgjVar3.b |= 4;
                rgjVar3.e = f3;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                rgi rgiVar2 = (rgi) tpcVarM.b;
                rgj rgjVar4 = (rgj) tpcVarM2.l();
                rgjVar4.getClass();
                rgiVar2.d = rgjVar4;
                rgiVar2.c = 4;
                break;
            case 9:
                Rect rect = (Rect) obj;
                break;
            case 10:
                Boolean bool = (Boolean) obj;
                break;
            case 11:
                Boolean bool2 = (Boolean) obj;
                break;
            case 15:
                List list4 = (List) obj;
                break;
            case 16:
                Float f4 = (Float) obj;
                gzi gziVar = gzp.a;
                break;
            case 17:
                Integer num = (Integer) obj;
                break;
        }
        return ((ggg) obj).a;
    }
}
