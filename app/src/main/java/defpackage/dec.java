package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dec extends uht implements uiu {
    int a;
    final /* synthetic */ dco b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ uiq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dec(dco dcoVar, boolean z, boolean z2, uiq uiqVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = dcoVar;
        this.c = z;
        this.d = z2;
        this.e = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dec) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            return obj;
        }
        dco dcoVar = this.b;
        deb debVar = new deb(!(dcoVar.q() && dcoVar.r()) && this.c, this.d, dcoVar, null, this.e);
        this.a = 1;
        Object objV = dcoVar.v(debVar, this);
        return objV == uhiVar ? uhiVar : objV;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new dec(this.b, this.c, this.d, this.e, uhbVar);
    }
}
