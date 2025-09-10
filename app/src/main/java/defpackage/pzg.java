package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzg implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ pzg(int i) {
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new qcs(false, null, (Exception) obj);
            case 1:
                return new qcs(true, obj, null);
            case 2:
                boolean z = pzr.a;
                return null;
            case 3:
                boolean z2 = pzr.a;
                return true;
            case 4:
                boolean z3 = pzr.a;
                int i = qbu.a;
                return rwc.j(-1);
            case 5:
                rwc rwcVar = (rwc) obj;
                boolean z4 = pzr.a;
                if (!rwcVar.h()) {
                    return -1;
                }
                Integer num = (Integer) rwcVar.c();
                if (num.intValue() < 0) {
                    return -1;
                }
                return num;
            case 6:
                boolean z5 = pzr.a;
                ArrayList arrayList = new ArrayList();
                for (qao qaoVar : (List) obj) {
                    pvb pvbVar = qaoVar.b.c;
                    if (pvbVar == null) {
                        pvbVar = pvb.a;
                    }
                    if (!pvbVar.h) {
                        arrayList.add(qaoVar);
                    }
                }
                return arrayList;
            case 7:
                pzr.a = true;
                return null;
            case 8:
                pvj pvjVar = (pvj) obj;
                tpc tpcVar = (tpc) pvjVar.a(5, null);
                tpcVar.r(pvjVar);
                if (tpcVar.a.C()) {
                    throw new IllegalArgumentException("Default instance must be immutable.");
                }
                tpcVar.b = tpcVar.k();
                return (pvj) tpcVar.l();
            case 9:
                return true;
            case 10:
                return false;
            case 11:
                return ((pvj) obj).d;
            case 12:
                pvj pvjVar2 = (pvj) obj;
                tpc tpcVar2 = (tpc) pvjVar2.a(5, null);
                tpcVar2.r(pvjVar2);
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                pvj pvjVar3 = (pvj) tpcVar2.b;
                pvj pvjVar4 = pvj.a;
                pvjVar3.d = trb.a;
                return (pvj) tpcVar2.l();
            case 13:
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return true;
            case 15:
                return false;
            case 16:
                return false;
            case 17:
                return true;
            case 18:
                return false;
            case 19:
                return true;
            default:
                return false;
        }
    }
}
