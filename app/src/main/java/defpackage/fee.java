package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fee {
    private final nnm a;
    private final owf b;
    private final ktv c;
    private final boolean d;
    private final boolean e;
    private final pnk f;

    public fee(pnk pnkVar, nnm nnmVar, hbj hbjVar, owf owfVar) {
        this.f = pnkVar;
        this.a = nnmVar;
        this.b = owfVar;
        this.c = new ktv(pnkVar);
        this.d = hbjVar.p(gzo.br);
        this.e = hbjVar.p(gza.d);
    }

    public final owf a(pjo pjoVar) {
        return owb.a(owl.h(owl.a(this.c, this.a.a()), new iaz(this, pjoVar, 1)));
    }

    public final pao b(pjo pjoVar) {
        return pao.b(c(pjoVar));
    }

    public final int c(pjo pjoVar) {
        boolean zD = true;
        boolean z = this.d && this.a.e();
        int i = this.f.a().e;
        if (z) {
            i = ((pao) ((Optional) this.a.a().dL()).orElse(pao.b(i))).e;
        }
        if (z) {
            zD = this.a.d();
        } else if (pjoVar.l() != pka.FRONT) {
            zD = false;
        }
        int iIntValue = this.e ? ((Integer) this.b.dL()).intValue() : pjoVar.g();
        if (zD) {
            i = (360 - i) % 360;
        }
        return (iIntValue + i) % 360;
    }
}
