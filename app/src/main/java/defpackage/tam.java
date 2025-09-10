package defpackage;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tam {
    public static final Charset a;
    public static final tal b;
    private static final sun c;
    private final tax d;

    static {
        tpc tpcVarM = sun.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sun sunVar = (sun) tphVar;
        sunVar.b |= 1;
        sunVar.c = 0L;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sun sunVar2 = (sun) tphVar2;
        sunVar2.b |= 2;
        sunVar2.d = 0;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        sun sunVar3 = (sun) tpcVarM.b;
        sunVar3.b |= 4;
        sunVar3.e = 0;
        c = (sun) tpcVarM.l();
        a = Charset.forName("UTF-8");
        b = tal.a().a();
    }

    public tam(String str, String str2) {
        tpc tpcVarM = tay.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        tay tayVar = (tay) tphVar;
        str.getClass();
        tayVar.b |= 1;
        tayVar.c = str;
        if (str2 != null) {
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tay tayVar2 = (tay) tpcVarM.b;
            tayVar2.b |= 2;
            tayVar2.d = str2;
        }
        tpc tpcVarM2 = tax.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tax taxVar = (tax) tpcVarM2.b;
        tay tayVar3 = (tay) tpcVarM.l();
        tayVar3.getClass();
        taxVar.c = tayVar3;
        taxVar.b |= 1;
        tpc tpcVarM3 = tbb.a.m();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        tbb tbbVar = (tbb) tpcVarM3.b;
        tbbVar.c = 0;
        tbbVar.b |= 1;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tax taxVar2 = (tax) tpcVarM2.b;
        tbb tbbVar2 = (tbb) tpcVarM3.l();
        tbbVar2.getClass();
        taxVar2.d = tbbVar2;
        taxVar2.b |= 2;
        this.d = (tax) tpcVarM2.l();
    }

    public static Object a(sid sidVar, shl shlVar) {
        return sidVar.k().d(shlVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.tpc c(defpackage.suo r6, int r7, defpackage.tal r8, java.lang.Object... r9) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tam.c(suo, int, tal, java.lang.Object[]):tpc");
    }

    public final tpc b(sid sidVar, int i, tal talVar) {
        String name;
        suo suoVar;
        uyd uydVar;
        if (sidVar.k().d(qon.a) != null) {
            tpc tpcVarM = suo.a.m();
            sun sunVar = c;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            suo suoVar2 = (suo) tpcVarM.b;
            sunVar.getClass();
            suoVar2.c = sunVar;
            suoVar2.b |= 1;
            int iIntValue = sidVar.o().intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            suo suoVar3 = (suo) tpcVarM.b;
            suoVar3.b |= 4;
            suoVar3.e = iIntValue;
            String strB = sidVar.f().b();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            suo suoVar4 = (suo) tpcVarM.b;
            strB.getClass();
            suoVar4.b |= 8;
            suoVar4.f = strB;
            String strD = sidVar.f().d();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            suo suoVar5 = (suo) tpcVarM.b;
            strD.getClass();
            suoVar5.b |= 16;
            suoVar5.g = strD;
            int iA = sidVar.f().a();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            suo suoVar6 = (suo) tpcVarM.b;
            suoVar6.b |= 32;
            suoVar6.h = iA;
            String strE = sidVar.f().e();
            if (strE != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                suo suoVar7 = (suo) tpcVarM.b;
                suoVar7.b |= 64;
                suoVar7.i = strE;
            }
            String str = (String) sidVar.k().d(qon.b);
            if (str != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                suo suoVar8 = (suo) tpcVarM.b;
                suoVar8.b |= 2;
                suoVar8.d = str;
            } else {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                suo suoVar9 = (suo) tpcVarM.b;
                suoVar9.b |= 2;
                suoVar9.d = "Unknown native thread";
            }
            sjf sjfVarL = sidVar.l();
            if (sjfVarL != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                String str2 = sjfVarL.b;
                suo suoVar10 = (suo) tpcVarM.b;
                suoVar10.b |= 256;
                suoVar10.j = str2;
            } else {
                String string = sidVar.m().toString();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                suo suoVar11 = (suo) tpcVarM.b;
                string.getClass();
                suoVar11.b |= 256;
                suoVar11.j = string;
            }
            suoVar = (suo) tpcVarM.l();
        } else {
            sjf sjfVarL2 = sidVar.l();
            if (sjfVarL2 != null) {
                name = sjfVarL2.b;
            } else {
                Object objM = sidVar.m();
                name = objM instanceof String ? (String) objM : objM != null ? objM.getClass().getName() : "null";
            }
            Throwable th = i == 2 ? (Throwable) a(sidVar, sgy.a) : null;
            shd shdVarF = sidVar.f();
            Level levelO = sidVar.o();
            String strB2 = shdVarF.b();
            String strD2 = shdVarF.d();
            int iA2 = shdVarF.a();
            tpc tpcVarM2 = suo.a.m();
            sun sunVar2 = c;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            suo suoVar12 = (suo) tpcVarM2.b;
            sunVar2.getClass();
            suoVar12.c = sunVar2;
            suoVar12.b |= 1;
            String name2 = Thread.currentThread().getName();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            suo suoVar13 = (suo) tpcVarM2.b;
            name2.getClass();
            suoVar13.b |= 2;
            suoVar13.d = name2;
            int iIntValue2 = levelO.intValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            suo suoVar14 = (suo) tphVar;
            suoVar14.b |= 4;
            suoVar14.e = iIntValue2;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            suo suoVar15 = (suo) tphVar2;
            strB2.getClass();
            suoVar15.b |= 8;
            suoVar15.f = strB2;
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            tph tphVar3 = tpcVarM2.b;
            suo suoVar16 = (suo) tphVar3;
            strD2.getClass();
            suoVar16.b |= 16;
            suoVar16.g = strD2;
            if (!tphVar3.C()) {
                tpcVarM2.o();
            }
            tph tphVar4 = tpcVarM2.b;
            suo suoVar17 = (suo) tphVar4;
            suoVar17.b |= 32;
            suoVar17.h = iA2;
            if (name != null) {
                if (!tphVar4.C()) {
                    tpcVarM2.o();
                }
                suo suoVar18 = (suo) tpcVarM2.b;
                suoVar18.b |= 256;
                suoVar18.j = name;
            }
            if (th != null) {
                tpc tpcVarO = talVar.c ? rkf.o(th, false) : rkf.q(th);
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                suo suoVar19 = (suo) tpcVarM2.b;
                sut sutVar = (sut) tpcVarO.l();
                sutVar.getClass();
                suoVar19.k = sutVar;
                suoVar19.b |= 1024;
            }
            suoVar = (suo) tpcVarM2.l();
        }
        tpc tpcVarC = sidVar.l() != null ? c(suoVar, i, talVar, sidVar.L()) : c(suoVar, i, talVar, new Object[0]);
        if (i == 2 && talVar.a && (uydVar = (uyd) a(sidVar, tao.b)) != null) {
            if (!tpcVarC.b.C()) {
                tpcVarC.o();
            }
            tba tbaVar = (tba) tpcVarC.b;
            tba tbaVar2 = tba.a;
            tbaVar.e = uydVar;
            tbaVar.b |= 4;
        }
        return tpcVarC;
    }
}
