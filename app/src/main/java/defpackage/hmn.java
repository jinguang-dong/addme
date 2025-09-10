package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmn implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public hmn(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? b() : b() : b() : b();
    }

    public final hlf b() {
        int i = this.b;
        if (i == 0) {
            ((hlj) this.a).a();
            gzg gzgVar = gyy.a;
            return cxb.H();
        }
        if (i == 1) {
            ((hlj) this.a).a();
            gzg gzgVar2 = gyy.a;
            return cxb.H();
        }
        if (i != 2) {
            ((hlj) this.a).a();
            gzi gziVar = gzz.a;
            return new hli(0);
        }
        return new hlh(((hbj) ((hlj) this.a).a().a).p(gyy.b));
    }
}
