package defpackage;

import android.content.res.Resources;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pgr implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pgr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r14v37, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, syx] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        int i = 2;
        int i2 = 15;
        boolean z = false;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (pgs.a) {
                    ((pgs) obj).c = true;
                }
                ((pgs) obj).b();
                return;
            case 1:
                Object obj2 = this.a;
                synchronized (pgs.a) {
                    ((pgs) obj2).b = true;
                }
                ((pgs) obj2).b();
                return;
            case 2:
                Object obj3 = this.a;
                synchronized (pgs.a) {
                    if (!((pgs) obj3).d) {
                        ((pgs) obj3).b = true;
                        z = true;
                    }
                }
                if (z) {
                    ((pgs) obj3).b();
                    return;
                }
                return;
            case 3:
                ((pif) this.a).a("distribute:async");
                return;
            case 4:
                Object obj4 = this.a;
                while (true) {
                    pif pifVar = (pif) obj4;
                    pio pioVar = (pio) pifVar.h.poll();
                    if (pioVar == null) {
                        if (z) {
                            pifVar.a("distribute:Offered");
                            return;
                        }
                        return;
                    } else {
                        synchronized (obj4) {
                            if (((pif) obj4).i) {
                                pioVar.i(null);
                            } else {
                                ((pif) obj4).g.add(pioVar);
                                z = true;
                            }
                        }
                    }
                }
            case 5:
                Object obj5 = this.a;
                pma pmaVar = (pma) obj5;
                pmb pmbVar = pmaVar.c;
                synchronized (pmbVar.a) {
                    pmbVar.c.remove(obj5);
                    pmbVar.d();
                }
                pmaVar.c.e();
                return;
            case 6:
                qpj qpjVar = (qpj) this.a;
                qna qnaVar = qpjVar.h;
                qnaVar.getClass();
                if (qpjVar.b == 0) {
                    qpjVar.c = true;
                    Iterator it = qpjVar.g.iterator();
                    while (it.hasNext()) {
                        ((qou) it.next()).k(qnaVar);
                    }
                }
                qpjVar.h.getClass();
                qpjVar.a();
                return;
            case 7:
                qsg qsgVar = (qsg) this.a;
                if (((Boolean) qsgVar.j.a()).booleanValue()) {
                    qoa qoaVar = qsgVar.l;
                    Iterator it2 = qoaVar.b.iterator();
                    while (it2.hasNext()) {
                        swz.j(((qoe) it2.next()).a(), new qaz(qoaVar, i2), qoaVar.a);
                    }
                }
                rcg rcgVar = qsgVar.m;
                if (((Boolean) rcgVar.e.a()).booleanValue()) {
                    double dLongValue = ((Long) rcgVar.a.a()).longValue();
                    Object obj6 = rcgVar.f;
                    ?? r4 = rcgVar.c;
                    rcgVar.b.g(new qly(rcgVar, i), Math.round(dLongValue + (((Random) obj6).nextDouble() * ((Long) r4.a()).longValue())), ((Long) r4.a()).longValue(), TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 8:
                ((qui) this.a).a(0);
                return;
            case 9:
                int i3 = quf.b;
                rcc.c();
                qui quiVar = ((quh) this.a).b;
                if (quiVar.h != null) {
                    return;
                }
                quiVar.h = qqx.a();
                return;
            case 10:
                int i4 = quf.b;
                rcc.c();
                ?? r14 = this.a;
                quh quhVar = (quh) r14;
                qui quiVar2 = quhVar.b;
                if (quiVar2.i != null) {
                    return;
                }
                quiVar2.i = qqx.a();
                qui.b("Primes-ttfdd-end-and-length-ms", quiVar2.i.a);
                quhVar.a.unregisterActivityLifecycleCallbacks(r14);
                return;
            case 11:
                rcc.c();
                qui quiVar3 = ((quh) this.a).b;
                if (quiVar3.k != null) {
                    return;
                }
                quiVar3.k = qqx.a();
                return;
            case 12:
                rcc.c();
                qui quiVar4 = ((quh) this.a).b;
                if (quiVar4.j != null) {
                    return;
                }
                quiVar4.j = qqx.a();
                return;
            case 13:
                Object obj7 = this.a;
                qzm qzmVar = (qzm) obj7;
                qxf qxfVar = qzmVar.b;
                syu syuVarB = qzu.b(qxfVar).b(new qwl(qzmVar.c, 3), qxfVar.b());
                syuVarB.c(new ovw(obj7, syuVarB, i2), qxfVar.b());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                try {
                    ske.U(this.a);
                    return;
                } catch (ExecutionException e) {
                    rcc.d(new qly(e, 11));
                    return;
                }
            default:
                rjc rjcVar = (rjc) this.a;
                rjcVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = rjcVar.c;
                cqr cqrVar = bottomSheetBehavior.y;
                if (cqrVar != null && cqrVar.l()) {
                    rjcVar.a(rjcVar.a);
                    return;
                } else {
                    if (bottomSheetBehavior.x == 2) {
                        bottomSheetBehavior.as(rjcVar.a);
                        return;
                    }
                    return;
                }
        }
    }

    public pgr(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
