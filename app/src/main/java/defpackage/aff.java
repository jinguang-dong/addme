package defpackage;

import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aff implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aff(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56, types: [bfs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r11v2, types: [ocq] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v65, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v68, types: [bfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v69, types: [aim, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [akb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v27, types: [blm] */
    /* JADX WARN: Type inference failed for: r12v55, types: [androidx.wear.ambient.AmbientDelegate] */
    /* JADX WARN: Type inference failed for: r1v14, types: [bry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [ami, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r8v0, types: [cdh] */
    /* JADX WARN: Type inference failed for: r8v1, types: [blp] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aqo] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        cdl cdlVarA;
        ccl cclVarD;
        bkn bknVarK;
        int i = 0;
        Throwable th = null;
        Object obj2 = null;
        switch (this.c) {
            case 0:
                ((ocq) this.b).aF(this.a);
                return ufg.a;
            case 1:
                abx abxVar = (abx) obj;
                this.b.a(abxVar.a(), ((byz) this.a).b.a(abxVar.d));
                return ufg.a;
            case 2:
                ((bdp) ((ocq) this.a).a).m(this.b);
                return ufg.a;
            case 3:
                long jB = bkf.b(((agu) obj).a, 1.0f);
                aii aiiVar = ((ahs) this.b).h;
                uiv uivVar = ahp.a;
                ((rnu) this.a).p(Float.intBitsToFloat((int) (aiiVar == aii.a ? jB & 4294967295L : jB >> 32)));
                return ufg.a;
            case 4:
                ((rnu) this.a).n(((aji) this.b).e(((agu) obj).a), 1);
                return ufg.a;
            case 5:
                ((Long) obj).longValue();
                ajs ajsVar = (ajs) this.a;
                float f = ajsVar.e;
                ajsVar.e = 0.0f;
                this.b.a(Float.valueOf(f));
                return ufg.a;
            case 6:
                cdl cdlVar = (cdl) obj;
                Object obj3 = this.a;
                if (obj3 != null) {
                    ((aqp) obj3).a.b(cdlVar);
                }
                ?? r11 = this.b;
                if (r11 != 0) {
                    r11.a(cdlVar);
                }
                return ufg.a;
            case 7:
                btd btdVar = (btd) obj;
                List listZ = bay.Z(this.b, ((aql) this.a).a);
                if (listZ != null) {
                    int size = listZ.size();
                    while (i < size) {
                        uev uevVar = (uev) listZ.get(i);
                        bte bteVar = (bte) uevVar.a;
                        uif uifVar = (uif) uevVar.b;
                        btdVar.r(bteVar, uifVar != null ? ((chy) uifVar.a()).a : 0L);
                        i++;
                    }
                }
                return ufg.a;
            case 8:
                ?? r12 = (blm) obj;
                Object obj4 = this.a;
                if (!((Boolean) new aei(obj4, 13).a()).booleanValue() || (cdlVarA = ((aqp) obj4).a()) == null || (cclVarD = aqp.d((ccl) this.b, cdlVarA)) == null) {
                    bknVarK = null;
                } else {
                    int i2 = cclVarD.b;
                    int i3 = cclVarD.c;
                    bknVarK = cdlVarA.k(i2, i3);
                    bkg bkgVarF = cdlVarA.f(i2);
                    bknVarK.n(((Float.floatToRawIntBits(cdlVarA.c(i2) == cdlVarA.c(i3 - 1) ? Math.min(cdlVarA.f(r11).b, bkgVarF.b) : 0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(bkgVarF.c))) ^ (-9223372034707292160L));
                }
                aqoVar = bknVarK != null ? new aqo(bknVarK) : 0;
                if (aqoVar != 0) {
                    r12.v(aqoVar);
                    r12.p(true);
                }
                return ufg.a;
            case 9:
                Object obj5 = this.a;
                bgz bgzVar = ((aqp) obj5).c;
                Object obj6 = this.b;
                bgzVar.add(obj6);
                return new dna(obj5, obj6, 1);
            case 10:
                cpq cpqVar = (cpq) obj;
                ccl cclVar = (ccl) this.b;
                ccu ccuVar = (ccu) cclVar.a;
                ccuVar.a();
                ebn ebnVar = (ebn) this.a;
                if (ebnVar.o()) {
                    ccuVar.a();
                }
                if (ebnVar.p()) {
                    ccuVar.a();
                }
                if (ebnVar.q()) {
                    ccuVar.a();
                }
                ujw ujwVar = new ujw();
                Object obj7 = cpqVar.a;
                ahg ahgVar = new ahg(ujwVar, cclVar, (cdh) aqoVar, 2);
                cck cckVar = new cck((ccm) obj7);
                List list = cckVar.a;
                int size2 = list.size();
                while (i < size2) {
                    list.set(i, bqs.u((ccl) ahgVar.a(((ccj) list.get(i)).a(Integer.MIN_VALUE))));
                    i++;
                }
                cpqVar.b = cckVar.a();
                return ufg.a;
            case 11:
                ?? r0 = this.a;
                btd btdVar2 = (btd) obj;
                if (r0 != 0) {
                    int size3 = r0.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        uev uevVar2 = (uev) r0.get(i4);
                        btdVar2.r((bte) uevVar2.a, ((chy) uevVar2.b).a);
                    }
                }
                ?? r112 = this.b;
                if (r112 != 0) {
                    int size4 = r112.size();
                    while (i < size4) {
                        uev uevVar3 = (uev) r112.get(i);
                        bte bteVar2 = (bte) uevVar3.a;
                        uif uifVar2 = (uif) uevVar3.b;
                        btdVar2.r(bteVar2, uifVar2 != null ? ((chy) uifVar2.a()).a : 0L);
                        i++;
                    }
                }
                return ufg.a;
            case 12:
                bpv bpvVar = (bpv) obj;
                long j = bpvVar.c;
                aqy aqyVar = (aqy) this.a;
                ?? A = aqyVar.a.a();
                if (A != 0) {
                    arn arnVar = aqyVar.b;
                    long j2 = aqyVar.c;
                    if (A.dm() && aro.a(arnVar, j2)) {
                        arnVar.f();
                        Object obj8 = this.b;
                        bpvVar.b();
                        ((ujw) obj8).a = true;
                    }
                } else {
                    Object obj82 = this.b;
                    bpvVar.b();
                    ((ujw) obj82).a = true;
                }
                return ufg.a;
            case 13:
                ((asz) this.b).a.b(new alj(this.a, (ami) obj));
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                abr abrVar = (abr) obj;
                float fFloatValue = ((Number) abrVar.d()).floatValue();
                ujx ujxVar = (ujx) this.b;
                ((rnu) this.a).p(fFloatValue - ujxVar.a);
                ujxVar.a = ((Number) abrVar.d()).floatValue();
                return ufg.a;
            case 15:
                Object obj9 = this.b;
                Object obj10 = this.a;
                Throwable th2 = (Throwable) obj;
                synchronized (((bao) obj10).c) {
                    if (obj9 == null) {
                        ((bao) obj10).e = (Throwable) obj2;
                        ((bao) obj10).l.e(bak.a);
                    } else {
                        if (th2 != null) {
                            if (true != (th2 instanceof CancellationException)) {
                                th = th2;
                            }
                            if (th != null) {
                                ujk.f((Throwable) obj9, th);
                            }
                        }
                        obj2 = obj9;
                        ((bao) obj10).e = (Throwable) obj2;
                        ((bao) obj10).l.e(bak.a);
                    }
                }
                return ufg.a;
            case 16:
                dkb dkbVar = (dkb) obj;
                List list2 = dkb.a;
                ((ujw) this.a).a = true;
                if (!dkbVar.e) {
                    return bxc.b;
                }
                ((uka) this.b).a = dkbVar.d();
                return bxc.c;
            case 17:
                dkz dkzVarH = ((dlh) this.b).h();
                ?? r113 = this.a;
                if (!AmbientLifecycleObserverKt.f(r113) && (dkzVarH instanceof dkm) && ((dkm) dkzVarH).d) {
                    r113.b(true);
                }
                return ufg.a;
            case 18:
                Object obj11 = this.a;
                zw zwVar = ((dnb) obj11).a;
                Object obj12 = this.b;
                zwVar.e(obj12);
                return new dna(obj11, obj12, 0);
            case 19:
                return new dnb(this.b, (Map) obj, this.a);
            default:
                long j3 = ((bkf) obj).a;
                ?? r122 = (AmbientDelegate) this.b;
                return new bkf(r122.j(this.a, j3, (bpb) r122.c));
        }
    }

    public /* synthetic */ aff(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
