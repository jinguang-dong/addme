package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class anj extends uht implements uiu {
    final /* synthetic */ ank a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anj(ank ankVar, int i, int i2, uhb uhbVar) {
        super(2, uhbVar);
        this.a = ankVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anj) c((aim) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        this.a.l(this.b, this.c);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new anj(this.a, this.b, this.c, uhbVar);
    }
}
