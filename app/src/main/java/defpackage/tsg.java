package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsg {
    static {
        tpc tpcVarM = tou.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        ((tou) tphVar).b = -315576000000L;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        ((tou) tpcVarM.b).c = -999999999;
        tpc tpcVarM2 = tou.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        ((tou) tphVar2).b = 315576000000L;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        ((tou) tpcVarM2.b).c = 999999999;
        tpc tpcVarM3 = tou.a.m();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        tph tphVar3 = tpcVarM3.b;
        ((tou) tphVar3).b = 0L;
        if (!tphVar3.C()) {
            tpcVarM3.o();
        }
        ((tou) tpcVarM3.b).c = 0;
    }

    public static tou a(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = rkf.i(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        tpc tpcVarM = tou.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        ((tou) tphVar).b = j;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        ((tou) tpcVarM.b).c = i;
        tou touVar = (tou) tpcVarM.l();
        long j2 = touVar.b;
        int i2 = touVar.c;
        if (j2 < -315576000000L || j2 > 315576000000L || i2 < -999999999 || i2 >= 1000000000 || ((j2 < 0 || i2 < 0) && (j2 > 0 || i2 > 0))) {
            throw new IllegalArgumentException(rnt.z("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j2), Integer.valueOf(i2)));
        }
        return touVar;
    }
}
