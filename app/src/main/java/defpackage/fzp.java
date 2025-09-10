package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzp implements fzx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fzp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.fzx
    public final void a() {
        if (this.b != 0) {
            sgv sgvVar = fze.a;
            fze.i(new fxs(this, 16), ((fze) this.a).c);
        } else {
            sgv sgvVar2 = fzs.a;
            ((fzs) this.a).e.e(true);
        }
    }

    @Override // defpackage.fzx
    public final void b(qaq qaqVar) {
        if (this.b == 0) {
            int iR = qaqVar.r();
            Object obj = this.a;
            if (iR != 0) {
                syw sywVar = ((fzs) obj).c;
                if (sywVar.isShutdown()) {
                    ((sgt) fzs.a.c().M(626)).s("Output executor is shutdown.");
                }
                fzs.e(new fjw(obj, qaqVar, 20), sywVar);
            }
            fzs.e(new gbh(this, qaqVar, 1), ((fzs) obj).b);
            return;
        }
        int iR2 = qaqVar.r();
        Object obj2 = this.a;
        if (iR2 != 0) {
            syw sywVar2 = ((fze) obj2).c;
            if (sywVar2.isShutdown()) {
                ((sgt) fze.a.c().M(601)).s("Output executor is shutdown.");
            }
            fze.i(new fjw(obj2, qaqVar, 18), sywVar2);
        }
        synchronized (((fze) obj2).d) {
            if (((fze) obj2).g.equals(fzd.STARTED)) {
                fze.i(new fjw(this, qaqVar, 19), ((fze) this.a).b);
            }
        }
    }
}
