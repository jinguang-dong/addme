package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozs implements Callable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ozs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (this.b == 0) {
            ((ozv) this.a).close();
            return null;
        }
        Object obj = this.a;
        synchronized (obj) {
            if (((epq) obj).f != null) {
                ((epq) obj).f();
                if (((epq) obj).g()) {
                    ((epq) obj).d();
                    ((epq) obj).h = 0;
                }
            }
        }
        return null;
    }
}
