package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpw {
    private static final rwr b = rwr.b('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List listF = b.f(str);
        return listF.size() != 3 ? "MALFORMED" : (String) listF.get(0);
    }

    final uxw b(uxw uxwVar) {
        uxr uxrVar = uxwVar.e;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        if ((uxrVar.b & 1) == 0) {
            return uxwVar;
        }
        uxr uxrVar2 = uxwVar.e;
        if (uxrVar2 == null) {
            uxrVar2 = uxr.a;
        }
        tpc tpcVar = (tpc) uxrVar2.a(5, null);
        tpcVar.r(uxrVar2);
        Long l = (Long) this.a.get(Long.valueOf(((uxr) tpcVar.b).c));
        l.getClass();
        tpc tpcVar2 = (tpc) uxwVar.a(5, null);
        tpcVar2.r(uxwVar);
        long jLongValue = l.longValue();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        uxr uxrVar3 = (uxr) tpcVar.b;
        uxrVar3.b |= 1;
        uxrVar3.c = jLongValue;
        if (!tpcVar2.b.C()) {
            tpcVar2.o();
        }
        uxw uxwVar2 = (uxw) tpcVar2.b;
        uxr uxrVar4 = (uxr) tpcVar.l();
        uxrVar4.getClass();
        uxwVar2.e = uxrVar4;
        uxwVar2.b |= 4;
        return (uxw) tpcVar2.l();
    }

    final uxw c(int i, uxw uxwVar) throws NoSuchAlgorithmException {
        uxr uxrVar = uxwVar.e;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        if ((uxrVar.b & 2) == 0) {
            return uxwVar;
        }
        uxr uxrVar2 = uxwVar.e;
        if (uxrVar2 == null) {
            uxrVar2 = uxr.a;
        }
        tpc tpcVar = (tpc) uxrVar2.a(5, null);
        tpcVar.r(uxrVar2);
        tpc tpcVar2 = (tpc) uxwVar.a(5, null);
        tpcVar2.r(uxwVar);
        String strConcat = ((uxr) tpcVar.b).d;
        Long lA = taa.a(strConcat);
        lA.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        long jLongValue = lA.longValue();
        if (!concurrentHashMap.containsKey(lA)) {
            int i2 = i - 1;
            if (i2 == 0) {
                Matcher matcher = c.matcher(strConcat);
                if (matcher.matches()) {
                    strConcat = strConcat.startsWith("*sync*/") ? "*sync*/".concat(String.valueOf(a(strConcat.substring(7)))) : matcher.group(1);
                }
            } else if (i2 == 1) {
                strConcat = a(strConcat);
            } else if (i2 == 2) {
                strConcat = "--";
            }
            Long lA2 = taa.a(strConcat);
            if (lA2 != null) {
                concurrentHashMap.putIfAbsent(lA, lA2);
            }
        }
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        tph tphVar = tpcVar.b;
        uxr uxrVar3 = (uxr) tphVar;
        uxrVar3.b |= 1;
        uxrVar3.c = jLongValue;
        if (!tphVar.C()) {
            tpcVar.o();
        }
        uxr uxrVar4 = (uxr) tpcVar.b;
        uxrVar4.b &= -3;
        uxrVar4.d = uxr.a.d;
        if (!tpcVar2.b.C()) {
            tpcVar2.o();
        }
        uxw uxwVar2 = (uxw) tpcVar2.b;
        uxr uxrVar5 = (uxr) tpcVar.l();
        uxrVar5.getClass();
        uxwVar2.e = uxrVar5;
        uxwVar2.b |= 4;
        return (uxw) tpcVar2.l();
    }
}
