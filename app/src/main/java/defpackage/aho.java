package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aho extends uht implements uiv {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aho(uhb uhbVar, int i) {
        super(3, uhbVar);
        this.a = i;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.a != 0) {
            long j = ((bkf) obj2).a;
            return new aho((uhb) obj3, 1, null).b(ufg.a);
        }
        ((Number) obj2).floatValue();
        return new aho((uhb) obj3, 0).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.a != 0) {
            rnt.aN(obj);
            return ufg.a;
        }
        rnt.aN(obj);
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aho(uhb uhbVar, int i, byte[] bArr) {
        super(3, uhbVar);
        this.a = i;
    }
}
