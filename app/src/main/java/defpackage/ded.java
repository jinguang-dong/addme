package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ded extends uht implements uiu {
    int a;
    final /* synthetic */ uhf b;
    final /* synthetic */ dco c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ uiq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(uhf uhfVar, dco dcoVar, boolean z, boolean z2, uiq uiqVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = uhfVar;
        this.c = dcoVar;
        this.d = z;
        this.e = z2;
        this.f = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ded) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            return obj;
        }
        uhf uhfVar = this.b;
        dec decVar = new dec(this.c, this.d, this.e, this.f, null);
        this.a = 1;
        Object objS = ung.s(uhfVar, decVar, this);
        return objS == uhiVar ? uhiVar : objS;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new ded(this.b, this.c, this.d, this.e, this.f, uhbVar);
    }
}
