package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qir implements qgj {
    public static final qir a = new qir(0);
    private final /* synthetic */ int b;

    public qir(int i) {
        this.b = i;
    }

    @Override // defpackage.qgj
    public final /* synthetic */ qgf a(Object obj, Executor executor) {
        return this.b != 0 ? ((qjy) ((qim) obj).h()).a() : ((qff) obj).a();
    }
}
