package defpackage;

import android.content.Context;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class psh implements ThreadFactory {
    private final /* synthetic */ int a;

    public /* synthetic */ psh(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            return new Thread(runnable, "LensSvConn");
        }
        if (i == 1) {
            return new cnd(runnable);
        }
        Context context = qxf.a;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
