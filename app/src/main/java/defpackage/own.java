package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class own extends owx {
    final /* synthetic */ rvu a;
    final /* synthetic */ rvu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public own(owq owqVar, rvu rvuVar, rvu rvuVar2) {
        super(owqVar);
        this.a = rvuVar;
        this.b = rvuVar2;
    }

    @Override // defpackage.owx
    public final Object b(Object obj) {
        return this.a.apply(obj);
    }

    @Override // defpackage.owx
    protected final Object c(Object obj) {
        return this.b.apply(obj);
    }
}
