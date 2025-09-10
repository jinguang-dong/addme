package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qyy extends qyz {
    private volatile boolean d;
    private Object e;

    public qyy(String str, qzn qznVar, qyv qyvVar, String str2) {
        super(str, qznVar, qyvVar);
        this.e = str2;
        this.d = true;
    }

    @Override // defpackage.qyq
    public final Object e() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    Object objFt = ft((String) this.e);
                    objFt.getClass();
                    this.e = objFt;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
