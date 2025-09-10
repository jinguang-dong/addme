package defpackage;

import androidx.wear.ambient.AmbientDelegate;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahq extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(ags agsVar, uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = agsVar;
        this.b = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((ahq) c((rnu) obj, (uhb) obj2)).b(ufg.a);
            case 1:
                return ((ahq) c((aim) obj, (uhb) obj2)).b(ufg.a);
            case 2:
                return ((ahq) c((rnu) obj, (uhb) obj2)).b(ufg.a);
            case 3:
                return ((ahq) c((aim) obj, (uhb) obj2)).b(ufg.a);
            case 4:
                return ((ahq) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 5:
                return ((ahq) c((bqr) obj, (uhb) obj2)).b(ufg.a);
            case 6:
                return ((ahq) c((und) obj, (uhb) obj2)).b(ufg.a);
            default:
                return ((ahq) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, und] */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.view.ScrollFeedbackProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, ura] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ajd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, und] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, uiu] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        dno dnoVar;
        Object objA;
        Object objAM;
        int i = 4;
        int i2 = 3;
        switch (this.e) {
            case 0:
                uhi uhiVar = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    rnu rnuVar = (rnu) this.d;
                    ?? r3 = this.b;
                    aff affVar = new aff(rnuVar, this.c, i2);
                    this.a = 1;
                    if (r3.a(affVar, this) == uhiVar) {
                        return uhiVar;
                    }
                }
                return ufg.a;
            case 1:
                uhi uhiVar2 = uhi.a;
                try {
                    if (this.a != 0) {
                        rnt.aN(obj);
                    } else {
                        rnt.aN(obj);
                        aim aimVar = (aim) this.d;
                        ((ags) this.c).c.b(true);
                        ?? r32 = this.b;
                        this.a = 1;
                        if (r32.a(aimVar, this) == uhiVar2) {
                            return uhiVar2;
                        }
                    }
                    ((ags) this.c).c.b(false);
                    return ufg.a;
                } catch (Throwable th) {
                    ((ags) this.c).c.b(false);
                    throw th;
                }
            case 2:
                uhi uhiVar3 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    rnu rnuVar2 = (rnu) this.d;
                    ?? r4 = this.b;
                    aff affVar2 = new aff(rnuVar2, this.c, i);
                    this.a = 1;
                    if (r4.a(affVar2, this) == uhiVar3) {
                        return uhiVar3;
                    }
                }
                return ufg.a;
            case 3:
                uhi uhiVar4 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    aim aimVar2 = (aim) this.d;
                    aji ajiVar = (aji) this.c;
                    ajiVar.i = aimVar2;
                    ?? r2 = this.b;
                    this.a = 1;
                    if (r2.a(ajiVar.l, this) == uhiVar4) {
                        return uhiVar4;
                    }
                }
                return ufg.a;
            case 4:
                uhi uhiVar5 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                    return obj;
                }
                rnt.aN(obj);
                und undVar = (und) this.d;
                umr umrVar = new umr();
                cru cruVar = (cru) this.c;
                dgz dgzVar = new dgz(this.b, umrVar, cruVar.g.q(), undVar.c());
                gno gnoVar = cruVar.f;
                Object objJ = gnoVar.b.j(dgzVar);
                if (objJ instanceof uqo) {
                    Throwable thB = uqq.b(objJ);
                    if (thB == null) {
                        throw new uqt("Channel was closed normally");
                    }
                    throw thB;
                }
                if (!uqq.c(objJ)) {
                    throw new IllegalStateException("Check failed.");
                }
                if (((AtomicInteger) ((pfl) gnoVar.d).a).getAndIncrement() == 0) {
                    ukc.C(gnoVar.a, null, 0, new csi(gnoVar, null), 3);
                }
                this.a = 1;
                Object objZ = umrVar.z(this);
                return objZ == uhiVar5 ? uhiVar5 : objZ;
            case 5:
                uhi uhiVar6 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    bqr bqrVar = (bqr) this.d;
                    float f = bqrVar.a;
                    uev uevVar = f == 0.0f ? new uev(aii.b, new Float(bqrVar.b)) : new uev(aii.a, new Float(f));
                    Object obj2 = uevVar.b;
                    aii aiiVar = (aii) uevVar.a;
                    float fFloatValue = ((Number) obj2).floatValue();
                    dnq dnqVar = (dnq) this.c;
                    dnqVar.d.a = aiiVar;
                    ?? r10 = this.b;
                    long j = bqrVar.c;
                    int i3 = bqrVar.d;
                    dnj dnjVar = dnqVar.c;
                    this.a = 1;
                    long j2 = dnjVar.a;
                    long j3 = j - j2;
                    if (j2 == -1 || j3 > 200) {
                        dnjVar.a();
                        dno dnoVar2 = dnjVar.e;
                        if (dnoVar2 != null) {
                            dnoVar2.a();
                        }
                        dnjVar.e = (dno) dnjVar.c.a(Integer.valueOf(i3), Long.valueOf(j));
                    } else if ((dnjVar.b || dnjVar.d * fFloatValue >= 0.0f || Math.abs(fFloatValue) >= Math.abs(dnjVar.d)) && (dnoVar = dnjVar.e) != null) {
                        ((bqn) dnoVar.g.a).c(j, fFloatValue);
                        dnoVar.d = j;
                    }
                    dnjVar.d += fFloatValue;
                    ebn ebnVar = dnjVar.h;
                    ?? r7 = ebnVar.b;
                    if ((fFloatValue <= 0.0f || r7.d()) && (fFloatValue >= 0.0f || r7.c())) {
                        ebnVar.a.onScrollProgress(i3, 4194304, 26, ukj.x(fFloatValue));
                    } else {
                        ebnVar.f(r7.c(), i3);
                    }
                    dnjVar.a = j;
                    dnt dntVar = dnjVar.f;
                    float f2 = dnjVar.d;
                    AmbientDelegate ambientDelegate = dnjVar.g;
                    dntVar.a();
                    dntVar.e = ukc.A(r10, null, new dns(dntVar, f2, ambientDelegate, (uhb) null, 0), 3);
                    dno dnoVar3 = dnjVar.e;
                    if (dnoVar3 != null) {
                        dlc dlcVar = new dlc(dnjVar, i);
                        AmbientDelegate ambientDelegate2 = dnjVar.g;
                        bgx bgxVar = new bgx(dnjVar, i3, i2);
                        dnoVar3.a();
                        dnoVar3.b = ukc.C(r10, null, 0, new dnl(dnoVar3, dlcVar, ambientDelegate2, bgxVar, (uhb) null, 0), 3);
                    }
                    if (ufg.a == uhiVar6) {
                        return uhiVar6;
                    }
                }
                return ufg.a;
            case 6:
                uhi uhiVar7 = uhi.a;
                try {
                    if (this.a != 0) {
                        rnt.aN(obj);
                        objA = obj;
                    } else {
                        rnt.aN(obj);
                        und undVar2 = (und) this.d;
                        ?? r33 = this.b;
                        this.a = 1;
                        objA = r33.a(undVar2, this);
                        if (objA == uhiVar7) {
                            return uhiVar7;
                        }
                    }
                    ((civ) this.c).c(objA);
                } catch (CancellationException unused) {
                    civ civVar = (civ) this.c;
                    civVar.d = true;
                    ciz cizVar = civVar.b;
                    if (cizVar != null && cizVar.b.cancel(true)) {
                        civVar.b();
                    }
                } catch (Throwable th2) {
                    ((civ) this.c).d(th2);
                }
                return ufg.a;
            default:
                uhi uhiVar8 = uhi.a;
                try {
                    if (this.a != 0) {
                        rnt.aN(obj);
                    } else {
                        rnt.aN(obj);
                        ?? r22 = this.b;
                        Object obj3 = this.c;
                        this.a = 1;
                        if (r22.h(obj3, this) == uhiVar8) {
                            return uhiVar8;
                        }
                    }
                    objAM = ufg.a;
                } catch (Throwable th3) {
                    objAM = rnt.aM(th3);
                }
                return new uqq(uex.b(objAM) ? ufg.a : new uqo(uex.a(objAM)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, ura] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, und] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        switch (this.e) {
            case 0:
                ahq ahqVar = new ahq((uiu) this.b, (ahs) this.c, uhbVar, 0);
                ahqVar.d = obj;
                return ahqVar;
            case 1:
                ahq ahqVar2 = new ahq((ags) this.c, (uiu) this.b, uhbVar, 1);
                ahqVar2.d = obj;
                return ahqVar2;
            case 2:
                ahq ahqVar3 = new ahq((uiu) this.b, (aji) this.c, uhbVar, 2);
                ahqVar3.d = obj;
                return ahqVar3;
            case 3:
                ahq ahqVar4 = new ahq((aji) this.c, (uiu) this.b, uhbVar, 3);
                ahqVar4.d = obj;
                return ahqVar4;
            case 4:
                ahq ahqVar5 = new ahq((cru) this.c, (uiu) this.b, uhbVar, 4);
                ahqVar5.d = obj;
                return ahqVar5;
            case 5:
                ahq ahqVar6 = new ahq((dnq) this.c, (und) this.b, uhbVar, 5);
                ahqVar6.d = obj;
                return ahqVar6;
            case 6:
                ahq ahqVar7 = new ahq((uiu) this.b, (civ) this.c, uhbVar, 6);
                ahqVar7.d = obj;
                return ahqVar7;
            default:
                ahq ahqVar8 = new ahq((ura) this.b, this.c, uhbVar, 7);
                ahqVar8.d = obj;
                return ahqVar8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(aji ajiVar, uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = ajiVar;
        this.b = uiuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(cru cruVar, uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = cruVar;
        this.b = uiuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(dnq dnqVar, und undVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = dnqVar;
        this.b = undVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(uiu uiuVar, ahs ahsVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = uiuVar;
        this.c = ahsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(uiu uiuVar, aji ajiVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = uiuVar;
        this.c = ajiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(uiu uiuVar, civ civVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = uiuVar;
        this.c = civVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(ura uraVar, Object obj, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = uraVar;
        this.c = obj;
    }
}
