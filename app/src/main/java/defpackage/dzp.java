package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzp extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzp(dvv dvvVar, dzq dzqVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = dvvVar;
        this.c = dzqVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((dzp) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((dzp) c((uqx) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.e != 0) {
            uhi uhiVar = uhi.a;
            int i = this.a;
            rnt.aN(obj);
            if (i == 0) {
                und undVar = (und) this.d;
                ArrayList arrayList = new ArrayList();
                Object obj2 = this.b;
                asd asdVar = new asd(arrayList, undVar, (ass) this.c);
                this.a = 1;
                if (usx.f((usx) ((ocq) obj2).a, asdVar, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        uhi uhiVar2 = uhi.a;
        if (this.a != 0) {
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            uqx uqxVar = (uqx) this.d;
            NetworkRequest networkRequestA = ((dvv) this.b).a();
            if (networkRequestA == null) {
                uqxVar.T().u(null);
                return ufg.a;
            }
            dzq dzqVar = (dzq) this.c;
            bzm bzmVar = new bzm(ukc.C(uqxVar, null, 0, new crq(dzqVar, uqxVar, (uhb) null, 6), 3), uqxVar, 3);
            dzt dztVar = dzt.a;
            Object obj3 = dzt.b;
            ConnectivityManager connectivityManager = dzqVar.a;
            synchronized (obj3) {
                Map map = dzt.c;
                boolean zIsEmpty = map.isEmpty();
                map.put(networkRequestA, bzmVar);
                if (zIsEmpty) {
                    dwj.b();
                    int i2 = dzx.a;
                    connectivityManager.registerDefaultNetworkCallback(dztVar);
                }
            }
            bsl bslVar = new bsl(new dyn(networkRequestA, connectivityManager, dztVar, 2), 7);
            this.a = 1;
            if (ukc.N(uqxVar, bslVar, this) == uhiVar2) {
                return uhiVar2;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.e != 0) {
            dzp dzpVar = new dzp((ocq) this.b, (ass) this.c, uhbVar, 1);
            dzpVar.d = obj;
            return dzpVar;
        }
        dzp dzpVar2 = new dzp((dvv) this.b, (dzq) this.c, uhbVar, 0);
        dzpVar2.d = obj;
        return dzpVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzp(ocq ocqVar, ass assVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = ocqVar;
        this.c = assVar;
    }
}
