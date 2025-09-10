package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ows implements owf {
    public volatile Object a;
    private final owm b = new owm(new nxi(this, 3));

    public ows(Object obj) {
        this.a = obj;
    }

    public final void a() {
        this.b.a();
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.b.dK(pauVar, executor);
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.b.dL();
    }
}
