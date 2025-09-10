package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpk {
    public final bry a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final zo g = new zo((byte[]) null);
    public final bpo f = new bpo();
    public final yx h = new yx(10);

    public bpk(bry bryVar) {
        this.a = bryVar;
    }

    public final void a() {
        if (this.d) {
            this.d = true;
        } else {
            this.f.d.g();
        }
    }

    public final void b() {
        if (this.b) {
            this.c = true;
            return;
        }
        bdp bdpVar = this.f.d;
        Object[] objArr = bdpVar.a;
        int i = bdpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bpn) objArr[i2]).a();
        }
        a();
    }

    public final void c(bij bijVar) {
        if (this.b) {
            this.e = true;
            this.g.o(bijVar);
            return;
        }
        bpo bpoVar = this.f;
        zo zoVar = bpoVar.e;
        zoVar.j();
        zoVar.o(bpoVar);
        while (zoVar.g()) {
            bpo bpoVar2 = (bpo) zoVar.h(zoVar.b - 1);
            int i = 0;
            while (true) {
                bdp bdpVar = bpoVar2.d;
                if (i < bdpVar.b) {
                    bpn bpnVar = (bpn) bdpVar.a[i];
                    if (a.ao(bpnVar.a, bijVar)) {
                        bdpVar.m(bpnVar);
                        bpnVar.a();
                    } else {
                        zoVar.o(bpnVar);
                        i++;
                    }
                }
            }
        }
    }
}
