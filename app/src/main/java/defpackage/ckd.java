package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckd extends ckh {
    public ckd(cjn cjnVar) {
        super(cjnVar);
    }

    private final void g(cjz cjzVar) {
        cjz cjzVar2 = this.h;
        cjzVar2.j.add(cjzVar);
        cjzVar.k.add(cjzVar2);
    }

    @Override // defpackage.ckh
    public final void b() {
        cjn cjnVar = this.d;
        if (cjnVar instanceof cjk) {
            cjz cjzVar = this.h;
            cjzVar.b = true;
            cjk cjkVar = (cjk) cjnVar;
            int i = cjkVar.a;
            boolean z = cjkVar.b;
            int i2 = 0;
            if (i == 0) {
                cjzVar.l = 4;
                while (i2 < cjkVar.as) {
                    cjn cjnVar2 = cjkVar.ar[i2];
                    if (z || cjnVar2.ah != 8) {
                        cjz cjzVar2 = cjnVar2.h.h;
                        cjzVar2.j.add(cjzVar);
                        cjzVar.k.add(cjzVar2);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
                return;
            }
            if (i == 1) {
                cjzVar.l = 5;
                while (i2 < cjkVar.as) {
                    cjn cjnVar3 = cjkVar.ar[i2];
                    if (z || cjnVar3.ah != 8) {
                        cjz cjzVar3 = cjnVar3.h.i;
                        cjzVar3.j.add(cjzVar);
                        cjzVar.k.add(cjzVar3);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
                return;
            }
            if (i == 2) {
                cjzVar.l = 6;
                while (i2 < cjkVar.as) {
                    cjn cjnVar4 = cjkVar.ar[i2];
                    if (z || cjnVar4.ah != 8) {
                        cjz cjzVar4 = cjnVar4.i.h;
                        cjzVar4.j.add(cjzVar);
                        cjzVar.k.add(cjzVar4);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
                return;
            }
            if (i != 3) {
                return;
            }
            cjzVar.l = 7;
            while (i2 < cjkVar.as) {
                cjn cjnVar5 = cjkVar.ar[i2];
                if (z || cjnVar5.ah != 8) {
                    cjz cjzVar5 = cjnVar5.i.i;
                    cjzVar5.j.add(cjzVar);
                    cjzVar.k.add(cjzVar5);
                }
                i2++;
            }
            g(this.d.i.h);
            g(this.d.i.i);
        }
    }

    @Override // defpackage.ckh
    public final void c() {
        cjn cjnVar = this.d;
        if (cjnVar instanceof cjk) {
            int i = ((cjk) cjnVar).a;
            if (i == 0 || i == 1) {
                cjnVar.Z = this.h.f;
            } else {
                cjnVar.aa = this.h.f;
            }
        }
    }

    @Override // defpackage.ckh
    public final void d() {
        this.l = null;
        this.h.b();
    }

    @Override // defpackage.ckh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ckh, defpackage.cjx
    public final void f() {
        cjk cjkVar = (cjk) this.d;
        int i = cjkVar.a;
        cjz cjzVar = this.h;
        Iterator it = cjzVar.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((cjz) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            cjzVar.c(i3 + cjkVar.c);
        } else {
            cjzVar.c(i2 + cjkVar.c);
        }
    }
}
