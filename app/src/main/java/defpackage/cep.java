package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cep extends uhp {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ pfl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cep(pfl pflVar, uhb uhbVar) {
        super(uhbVar);
        this.d = pflVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.u(null, this);
    }
}
