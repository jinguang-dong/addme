package defpackage;

import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import com.pairip.VMRunner;
import j$.util.DesugarArrays;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kxg implements let {
    public static final sgv a = sgv.g("kxg");
    public final sax b = new sax();
    public final pdn c;
    private final rww d;
    private final khl e;
    private final long f;
    private final ley g;
    private final Set h;
    private final pbn i;
    private final int j;
    private final pfu k;
    private final kgw l;
    private final cxb m;

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, uem] */
    public kxg(our ourVar, khl khlVar, syu syuVar, ley leyVar, Set set, cxb cxbVar, pfu pfuVar, kgw kgwVar, pbn pbnVar, long j, pdn pdnVar, rww rwwVar, int i) {
        this.e = khlVar;
        this.d = rwwVar;
        this.j = i;
        this.f = j;
        this.c = pdnVar;
        this.g = leyVar;
        this.h = set;
        this.m = cxbVar;
        this.k = pfuVar;
        this.l = kgwVar;
        this.i = pbnVar;
        for (peo peoVar : pdnVar.i().d()) {
            this.b.o(Integer.valueOf(peoVar.a()), peoVar);
        }
        ourVar.d(pdnVar);
        ojl.ck(syuVar, new iyn(pdnVar, 7), sxo.a);
        IntStream intStreamStream = DesugarArrays.stream(lbb.a);
        final sax saxVar = this.b;
        if (intStreamStream.anyMatch(new IntPredicate() { // from class: kxf
            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return IntPredicate$CC.$default$and(this, intPredicate);
            }

            public final /* synthetic */ IntPredicate negate() {
                return IntPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return IntPredicate$CC.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i2) {
                return saxVar.n(Integer.valueOf(i2));
            }
        }) && leyVar.b.p(gzs.X)) {
            qqq qqqVar = leyVar.c;
            hzs hzsVar = (hzs) qqqVar.c.a();
            hzsVar.getClass();
            lat latVar = (lat) qqqVar.d.a();
            latVar.getClass();
            Object objA = qqqVar.e.a();
            Supplier supplier = (Supplier) qqqVar.b.a();
            supplier.getClass();
            pfl pflVar = (pfl) qqqVar.a.a();
            pflVar.getClass();
            lev levVar = new lev(hzsVar, latVar, (ovo) objA, supplier, pflVar, pdnVar);
            pdnVar.l(levVar);
            leyVar.a.d(levVar);
            rwc.j(levVar);
        }
    }

    @Override // defpackage.let
    public final les a() {
        return new kxe(0);
    }

    @Override // defpackage.let
    public final pdk b(long j) {
        return this.c.d(new jmj(j, 2));
    }

    @Override // defpackage.let
    public final pdk c() throws InterruptedException {
        pdk pdkVarH = this.j + (-1) != 1 ? this.c.h() : this.c.e();
        if (pdkVarH != null) {
            ojl.by(pdkVarH);
        }
        return pdkVarH;
    }

    @Override // defpackage.let
    public final pdk d() {
        int i = this.j - 1;
        pdn pdnVar = this.c;
        return i != 1 ? pdnVar.g() : pdnVar.c();
    }

    @Override // defpackage.let
    public final pdk e() throws InterruptedException {
        pdk pdkVarH = this.c.h();
        if (pdkVarH != null) {
            ojl.by(pdkVarH);
        }
        return pdkVarH;
    }

    @Override // defpackage.let
    public final pdn f() {
        return this.c;
    }

    @Override // defpackage.let
    public final pdv g() {
        return this.c.i();
    }

    @Override // defpackage.let
    public final sbp i(List list) throws InterruptedException {
        pbn pbnVar = this.i;
        pbnVar.f("zslRingBuffer#filter");
        sbp sbpVarH = h(list);
        pbnVar.h("zslRingBuffer#awaitComplete");
        int i = ((sex) sbpVarH).c;
        for (int i2 = 0; i2 < i; i2++) {
            ojl.by((pdk) sbpVarH.get(i2));
        }
        pbnVar.g();
        return sbpVarH;
    }

    @Override // defpackage.let
    public final List j() {
        return i(o());
    }

    @Override // defpackage.let
    public final List k() {
        return o();
    }

    @Override // defpackage.let
    public final List l() {
        return this.c.j();
    }

    @Override // defpackage.let
    public final void m(String str) {
        this.c.i().b().dL();
    }

    @Override // defpackage.let
    public void n(int i) {
        VMRunner.invoke("DwrmrAQgOZVDnaD2", new Object[]{this, Integer.valueOf(i)});
    }

    public final List o() {
        int i = this.j - 1;
        pdn pdnVar = this.c;
        return i != 1 ? pdnVar.k() : pdnVar.j();
    }

    @Override // defpackage.let
    public final sbp h(List list) throws InterruptedException {
        sbp sbpVarG;
        sbp sbpVarG2;
        sbp sbpVarG3;
        pbn pbnVar = this.i;
        pbnVar.f("zslRingBuffer#filterAndTrim");
        pbnVar.f("zslRingBuffer#filterByTimestamp");
        if (list.isEmpty()) {
            int i = sbp.d;
            sbpVarG = sex.a;
        } else {
            int i2 = sbp.d;
            sbk sbkVar = new sbk();
            pdo pdoVarB = ((pdk) ujp.aQ(list)).b();
            long jMax = pdoVarB != null ? Math.max(pdoVarB.b, this.e.k()) : this.e.k();
            long j = this.f;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pdk pdkVar = (pdk) it.next();
                pdo pdoVarB2 = pdkVar.b();
                if (pdoVarB2 != null) {
                    if (pdoVarB2.b > jMax - j) {
                        sbkVar.h(pdkVar);
                    }
                }
                pdkVar.close();
            }
            sbpVarG = sbkVar.g();
        }
        pbnVar.h("zslRingBuffer#trimByCapacity");
        if (sbpVarG.isEmpty()) {
            sbpVarG2 = sex.a;
        } else {
            LinkedList linkedList = new LinkedList(sbpVarG);
            sbk sbkVar2 = new sbk();
            int iMin = Math.min(((Integer) this.d.fr()).intValue(), ((sex) sbpVarG).c);
            for (int i3 = 0; i3 < iMin; i3++) {
                pdk pdkVar2 = (pdk) linkedList.pollLast();
                if (pdkVar2 != null) {
                    sbkVar2.h(pdkVar2);
                }
            }
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                pdk pdkVar3 = (pdk) it2.next();
                pdkVar3.b();
                pdkVar3.close();
            }
            sbpVarG2 = sbkVar2.g();
        }
        pbnVar.g();
        pbnVar.h("zslRingBuffer#filterByMetadata");
        if (sbpVarG2.isEmpty()) {
            sbpVarG3 = sex.a;
        } else {
            sbk sbkVar3 = new sbk();
            scl sclVar = new scl();
            sclVar.j(this.h);
            kgw kgwVar = this.l;
            if (!kgwVar.M() || !kgwVar.D()) {
                pdk pdkVar4 = (pdk) sbpVarG2.get(0);
                pbnVar.f("zslRingBuffer#getRecentFocalLength");
                ojl.bA(pdkVar4);
                poe poeVarD = pdkVar4.d();
                float fFloatValue = -1.0f;
                if (poeVarD != null) {
                    Float f = (Float) poeVarD.a(CaptureResult.LENS_FOCAL_LENGTH);
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        ((sgt) a.c().M(3572)).v("Invalid focal length for frame %s", pdkVar4.b());
                    }
                } else {
                    ((sgt) a.c().M(3571)).v("No metadata found for frame %s", pdkVar4.b());
                }
                sclVar.d(new lfk(CaptureResult.LENS_FOCAL_LENGTH, Float.valueOf(fFloatValue)));
                pbnVar.g();
            }
            pbnVar.f(KsvNaXS.bzEKAfWy);
            lfa lfaVar = new lfa(sclVar.g());
            pbnVar.h("findBinningStatus");
            Set setA = this.g.a(sbpVarG2);
            pbnVar.g();
            sgk it3 = sbpVarG2.iterator();
            boolean z = false;
            while (it3.hasNext()) {
                pdk pdkVar5 = (pdk) it3.next();
                pbnVar.f("zslRingBuffer#filter");
                boolean zContains = setA.contains(pdkVar5.b());
                if (lfaVar.a(pdkVar5)) {
                    sbkVar3.h(pdkVar5);
                    if (zContains) {
                        pdkVar5.b().getClass();
                    } else {
                        cxb cxbVar = this.m;
                        pdkVar5.b().getClass();
                        z |= !cxbVar.G(r6.b);
                    }
                } else {
                    pdkVar5.b();
                    pdkVar5.close();
                }
                pbnVar.g();
            }
            sbpVarG3 = sbkVar3.g();
            if (!z) {
                int i4 = ((sex) sbpVarG3).c;
                for (int i5 = 0; i5 < i4; i5++) {
                    pdk pdkVar6 = (pdk) sbpVarG3.get(i5);
                    pdkVar6.b();
                    pdkVar6.close();
                }
                sbpVarG3 = sex.a;
            }
        }
        pbnVar.g();
        return sbpVarG3;
    }
}
