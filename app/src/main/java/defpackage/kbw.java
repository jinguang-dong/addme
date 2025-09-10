package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbw {
    private sbp d;
    private int e = 1;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;

    public final synchronized void a() {
        boolean z = true;
        if (this.e != 1) {
            z = false;
        }
        rnt.L(z);
        this.e = 4;
    }

    public final synchronized void b() {
        boolean z = true;
        if (this.e != 1) {
            z = false;
        }
        rnt.L(z);
        this.e = 3;
    }

    public final synchronized void c(sbp sbpVar) {
        this.d = sbpVar;
    }

    public final synchronized void d() {
        boolean z = true;
        if (this.e != 1) {
            z = false;
        }
        rnt.L(z);
        this.e = 2;
    }

    public final synchronized void e(tpc tpcVar) {
        sbp sbpVar = this.d;
        if (sbpVar != null) {
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            srw srwVar = (srw) tpcVar.b;
            srw srwVar2 = srw.a;
            srwVar.j = trb.a;
            for (int i = 0; i < sbpVar.size(); i++) {
                tpc tpcVarM = srz.a.m();
                Long l = (Long) sbpVar.get(i);
                l.getClass();
                int iLongValue = (int) l.longValue();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                srz srzVar = (srz) tphVar;
                srzVar.b |= 1;
                srzVar.c = iLongValue;
                boolean z = this.a;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                srz srzVar2 = (srz) tphVar2;
                srzVar2.b |= 2;
                srzVar2.d = z;
                boolean z2 = this.c;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                srz srzVar3 = (srz) tphVar3;
                srzVar3.b |= 8;
                srzVar3.f = z2;
                boolean z3 = this.b;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                srz srzVar4 = (srz) tpcVarM.b;
                srzVar4.b |= 4;
                srzVar4.e = z3;
                srz srzVar5 = (srz) tpcVarM.l();
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                srw srwVar3 = (srw) tpcVar.b;
                srzVar5.getClass();
                tpw tpwVar = srwVar3.j;
                if (!tpwVar.c()) {
                    srwVar3.j = tph.v(tpwVar);
                }
                srwVar3.j.add(srzVar5);
            }
        }
        int i2 = this.e;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        srw srwVar4 = (srw) tpcVar.b;
        srw srwVar5 = srw.a;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        srwVar4.l = i3;
        srwVar4.b |= 256;
    }
}
