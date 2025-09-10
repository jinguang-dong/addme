package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import com.google.googlex.gcam.Gcam;
import j$.util.Objects;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktc implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;
    private final /* synthetic */ int l;

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i) {
        this.l = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, krp, owq] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        rwc rwcVar;
        CaptureRequest.Key key;
        final lbb lbbVar;
        final pjo pjoVarF;
        scn scnVarG;
        scn scnVarG2;
        final pjo pjoVarJ;
        int i = 0;
        z = false;
        boolean z = false;
        switch (this.l) {
            case 0:
                final luj lujVar = (luj) this.a.a();
                final owf owfVarB = ((ihb) this.b).b();
                hbj hbjVar = (hbj) this.c.a();
                final hie hieVar = (hie) this.d.a();
                final owf owfVar = (owf) this.e.a();
                final fuf fufVar = (fuf) this.f.a();
                nkw nkwVarA = ((nkv) this.g).a();
                final owf owfVar2 = (owf) this.h.a();
                final owf owfVar3 = (owf) this.i.a();
                final owf owfVar4 = (owf) this.j.a();
                final owq owqVar = (owq) this.k.a();
                sgv sgvVar = ktb.a;
                boolean zB = fufVar.b(nkwVarA);
                luu luuVar = luf.v;
                owq owqVarA = lujVar.a(luuVar);
                String str = (String) luuVar.d(hbjVar);
                ksa ksaVar = ksa.PHOTO_FLASH_NS;
                ksa ksaVar2 = ksa.PHOTO_FLASH_AUTO;
                ksa ksaVar3 = ksa.PHOTO_FLASH_ON;
                ksa ksaVar4 = ksa.PHOTO_FLASH_OFF;
                final ?? krpVar = new krp(owqVarA, str, ksaVar, ksaVar2, ksaVar3, ksaVar4, null);
                if (zB && ksaVar2.equals(krpVar.dL())) {
                    krpVar.a(ksaVar);
                } else if (!zB && ksaVar.equals(krpVar.dL())) {
                    krpVar.a(ksaVar4);
                }
                final boolean zP = hbjVar.p(gzo.U);
                final boolean zP2 = hbjVar.p(hak.h);
                Predicate predicate = new Predicate() { // from class: ksr
                    public final /* synthetic */ Predicate and(Predicate predicate2) {
                        return Predicate$CC.$default$and(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo32negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate2) {
                        return Predicate$CC.$default$or(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        krj krjVar = (krj) obj;
                        sgv sgvVar2 = ktb.a;
                        nkw nkwVarD = krjVar.d();
                        if (!((Boolean) owfVar.dL()).booleanValue()) {
                            boolean z2 = nkwVarD.equals(nkw.PHOTO) || (nkwVarD.equals(nkw.PORTRAIT) && zP2) || nkwVarD.equals(nkw.IMAGE_INTENT);
                            if (((!zP && fufVar.a(krjVar.d())) || krjVar.f) && !krjVar.s() && z2) {
                                return true;
                            }
                        } else if (krjVar.f && nkwVarD.equals(nkw.IMAGE_INTENT)) {
                            return true;
                        }
                        return false;
                    }
                };
                Predicate predicate2 = new Predicate() { // from class: kss
                    public final /* synthetic */ Predicate and(Predicate predicate3) {
                        return Predicate$CC.$default$and(this, predicate3);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo32negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate3) {
                        return Predicate$CC.$default$or(this, predicate3);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
                    @Override // java.util.function.Predicate
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final boolean test(java.lang.Object r6) {
                        /*
                            r5 = this;
                            krj r6 = (defpackage.krj) r6
                            sgv r0 = defpackage.ktb.a
                            owf r0 = r1
                            java.lang.Object r0 = r0.dL()
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            hie r1 = r2
                            owq r1 = r1.d
                            ovx r1 = (defpackage.ovx) r1
                            java.lang.Object r1 = r1.d
                            java.lang.Boolean r1 = (java.lang.Boolean) r1
                            boolean r1 = r1.booleanValue()
                            r2 = 1
                            r3 = 0
                            if (r1 == 0) goto L42
                            owf r1 = r3
                            java.lang.Object r4 = r1.dL()
                            jjq r4 = (defpackage.jjq) r4
                            j$.util.Optional r4 = r4.b
                            boolean r4 = r4.isEmpty()
                            if (r4 == 0) goto L42
                            java.lang.Object r1 = r1.dL()
                            jjq r1 = (defpackage.jjq) r1
                            j$.util.Optional r1 = r1.e
                            boolean r1 = r1.isEmpty()
                            if (r1 == 0) goto L42
                            r1 = r2
                            goto L43
                        L42:
                            r1 = r3
                        L43:
                            fuf r5 = r4
                            nkw r6 = r6.d()
                            boolean r5 = r5.a(r6)
                            if (r5 != 0) goto L55
                            if (r1 == 0) goto L54
                            if (r0 != 0) goto L54
                            return r2
                        L54:
                            return r3
                        L55:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.kss.test(java.lang.Object):boolean");
                    }
                };
                BiPredicate biPredicate = new BiPredicate() { // from class: kst
                    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate2) {
                        return BiPredicate$CC.$default$and(this, biPredicate2);
                    }

                    public final /* synthetic */ BiPredicate negate() {
                        return BiPredicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate2) {
                        return BiPredicate$CC.$default$or(this, biPredicate2);
                    }

                    @Override // java.util.function.BiPredicate
                    public final boolean test(Object obj, Object obj2) {
                        ksa ksaVar5 = (ksa) obj2;
                        sgv sgvVar2 = ktb.a;
                        nkw nkwVarD = ((kqy) obj).d();
                        fuf fufVar2 = fufVar;
                        if (!fufVar2.a(nkwVarD) || !ksa.PHOTO_FLASH_ON.equals(ksaVar5)) {
                            if (!Objects.equals(ksaVar5, ksa.PHOTO_FLASH_NS) || ((Boolean) fufVar2.e.dL()).booleanValue()) {
                                return true;
                            }
                            return Objects.equals(krpVar.dL(), ksa.PHOTO_FLASH_ON) && owqVar.dL() == ltw.OFF;
                        }
                        hie hieVar2 = hieVar;
                        boolean zBooleanValue = ((Boolean) owfVarB.dL()).booleanValue();
                        if (((Boolean) ((ovx) hieVar2.d).d).booleanValue()) {
                            owf owfVar5 = owfVar3;
                            return ((jjq) owfVar5.dL()).b.isEmpty() && ((jjq) owfVar5.dL()).e.isEmpty() && !zBooleanValue && !((Boolean) owfVar4.dL()).booleanValue();
                        }
                        return false;
                    }
                };
                ljx ljxVar = new ljx(krpVar, biPredicate, 1);
                Consumer consumer = new Consumer() { // from class: ksu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void d(Object obj) {
                        krj krjVar = (krj) obj;
                        sgv sgvVar2 = ktb.a;
                        AtomicReference atomicReference = new AtomicReference(ksa.UNKNOWN);
                        our ourVar = krjVar.L;
                        ksq ksqVar = new ksq(krjVar, 0);
                        sxo sxoVar = sxo.a;
                        ourVar.d(owfVar.dK(ksqVar, sxoVar));
                        owf owfVarA = owb.a(owl.c(owl.h(owfVarB, new jku(10)), hieVar.d, owl.h(owfVar3, new jku(11)), owl.h(owfVar4, new jku(12))));
                        owq owqVar2 = krpVar;
                        fuf fufVar2 = fufVar;
                        ourVar.d(owfVarA.dK(new ksw(owqVar2, fufVar2, owfVar2, krjVar, 1), sxoVar));
                        luj lujVar2 = lujVar;
                        ktb.c(ourVar, fufVar2, owqVar2, lujVar2.a(luf.B), krjVar, krs.BACK_PHOTO_FLASH);
                        ourVar.d(owqVar2.dK(new fun(atomicReference, lujVar2, 13, null), sxoVar));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                ksh kshVarA = ktb.a(zB, zP, true);
                kshVarA.a = krpVar;
                kshVarA.b = predicate;
                kshVarA.c = predicate2;
                kshVarA.d = biPredicate;
                kshVarA.f = ljxVar;
                kshVarA.e = consumer;
                kshVarA.n(krs.BACK_PHOTO_FLASH);
                return kshVarA.a();
            case 1:
                owf owfVar5 = (owf) this.i.a();
                owf owfVar6 = (owf) this.a.a();
                tzx tzxVar = this.j;
                tzx tzxVar2 = this.b;
                pjo pjoVarA = ((kiv) this.e).a();
                pae paeVarA = ((kqq) tzxVar2).a();
                pnq pnqVar = (pnq) tzxVar.a();
                tzx tzxVar3 = this.f;
                gnt gntVarA = ((kif) this.c).a();
                our ourVar = (our) tzxVar3.a();
                hbj hbjVar2 = (hbj) this.g.a();
                tzx tzxVar4 = this.k;
                pjp pjpVarA = ((pab) this.h).a();
                kqx kqxVar = (pnqVar.h() || ((kid) this.d).a() == nkw.COTTAGE) ? new kqx(owfVar5, owfVar6, pjoVarA, hbjVar2, pjpVarA) : new kqx(owfVar5, owfVar6, pjoVarA, paeVarA, hbjVar2, pjpVarA, (Rect) tzxVar4.a());
                ourVar.d(gntVarA.dK(new jjl(kqxVar, 20), sxo.a));
                return kqxVar;
            case 2:
                pmv pmvVar = (pmv) this.h.a();
                kgw kgwVarA = ((kiu) this.d).a();
                pfu pfuVar = (pfu) this.e.a();
                rwc rwcVar2 = (rwc) this.f.a();
                rwc rwcVar3 = (rwc) this.g.a();
                rwc rwcVar4 = (rwc) this.c.a();
                rwc rwcVar5 = (rwc) this.a.a();
                rwc rwcVar6 = (rwc) this.b.a();
                hbj hbjVar3 = (hbj) this.i.a();
                nkw nkwVarA2 = ((kid) this.k).a();
                if (!hbjVar3.p(gzs.ai) && ((kgwVarA.l() == pka.FRONT && !pmvVar.p()) || (kgwVarA.l() == pka.BACK && !pmvVar.q()))) {
                    qpt.cc(nkwVarA2);
                    rwcVar5 = rvk.a;
                }
                rwc rwcVar7 = rwcVar5;
                rvk rvkVar = rvk.a;
                return !rwcVar2.h() ? rvkVar : qpt.cb(pfuVar, new sfm((peo) rwcVar2.c()), rwcVar7, rwcVar3, rvkVar, rwcVar4, rwcVar6, ((tzz) this.j).a());
            case 3:
                pfu pfuVar2 = (pfu) this.c.a();
                Map map = (Map) this.f.a();
                rwc rwcVar8 = (rwc) this.a.a();
                hbj hbjVar4 = (hbj) this.e.a();
                idt idtVar = (idt) this.h.a();
                nkw nkwVarA3 = ((kid) this.k).a();
                lcz lczVar = lcz.RAW_WIDE;
                if (!map.containsKey(lczVar) && !map.containsKey(lcz.RAW_WIDE_RM)) {
                    return sfc.a;
                }
                EnumMap enumMap = new EnumMap(lcz.class);
                for (lcz lczVar2 : map.keySet()) {
                    scl sclVar = new scl();
                    peo peoVar = (peo) map.get(lczVar2);
                    peoVar.getClass();
                    sclVar.d(peoVar);
                    if (idtVar.b() && lczVar2.equals(lczVar)) {
                        lcz lczVar3 = lcz.RAW_ULTRAWIDE;
                        if (map.containsKey(lczVar3)) {
                            peo peoVar2 = (peo) map.get(lczVar3);
                            peoVar2.getClass();
                            sclVar.d(peoVar2);
                        }
                    }
                    if (idtVar.e() && (lczVar2.equals(lcz.RAW_WIDE_UPPER) || lczVar2.equals(lcz.RAW_WIDE_RM_UPPER))) {
                        lcz lczVar4 = lcz.RAW_TELE;
                        if (map.containsKey(lczVar4)) {
                            peo peoVar3 = (peo) map.get(lczVar4);
                            peoVar3.getClass();
                            sclVar.d(peoVar3);
                        }
                    }
                    tzx tzxVar5 = this.i;
                    scn scnVarG3 = sclVar.g();
                    Set setA = ((tzz) tzxVar5).a();
                    scl sclVar2 = new scl();
                    if (lczVar2 != lczVar && idtVar.b() && (key = nvm.p) != null) {
                        sclVar2.d(new pej(key, Integer.valueOf(i)));
                    }
                    sclVar2.j(setA);
                    scn scnVarG4 = sclVar2.g();
                    rwc rwcVar9 = lczVar2 == lczVar ? (rwc) this.j.a() : rvk.a;
                    rwc rwcVar10 = lczVar2 == lcz.RAW_TELE_PLUS ? (rwc) this.g.a() : rvk.a;
                    rwc rwcVar11 = (rwc) this.d.a();
                    if (hbjVar4.p(gzs.ai) || ((pmv) this.b.a()).q()) {
                        if (!ixg.a(nkwVarA3)) {
                            rwcVar = rwcVar8;
                        }
                        rwc rwcVar12 = rwcVar9;
                        EnumMap enumMap2 = enumMap;
                        pdv pdvVar = (pdv) qpt.cb(pfuVar2, scnVarG3, rwcVar, rwcVar12, rwcVar10, rvk.a, rwcVar11, scnVarG4).f();
                        pdvVar.getClass();
                        enumMap2.put((EnumMap) lczVar2, (lcz) pdvVar);
                        enumMap = enumMap2;
                        map = map;
                        i = 0;
                    } else {
                        qpt.cc(nkwVarA3);
                    }
                    rwcVar = rvk.a;
                    rwc rwcVar122 = rwcVar9;
                    EnumMap enumMap22 = enumMap;
                    pdv pdvVar2 = (pdv) qpt.cb(pfuVar2, scnVarG3, rwcVar, rwcVar122, rwcVar10, rvk.a, rwcVar11, scnVarG4).f();
                    pdvVar2.getClass();
                    enumMap22.put((EnumMap) lczVar2, (lcz) pdvVar2);
                    enumMap = enumMap22;
                    map = map;
                    i = 0;
                }
                return enumMap;
            case 4:
                tzx tzxVar6 = this.d;
                Object objA = this.b.a();
                final kgw kgwVar = (kgw) tzxVar6.a();
                final nms nmsVar = (nms) this.g.a();
                final nkw nkwVar = (nkw) this.k.a();
                tzx tzxVar7 = this.h;
                final rwc rwcVarB = ((ixr) this.a).b();
                final hbj hbjVar5 = (hbj) tzxVar7.a();
                final boolean zBooleanValue = ((Boolean) this.j.a()).booleanValue();
                lbb lbbVar2 = (lbb) this.i.a();
                final peg pegVar = (peg) this.c.a();
                final ldd lddVar = (ldd) this.e.a();
                final lcs lcsVarB = ((lct) this.f).a();
                if (nmsVar.a == 2 && hbjVar5.p(gzo.Z)) {
                    scnVarG = sfd.a;
                } else {
                    ?? r0 = zBooleanValue && hbjVar5.p(han.i);
                    final boolean z2 = zBooleanValue && !r0 == true;
                    ?? r4 = zBooleanValue && hbjVar5.p(han.l);
                    boolean z3 = hbjVar5.o(hae.z) && !zBooleanValue;
                    scl sclVar3 = new scl();
                    if (!zBooleanValue || z2 || r4 == true) {
                        lbbVar = lbbVar2;
                        sclVar3.d(qpt.bZ(lcz.RAW_TELE, new uem() { // from class: lci
                            @Override // defpackage.uem, defpackage.uel
                            public final Object a() {
                                kgw kgwVar2 = kgwVar;
                                boolean z4 = false;
                                if (kgwVar2.M() && kgwVar2.D()) {
                                    z4 = true;
                                }
                                ldd lddVar2 = lddVar;
                                peg pegVar2 = pegVar;
                                lbb lbbVar3 = lbbVar;
                                rwc rwcVar13 = rwcVarB;
                                hbj hbjVar6 = hbjVar5;
                                nkw nkwVar2 = nkwVar;
                                lcs lcsVar = lcsVarB;
                                boolean z5 = z2;
                                nms nmsVar2 = nmsVar;
                                a.I(z4);
                                pjo pjoVarE = nmsVar2.e();
                                pjoVarE.j();
                                pjoVarE.s();
                                return lcl.b(pjoVarE, lcsVar, nkwVar2, hbjVar6, rwcVar13, !z5, true, z5, lbbVar3, pegVar2, lddVar2, lcz.RAW_TELE);
                            }
                        }));
                    } else {
                        lbbVar = lbbVar2;
                    }
                    if ((z3 || r0 != false) && (pjoVarF = nmsVar.f()) != null) {
                        final lbb lbbVar3 = lbbVar;
                        sclVar3.d(qpt.bZ(lcz.RAW_TELE_RM, new uem() { // from class: lcj
                            @Override // defpackage.uem, defpackage.uel
                            public final Object a() {
                                pjo pjoVar = pjoVarF;
                                pjoVar.s();
                                return lcl.b(pjoVar, lcsVarB, nkwVar, hbjVar5, rwcVarB, false, false, zBooleanValue, lbbVar3, pegVar, ldc.a, lcz.RAW_TELE_RM);
                            }
                        }));
                    }
                    scnVarG = sclVar3.g();
                }
                scnVarG.getClass();
                return scnVarG;
            case 5:
                tzx tzxVar8 = this.d;
                Object objA2 = this.b.a();
                kgw kgwVar2 = (kgw) tzxVar8.a();
                final nms nmsVar2 = (nms) this.g.a();
                final nkw nkwVar2 = (nkw) this.k.a();
                tzx tzxVar9 = this.h;
                final rwc rwcVarB2 = ((ixr) this.a).b();
                final hbj hbjVar6 = (hbj) tzxVar9.a();
                final boolean zBooleanValue2 = ((Boolean) this.j.a()).booleanValue();
                final lbb lbbVar4 = (lbb) this.i.a();
                final peg pegVar2 = (peg) this.c.a();
                final ldd lddVar2 = (ldd) this.e.a();
                final lcs lcsVarB2 = ((lct) this.f).a();
                if (hbjVar6.p(gzo.Z)) {
                    final boolean z4 = zBooleanValue2 && nkwVar2 == nkw.PORTRAIT;
                    ?? r02 = zBooleanValue2 && hbjVar6.p(han.j) && !z4;
                    final boolean z5 = zBooleanValue2 && !r02 == true;
                    ?? r42 = zBooleanValue2 && hbjVar6.p(han.l);
                    a.I(kgwVar2.M() && kgwVar2.D());
                    scl sclVar4 = new scl();
                    if (!zBooleanValue2 || z5 || r42 != false) {
                        sclVar4.d(qpt.bZ(lcz.RAW_ULTRAWIDE, new uem() { // from class: lce
                            @Override // defpackage.uem, defpackage.uel
                            public final Object a() {
                                pjo pjoVarI = nmsVar2.i();
                                pjoVarI.j();
                                pjoVarI.s();
                                boolean z6 = z5 && !z4;
                                boolean z7 = !zBooleanValue2;
                                ldd lddVar3 = lddVar2;
                                peg pegVar3 = pegVar2;
                                lbb lbbVar5 = lbbVar4;
                                return lcl.b(pjoVarI, lcsVarB2, nkwVar2, hbjVar6, rwcVarB2, z7, true, z6, lbbVar5, pegVar3, lddVar3, lcz.RAW_ULTRAWIDE);
                            }
                        }));
                    }
                    if (r02 != false && (pjoVarJ = nmsVar2.j()) != null) {
                        sclVar4.d(qpt.bZ(lcz.RAW_ULTRAWIDE_RM, new uem() { // from class: lcf
                            @Override // defpackage.uem, defpackage.uel
                            public final Object a() {
                                pjo pjoVar = pjoVarJ;
                                pjoVar.s();
                                return lcl.b(pjoVar, lcsVarB2, nkwVar2, hbjVar6, rwcVarB2, false, true, zBooleanValue2, lbbVar4, pegVar2, lddVar2, lcz.RAW_ULTRAWIDE);
                            }
                        }));
                    }
                    scnVarG2 = sclVar4.g();
                } else {
                    scnVarG2 = sfd.a;
                }
                scnVarG2.getClass();
                return scnVarG2;
            case 6:
                tzx tzxVar10 = this.d;
                Object objA3 = this.b.a();
                final kgw kgwVar3 = (kgw) tzxVar10.a();
                nms nmsVar3 = (nms) this.g.a();
                final nkw nkwVar3 = (nkw) this.k.a();
                final hbj hbjVar7 = (hbj) this.h.a();
                tzx tzxVar11 = this.j;
                final rwc rwcVarB3 = ((ixr) this.a).b();
                final boolean zBooleanValue3 = ((Boolean) tzxVar11.a()).booleanValue();
                final lbb lbbVar5 = (lbb) this.i.a();
                tzx tzxVar12 = this.e;
                final lcs lcsVarB3 = ((lct) this.f).a();
                final ldd lddVar3 = (ldd) tzxVar12.a();
                final peg pegVar3 = (peg) this.c.a();
                final pjo pjoVarH = nmsVar3.h();
                lcz lczVar5 = lcz.RAW_WIDE_RM;
                Object sfmVar = !lcsVarB3.b(lczVar5, pjoVarH) ? sfd.a : new sfm(qpt.bZ(lczVar5, new uem() { // from class: lcg
                    @Override // defpackage.uem, defpackage.uel
                    public final Object a() {
                        kgw kgwVar4 = kgwVar3;
                        boolean z6 = false;
                        if (kgwVar4.M() && kgwVar4.D()) {
                            z6 = true;
                        }
                        ldd lddVar4 = lddVar3;
                        peg pegVar4 = pegVar3;
                        lbb lbbVar6 = lbbVar5;
                        boolean z7 = zBooleanValue3;
                        rwc rwcVar13 = rwcVarB3;
                        hbj hbjVar8 = hbjVar7;
                        nkw nkwVar4 = nkwVar3;
                        lcs lcsVar = lcsVarB3;
                        pjo pjoVar = pjoVarH;
                        a.I(z6);
                        pjoVar.getClass();
                        pjoVar.s();
                        return lcl.b(pjoVar, lcsVar, nkwVar4, hbjVar8, rwcVar13, false, false, z7, lbbVar6, pegVar4, lddVar4, lcz.RAW_WIDE_RM);
                    }
                }));
                sfmVar.getClass();
                return sfmVar;
            case 7:
                tzx tzxVar13 = this.d;
                tzx tzxVar14 = this.k;
                Object objA4 = tzxVar13.a();
                kgw kgwVar4 = (kgw) tzxVar14.a();
                nms nmsVar4 = (nms) this.j.a();
                rwc rwcVarB4 = ((ixr) this.a).b();
                jho jhoVar = (jho) this.g.a();
                lbb lbbVar6 = (lbb) this.h.a();
                peg pegVar4 = (peg) this.b.a();
                lcs lcsVarB4 = ((lct) this.f).a();
                ldd lddVar4 = (ldd) this.c.a();
                boolean zBooleanValue4 = ((Boolean) this.e.a()).booleanValue();
                nkw nkwVar4 = (nkw) this.i.a();
                lcz lczVar6 = lcz.RAW_WIDE;
                if (!lcsVarB4.b(lczVar6, kgwVar4)) {
                    return rvk.a;
                }
                a.I(kgwVar4.M() && kgwVar4.D());
                lcc lccVar = new lcc();
                pjo pjoVarG = nmsVar4.g();
                pjoVarG.j();
                pjoVarG.s();
                nkw nkwVar5 = nkw.UNINITIALIZED;
                if (lczVar6.ordinal() != 3) {
                    throw new IllegalArgumentException("Unsupported stream: ".concat(String.valueOf(String.valueOf(lczVar6))));
                }
                if (zBooleanValue4 && (!jhoVar.d || !jhoVar.d(true, nkwVar4))) {
                    z = true;
                }
                pko pkoVarC = lbbVar6.c(lczVar6, pjoVarG, z);
                lccVar.c = lcsVarB4.a(pkoVarC);
                lccVar.a = pjoVarG.j();
                lccVar.b = pkoVarC;
                lccVar.d = true;
                lccVar.f = (Long) rwcVarB4.f();
                lccVar.h = z;
                lccVar.g = !z;
                lccVar.l = pegVar4;
                lccVar.k = lddVar4.b(lczVar6);
                return rwc.j(lccVar.a());
            case 8:
                return new ldr(((hxw) this.g).a(), (rwc) this.i.a(), tzs.b(this.h), (Executor) this.d.a(), (iso) this.f.a(), ((igk) this.b).a(), (iey) this.k.a(), tzs.b(this.a), (hbj) this.c.a(), ((tgr) this.j).a(), (ibj) this.e.a());
            case 9:
                lge lgeVar = (lge) this.j.a();
                lgo lgoVar = (lgo) this.e.a();
                kjc kjcVar = new kjc(1);
                Executor executor = (Executor) this.g.a();
                tzx tzxVar15 = this.i;
                Context contextB = ((imm) this.k).b();
                ((ihz) tzxVar15).a();
                return new lgb(lgeVar, lgoVar, kjcVar, executor, contextB, (hbj) this.b.a(), (luj) this.f.a(), (hyd) this.h.a(), (Gcam) this.c.a(), (mhq) this.a.a(), this.d);
            case 10:
                return new lka((owq) this.e.a(), (owq) this.f.a(), (owf) this.a.a(), ((imm) this.k).b(), (out) this.j.a(), (hbj) this.b.a(), ((lkh) this.i).a(), (sbv) this.g.a(), (owf) this.c.a(), (owq) this.h.a(), (mwq) this.d.a());
            case 11:
                mck mckVar = (mck) this.g.a();
                boolean zBooleanValue5 = ((koh) this.c).b().booleanValue();
                lup lupVar = (lup) this.j.a();
                tzx tzxVar16 = this.i;
                Executor executorB = ((fry) this.h).b();
                luj lujVar2 = (luj) tzxVar16.a();
                luw luwVar = (luw) this.a.a();
                glu gluVar = (glu) this.d.a();
                tzx tzxVar17 = this.b;
                mwq mwqVarB = ((mcb) this.f).a();
                hbj hbjVar8 = (hbj) tzxVar17.a();
                return new mcn(hbjVar8, (owf) this.k.a(), mckVar, zBooleanValue5, true, lupVar, ltv.a(((Integer) luf.Y.d(hbjVar8)).intValue()), lujVar2, luwVar, gluVar, executorB, mwqVarB, (owf) this.e.a());
            case 12:
                return new mis((gnt) this.d.a(), (owq) this.c.a(), ((ize) this.g).a(), (pbn) this.f.a(), (gfq) this.j.a(), (juh) this.k.a(), (ipq) this.i.a(), (nrc) this.a.a(), (muu) this.h.a(), (owf) this.e.a(), (hbj) this.b.a());
            case 13:
                return new mrm((owq) this.k.a(), (fvu) this.d.a(), (ndj) this.f.a(), ((imo) this.a).a(), (mts) this.c.a(), (pfl) this.g.a(), (krj) this.e.a(), (mzz) this.i.a(), (mte) this.b.a(), (jjn) this.h.a(), (mqb) this.j.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new myl(((imm) this.c).b(), (luj) this.i.a(), (luj) this.j.a(), ((myh) this.d).a(), (out) this.e.a(), (Executor) this.h.a(), ((ixw) this.k).a(), (mgr) this.g.a(), this.a, (pbn) this.f.a(), (mwq) this.b.a());
            case 15:
                return new nmg((nmm) this.d.a(), ((imm) this.k).b(), (imi) this.e.a(), (luj) this.g.a(), (luj) this.f.a(), ((nmz) this.i).a(), (mdy) this.a.a(), (lsp) this.j.a(), hmp.b(), (out) this.h.a(), ((hef) this.c).b().booleanValue(), ((hef) this.b).b().booleanValue());
            case 16:
                return new pgs((qrh) this.b.a(), (pez) this.d.a(), (pgn) this.g.a(), (pgq) this.f.a(), (pfr) this.c.a(), (pit) this.h.a(), (our) this.i.a(), (pbn) this.a.a(), ((pba) this.j).a(), (pmv) this.k.a(), (pit) this.e.a());
            case 17:
                tzx tzxVar18 = this.e;
                return new qsg(((qqr) this.g).a(), ((imm) this.h).b(), (Executor) tzxVar18.a(), ((qse) this.c).a(), this.a, tzs.b(this.b), (qoa) this.j.a(), (rcg) this.f.a(), this.k, this.d, this.i);
            default:
                tzx tzxVar19 = this.d;
                qqq qqqVarB = ((qqr) this.g).a();
                ((imm) this.c).b();
                return new qtu(qqqVarB, (qtp) this.j.a(), (syx) this.i.a(), tzs.b(this.b), (qtx) this.k.a(), (qnl) this.a.a(), this.f, (Executor) this.h.a(), (rwc) ((tzu) this.e).a);
        }
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, byte[] bArr) {
        this.l = i;
        this.i = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.j = tzxVar5;
        this.c = tzxVar6;
        this.f = tzxVar7;
        this.g = tzxVar8;
        this.h = tzxVar9;
        this.k = tzxVar10;
        this.d = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, char[] cArr) {
        this.l = i;
        this.h = tzxVar;
        this.d = tzxVar2;
        this.e = tzxVar3;
        this.f = tzxVar4;
        this.g = tzxVar5;
        this.c = tzxVar6;
        this.a = tzxVar7;
        this.b = tzxVar8;
        this.j = tzxVar9;
        this.i = tzxVar10;
        this.k = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, float[] fArr) {
        this.l = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.g = tzxVar3;
        this.k = tzxVar4;
        this.h = tzxVar5;
        this.a = tzxVar6;
        this.j = tzxVar7;
        this.i = tzxVar8;
        this.f = tzxVar9;
        this.e = tzxVar10;
        this.c = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, int[] iArr) {
        this.l = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.g = tzxVar3;
        this.k = tzxVar4;
        this.a = tzxVar5;
        this.h = tzxVar6;
        this.j = tzxVar7;
        this.i = tzxVar8;
        this.c = tzxVar9;
        this.e = tzxVar10;
        this.f = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, short[] sArr) {
        this.l = i;
        this.c = tzxVar;
        this.f = tzxVar2;
        this.a = tzxVar3;
        this.j = tzxVar4;
        this.g = tzxVar5;
        this.d = tzxVar6;
        this.i = tzxVar7;
        this.e = tzxVar8;
        this.h = tzxVar9;
        this.b = tzxVar10;
        this.k = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, byte[][] bArr) {
        this.l = i;
        this.d = tzxVar;
        this.k = tzxVar2;
        this.j = tzxVar3;
        this.a = tzxVar4;
        this.g = tzxVar5;
        this.h = tzxVar6;
        this.b = tzxVar7;
        this.f = tzxVar8;
        this.c = tzxVar9;
        this.e = tzxVar10;
        this.i = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, char[][] cArr) {
        this.l = i;
        this.g = tzxVar;
        this.i = tzxVar2;
        this.h = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.b = tzxVar6;
        this.k = tzxVar7;
        this.a = tzxVar8;
        this.c = tzxVar9;
        this.j = tzxVar10;
        this.e = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, float[][] fArr) {
        this.l = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.g = tzxVar3;
        this.f = tzxVar4;
        this.j = tzxVar5;
        this.k = tzxVar6;
        this.i = tzxVar7;
        this.a = tzxVar8;
        this.h = tzxVar9;
        this.e = tzxVar10;
        this.b = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, int[][] iArr) {
        this.l = i;
        this.e = tzxVar;
        this.f = tzxVar2;
        this.a = tzxVar3;
        this.k = tzxVar4;
        this.j = tzxVar5;
        this.b = tzxVar6;
        this.i = tzxVar7;
        this.g = tzxVar8;
        this.c = tzxVar9;
        this.h = tzxVar10;
        this.d = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, short[][] sArr) {
        this.l = i;
        this.j = tzxVar;
        this.e = tzxVar2;
        this.g = tzxVar3;
        this.k = tzxVar4;
        this.i = tzxVar5;
        this.b = tzxVar6;
        this.f = tzxVar7;
        this.h = tzxVar8;
        this.c = tzxVar9;
        this.a = tzxVar10;
        this.d = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, boolean[][] zArr) {
        this.l = i;
        this.g = tzxVar;
        this.c = tzxVar2;
        this.j = tzxVar3;
        this.h = tzxVar4;
        this.i = tzxVar5;
        this.a = tzxVar6;
        this.d = tzxVar7;
        this.f = tzxVar8;
        this.b = tzxVar9;
        this.k = tzxVar10;
        this.e = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, byte[][][] bArr) {
        this.l = i;
        this.k = tzxVar;
        this.d = tzxVar2;
        this.f = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
        this.g = tzxVar6;
        this.e = tzxVar7;
        this.i = tzxVar8;
        this.b = tzxVar9;
        this.h = tzxVar10;
        this.j = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, char[][][] cArr) {
        this.l = i;
        this.c = tzxVar;
        this.i = tzxVar2;
        this.j = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.h = tzxVar6;
        this.k = tzxVar7;
        this.g = tzxVar8;
        this.a = tzxVar9;
        this.f = tzxVar10;
        this.b = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, float[][][] fArr) {
        this.l = i;
        this.g = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.j = tzxVar4;
        this.i = tzxVar5;
        this.b = tzxVar6;
        this.k = tzxVar7;
        this.a = tzxVar8;
        this.f = tzxVar9;
        this.h = tzxVar10;
        this.e = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, int[][][] iArr) {
        this.l = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.g = tzxVar3;
        this.f = tzxVar4;
        this.c = tzxVar5;
        this.h = tzxVar6;
        this.i = tzxVar7;
        this.a = tzxVar8;
        this.j = tzxVar9;
        this.k = tzxVar10;
        this.e = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, short[][][] sArr) {
        this.l = i;
        this.d = tzxVar;
        this.k = tzxVar2;
        this.e = tzxVar3;
        this.g = tzxVar4;
        this.f = tzxVar5;
        this.i = tzxVar6;
        this.a = tzxVar7;
        this.j = tzxVar8;
        this.h = tzxVar9;
        this.c = tzxVar10;
        this.b = tzxVar11;
    }

    public ktc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, boolean[][][] zArr) {
        this.l = i;
        this.g = tzxVar;
        this.h = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
        this.b = tzxVar6;
        this.j = tzxVar7;
        this.f = tzxVar8;
        this.k = tzxVar9;
        this.d = tzxVar10;
        this.i = tzxVar11;
    }
}
