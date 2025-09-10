package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojo {
    private static final ojo a = new ojo();
    private pfl b = null;

    public static pfl b(Context context) {
        return a.a(context);
    }

    public final synchronized pfl a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new pfl(context);
        }
        return this.b;
    }
}
