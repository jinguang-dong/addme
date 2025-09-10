package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjw extends ckh {
    ArrayList a;
    private int b;

    public cjw(cjn cjnVar, int i) {
        cjn cjnVar2;
        super(cjnVar);
        this.a = new ArrayList();
        this.f = i;
        cjn cjnVar3 = this.d;
        cjn cjnVarN = cjnVar3.n(i);
        while (true) {
            cjn cjnVar4 = cjnVarN;
            cjnVar2 = cjnVar3;
            cjnVar3 = cjnVar4;
            if (cjnVar3 == null) {
                break;
            } else {
                cjnVarN = cjnVar3.n(this.f);
            }
        }
        this.d = cjnVar2;
        this.a.add(cjnVar2.o(this.f));
        cjn cjnVarM = cjnVar2.m(this.f);
        while (cjnVarM != null) {
            this.a.add(cjnVarM.o(this.f));
            cjnVarM = cjnVarM.m(this.f);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ckh ckhVar = (ckh) arrayList.get(i2);
            int i3 = this.f;
            if (i3 == 0) {
                ckhVar.d.f = this;
            } else if (i3 == 1) {
                ckhVar.d.g = this;
            }
        }
        if (this.f == 0 && ((cjo) this.d.U).c && this.a.size() > 1) {
            this.d = ((ckh) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.f == 0 ? this.d.aj : this.d.ak;
    }

    private final cjn g() {
        for (int i = 0; i < this.a.size(); i++) {
            cjn cjnVar = ((ckh) this.a.get(i)).d;
            if (cjnVar.ah != 8) {
                return cjnVar;
            }
        }
        return null;
    }

    private final cjn n() {
        cjn cjnVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            cjnVar = ((ckh) this.a.get(size)).d;
        } while (cjnVar.ah == 8);
        return cjnVar;
    }

    @Override // defpackage.ckh
    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            jA = jA + r4.h.e + ((ckh) this.a.get(i)).a() + r4.i.e;
        }
        return jA;
    }

    @Override // defpackage.ckh
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ckh) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        cjn cjnVar = ((ckh) this.a.get(0)).d;
        cjn cjnVar2 = ((ckh) this.a.get(size2 - 1)).d;
        if (this.f == 0) {
            cjm cjmVar = cjnVar.J;
            cjm cjmVar2 = cjnVar2.L;
            cjz cjzVarL = l(cjmVar, 0);
            int iB = cjmVar.b();
            cjn cjnVarG = g();
            if (cjnVarG != null) {
                iB = cjnVarG.J.b();
            }
            if (cjzVarL != null) {
                j(this.h, cjzVarL, iB);
            }
            cjz cjzVarL2 = l(cjmVar2, 0);
            int iB2 = cjmVar2.b();
            cjn cjnVarN = n();
            if (cjnVarN != null) {
                iB2 = cjnVarN.L.b();
            }
            if (cjzVarL2 != null) {
                j(this.i, cjzVarL2, -iB2);
            }
        } else {
            cjm cjmVar3 = cjnVar.K;
            cjm cjmVar4 = cjnVar2.M;
            cjz cjzVarL3 = l(cjmVar3, 1);
            int iB3 = cjmVar3.b();
            cjn cjnVarG2 = g();
            if (cjnVarG2 != null) {
                iB3 = cjnVarG2.K.b();
            }
            if (cjzVarL3 != null) {
                j(this.h, cjzVarL3, iB3);
            }
            cjz cjzVarL4 = l(cjmVar4, 1);
            int iB4 = cjmVar4.b();
            cjn cjnVarN2 = n();
            if (cjnVarN2 != null) {
                iB4 = cjnVarN2.M.b();
            }
            if (cjzVarL4 != null) {
                j(this.i, cjzVarL4, -iB4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // defpackage.ckh
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((ckh) this.a.get(i)).c();
        }
    }

    @Override // defpackage.ckh
    public final void d() {
        this.l = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ckh) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.ckh
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((ckh) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    @Override // defpackage.ckh, defpackage.cjx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjw.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ckh ckhVar = (ckh) arrayList.get(i);
            sb.append("<");
            sb.append(ckhVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
