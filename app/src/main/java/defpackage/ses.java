package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ses extends ryk {
    final Comparable a;
    final /* synthetic */ sev b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ses(sev sevVar, Comparable comparable) {
        super(comparable);
        this.b = sevVar;
        this.a = sevVar.first();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ryk
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (sev.S(obj, this.a)) {
            return null;
        }
        return this.b.a.f(obj);
    }
}
