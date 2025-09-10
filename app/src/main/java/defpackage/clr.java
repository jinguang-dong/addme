package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clr {
    public static String b;
    private static clq f;
    public final NotificationManager d;
    private final Context g;
    public static final Object a = new Object();
    public static Set c = new HashSet();
    private static final Object e = new Object();

    public clr(Context context) {
        this.g = context;
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.d.notify(null, i, notification);
            return;
        }
        Context context = this.g;
        clo cloVar = new clo(context.getPackageName(), i, notification);
        synchronized (e) {
            if (f == null) {
                f = new clq(context.getApplicationContext());
            }
            f.a.obtainMessage(0, cloVar).sendToTarget();
        }
        this.d.cancel(null, i);
    }
}
