package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class crf extends uht implements uiv {
    int a;
    final /* synthetic */ cru b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crf(cru cruVar, uhb uhbVar) {
        super(3, uhbVar);
        this.b = cruVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new crf(this.b, (uhb) obj3).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            cru cruVar = this.b;
            this.a = 1;
            if (cruVar.a(this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }
}
