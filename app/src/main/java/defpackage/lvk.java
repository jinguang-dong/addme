package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lvk {
    public static final sgv a = sgv.g("lvk");
    public final luk b;
    public final String c;
    public final String d;
    public final jug e;
    public final kgn f;
    public final pkc g;
    public final hbj h;
    private final owq i;
    private final owq j;
    private final owq k;
    private final owf l;
    private final owf m;
    private final owf n;
    private final pfw o;
    private final our p;

    public lvk(kgn kgnVar, luk lukVar, pkc pkcVar, pfw pfwVar, luj lujVar, owq owqVar, fdq fdqVar, hbj hbjVar, owf owfVar, jug jugVar, owf owfVar2, owf owfVar3) {
        this.f = kgnVar;
        this.b = lukVar;
        this.g = pkcVar;
        this.o = pfwVar;
        this.h = hbjVar;
        owq owqVarA = lujVar.a(luf.e);
        this.i = owqVarA;
        owq owqVarA2 = lujVar.a(luf.g);
        this.j = owqVarA2;
        this.k = owqVar;
        our ourVarJ = fdqVar.j();
        this.p = ourVarJ;
        this.l = owfVar;
        this.e = jugVar;
        this.m = owfVar2;
        this.n = owfVar3;
        String strF = hbjVar.f(gzo.V);
        strF.getClass();
        this.c = strF;
        String strF2 = hbjVar.f(gzo.W);
        strF2.getClass();
        this.d = strF2;
        lqn lqnVar = new lqn(this, 13);
        sxo sxoVar = sxo.a;
        ourVarJ.d(owqVar.dK(lqnVar, sxoVar));
        int i = 11;
        ourVarJ.d(owqVarA.dK(new lqn(this, 11), sxoVar));
        gzg gzgVar = gza.b;
        if (hbjVar.p(gzgVar)) {
            ourVarJ.d(owqVarA2.dK(new lld(this, 9), sxoVar));
        }
        int i2 = 10;
        ourVarJ.d(owl.h(owfVar3, new leb(10)).dK(new lqn(this, 12), sxoVar));
        if (hbjVar.p(gzgVar)) {
            ourVarJ.d(owfVar.dK(new lld(this, i), sxoVar));
            ourVarJ.d(owfVar2.dK(new lld(this, i2), sxoVar));
        }
    }

    public final void a(pka pkaVar) {
        String strB = lvo.b(pkaVar);
        if (strB == null) {
            return;
        }
        luk lukVar = this.b;
        if (lukVar.l(strB)) {
            return;
        }
        pkc pkcVar = this.g;
        pjr pjrVarE = pkcVar.e(pkaVar);
        if (pjrVarE == null) {
            ((sgt) a.c().M(4448)).v("Failed to retrieve a camera id for facing: %s", pkaVar);
        } else {
            lukVar.i(strB, ojl.bN(ojl.bM(qpt.bz(kzz.o(pjrVarE, pkcVar, this.f, this.h).y(256), pkaVar == pka.BACK ? this.c : this.d))));
        }
    }

    public final void b() {
        String str = (String) this.k.dL();
        if (str == null) {
            return;
        }
        jug jugVar = this.e;
        pka pkaVar = pka.BACK;
        d(jugVar.e(pkaVar), pkaVar, str);
        pka pkaVar2 = pka.FRONT;
        d(jugVar.e(pkaVar2), pkaVar2, str);
    }

    public final void c(pka pkaVar, int i, List list) {
        String strF = pkaVar.equals(pka.BACK) ? this.h.f(gzo.aQ) : this.h.f(gzo.aR);
        if (strF == null || strF.isEmpty() || !qpt.bI(i).l(pae.a)) {
            return;
        }
        pas pasVarBL = ojl.bL(strF);
        pasVarBL.getClass();
        list.add(pasVarBL);
    }

    public final void d(final int i, pka pkaVar, String str) {
        pas pasVar;
        pjp pjpVar = this.o.a;
        pjr pjrVarE = pjpVar.e(pkaVar);
        if (pjrVarE == null) {
            ((sgt) a.b().M(4450)).v("Unable to fetch camera ID for facing value: %s", pkaVar);
            return;
        }
        kgw kgwVarO = kzz.o(pjrVarE, pjpVar, this.f, this.h);
        String strB = lvo.b(pkaVar);
        if (strB == null) {
            ((sgt) a.b().M(4449)).v("Undefined picture size setting key for facing %s.", pkaVar);
            return;
        }
        List list = (List) Collection.EL.stream(kgwVarO.y(256)).filter(new Predicate() { // from class: lvj
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo32negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return pae.i((pas) obj).l(qpt.bI(i));
            }
        }).collect(Collectors.toList());
        c(pkaVar, i, list);
        List<pas> list2 = (List) Collection.EL.stream(list).sorted(Collections.reverseOrder(bur.b)).collect(Collectors.toList());
        rnt.L(!list2.isEmpty());
        if (str.equals("full")) {
            pasVar = (pas) list2.get(0);
        } else if (str.equals("medium")) {
            if (list2.size() > 1) {
                list2.remove(0);
            }
            for (pas pasVar2 : list2) {
                if (pasVar2.b() < 5242880) {
                    pasVar = pasVar2;
                    break;
                }
            }
            ((sgt) a.c().M(4446)).s("Invalid resolution setting, using default.");
            pasVar = (pas) list2.get(0);
        } else {
            ((sgt) a.c().M(4446)).s("Invalid resolution setting, using default.");
            pasVar = (pas) list2.get(0);
        }
        this.b.i(strB, ojl.bN(pasVar));
    }
}
