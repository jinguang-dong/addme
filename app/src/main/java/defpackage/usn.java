package defpackage;

/* loaded from: classes2.dex */
public final class usn extends uhp {
    /* synthetic */ Object a;
    int b;
    Object c;
    Object d;
    final /* synthetic */ uru e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usn(uru uruVar, uhb uhbVar) {
        super(uhbVar);
        this.e = uruVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
