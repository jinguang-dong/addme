package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cmd {
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(Typeface typeface);

    public abstract void b();

    public final void c(int i) {
        e().post(new mb(this, 9));
    }

    public final void d(Typeface typeface) {
        e().post(new cmc(this, typeface, 0));
    }
}
