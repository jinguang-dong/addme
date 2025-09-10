package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckc extends ckh {
    public ckc(cjn cjnVar) {
        super(cjnVar);
        cjnVar.h.d();
        cjnVar.i.d();
        this.f = ((cjq) cjnVar).ar;
    }

    private final void g(cjz cjzVar) {
        cjz cjzVar2 = this.h;
        cjzVar2.j.add(cjzVar);
        cjzVar.k.add(cjzVar2);
    }

    @Override // defpackage.ckh
    public final void b() {
        cjn cjnVar = this.d;
        cjq cjqVar = (cjq) cjnVar;
        int i = cjqVar.b;
        int i2 = cjqVar.c;
        float f = cjqVar.a;
        if (cjqVar.ar == 1) {
            if (i != -1) {
                cjz cjzVar = this.h;
                cjzVar.k.add(cjnVar.U.h.h);
                this.d.U.h.h.j.add(cjzVar);
                cjzVar.e = i;
            } else if (i2 != -1) {
                cjz cjzVar2 = this.h;
                cjzVar2.k.add(cjnVar.U.h.i);
                this.d.U.h.i.j.add(cjzVar2);
                cjzVar2.e = -i2;
            } else {
                cjz cjzVar3 = this.h;
                cjzVar3.b = true;
                cjzVar3.k.add(cjnVar.U.h.i);
                this.d.U.h.i.j.add(cjzVar3);
            }
            g(this.d.h.h);
            g(this.d.h.i);
            return;
        }
        if (i != -1) {
            cjz cjzVar4 = this.h;
            cjzVar4.k.add(cjnVar.U.i.h);
            this.d.U.i.h.j.add(cjzVar4);
            cjzVar4.e = i;
        } else if (i2 != -1) {
            cjz cjzVar5 = this.h;
            cjzVar5.k.add(cjnVar.U.i.i);
            this.d.U.i.i.j.add(cjzVar5);
            cjzVar5.e = -i2;
        } else {
            cjz cjzVar6 = this.h;
            cjzVar6.b = true;
            cjzVar6.k.add(cjnVar.U.i.i);
            this.d.U.i.i.j.add(cjzVar6);
        }
        g(this.d.i.h);
        g(this.d.i.i);
    }

    @Override // defpackage.ckh
    public final void c() {
        cjn cjnVar = this.d;
        if (((cjq) cjnVar).ar == 1) {
            cjnVar.Z = this.h.f;
        } else {
            cjnVar.aa = this.h.f;
        }
    }

    @Override // defpackage.ckh
    public final void d() {
        this.h.b();
    }

    @Override // defpackage.ckh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ckh, defpackage.cjx
    public final void f() {
        cjz cjzVar = this.h;
        if (cjzVar.c && !cjzVar.i) {
            cjzVar.c((int) ((((cjz) cjzVar.k.get(0)).f * ((cjq) this.d).a) + 0.5f));
        }
    }
}
