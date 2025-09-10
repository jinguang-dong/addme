package defpackage;

import android.content.Intent;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gnt implements goj, owf {
    private static final sgv d = sgv.g("gnt");
    public pka a;
    public final owq b;
    public final List c;
    private final out e;
    private final owf f;
    private boolean g;
    private boolean h;
    private final Intent i;
    private final hhc j;
    private final List k;
    private kgw l;
    private kgw m;
    private final pkc n;
    private final gox o;
    private final gtm p;
    private final qrh q;
    private final cxb r;

    public gnt(pkc pkcVar, out outVar, gtm gtmVar, qrh qrhVar, gox goxVar, cxb cxbVar, hhc hhcVar, Intent intent) {
        pka pkaVar = pka.BACK;
        this.a = pkaVar;
        this.c = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.n = pkcVar;
        this.e = outVar;
        this.g = false;
        this.h = false;
        this.i = intent;
        this.p = gtmVar;
        this.q = qrhVar;
        this.o = goxVar;
        this.r = cxbVar;
        this.j = hhcVar;
        arrayList.add(new gns(pkaVar, o() != null));
        pka pkaVar2 = pka.FRONT;
        arrayList.add(new gns(pkaVar2, p() != null));
        this.a = o() != null ? pkaVar : pkaVar2;
        ovx ovxVar = new ovx(this.a);
        this.b = ovxVar;
        this.f = new fsm(owl.h(owb.a(ovxVar), new fdz(this, 7)));
        if (m()) {
            goxVar.e(pkaVar2, pkaVar);
        } else if (!n(pkaVar2)) {
            goxVar.e(pkaVar);
        } else if (!n(pkaVar)) {
            goxVar.e(pkaVar2);
        }
        pkaVar = true == fdo.i(intent) ? pkaVar2 : pkaVar;
        l(pkaVar);
        if (m() || pkaVar == ovxVar.d) {
            return;
        }
        if (cxbVar.v()) {
            l((pka) ovxVar.d);
            goxVar.f(pkaVar);
            gtmVar.a(pkaVar, 2, 2);
        } else {
            hhcVar.c(new hgx("No " + pkaVar.name() + " camera present", pbw.CAMERAS_NOT_ENUMERATED, pkaVar));
        }
    }

    private final void l(pka pkaVar) {
        gns gnsVar = (gns) Collection.EL.stream(this.k).filter(new glx(pkaVar, 2)).findFirst().orElse(null);
        if (gnsVar != null) {
            gnsVar.d = true;
        }
    }

    private final boolean m() {
        return Collection.EL.stream(this.k).filter(new hsj(1)).count() == 2;
    }

    private final boolean n(pka pkaVar) {
        return Collection.EL.stream(this.k).anyMatch(new fme(pkaVar, 8));
    }

    private final synchronized kgw o() {
        if (!this.g) {
            this.l = q(this.n, pka.BACK);
            this.g = true;
        }
        return this.l;
    }

    private final synchronized kgw p() {
        if (!this.h) {
            this.m = q(this.n, pka.FRONT);
            this.h = true;
        }
        return this.m;
    }

    private static kgw q(pkc pkcVar, pka pkaVar) {
        pjr pjrVarE = pkcVar.e(pkaVar);
        if (pjrVarE == null) {
            return null;
        }
        return pkcVar.f(pjrVarE);
    }

    @Override // defpackage.goj
    public final pka a() {
        return (pka) ((ovx) this.b).d;
    }

    public final rwc d() {
        return rwc.i(k(a()));
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.f.dK(pauVar, executor);
    }

    @Override // defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        return (goi) this.f.dL();
    }

    public final void e(pka pkaVar) {
        gns gnsVar = (gns) Collection.EL.stream(this.k).filter(new fme(pkaVar, 7)).findFirst().orElse(null);
        if (gnsVar != null) {
            gnsVar.c = false;
        }
    }

    public final void f(pka pkaVar) {
        if (m()) {
            this.b.a(pkaVar);
        }
    }

    public final void g() {
        h(new fij(5));
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void h(Runnable runnable) {
        gns gnsVar;
        pka pkaVarA = a();
        pka pkaVar = pka.BACK;
        pka pkaVar2 = pkaVarA == pkaVar ? pka.FRONT : pkaVar;
        int i = 10;
        if (n(pkaVar2)) {
            if (i()) {
                pkaVar = pka.FRONT;
            }
            f(pkaVar);
            a();
            ojl.ck(ske.I((Iterable) Collection.EL.stream(this.c).map(new fiy(this, i)).collect(Collectors.toList())), new fqz(runnable, 4), this.e);
        } else if (!this.r.v()) {
            this.j.c(new hgx("No " + pkaVar2.name() + " camera present", pbw.CAMERAS_NOT_ENUMERATED, pkaVar2));
        }
        if (n(pkaVarA) && !n(pkaVar2) && this.r.v()) {
            List list = this.k;
            Optional optionalFindFirst = Collection.EL.stream(list).filter(new fme(pkaVar2, 9)).findFirst();
            int i2 = (optionalFindFirst.isPresent() && ((gns) optionalFindFirst.get()).b) ? 3 : 2;
            if (i2 == 2 && ((gnsVar = (gns) Collection.EL.stream(list).filter(new fme(pkaVar2, i)).findFirst().orElse(null)) == null || !gnsVar.d)) {
                this.o.f(pkaVar2);
            }
            this.p.a(pkaVar2, 3, i2);
        } else if (!n(pkaVarA) && !n(pkaVar2) && this.r.v()) {
            qrh qrhVar = this.q;
            Object obj = qrhVar.g;
            gpf gpfVar = gpf.UNOPENABLE;
            gox goxVar = (gox) obj;
            goxVar.i(gpfVar);
            ske.W(goxVar.d(gpfVar), new fxw(qrhVar, 2), qrhVar.c);
        }
        l(pkaVar2);
    }

    public final boolean i() {
        return a() == pka.BACK;
    }

    public final boolean j() {
        return a() == pka.FRONT;
    }

    public final kgw k(pka pkaVar) {
        if (pkaVar == pka.BACK && o() != null) {
            return o();
        }
        if (pkaVar == pka.FRONT && p() != null) {
            return p();
        }
        ((sgt) d.c().M(991)).v("No OneCameraCharacteristics found for: %s", a());
        return null;
    }

    public final String toString() {
        return true != i() ? "Front Camera" : "Back Camera";
    }
}
