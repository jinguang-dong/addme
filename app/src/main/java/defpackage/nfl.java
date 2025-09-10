package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfl {
    private static nfl a;
    private final int b;

    private nfl(Context context) {
        this.b = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        ((Activity) context).isInMultiWindowMode();
    }

    public static int a(Context context) {
        nfl nflVar = a;
        return nflVar != null ? nflVar.b : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static void b(Context context) {
        if (a == null) {
            a = new nfl(context);
        }
    }

    public static void c() {
        a = null;
    }
}
