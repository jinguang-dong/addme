package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qay {
    public final Object a;
    public final Object b;

    public qay(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static syu c(pvu pvuVar, puh puhVar, List list) {
        qay qayVar = new qay(pvuVar, list, null);
        qdp qdpVarE = qdp.e(b(puhVar));
        qaz qazVar = new qaz(qayVar, 13);
        sxo sxoVar = sxo.a;
        return qdpVarE.g(qazVar, sxoVar).d(ptv.class, new qci(3), sxoVar);
    }

    private static final void i(syu syuVar, String str, rwc rwcVar, rwc rwcVar2) {
        qsz.o(syuVar, new fpc(str, rwcVar, 14, (char[]) null), sxo.a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, pvu] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public final syu a(List list) {
        ArrayList arrayList = new ArrayList();
        rvk rvkVar = rvk.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pud pudVar = (pud) it.next();
            if (pudVar != null && !pudVar.c.isEmpty()) {
                ?? r3 = this.b;
                syu syuVarA = r3.a(new ptu(pudVar, rvkVar, rvkVar));
                i(syuVarA, pudVar.c, rvkVar, rvkVar);
                arrayList.add(syuVarA);
                for (Account account : this.a) {
                    syu syuVarA2 = r3.a(new ptu(pudVar, rwc.j(account), rvkVar));
                    i(syuVarA2, pudVar.c, rwc.j(account), rvkVar);
                    arrayList.add(syuVarA2);
                }
            }
        }
        return qsp.N(arrayList).f(new ozi(arrayList, 9), sxo.a);
    }

    public final List d(qex qexVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = qexVar.a;
        int i3 = qexVar.b;
        int i4 = i3;
        int i5 = i2;
        while (true) {
            i = i2 + i3;
            if (i5 >= i) {
                break;
            }
            qeu qeuVar = new qeu(this, new qex(i5, i4));
            int i6 = qeuVar.b.b + qeuVar.c;
            i4 -= i6;
            if (i4 < 0) {
                z = false;
            }
            rnt.L(z);
            arrayList.add(qeuVar);
            i5 += i6;
        }
        rnt.L(i5 == i);
        rnt.L(i4 == 0);
        return arrayList;
    }

    public final qew e(qev qevVar) throws qey {
        rwc rwcVar = (rwc) this.a;
        a.I(rwcVar.h());
        a.I(((qeu) rwcVar.c()).a.equals(qevVar.b));
        qex qexVar = ((qeu) rwcVar.c()).b;
        int i = qevVar.a;
        if (qexVar.b < i + 4) {
            throw new qey(String.format(Locale.US, "Trying to look up offset %d in box %s but the box is only %d bytes long", Integer.valueOf(i), ((qeu) rwcVar.c()).a, Integer.valueOf(((qeu) rwcVar.c()).b.b)));
        }
        qeu qeuVar = (qeu) rwcVar.c();
        return new qew(qeuVar.d, qeuVar.b.a + i);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final List f(String str) {
        ArrayList arrayList = new ArrayList();
        for (qay qayVar : this.b) {
            rwc rwcVar = (rwc) qayVar.a;
            rnt.L(rwcVar.h());
            if (((qeu) rwcVar.c()).a.equals(str)) {
                arrayList.add(qayVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void g(qay qayVar, List list) {
        qay qayVar2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qeu qeuVar = (qeu) it.next();
            if (this.b.contains(qeuVar.a)) {
                qayVar2 = new qay(rwc.j(qeuVar));
                g(qayVar2, d(qeuVar.b));
            } else {
                qayVar2 = new qay(rwc.j(qeuVar));
            }
            rwc.j(qayVar);
            qayVar.b.add(qayVar2);
        }
    }

    public final qay h(String str) throws qey {
        List listF = f(str);
        if (listF.size() == 1) {
            return (qay) listF.get(0);
        }
        rwc rwcVar = (rwc) this.a;
        throw new qey(String.format(Locale.US, "Looking for a unique %s box in a %s box but found %d of them", str, rwcVar.h() ? ((qeu) rwcVar.c()).a : "n/a", Integer.valueOf(listF.size())));
    }

    public qay(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.syu b(defpackage.puh r16) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qay.b(puh):syu");
    }

    public qay(rwc rwcVar) {
        this.b = new ArrayList();
        this.a = rwcVar;
    }

    public qay() {
        this.b = new HashMap();
        this.a = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public qay(qay qayVar) {
        this.b = new HashMap((Map) qayVar.b);
        HashMap map = new HashMap((Map) qayVar.a);
        this.a = map;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((twk) ((Map.Entry) it.next()).getValue()).e.get()) {
                it.remove();
            }
        }
    }
}
