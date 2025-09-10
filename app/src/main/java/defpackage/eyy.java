package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import com.bumptech.glide.manager.LifecycleLifecycle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyy implements Handler.Callback {
    private static final ezh b = new ezh((byte[]) null);
    private volatile epl a;
    private final ejt c;

    public eyy() {
        new yd();
        this.c = new ejt((byte[]) null, (byte[]) null, (byte[]) null);
        int i = exd.a;
    }

    private static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final epl a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (fax.j() && !(context instanceof Application)) {
            if (context instanceof bp) {
                bp bpVar = (bp) context;
                if (fax.i()) {
                    return a(bpVar.getApplicationContext());
                }
                if (bpVar.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                Activity activityB = b(bpVar);
                boolean z = true;
                if (activityB != null && activityB.isFinishing()) {
                    z = false;
                }
                eox eoxVarB = eox.b(bpVar.getApplicationContext());
                ejt ejtVar = this.c;
                cwc cwcVar = bpVar.f;
                bpVar.eo();
                fax.g();
                fax.g();
                ?? r3 = ejtVar.a;
                epl eplVar = (epl) r3.get(cwcVar);
                if (eplVar != null) {
                    return eplVar;
                }
                LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(cwcVar);
                epl eplVar2 = new epl(eoxVarB, lifecycleLifecycle, new eyw(), bpVar);
                r3.put(cwcVar, eplVar2);
                lifecycleLifecycle.a(new eyv(ejtVar, cwcVar));
                if (z) {
                    eplVar2.g();
                }
                return eplVar2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new epl(eox.b(context.getApplicationContext()), new eyp(), new eyw(), context.getApplicationContext());
                }
            }
        }
        return this.a;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
