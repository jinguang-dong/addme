package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxm implements pau {
    final /* synthetic */ fqf a;
    private boolean b = true;
    private final /* synthetic */ int c;

    public jxm(fqf fqfVar, int i) {
        this.c = i;
        this.a = fqfVar;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        int i = this.c;
        boolean z = true;
        if (i == 0) {
            fqf fqfVar = this.a;
            synchronized (((jxp) fqfVar).h) {
                if (this.b) {
                    this.b = false;
                    return;
                }
                lty ltyVar = (lty) ((jxp) fqfVar).k.dL();
                lty ltyVar2 = lty.RES_4320P;
                boolean z2 = ltyVar.equals(ltyVar2) && !((jxp) fqfVar).m.equals(ltyVar2);
                if (ltyVar.equals(ltyVar2) || !((jxp) fqfVar).m.equals(ltyVar2)) {
                    z = false;
                }
                if (z2 || z) {
                    ((jxp) fqfVar).G(gnm.RESOLUTION_SWITCH);
                }
                ((jxp) fqfVar).m = ltyVar;
                return;
            }
        }
        if (i == 1) {
            fqf fqfVar2 = this.a;
            synchronized (((jue) fqfVar2).d) {
                if (this.b) {
                    this.b = false;
                    return;
                } else {
                    if (!((jue) fqfVar2).e) {
                        ((jue) fqfVar2).b(gnm.RESOLUTION_SWITCH);
                    }
                    return;
                }
            }
        }
        if (i == 2) {
            fqf fqfVar3 = this.a;
            jxp jxpVar = (jxp) fqfVar3;
            synchronized (jxpVar.h) {
                if (this.b) {
                    this.b = false;
                    return;
                }
                ggw ggwVarA = ((jxp) fqfVar3).b.a(nkw.VIDEO);
                if (ggwVarA instanceof ggt) {
                    ((jxp) fqfVar3).e.a((oxh) ggwVarA.dL());
                }
                if (!((jxp) fqfVar3).n) {
                    ((jxp) fqfVar3).G(gnm.RESOLUTION_SWITCH);
                }
                jxpVar.e();
                return;
            }
        }
        if (i == 3) {
            fqf fqfVar4 = this.a;
            synchronized (((jxp) fqfVar4).h) {
                if (this.b) {
                    this.b = false;
                    return;
                }
                ocq ocqVar = ((jxp) fqfVar4).w;
                if (ocqVar.ai("amethyst_edu") == 0) {
                    ((jxp) fqfVar4).j.a();
                    ocqVar.ak("amethyst_edu");
                }
                ((jxp) fqfVar4).G(gnm.AMETHYST);
                return;
            }
        }
        if (i == 4) {
            fqf fqfVar5 = this.a;
            synchronized (((jxp) fqfVar5).h) {
                if (this.b) {
                    this.b = false;
                    return;
                }
                if (((jxp) fqfVar5).g.i()) {
                    ghr ghrVar = ((jxp) fqfVar5).d;
                    ghrVar.c.a(gho.DEFAULT);
                    rwc rwcVar = ghrVar.b;
                    if (rwcVar.h()) {
                        ((gmt) rwcVar.c()).c();
                    }
                    ghrVar.e.set(true);
                    ((jxp) fqfVar5).G(gnm.SAPPHIRE);
                }
                return;
            }
        }
        if (i != 5) {
            fqf fqfVar6 = this.a;
            synchronized (((jxv) fqfVar6).d) {
                if (this.b) {
                    this.b = false;
                    return;
                } else {
                    ((jxv) fqfVar6).b(gnm.FPS_SWITCH);
                    return;
                }
            }
        }
        fqf fqfVar7 = this.a;
        synchronized (((jxv) fqfVar7).d) {
            if (this.b) {
                this.b = false;
                return;
            }
            lty ltyVar3 = (lty) ((jxv) fqfVar7).a.dL();
            lty ltyVar4 = lty.RES_4320P;
            boolean z3 = ltyVar3.equals(ltyVar4) && !((jxv) fqfVar7).f.equals(ltyVar4);
            if (ltyVar3.equals(ltyVar4) || !((jxv) fqfVar7).f.equals(ltyVar4)) {
                z = false;
            }
            if (z3 || z) {
                ((jxv) fqfVar7).b(gnm.RESOLUTION_SWITCH);
            }
            ((jxv) fqfVar7).f = ltyVar3;
        }
    }
}
