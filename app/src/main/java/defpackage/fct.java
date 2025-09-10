package defpackage;

import android.location.Location;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fct implements paf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fct(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [szh] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, lzh] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, mgl] */
    /* JADX WARN: Type inference failed for: r5v3, types: [fda, java.lang.Object] */
    @Override // defpackage.paf
    public final void a(Object obj) {
        int i = 16;
        int i2 = 0;
        switch (this.c) {
            case 0:
                owf owfVar = (owf) obj;
                if (owfVar != null) {
                    Object obj2 = this.b;
                    Object obj3 = this.a;
                    ((fcv) obj3).h = owfVar.dK(new fcs(obj3, obj2, i2), ojl.ce());
                    break;
                }
                break;
            case 1:
                fcx fcxVar = (fcx) ((ovx) ((fcy) this.a).a).d;
                if (!fcxVar.equals(fcx.AE_AF_LOCKED)) {
                    ?? r5 = this.b;
                    if (!fcxVar.equals(fcx.AE_LOCKED)) {
                        r5.i();
                        break;
                    } else {
                        r5.j();
                        break;
                    }
                }
                break;
            case 2:
                fcx fcxVar2 = (fcx) ((ovx) ((fcy) this.b).a).d;
                if (!fcxVar2.equals(fcx.AE_AF_LOCKED)) {
                    Object obj4 = this.a;
                    if (!fcxVar2.equals(fcx.AE_LOCKED)) {
                        ((fcv) obj4).e.i();
                        break;
                    } else {
                        ((fcv) obj4).e.j();
                        break;
                    }
                }
                break;
            case 3:
                if (!((fcx) ((ovx) ((fcy) this.b).a).d).equals(fcx.AE_AF_LOCKED)) {
                    Object obj5 = this.a;
                    fcv fcvVar = (fcv) obj5;
                    if (!fcvVar.f()) {
                        fcvVar.d(rvk.a);
                        nlt nltVar = fcvVar.g;
                        if (nltVar == null) {
                            fcvVar.e();
                            break;
                        } else {
                            nltVar.a().c(new dzd(obj5, 16), sxo.a);
                            break;
                        }
                    } else {
                        fcvVar.c(rvk.a);
                        break;
                    }
                }
                break;
            case 4:
                rwc rwcVar = (rwc) obj;
                rwcVar.getClass();
                if (rwcVar.h()) {
                    Object obj6 = this.a;
                    sbp sbpVarB = kzz.b(((gcp) obj6).h, (Location) rwcVar.c());
                    int i3 = ((sex) sbpVarB).c;
                    while (i2 < i3) {
                        ((pfu) this.b).l((pej) sbpVarB.get(i2));
                        i2++;
                    }
                    break;
                }
                break;
            case 5:
                Object obj7 = this.a;
                ((irk) this.b).e((iqq) obj7, (efh) obj);
                break;
            case 6:
                efh efhVar = (efh) obj;
                efhVar.getClass();
                ((irk) this.b).d((iqq) this.a, efhVar);
                break;
            case 7:
                Object obj8 = this.a;
                irs irsVar = (irs) obj8;
                if (irsVar.n()) {
                    irsVar.f(iqz.JOY).ifPresent(new fxu(obj8, this.b, i));
                    break;
                }
                break;
            case 8:
                our ourVar = ((jbc) this.a).K;
                fel felVar = (fel) obj;
                if (!ourVar.b()) {
                    ?? r52 = this.b;
                    felVar.getClass();
                    felVar.j((fey) r52.a());
                    ourVar.d(new iew(felVar, 6));
                    break;
                }
                break;
            case 9:
                Object obj9 = this.b;
                Object obj10 = this.a;
                lmo lmoVar = new lmo(((lmm) obj10).d, (nw) obj9, 3);
                ((lmp) obj10).h.k.a(lmoVar, (ltd) obj);
                break;
            case 10:
                final lyq lyqVar = (lyq) obj;
                rnt.x(lyqVar);
                final lzj lzjVar = (lzj) this.b;
                rwc rwcVar2 = lzjVar.h;
                ?? C = lyqVar.c;
                if (rwcVar2.h()) {
                    C = rwcVar2.c();
                }
                final ?? r53 = this.a;
                lyqVar.o.c(new Runnable() { // from class: lyh
                    @Override // java.lang.Runnable
                    public final void run() {
                        lyq lyqVar2 = lyqVar;
                        Map map = lyqVar2.j;
                        lzh lzhVar = r53;
                        if (map.containsKey(lzhVar)) {
                            ((sgt) lyq.a.b().M(4524)).v("Trying to add previously added Smarts Processor %s", lzhVar);
                            return;
                        }
                        if (lzhVar instanceof lzf) {
                            lyqVar2.b = true;
                        }
                        lzj lzjVar2 = lzjVar;
                        lyy lyyVar = new lyy(lzhVar, lzjVar2);
                        map.put(lzhVar, lyyVar);
                        pbn pbnVar = lyqVar2.k;
                        pbnVar.f("smartsProcessor#init-".concat(String.valueOf(lzjVar2.a)));
                        lyyVar.c = new lyw(lyyVar, new lyz(lyqVar2.l, lzjVar2, lzhVar));
                        lyyVar.a.eZ(lyyVar.c);
                        lyyVar.d = true;
                        our ourVar2 = lyyVar.f;
                        lzj lzjVar3 = lyyVar.b;
                        ourVar2.d(lzjVar3.f.dK(new lqn(lyyVar, 15), ojl.ce()));
                        pbnVar.g();
                        lyyVar.d(lyqVar2.p);
                        lyyVar.e(lyqVar2.q);
                        lyyVar.f(lyqVar2.s);
                        lyyVar.c(lyqVar2.u);
                        lyyVar.g(lyq.k((ltw) lyqVar2.g.dL()));
                        lyyVar.h(((Boolean) lyqVar2.h.dL()).booleanValue());
                        pjo pjoVar = lyqVar2.r;
                        if (pjoVar != null) {
                            lyyVar.a(pjoVar);
                        }
                    }
                }, C);
                break;
            default:
                mgn mgnVar = (mgn) obj;
                mgnVar.getClass();
                ((mgm) this.b).b = mgnVar;
                this.a.a(mgnVar);
                break;
        }
    }

    public /* synthetic */ fct(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
