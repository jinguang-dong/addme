package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dug {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ukb.a;
        new uji(dug.class).c();
    }

    private dug() {
    }

    public static final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
