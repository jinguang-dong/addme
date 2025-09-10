package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owh extends oww {
    final /* synthetic */ rvu a;
    final /* synthetic */ owf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owh(owf owfVar, rvu rvuVar, owf owfVar2) {
        super(owfVar);
        this.a = rvuVar;
        this.b = owfVar2;
    }

    @Override // defpackage.oww
    protected final Object d(Object obj) {
        return this.a.apply(obj);
    }

    public final String toString() {
        rwb rwbVar = new rwb("TransformedObs");
        rwbVar.b("input", this.b);
        rwbVar.b("func", this.a);
        return rwbVar.toString();
    }
}
