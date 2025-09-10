package defpackage;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsx {
    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final rvu a(rvu rvuVar) {
        return new rsu(rsa.b(), rvuVar);
    }

    public static final sxh b(sxh sxhVar) {
        return new sxu(rsa.b(), sxhVar, 1);
    }

    public static final sxi c(sxi sxiVar) {
        return new rss(rsa.b(), sxiVar);
    }

    public static final syf d(syf syfVar) {
        return new rsv(rsa.b(), syfVar);
    }

    public static final Runnable e(Runnable runnable) {
        return new rsw(new uka(), rsa.b(), runnable, 0);
    }

    public static final Callable f(Callable callable) {
        return new rst(rsa.b(), callable);
    }
}
