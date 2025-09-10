package defpackage;

import android.content.ContentResolver;
import android.os.Handler;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gbe {
    private static final sgv b = sgv.g("gbe");
    private static final Duration c = Duration.ofMillis(250);
    public final gbc a;
    private final ContentResolver d;
    private final Handler e;
    private final ScheduledExecutorService f;
    private final Window g;
    private ScheduledFuture h;

    public gbe(ContentResolver contentResolver, gbc gbcVar, ScheduledExecutorService scheduledExecutorService, Handler handler, Window window) {
        this.d = contentResolver;
        this.a = gbcVar;
        this.e = handler;
        this.f = scheduledExecutorService;
        this.g = window;
    }

    private final void f() {
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public final int a() {
        try {
            return Settings.System.getInt(this.d, "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            ((sgt) ((sgt) b.c().i(e)).M((char) 672)).s("Fail to get screen brightness setting.");
            return -1;
        }
    }

    public final void b() {
        f();
        this.e.post(new gba(this, 4));
    }

    public final void c(float f) {
        Window window = this.g;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
    }

    public final void d(int i, boolean z) {
        f();
        if (i - 1 != 0) {
            int iA = a();
            if (iA != -1) {
                e(iA, this.a.b(iA, 0.1f, z), z);
                return;
            }
            return;
        }
        int iA2 = a();
        if (iA2 != -1) {
            this.e.post(new cmu(this, this.a.b(iA2, 0.1f, z), 9, null));
        }
    }

    public final void e(int i, int i2, boolean z) {
        int iB = this.a.b(i, 0.0025f, z);
        if (iB == i) {
            iB--;
        }
        int i3 = iB;
        if (i3 < i2) {
            return;
        }
        this.e.post(new cmu(this, i3, 8, null));
        if (i3 > i2) {
            this.h = this.f.schedule(new vcv(this, i3, i2, z, 1), c.toMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
