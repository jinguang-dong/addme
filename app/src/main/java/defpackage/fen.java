package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fen implements fel {
    public final Set a;
    public final our b;
    private owf c;
    private owf d;
    private owf e;
    private owf f;
    private boolean g;
    private final rvu h = new hth(1);

    public fen(Set set, our ourVar) {
        this.a = set;
        this.b = ourVar;
    }

    @Override // defpackage.fel
    public final int a() {
        return ((Integer) this.c.dL()).intValue();
    }

    @Override // defpackage.fel
    public final void b() {
        this.g = false;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fev) it.next()).c();
        }
    }

    @Override // defpackage.fel
    public final void c() {
        this.g = true;
    }

    @Override // defpackage.fel
    public final void d(pjr pjrVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fev) it.next()).d(pjrVar);
        }
    }

    @Override // defpackage.fel
    public final void e(goi goiVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fev) it.next()).e(goiVar.a);
        }
    }

    @Override // defpackage.fel
    public final void f(lmg lmgVar) {
        if (!this.g || !((Boolean) this.f.dL()).booleanValue()) {
            lmgVar.a.close();
            return;
        }
        poj pojVar = lmgVar.a;
        Set<fev> set = this.a;
        pkf pkfVar = new pkf(pojVar, set.size());
        for (fev fevVar : set) {
            if (((Boolean) fevVar.b().a().dL()).booleanValue() && (fevVar instanceof fet)) {
                lmg.b(new pkg(pkfVar), lmgVar);
                ((fet) fevVar).a();
            } else {
                pkfVar.l();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0355 A[Catch: all -> 0x03f6, TryCatch #1 {all -> 0x03f6, blocks: (B:81:0x023c, B:83:0x0248, B:84:0x024b, B:86:0x0266, B:87:0x0269, B:89:0x0278, B:94:0x0284, B:96:0x028a, B:97:0x028d, B:99:0x02a2, B:100:0x02a5, B:102:0x02b8, B:103:0x02bb, B:105:0x02ce, B:106:0x02d1, B:108:0x030d, B:110:0x031b, B:113:0x032a, B:117:0x0351, B:119:0x0355, B:121:0x0359, B:152:0x03ea, B:124:0x035f, B:126:0x0369, B:128:0x0371, B:151:0x03e7, B:129:0x0378, B:131:0x0386, B:132:0x038d, B:134:0x0393, B:136:0x0397, B:138:0x03b6, B:140:0x03be, B:141:0x03c3, B:142:0x03d0, B:143:0x03d6, B:146:0x03da, B:150:0x03e6, B:153:0x03ec, B:155:0x03f2, B:90:0x027b, B:92:0x027f, B:93:0x0282, B:144:0x03d7, B:145:0x03d9), top: B:177:0x023c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x035f A[Catch: all -> 0x03f6, TryCatch #1 {all -> 0x03f6, blocks: (B:81:0x023c, B:83:0x0248, B:84:0x024b, B:86:0x0266, B:87:0x0269, B:89:0x0278, B:94:0x0284, B:96:0x028a, B:97:0x028d, B:99:0x02a2, B:100:0x02a5, B:102:0x02b8, B:103:0x02bb, B:105:0x02ce, B:106:0x02d1, B:108:0x030d, B:110:0x031b, B:113:0x032a, B:117:0x0351, B:119:0x0355, B:121:0x0359, B:152:0x03ea, B:124:0x035f, B:126:0x0369, B:128:0x0371, B:151:0x03e7, B:129:0x0378, B:131:0x0386, B:132:0x038d, B:134:0x0393, B:136:0x0397, B:138:0x03b6, B:140:0x03be, B:141:0x03c3, B:142:0x03d0, B:143:0x03d6, B:146:0x03da, B:150:0x03e6, B:153:0x03ec, B:155:0x03f2, B:90:0x027b, B:92:0x027f, B:93:0x0282, B:144:0x03d7, B:145:0x03d9), top: B:177:0x023c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0378 A[Catch: all -> 0x03f6, TryCatch #1 {all -> 0x03f6, blocks: (B:81:0x023c, B:83:0x0248, B:84:0x024b, B:86:0x0266, B:87:0x0269, B:89:0x0278, B:94:0x0284, B:96:0x028a, B:97:0x028d, B:99:0x02a2, B:100:0x02a5, B:102:0x02b8, B:103:0x02bb, B:105:0x02ce, B:106:0x02d1, B:108:0x030d, B:110:0x031b, B:113:0x032a, B:117:0x0351, B:119:0x0355, B:121:0x0359, B:152:0x03ea, B:124:0x035f, B:126:0x0369, B:128:0x0371, B:151:0x03e7, B:129:0x0378, B:131:0x0386, B:132:0x038d, B:134:0x0393, B:136:0x0397, B:138:0x03b6, B:140:0x03be, B:141:0x03c3, B:142:0x03d0, B:143:0x03d6, B:146:0x03da, B:150:0x03e6, B:153:0x03ec, B:155:0x03f2, B:90:0x027b, B:92:0x027f, B:93:0x0282, B:144:0x03d7, B:145:0x03d9), top: B:177:0x023c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f2 A[Catch: all -> 0x03f6, TRY_LEAVE, TryCatch #1 {all -> 0x03f6, blocks: (B:81:0x023c, B:83:0x0248, B:84:0x024b, B:86:0x0266, B:87:0x0269, B:89:0x0278, B:94:0x0284, B:96:0x028a, B:97:0x028d, B:99:0x02a2, B:100:0x02a5, B:102:0x02b8, B:103:0x02bb, B:105:0x02ce, B:106:0x02d1, B:108:0x030d, B:110:0x031b, B:113:0x032a, B:117:0x0351, B:119:0x0355, B:121:0x0359, B:152:0x03ea, B:124:0x035f, B:126:0x0369, B:128:0x0371, B:151:0x03e7, B:129:0x0378, B:131:0x0386, B:132:0x038d, B:134:0x0393, B:136:0x0397, B:138:0x03b6, B:140:0x03be, B:141:0x03c3, B:142:0x03d0, B:143:0x03d6, B:146:0x03da, B:150:0x03e6, B:153:0x03ec, B:155:0x03f2, B:90:0x027b, B:92:0x027f, B:93:0x0282, B:144:0x03d7, B:145:0x03d9), top: B:177:0x023c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0404 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, pjo] */
    @Override // defpackage.fel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.lmg r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fen.g(lmg):void");
    }

    @Override // defpackage.fel
    public final void h(poe poeVar) {
        if (this.g && ((Boolean) this.e.dL()).booleanValue()) {
            for (fev fevVar : this.a) {
                if (((Boolean) fevVar.b().a().dL()).booleanValue() && (fevVar instanceof feu)) {
                    ((feu) fevVar).a(poeVar);
                }
            }
        }
    }

    @Override // defpackage.fel
    public final boolean i() {
        return ((Boolean) this.d.dL()).booleanValue();
    }

    @Override // defpackage.fel
    public final void j(fey feyVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fev) it.next()).f(feyVar);
        }
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList2.add(new owi(false));
        arrayList3.add(new owi(false));
        arrayList4.add(new owi(false));
        for (fev fevVar : this.a) {
            fes fesVarB = fevVar.b();
            if (fevVar instanceof ffk) {
                arrayList2.add(fesVarB.a());
                if (((Boolean) fesVarB.a().dL()).booleanValue()) {
                    arrayList.add(fesVarB.b());
                }
            }
            if (fevVar instanceof feu) {
                arrayList3.add(fesVarB.a());
                if (((Boolean) fesVarB.a().dL()).booleanValue()) {
                    arrayList.add(fesVarB.b());
                }
            }
            if (fevVar instanceof fet) {
                arrayList4.add(fesVarB.a());
            }
        }
        this.c = owl.h(new owe(arrayList), this.h);
        this.d = owl.f(arrayList2);
        this.e = owl.f(arrayList3);
        this.f = owl.f(arrayList4);
    }
}
