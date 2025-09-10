package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aku {
    private static final zu b = e(true);
    private static final zu c = e(false);
    private static final bsr a = akt.a;

    public static final akr a(bsq bsqVar) {
        Object objG = bsqVar.g();
        if (objG instanceof akr) {
            return (akr) objG;
        }
        return null;
    }

    public static final void b(bik bikVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-211209833);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(bikVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (aycVarC.H((i2 & 3) != 2, i2 & 1)) {
            bsr bsrVar = a;
            int iR = a.r(bay.N(aycVarC));
            bik bikVarV = bay.v(aycVarC, bikVar);
            ayg aygVar = (ayg) aycVarC;
            bfk bfkVarAg = aygVar.ag();
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVar, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            bbr.a(aycVarC, bikVarV, bum.b);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            aycVarC.m();
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(bikVar, i, 1);
        }
    }

    public static final bsr c(bie bieVar, boolean z) {
        bsr bsrVar = (bsr) (z ? b : c).a(bieVar);
        return bsrVar == null ? new akw(bieVar, z) : bsrVar;
    }

    public static final void d(btd btdVar, bte bteVar, bsq bsqVar, cib cibVar, int i, int i2, bie bieVar) {
        bie bieVar2;
        akr akrVarA = a(bsqVar);
        btdVar.r(bteVar, ((akrVarA == null || (bieVar2 = akrVarA.a) == null) ? bieVar : bieVar2).a((bteVar.a << 32) | (bteVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), cibVar));
    }

    private static final zu e(boolean z) {
        zu zuVar = new zu(9);
        bie bieVar = bib.f;
        zuVar.j(bieVar, new akw(bieVar, z));
        bie bieVar2 = bib.g;
        zuVar.j(bieVar2, new akw(bieVar2, z));
        bie bieVar3 = bib.h;
        zuVar.j(bieVar3, new akw(bieVar3, z));
        bie bieVar4 = bib.i;
        zuVar.j(bieVar4, new akw(bieVar4, z));
        bie bieVar5 = bib.j;
        zuVar.j(bieVar5, new akw(bieVar5, z));
        bie bieVar6 = bib.k;
        zuVar.j(bieVar6, new akw(bieVar6, z));
        bie bieVar7 = bib.l;
        zuVar.j(bieVar7, new akw(bieVar7, z));
        bie bieVar8 = bib.m;
        zuVar.j(bieVar8, new akw(bieVar8, z));
        bie bieVar9 = bib.n;
        zuVar.j(bieVar9, new akw(bieVar9, z));
        return zuVar;
    }
}
