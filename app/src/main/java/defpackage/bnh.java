package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnh extends bog {
    public uiq e;
    public float g;
    public float h;
    public float i;
    public float l;
    public float m;
    private float[] o;
    private bkn r;
    private final List p = new ArrayList();
    public boolean a = true;
    public long b = bkv.f;
    public List c = bok.a;
    public boolean d = true;
    private final uiq q = new aal(this, 8);
    public String f = "";
    public float j = 1.0f;
    public float k = 1.0f;
    public boolean n = true;

    private final void g() {
        this.a = false;
        this.b = bkv.f;
    }

    private final void h(bks bksVar) {
        if (this.a && bksVar != null) {
            if (bksVar instanceof blr) {
                i(((blr) bksVar).a);
            } else {
                g();
            }
        }
    }

    private final void i(long j) {
        if (this.a && j != 16) {
            long j2 = this.b;
            if (j2 == 16) {
                this.b = j;
                return;
            }
            List list = bok.a;
            if (bkv.d(j2) == bkv.d(j) && bkv.c(j2) == bkv.c(j) && bkv.b(j2) == bkv.b(j)) {
                return;
            }
            g();
        }
    }

    private final boolean j() {
        return !this.c.isEmpty();
    }

    @Override // defpackage.bog
    public final uiq a() {
        return this.e;
    }

    @Override // defpackage.bog
    public final void b(bmv bmvVar) {
        if (this.n) {
            float[] fArrD = this.o;
            if (fArrD == null) {
                fArrD = bld.d();
                this.o = fArrD;
            } else {
                bld.c(fArrD);
            }
            bld.f(fArrD, this.l + this.h, this.m + this.i);
            double d = this.g * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = fArrD[0];
            float f2 = fArrD[4];
            float f3 = -fSin;
            float f4 = fArrD[1];
            float f5 = fArrD[5];
            float f6 = fArrD[2];
            float f7 = fArrD[6];
            float f8 = fArrD[3];
            float f9 = fArrD[7];
            fArrD[0] = (fCos * f) + (fSin * f2);
            fArrD[1] = (fCos * f4) + (fSin * f5);
            fArrD[2] = (fCos * f6) + (fSin * f7);
            fArrD[3] = (fCos * f8) + (fSin * f9);
            fArrD[4] = (f * f3) + (f2 * fCos);
            fArrD[5] = (f4 * f3) + (f5 * fCos);
            fArrD[6] = (f6 * f3) + (f7 * fCos);
            fArrD[7] = (f3 * f8) + (fCos * f9);
            bld.e(fArrD, this.j, this.k);
            bld.f(fArrD, -this.h, -this.i);
            this.n = false;
        }
        if (this.d) {
            if (j()) {
                bkn bknVar = this.r;
                if (bknVar == null) {
                    bknVar = new bkn((byte[]) null);
                    this.r = bknVar;
                }
                byi.B(this.c, bknVar);
            }
            this.d = false;
        }
        bms bmsVarO = bmvVar.o();
        long jA = bmsVarO.a();
        bmsVarO.b().f();
        try {
            rnu rnuVar = bmsVarO.c;
            float[] fArr = this.o;
            if (fArr != null) {
                ((bms) rnuVar.a).b().a(new bld(fArr).a);
            }
            bkn bknVar2 = this.r;
            if (j() && bknVar2 != null) {
                rnuVar.k(bknVar2);
            }
            List list = this.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((bog) list.get(i)).b(bmvVar);
            }
        } finally {
            bmsVarO.b().d();
            bmsVarO.h(jA);
        }
    }

    public final void c(int i, bog bogVar) {
        List list = this.p;
        if (i < list.size()) {
            list.set(i, bogVar);
        } else {
            list.add(bogVar);
        }
        d(bogVar);
        bogVar.e(this.q);
        f();
    }

    public final void d(bog bogVar) {
        if (bogVar instanceof bnl) {
            bnl bnlVar = (bnl) bogVar;
            h(bnlVar.a);
            h(bnlVar.f);
        } else if (bogVar instanceof bnh) {
            bnh bnhVar = (bnh) bogVar;
            if (bnhVar.a && this.a) {
                i(bnhVar.b);
            } else {
                g();
            }
        }
    }

    @Override // defpackage.bog
    public final void e(uiq uiqVar) {
        this.e = uiqVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f);
        List list = this.p;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bog bogVar = (bog) list.get(i);
            sb.append("\t");
            sb.append(bogVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
