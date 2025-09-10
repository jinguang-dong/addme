package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kua {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(Context context) {
        if (b.compareAndSet(false, true)) {
            qxt.f(context);
        }
    }
}
