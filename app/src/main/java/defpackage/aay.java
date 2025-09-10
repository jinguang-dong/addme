package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aay extends abf {
    public ado a;
    public aaz b;
    public aba c;
    public uif d;
    public aas e;
    public bie f;
    private long g = -9223372034707292160L;

    public aay(ado adoVar, aaz aazVar, aba abaVar, uif uifVar, aas aasVar) {
        this.a = adoVar;
        this.b = aazVar;
        this.c = abaVar;
        this.d = uifVar;
        this.e = aasVar;
        chp.k(0, 0, 15);
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        long j2;
        char c;
        adh adhVar;
        adh adhVar2 = null;
        if (this.a.d() == this.a.e()) {
            this.f = null;
        } else if (this.f == null) {
            if (this.a.s().a(aar.a, aar.b)) {
                abo aboVar = this.b.b;
                abo aboVar2 = this.c.b;
            } else {
                abo aboVar3 = this.c.b;
                abo aboVar4 = this.b.b;
            }
            this.f = bib.f;
        }
        if (bstVar.dt()) {
            bte bteVarR = bsqVar.r(j);
            long j3 = (bteVarR.a << 32) | (bteVarR.b & 4294967295L);
            this.g = j3;
            return bstVar.ds((int) (j3 >> 32), (int) (j3 & 4294967295L), ufx.a, new aaw(bteVarR, 0));
        }
        if (!((Boolean) this.d.a()).booleanValue()) {
            bte bteVarR2 = bsqVar.r(j);
            return bstVar.ds(bteVarR2.a, bteVarR2.b, ufx.a, new aaw(bteVarR2, 2));
        }
        aas aasVar = this.e;
        adi adiVar = aasVar.a;
        ado adoVar = aasVar.b;
        aaz aazVar = aasVar.c;
        aba abaVar = aasVar.d;
        acy acyVar = aav.a;
        if (adiVar != null) {
            aat aatVar = new aat(aazVar, abaVar, 1);
            aat aatVar2 = new aat(aazVar, abaVar, 0);
            adh adhVarA = adiVar.a();
            if (adhVarA == null) {
                ado adoVar2 = adiVar.b;
                j2 = 4294967295L;
                Object objA = aatVar2.a(adoVar2.d());
                byz byzVar = adiVar.c;
                c = ' ';
                adhVar = new adh(adiVar, new adk(adoVar2, objA, byi.bl(byzVar, aatVar2.a(adoVar2.d())), byzVar), aatVar, aatVar2);
                adiVar.a.b(adhVar);
                adoVar2.c.add(adhVar.a);
            } else {
                j2 = 4294967295L;
                c = ' ';
                adhVar = adhVarA;
            }
            ado adoVar3 = adiVar.b;
            adhVar.c = aatVar2;
            adhVar.b = aatVar;
            adhVar.b(adoVar3.s());
            adhVar2 = adhVar;
        } else {
            j2 = 4294967295L;
            c = ' ';
        }
        if (adoVar.d() == aar.a) {
            abo aboVar5 = aazVar.b;
            abo aboVar6 = abaVar.b;
        } else {
            abo aboVar7 = abaVar.b;
            abo aboVar8 = aazVar.b;
        }
        aal aalVar = new aal(adhVar2, 2);
        bte bteVarR3 = bsqVar.r(j);
        long j4 = bteVarR3.b & j2;
        long j5 = this.g;
        long j6 = j4 | (bteVarR3.a << c);
        long j7 = true != byi.bi(j5) ? j6 : j5;
        long jE = chp.e(j, j6);
        bie bieVar = this.f;
        return bstVar.ds((int) (jE >> c), (int) (jE & j2), ufx.a, new aax(bteVarR3, chy.d(bieVar != null ? bieVar.a(j7, jE, cib.a) : 0L, 0L), 0L, aalVar));
    }

    @Override // defpackage.bij
    public final void cW() {
        this.g = -9223372034707292160L;
    }
}
