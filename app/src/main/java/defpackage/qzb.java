package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class qzb extends qze {
    private volatile long d;

    public qzb(String str, String str2, qzn qznVar) {
        super(str, str2, qznVar);
    }

    @Override // defpackage.qyq
    protected final /* synthetic */ Object b(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.qyq
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.qyu
    public final /* bridge */ /* synthetic */ Object d() {
        return Long.valueOf(this.d);
    }

    @Override // defpackage.qyu
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Long) obj).longValue();
    }
}
