package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsi {
    public static final Method a;
    public static final Method b;
    public static final Method c;

    public static long a(trn trnVar) {
        d(trnVar);
        return rkf.i(rkf.j(trnVar.b, 1000L), trnVar.c / 1000000);
    }

    public static trn b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static trn c(long j, int i) {
        if (!f(j)) {
            throw new IllegalArgumentException(rnt.z("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j)));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = rkf.i(j, i / 1000000000);
            i %= 1000000000;
        }
        long j2 = j;
        if (i < 0) {
            i += 1000000000;
            long j3 = (-1) + j2;
            ske.an(((j2 ^ j3) >= 0) | ((1 ^ j2) >= 0), "checkedSubtract", j2, 1L);
            j2 = j3;
        }
        tpc tpcVarM = trn.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        ((trn) tphVar).b = j2;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        ((trn) tpcVarM.b).c = i;
        trn trnVar = (trn) tpcVarM.l();
        d(trnVar);
        return trnVar;
    }

    public static void d(trn trnVar) {
        long j = trnVar.b;
        boolean zF = f(j);
        int i = trnVar.c;
        if (!zF || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(rnt.z("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    private static Method e(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean f(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    static {
        tpc tpcVarM = trn.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        ((trn) tphVar).b = -62135596800L;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        ((trn) tpcVarM.b).c = 0;
        tpc tpcVarM2 = trn.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        ((trn) tphVar2).b = 253402300799L;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        ((trn) tpcVarM2.b).c = 999999999;
        tpc tpcVarM3 = trn.a.m();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        tph tphVar3 = tpcVarM3.b;
        ((trn) tphVar3).b = 0L;
        if (!tphVar3.C()) {
            tpcVarM3.o();
        }
        ((trn) tpcVarM3.b).c = 0;
        new tsh();
        a = e(LmJPKwPBa.yeaAYxlzbumUkNm);
        b = e("getEpochSecond");
        c = e("getNano");
    }
}
