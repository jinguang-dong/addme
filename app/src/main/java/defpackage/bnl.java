package defpackage;

import android.graphics.PathMeasure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnl extends bog {
    public bks a;
    public float e;
    public bks f;
    public float j;
    public float l;
    public boolean o;
    public bkn p;
    private bmy q;
    private final ues r;
    private final bkn s;
    public float b = 1.0f;
    public List c = bok.a;
    public float d = 1.0f;
    public int g = 0;
    public int h = 0;
    public float i = 4.0f;
    public float k = 1.0f;
    public boolean m = true;
    public boolean n = true;

    public bnl() {
        bkn bknVar = new bkn((byte[]) null);
        this.s = bknVar;
        this.p = bknVar;
        this.r = rnt.aO(3, bnk.a);
    }

    private final void c() {
        if (this.j == 0.0f && this.k == 1.0f) {
            this.p = this.s;
            return;
        }
        bkn bknVar = this.p;
        bkn bknVar2 = this.s;
        if (a.ao(bknVar, bknVar2)) {
            this.p = new bkn((byte[]) null);
        } else {
            int iA = this.p.a();
            this.p.l();
            this.p.m(iA);
        }
        ((PathMeasure) d().a).setPath(bknVar2.a, false);
        float length = ((PathMeasure) d().a).getLength();
        float f = this.j;
        float f2 = this.l;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.k + f2) % 1.0f) * length;
        if (f3 <= f4) {
            d().x(f3, f4, this.p);
        } else {
            d().x(f3, length, this.p);
            d().x(0.0f, f4, this.p);
        }
    }

    private final ejs d() {
        return (ejs) this.r.a();
    }

    @Override // defpackage.bog
    public final void b(bmv bmvVar) {
        bmv bmvVar2;
        bmy bmyVar;
        if (this.m) {
            byi.B(this.c, this.s);
            c();
        } else if (this.o) {
            c();
        }
        this.m = false;
        this.o = false;
        bks bksVar = this.a;
        if (bksVar != null) {
            bmvVar2 = bmvVar;
            byi.an(bmvVar2, this.p, bksVar, this.b, null, 56);
        } else {
            bmvVar2 = bmvVar;
        }
        bks bksVar2 = this.f;
        if (bksVar2 != null) {
            bmy bmyVar2 = this.q;
            if (this.n || bmyVar2 == null) {
                bmy bmyVar3 = new bmy(this.e, this.i, this.g, this.h, 16);
                this.q = bmyVar3;
                this.n = false;
                bmyVar = bmyVar3;
            } else {
                bmyVar = bmyVar2;
            }
            byi.an(bmvVar2, this.p, bksVar2, this.d, bmyVar, 48);
        }
    }

    public final String toString() {
        return this.s.toString();
    }
}
