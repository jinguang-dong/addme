package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baa extends uhp {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ byt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baa(byt bytVar, uhb uhbVar) {
        super(uhbVar);
        this.d = bytVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
