package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class qyx extends qze {
    private volatile boolean d;

    public qyx(String str, String str2, qzn qznVar) {
        super(str, str2, qznVar);
    }

    @Override // defpackage.qyq
    protected final /* synthetic */ Object b(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.qyq
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.qyu
    public final /* bridge */ /* synthetic */ Object d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.qyu
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Boolean) obj).booleanValue();
    }
}
