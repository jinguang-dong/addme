package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upy {
    public static final uoz a;

    static {
        Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
        int i = upx.a;
        a = new upv(handlerCreateAsync, "main");
    }
}
