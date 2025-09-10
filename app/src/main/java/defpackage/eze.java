package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eze {
    private static volatile eze b;
    final Object a;
    private boolean c;
    private final Object d;

    public eze() {
        throw null;
    }

    static eze a(Context context) {
        if (b == null) {
            synchronized (eze.class) {
                if (b == null) {
                    b = new eze(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [far, java.lang.Object] */
    final synchronized void b(eyq eyqVar) {
        ?? r0 = this.a;
        r0.add(eyqVar);
        if (!this.c && !r0.isEmpty()) {
            Object obj = this.d;
            ?? r02 = ((nyr) obj).c;
            boolean z = true;
            ((nyr) obj).a = ((ConnectivityManager) r02.a()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) r02.a()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) ((nyr) obj).d);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.c = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [far, java.lang.Object] */
    final synchronized void c(eyq eyqVar) {
        ?? r0 = this.a;
        r0.remove(eyqVar);
        if (this.c && r0.isEmpty()) {
            Object obj = this.d;
            ((ConnectivityManager) ((nyr) obj).c.a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) ((nyr) obj).d);
            this.c = false;
        }
    }

    public final void d() {
        this.c = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rnh] */
    public final void e(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.a.a(typeface);
    }

    public final void f() {
        e((Typeface) this.d);
    }

    public eze(rnh rnhVar, Typeface typeface) {
        this.d = typeface;
        this.a = rnhVar;
    }

    private eze(Context context) {
        this.a = new HashSet();
        this.d = new nyr(new faq(new ezb(context)), new ezc(this));
    }
}
