package defpackage;

import android.os.PowerManager;
import android.os.Trace;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mhm {
    public static final sgv a = sgv.g("mhm");
    public final PowerManager b;
    public boolean c = false;
    public boolean d = false;
    public final Executor e;

    public mhm(PowerManager powerManager, Executor executor) {
        this.b = powerManager;
        this.e = executor;
    }

    final int a() {
        return this.b.getCurrentThermalStatus();
    }

    final synchronized void b(final PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener) {
        this.c = true;
        this.e.execute(new Runnable() { // from class: mhk
            @Override // java.lang.Runnable
            public final void run() {
                mhm mhmVar = this.a;
                PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener2 = onThermalStatusChangedListener;
                synchronized (mhmVar) {
                    if (!mhmVar.c) {
                        ((sgt) mhm.a.c().M(4766)).s("removeThermalStatusListener already called. Not registering listener.");
                        return;
                    }
                    Trace.beginSection("AddThermalStatusListener");
                    mhmVar.b.addThermalStatusListener(mhmVar.e, onThermalStatusChangedListener2);
                    Trace.endSection();
                    mhmVar.d = true;
                }
            }
        });
    }
}
