package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tdh {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            Class<?> cls = Class.forName("android.os.Trace");
            cls.getMethod("beginAsyncSection", String.class, Integer.TYPE);
            cls.getMethod("endAsyncSection", String.class, Integer.TYPE);
        } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException unused) {
        }
        Logger.getLogger("AndroidTrace");
    }
}
