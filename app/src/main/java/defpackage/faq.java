package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faq implements far {
    final /* synthetic */ far a;
    private volatile Object b;

    public faq(far farVar) {
        this.a = farVar;
    }

    @Override // defpackage.far
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object objA = this.a.a();
                    eoz.k(objA);
                    this.b = objA;
                }
            }
        }
        return this.b;
    }
}
