package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aug extends uht implements uiv {
    /* synthetic */ float a;
    final /* synthetic */ aus b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aug(aus ausVar, uhb uhbVar) {
        super(3, uhbVar);
        this.b = ausVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        aug augVar = new aug(this.b, (uhb) obj3);
        augVar.c = (und) obj;
        augVar.a = fFloatValue;
        return augVar.b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, und] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        ukc.C(this.c, null, 0, new dqr(this.b, this.a, (uhb) null, 1), 3);
        return ufg.a;
    }
}
