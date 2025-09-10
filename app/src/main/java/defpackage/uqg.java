package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uqg extends uhp {
    /* synthetic */ Object a;
    final /* synthetic */ uqi b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqg(uqi uqiVar, uhb uhbVar) {
        super(uhbVar);
        this.b = uqiVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objF = uqi.f(this.b, this);
        return objF == uhi.a ? objF : new uqq(objF);
    }
}
