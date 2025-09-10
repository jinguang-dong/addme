package defpackage;

import android.net.Uri;
import j$.util.Collection;
import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pyb implements rvu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pyb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r6v32, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    ((qav) this.a).k.l(1036);
                    qbu.c("%s: Failed to remove expired groups!", "ExpirationHandler");
                }
                return null;
            case 1:
                return (pts) ((tpc) this.a).l();
            case 2:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    this.a.add(uri);
                }
                return null;
            case 3:
                this.a.addAll((List) obj);
                return null;
            case 4:
                return this.a;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                pvb pvbVar = ((pvc) obj2).c;
                if (pvbVar == null) {
                    pvbVar = pvb.a;
                }
                tpc tpcVar = (tpc) pvbVar.a(5, null);
                tpcVar.r(pvbVar);
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                pvb pvbVar2 = (pvb) tpcVar.b;
                pvbVar2.b |= 64;
                pvbVar2.i = zBooleanValue;
                pvb pvbVar3 = (pvb) tpcVar.l();
                tph tphVar = (tph) obj2;
                tpc tpcVar2 = (tpc) tphVar.a(5, null);
                tpcVar2.r(tphVar);
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                pvc pvcVar = (pvc) tpcVar2.b;
                pvbVar3.getClass();
                pvcVar.c = pvbVar3;
                pvcVar.b |= 1;
                return (pvc) tpcVar2.l();
            case 6:
                return (sbv) Collection.EL.stream((List) obj).collect(ryv.a(new ndu(19), new npd(this.a, 2)));
            case 7:
                if (((Boolean) obj).booleanValue() && ((Boolean) this.a).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                if (((Boolean) obj).booleanValue() && ((Boolean) this.a).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                boolean z2 = pzr.a;
                this.a.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                return null;
            case 10:
                sbr sbrVar = new sbr();
                sgj sgjVarListIterator = ((sbv) obj).entrySet().listIterator();
                while (sgjVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) sgjVarListIterator.next();
                    pva pvaVar = (pva) entry.getKey();
                    if (entry.getValue() != null) {
                        if ((pvaVar.b & 256) != 0) {
                            Uri uriBuild = (Uri) entry.getValue();
                            tvy tvyVar = pvaVar.k;
                            if (tvyVar == null) {
                                tvyVar = tvy.a;
                            }
                            if (((pzr) this.a).m.C() && tvyVar.b.size() != 0) {
                                uriBuild = uriBuild.buildUpon().encodedFragment(rdy.a(tvyVar)).build();
                            }
                            sbrVar.f(pvaVar, uriBuild);
                        } else {
                            sbrVar.g(entry);
                        }
                    }
                }
                return sbrVar.e();
            case 11:
                return ((pzr) this.a).c((pvc) obj);
            case 12:
                return ujp.aG((List) obj, new pyb(this.a, 11));
            case 13:
                pvj pvjVar = (pvj) obj;
                tpc tpcVar3 = (tpc) pvjVar.a(5, null);
                tpcVar3.r(pvjVar);
                if (!tpcVar3.b.C()) {
                    tpcVar3.o();
                }
                pvj pvjVar2 = (pvj) tpcVar3.b;
                pvj pvjVar3 = pvj.a;
                tpw tpwVar = pvjVar2.d;
                if (!tpwVar.c()) {
                    pvjVar2.d = tph.v(tpwVar);
                }
                tnq.e(this.a, pvjVar2.d);
                return (pvj) tpcVar3.l();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return (pvm) DesugarCollections.unmodifiableMap(((pvj) obj).c).get(this.a);
            case 15:
                pvj pvjVar4 = (pvj) obj;
                tpc tpcVar4 = (tpc) pvjVar4.a(5, null);
                tpcVar4.r(pvjVar4);
                for (pvl pvlVar : this.a) {
                    String str = pvlVar.c;
                    String str2 = pvlVar.d;
                    int i = qbu.a;
                    tpcVar4.D(qsp.W(pvlVar));
                }
                return (pvj) tpcVar4.l();
            case 16:
                return this.a;
            case 17:
                return (pvc) DesugarCollections.unmodifiableMap(((pvj) obj).b).get(this.a);
            case 18:
                pvj pvjVar5 = (pvj) obj;
                tpc tpcVar5 = (tpc) pvjVar5.a(5, null);
                tpcVar5.r(pvjVar5);
                tpcVar5.D((String) this.a);
                return (pvj) tpcVar5.l();
            case 19:
                pvj pvjVar6 = (pvj) obj;
                tpc tpcVar6 = (tpc) pvjVar6.a(5, null);
                tpcVar6.r(pvjVar6);
                ?? r6 = this.a;
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(pvjVar6.b).entrySet()) {
                    String str3 = (String) entry2.getKey();
                    try {
                        r6.add(new qao(qsp.U(str3), (pvc) entry2.getValue()));
                    } catch (qct e) {
                        tpcVar6.D(str3);
                        qbu.f(e, "Failed to deserialized file group key: ".concat(String.valueOf(str3)));
                    }
                }
                return (pvj) tpcVar6.l();
            default:
                return this.a;
        }
    }
}
