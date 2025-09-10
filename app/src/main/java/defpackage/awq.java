package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awq implements uiu {
    final /* synthetic */ bik a;
    final /* synthetic */ blp b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ boolean e;
    final /* synthetic */ uif f;
    final /* synthetic */ float g;
    final /* synthetic */ uiu h;
    final /* synthetic */ ocq i;
    private final /* synthetic */ int j;

    public awq(bik bikVar, blp blpVar, long j, float f, float f2, ocq ocqVar, boolean z, uif uifVar, uiu uiuVar, int i) {
        this.j = i;
        this.a = bikVar;
        this.b = blpVar;
        this.c = j;
        this.d = f;
        this.g = f2;
        this.i = ocqVar;
        this.e = z;
        this.f = uifVar;
        this.h = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.j != 0) {
            ayc aycVar = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
                aycVar.r();
            } else {
                bik bikVarBK = byi.bK(akg.m(asw.a(this.a), this.b, akg.n(this.c, (asc) aycVar.e(asm.a), this.d, aycVar), this.g), this.i, atc.a(0.0f, 7), this.e, null, this.f, 24);
                uiu uiuVar = this.h;
                bsr bsrVarC = aku.c(bib.f, true);
                int iM = bay.M(aycVar);
                bfk bfkVarM = aycVar.M();
                bik bikVarV = bay.v(aycVar, bikVarBK);
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
                uiu uiuVar2 = bum.e;
                if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iM))) {
                    Integer numValueOf = Integer.valueOf(iM);
                    aycVar.w(numValueOf);
                    aycVar.h(numValueOf, uiuVar2);
                }
                bbr.a(aycVar, bikVarV, bum.b);
                uiuVar.a(aycVar, 0);
                aycVar.m();
            }
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar2.G()) {
            aycVar2.r();
        } else {
            bik bikVar = this.a;
            blp blpVar = this.b;
            long jL = this.c;
            float f = this.d;
            bik bikVarA = awa.a(bikVar);
            avp avpVarO = bay.O(aycVar2);
            boolean zBooleanValue = ((Boolean) aycVar2.e(avq.b)).booleanValue();
            long j = avpVarO.p;
            long j2 = bkv.a;
            if (a.q(jL, j) && zBooleanValue) {
                if (cht.b(f, 0.0f)) {
                    jL = j;
                } else {
                    float fLog = (float) Math.log(f + 1.0f);
                    long j3 = avpVarO.t;
                    jL = bko.l(bko.k(bkv.d(j3), bkv.c(j3), bkv.b(j3), ((fLog * 4.5f) + 2.0f) / 100.0f, bkv.f(j3)), j);
                }
            }
            long j4 = jL;
            float fDk = ((chq) aycVar2.e(bze.c)).dk(this.g);
            bik bikVarF = amo.f(byi.bK(bdq.C(byi.aR(bikVarA.cM(fDk > 0.0f ? bko.d(bik.c, 0.0f, 0.0f, 0.0f, fDk, blpVar, 124895) : bik.c).cM(bik.c), j4, blpVar), blpVar), this.i, awl.a(), this.e, null, this.f, 24));
            uiu uiuVar3 = this.h;
            bsr bsrVarC2 = aku.c(bib.f, true);
            int iM2 = bay.M(aycVar2);
            bfk bfkVarM2 = aycVar2.M();
            bik bikVarV2 = bay.v(aycVar2, bikVarF);
            uif uifVar2 = bum.a;
            aycVar2.L();
            aycVar2.v();
            if (aycVar2.F()) {
                aycVar2.j(uifVar2);
            } else {
                aycVar2.x();
            }
            bbr.a(aycVar2, bsrVarC2, bum.d);
            bbr.a(aycVar2, bfkVarM2, bum.c);
            uiu uiuVar4 = bum.e;
            if (aycVar2.F() || !a.ao(aycVar2.f(), Integer.valueOf(iM2))) {
                Integer numValueOf2 = Integer.valueOf(iM2);
                aycVar2.w(numValueOf2);
                aycVar2.h(numValueOf2, uiuVar4);
            }
            bbr.a(aycVar2, bikVarV2, bum.b);
            uiuVar3.a(aycVar2, 0);
            aycVar2.m();
        }
        return ufg.a;
    }

    public awq(bik bikVar, blp blpVar, long j, float f, ocq ocqVar, boolean z, uif uifVar, float f2, uiu uiuVar, int i) {
        this.j = i;
        this.a = bikVar;
        this.b = blpVar;
        this.c = j;
        this.d = f;
        this.i = ocqVar;
        this.e = z;
        this.f = uifVar;
        this.g = f2;
        this.h = uiuVar;
    }
}
