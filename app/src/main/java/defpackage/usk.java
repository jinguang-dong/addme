package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class usk extends uht implements uiu {
    /* synthetic */ int a;

    public usk(uhb uhbVar) {
        super(2, uhbVar);
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((usk) c(Integer.valueOf(((Number) obj).intValue()), (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        return Boolean.valueOf(this.a > 0);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        usk uskVar = new usk(uhbVar);
        uskVar.a = ((Number) obj).intValue();
        return uskVar;
    }
}
