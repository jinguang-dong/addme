package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.wear.compose.material3.ScrollAwayModifierElement;
import com.google.android.apps.camera.wear.wearappv2.ui.countdown.WearCountdownView;
import com.google.android.apps.camera.wear.wearappv2.ui.settings.ComposeMenuButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asu implements uiu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public asu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v9, types: [atr, java.lang.Object] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        bik bikVarT = null;
        switch (this.b) {
            case 0:
                ayc aycVar = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
                    aycVar.r();
                } else {
                    bik bikVarA = amd.a(bik.c, 56.0f, 56.0f);
                    ?? r0 = this.a;
                    bsr bsrVarC = aku.c(bib.j, false);
                    int iM = bay.M(aycVar);
                    bfk bfkVarM = aycVar.M();
                    bik bikVarV = bay.v(aycVar, bikVarA);
                    uif uifVar = bum.a;
                    aycVar.L();
                    aycVar.v();
                    if (aycVar.F()) {
                        aycVar.j(uifVar);
                    } else {
                        aycVar.x();
                    }
                    bbr.a(aycVar, bsrVarC, bum.d);
                    bbr.a(aycVar, bfkVarM, bum.c);
                    uiu uiuVar = bum.e;
                    if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iM))) {
                        Integer numValueOf = Integer.valueOf(iM);
                        aycVar.w(numValueOf);
                        aycVar.h(numValueOf, uiuVar);
                    }
                    bbr.a(aycVar, bikVarV, bum.b);
                    r0.a(aycVar, 0);
                    aycVar.m();
                }
                break;
            case 1:
                ayc aycVar2 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar2.G()) {
                    aycVar2.r();
                } else {
                    bik bikVarAM = byi.aM(bik.c, 20.0f, 0.0f, 20.0f, 0.0f, 10);
                    ?? r02 = this.a;
                    bsr bsrVarA = ama.a(akq.a, bib.b, aycVar2, 48);
                    int iM2 = bay.M(aycVar2);
                    bfk bfkVarM2 = aycVar2.M();
                    bik bikVarV2 = bay.v(aycVar2, bikVarAM);
                    uif uifVar2 = bum.a;
                    aycVar2.L();
                    aycVar2.v();
                    if (aycVar2.F()) {
                        aycVar2.j(uifVar2);
                    } else {
                        aycVar2.x();
                    }
                    bbr.a(aycVar2, bsrVarA, bum.d);
                    bbr.a(aycVar2, bfkVarM2, bum.c);
                    uiu uiuVar2 = bum.e;
                    if (aycVar2.F() || !a.ao(aycVar2.f(), Integer.valueOf(iM2))) {
                        Integer numValueOf2 = Integer.valueOf(iM2);
                        aycVar2.w(numValueOf2);
                        aycVar2.h(numValueOf2, uiuVar2);
                    }
                    bbr.a(aycVar2, bikVarV2, bum.b);
                    aycVar2.u(185708299);
                    aycVar2.n();
                    r02.a(aycVar2, 0);
                    aycVar2.m();
                }
                break;
            case 2:
                ayc aycVar3 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar3.G()) {
                    aycVar3.r();
                } else {
                    auv.a(e.n(aycVar3).b, bdq.k(-1686273317, new asu(this.a, 0), aycVar3), aycVar3, 48);
                }
                break;
            case 3:
                ayc aycVar4 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar4.G()) {
                    aycVar4.r();
                } else {
                    auv.b(this.a.b(), null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, aycVar4, 0, 0, 131070);
                }
                break;
            case 4:
                ayc aycVar5 = (ayc) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (aycVar5.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    Object obj3 = this.a;
                    uev uevVarF = ((tdy) obj3).f();
                    dqj dqjVar = (dqj) uevVarF.a;
                    uiu uiuVar3 = (uiu) uevVarF.b;
                    dkf dkfVar = dqjVar != null ? (dkf) dqjVar.b.a() : null;
                    if (dkfVar == null) {
                        aycVar5.u(412833616);
                    } else {
                        aycVar5.u(412833617);
                        FillElement fillElement = amd.b;
                        boolean zB = aycVar5.B(obj3);
                        Object objF = aycVar5.f();
                        if (zB || objF == ayb.a) {
                            objF = new dlc(obj3, 11);
                            aycVar5.w(objF);
                        }
                        bikVarT = bay.t(fillElement, new ScrollAwayModifierElement(dkfVar, (uif) objF));
                    }
                    aycVar5.n();
                    if (bikVarT == null) {
                        bikVarT = bik.c;
                    }
                    bsr bsrVarC2 = aku.c(bib.f, false);
                    int iM3 = bay.M(aycVar5);
                    bfk bfkVarM3 = aycVar5.M();
                    bik bikVarV3 = bay.v(aycVar5, bikVarT);
                    uif uifVar3 = bum.a;
                    aycVar5.L();
                    aycVar5.v();
                    if (aycVar5.F()) {
                        aycVar5.j(uifVar3);
                    } else {
                        aycVar5.x();
                    }
                    bbr.a(aycVar5, bsrVarC2, bum.d);
                    bbr.a(aycVar5, bfkVarM3, bum.c);
                    uiu uiuVar4 = bum.e;
                    if (aycVar5.F() || !a.ao(aycVar5.f(), Integer.valueOf(iM3))) {
                        Integer numValueOf3 = Integer.valueOf(iM3);
                        aycVar5.w(numValueOf3);
                        aycVar5.h(numValueOf3, uiuVar4);
                    }
                    bbr.a(aycVar5, bikVarV3, bum.b);
                    uiuVar3.a(aycVar5, 0);
                    aycVar5.m();
                } else {
                    aycVar5.r();
                }
                break;
            case 5:
                ayc aycVar6 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar6.G()) {
                    aycVar6.r();
                } else {
                    this.a.a(aycVar6, 0);
                }
                break;
            case 6:
                ayc aycVar7 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar7.G()) {
                    aycVar7.r();
                } else {
                    WearCountdownView wearCountdownView = (WearCountdownView) this.a;
                    wearCountdownView.f(wearCountdownView.a, aycVar7, 0);
                }
                break;
            case 7:
                ayc aycVar8 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar8.G()) {
                    aycVar8.r();
                } else {
                    ComposeMenuButton composeMenuButton = (ComposeMenuButton) this.a;
                    composeMenuButton.e(composeMenuButton.b, aycVar8, 0);
                }
                break;
            case 8:
                ayc aycVar9 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar9.G()) {
                    aycVar9.r();
                } else {
                    nrx nrxVar = ((nrs) this.a).ah;
                    if (nrxVar == null) {
                        ujp.c("viewModel");
                        nrxVar = null;
                    }
                    jsv.u(nrxVar, nsk.a, null, aycVar9, 48);
                }
                break;
            case 9:
                ayc aycVar10 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar10.G()) {
                    aycVar10.r();
                } else {
                    ((nrs) this.a).B(aycVar10, 0);
                }
                break;
            case 10:
                ayc aycVar11 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar11.G()) {
                    aycVar11.r();
                } else {
                    nrv nrvVar = (nrv) this.a;
                    nrx nrxVar2 = nrvVar.aj;
                    if (nrxVar2 == null) {
                        ujp.c("viewModel");
                        nrxVar2 = null;
                    }
                    jsv.u(nrxVar2, nrvVar.ag, null, aycVar11, 0);
                }
                break;
            default:
                ayc aycVar12 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar12.G()) {
                    aycVar12.r();
                } else {
                    ((nrv) this.a).B(aycVar12, 0);
                }
                break;
        }
        return ufg.a;
    }
}
