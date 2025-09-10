package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ove implements ThreadFactory {
    final /* synthetic */ ovd a;
    final /* synthetic */ boolean b;
    private final AtomicInteger c = new AtomicInteger(0);

    public ove(ovd ovdVar, boolean z) {
        this.a = ovdVar;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.b) {
            str = "";
        } else {
            str = PNlJufQ.WeKZJKrNQnzU + this.c.incrementAndGet();
        }
        ovd ovdVar = this.a;
        return new oui(ovdVar.c, runnable, String.valueOf(ovdVar.b).concat(str));
    }
}
