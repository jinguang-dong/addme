package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class upx {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objAM;
        try {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, Looper.getMainLooper());
            objInvoke.getClass();
            objAM = new upv((Handler) objInvoke, null);
        } catch (Throwable th) {
            objAM = rnt.aM(th);
        }
    }
}
