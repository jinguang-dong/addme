package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abq extends uht implements uiq {
    final /* synthetic */ abr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abq(abr abrVar, uhb uhbVar) {
        super(1, uhbVar);
        this.a = abrVar;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new abq(this.a, (uhb) obj).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        this.a.g();
        return ufg.a;
    }
}
