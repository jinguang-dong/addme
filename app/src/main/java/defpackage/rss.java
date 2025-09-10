package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rss implements sxi {
    final /* synthetic */ rso a;
    final /* synthetic */ sxi b;

    public rss(rso rsoVar, sxi sxiVar) {
        this.a = rsoVar;
        this.b = sxiVar;
    }

    @Override // defpackage.sxi
    public final syu a(Object obj) {
        rso rsoVarC = rsa.c(rsa.a(), this.a);
        try {
            syu syuVarA = this.b.a(obj);
            if (syuVarA != null) {
                return syuVarA;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
