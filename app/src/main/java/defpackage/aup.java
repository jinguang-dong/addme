package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aup extends uhp {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ auq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aup(auq auqVar, uhb uhbVar) {
        super(uhbVar);
        this.c = auqVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
