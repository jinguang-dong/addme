package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uu implements tzx {
    private final int a;
    private final kyz b;
    private final uh c;

    public uu(kyz kyzVar, uh uhVar, int i) {
        this.b = kyzVar;
        this.c = uhVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, wb] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        switch (this.a) {
            case 0:
                uh uhVar = this.c;
                und undVar = (und) uhVar.f.a();
                kyz kyzVar = this.b;
                qrh qrhVar = (qrh) kyzVar.h.a();
                sp spVar = (sp) uhVar.g.a();
                ti tiVar = (ti) uhVar.d.a();
                kyz kyzVar2 = (kyz) uhVar.h;
                qrh qrhVar2 = (qrh) kyzVar2.h.a();
                ut utVar = (ut) uhVar.i;
                pl plVar = (pl) utVar.b;
                cey ceyVar = new cey(qrhVar2, plVar, (wq) utVar.d, (sx) kyzVar2.n.a());
                uh uhVar2 = (uh) kyzVar.c.a();
                py pyVar = (py) kyzVar.p.a();
                sx sxVar = (sx) kyzVar.n.a();
                byi byiVar = (byi) kyzVar.d.a();
                Object obj = utVar.f;
                return new sl(undVar, qrhVar, plVar, utVar.c, (wr) utVar.e, spVar, tiVar, ceyVar, uhVar2, pyVar, sxVar, byiVar, (po) utVar.a, (qrh) obj);
            case 1:
                qrh qrhVar3 = (qrh) this.b.h.a();
                qrhVar3.getClass();
                return ung.j(((ugx) qrhVar3.c).plus(new unc("CXCP-Camera2Controller")));
            case 2:
                kyz kyzVar3 = this.b;
                qrh qrhVar4 = (qrh) kyzVar3.h.a();
                uh uhVar3 = this.c;
                qrhVar4.getClass();
                return new sp(kyzVar3.m, qrhVar4, ((pl) ((ut) uhVar3.i).b).a);
            case 3:
                uh uhVar4 = this.c;
                return a.p(((pl) ((ut) uhVar4.i).b).g, 2) ? (ti) uhVar4.a.a() : (ti) uhVar4.e.a();
            case 4:
                return new rx((qrh) this.b.h.a(), 1, null);
            case 5:
                return new ry((qrh) this.b.h.a(), (pl) ((ut) this.c.i).b);
            case 6:
                return new rx((qrh) this.b.h.a(), 0);
            case 7:
                qrh qrhVar5 = (qrh) this.b.h.a();
                ut utVar2 = (ut) this.c.i;
                return new rz(qrhVar5, (wq) utVar2.d, (pl) utVar2.b);
            case 8:
                qrh qrhVar6 = (qrh) this.b.h.a();
                ut utVar3 = (ut) this.c.i;
                return new sb(qrhVar6, (pl) utVar3.b, (wq) utVar3.d);
            default:
                kyz kyzVar4 = this.b;
                qrh qrhVar7 = (qrh) kyzVar4.h.a();
                uh uhVar5 = this.c;
                ut utVar4 = (ut) kyzVar4.j.a();
                ut utVar5 = (ut) uhVar5.i;
                return new rt(qrhVar7, (pl) utVar5.b, (wq) utVar5.d, utVar4);
        }
    }
}
