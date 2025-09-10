package defpackage;

import android.text.TextUtils;
import java.net.HttpCookie;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kve implements rvu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kve(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r9v57, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r9v59, types: [java.lang.Object, peo] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                ltq ltqVar = (ltq) obj;
                float f = 0.0f;
                if (this.a.l() == pka.FRONT) {
                    int iOrdinal = ltqVar.ordinal();
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        f = 2.0f;
                    } else if (iOrdinal == 3) {
                        f = 1.0f;
                    }
                } else if (ltqVar.ordinal() == 2) {
                    f = 0.833f;
                }
                return Float.valueOf(f);
            case 1:
                return ((pfu) this.a).d((peo) obj);
            case 2:
                return ((kvv) this.a).b((mmf) obj);
            case 3:
                return ((pfu) this.a).e(new sfm((peo) obj));
            case 4:
                return ((lrx) this.a).a;
            case 5:
                rwc rwcVar = (rwc) obj;
                tpc tpcVarM = sod.a.m();
                soc socVar = soc.NAVIGATION_CHANGE;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                sod sodVar = (sod) tphVar;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                Object obj2 = this.a;
                sod sodVar2 = (sod) tpcVarM.b;
                ssd ssdVar = (ssd) ((tpc) obj2).l();
                ssdVar.getClass();
                sodVar2.h = ssdVar;
                sodVar2.b |= 8;
                if (rwcVar.h() && ((srg) rwcVar.c()).d.size() > 0) {
                    srg srgVar = (srg) rwcVar.c();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    sod sodVar3 = (sod) tpcVarM.b;
                    sodVar3.aE = srgVar;
                    sodVar3.e |= 1;
                }
                return tpcVarM;
            case 6:
                rwc rwcVar2 = (rwc) obj;
                boolean zH = rwcVar2.h();
                Object obj3 = this.a;
                if (zH && ((srg) rwcVar2.c()).d.size() > 0) {
                    ((kwp) obj3).b = (srg) rwcVar2.c();
                }
                sod sodVarB = ((kwp) obj3).b();
                tpc tpcVar = (tpc) sodVarB.a(5, null);
                tpcVar.r(sodVarB);
                return tpcVar;
            case 7:
                npi npiVar = new npi();
                mje mjeVar = (mje) this.a;
                pfu pfuVar = mjeVar.aa;
                rnt.x(pfuVar);
                npiVar.f(pfuVar.a.c());
                pdn pdnVar = mjeVar.K;
                rnt.x(pdnVar);
                npiVar.c(pdnVar);
                npiVar.d(mjeVar.P);
                owq owqVar = mjeVar.q;
                rnt.x(owqVar);
                npiVar.b(owqVar);
                npiVar.e(mjeVar.ad);
                return ((noy) obj).a(npiVar.a());
            case 8:
                String str = (String) obj;
                Pattern pattern = nzo.a;
                Object obj4 = this.a;
                if (str != null) {
                    ((obu) obj4).g("Authorization", "Bearer ".concat(str));
                }
                return new obu((obu) obj4);
            case 9:
                scn scnVar = (scn) obj;
                if (!scnVar.isEmpty()) {
                    sgj sgjVarListIterator = scnVar.listIterator();
                    while (sgjVarListIterator.hasNext()) {
                        ((obu) this.a).g("Cookie", ((HttpCookie) sgjVarListIterator.next()).toString());
                    }
                }
                return null;
            case 10:
                och ochVar = (och) obj;
                if (ochVar != null) {
                    tpe tpeVar = ((oca) this.a).n;
                    tzg tzgVar = ((tze) tpeVar.b).k;
                    if (tzgVar == null) {
                        tzgVar = tzg.a;
                    }
                    tpc tpcVar2 = (tpc) tzgVar.a(5, null);
                    tpcVar2.r(tzgVar);
                    tpe tpeVar2 = (tpe) tpcVar2;
                    tzg tzgVar2 = ((tze) tpeVar.b).k;
                    if (tzgVar2 == null) {
                        tzgVar2 = tzg.a;
                    }
                    tmp tmpVar = tzgVar2.e;
                    if (tmpVar == null) {
                        tmpVar = tmp.a;
                    }
                    tpc tpcVar3 = (tpc) tmpVar.a(5, null);
                    tpcVar3.r(tmpVar);
                    String strB = ochVar.b();
                    if (!tpcVar3.b.C()) {
                        tpcVar3.o();
                    }
                    tmp tmpVar2 = (tmp) tpcVar3.b;
                    strB.getClass();
                    tmpVar2.c = strB;
                    tmo tmoVarA = ochVar.a();
                    if (!tpcVar3.b.C()) {
                        tpcVar3.o();
                    }
                    tmp tmpVar3 = (tmp) tpcVar3.b;
                    tmoVarA.getClass();
                    tmpVar3.d = tmoVarA;
                    tmpVar3.b |= 1;
                    if (!tpeVar2.b.C()) {
                        tpeVar2.o();
                    }
                    tzg tzgVar3 = (tzg) tpeVar2.b;
                    tmp tmpVar4 = (tmp) tpcVar3.l();
                    tmpVar4.getClass();
                    tzgVar3.e = tmpVar4;
                    tzgVar3.b |= 4;
                    tzg tzgVar4 = (tzg) tpeVar2.l();
                    if (!tpeVar.b.C()) {
                        tpeVar.o();
                    }
                    tze tzeVar = (tze) tpeVar.b;
                    tzgVar4.getClass();
                    tzeVar.k = tzgVar4;
                    tzeVar.b |= 268435456;
                }
                return null;
            case 11:
                return ((ocw) this.a).a((oca) obj, ocn.a);
            case 12:
                return Boolean.valueOf(((Comparable) obj).compareTo(this.a) >= 0);
            case 13:
                Comparable comparable = (Comparable) obj;
                comparable.getClass();
                return Boolean.valueOf(comparable.compareTo(this.a) == 0);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return pig.e(this.a, (piq) obj);
            case 15:
                return phz.e(this.a, (piq) obj);
            case 16:
                List<pio> list = (List) obj;
                scl sclVar = new scl();
                pfb pfbVar = (pfb) this.a;
                for (pgb pgbVar : pfbVar.c) {
                    lat latVar = pfbVar.d;
                    scl sclVar2 = new scl();
                    for (pio pioVar : list) {
                        if (pgbVar.c.contains(pioVar.d())) {
                            sclVar2.d(pioVar);
                        }
                    }
                    sclVar.d(pgf.o((pfl) latVar.c, pgbVar, sclVar2.g()));
                }
                return sclVar.g();
            case 17:
                return new pmf((pmg) this.a, (plz) obj);
            case 18:
                int i = sbp.d;
                sbk sbkVar = new sbk();
                for (qao qaoVar : (List) obj) {
                    Object obj5 = this.a;
                    pvl pvlVar = qaoVar.a;
                    pvc pvcVar = qaoVar.b;
                    pws pwsVar = (pws) obj5;
                    rwc rwcVar3 = pwsVar.a;
                    rwcVar3.h();
                    if (TextUtils.equals(rwcVar3.c(), pvlVar.c)) {
                        rwc rwcVar4 = pwsVar.d;
                        rwcVar4.h();
                        if (((Boolean) rwcVar4.c()).equals(Boolean.valueOf(pvlVar.f))) {
                            sbkVar.h(qaoVar);
                        }
                    }
                }
                return sbkVar.g();
            case 19:
                pts ptsVar = (pts) obj;
                if (ptsVar != null) {
                    ((pwr) this.a).b.h(pwr.l(ptsVar));
                }
                return ptsVar;
            default:
                return new qap((pvc) this.a, (pvc) obj);
        }
    }
}
