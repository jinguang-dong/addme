package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzj implements dwy {
    public static final String a = dwj.a(PNlJufQ.bVjrfMf);
    final Context b;
    public final edj c;
    public final dxj d;
    public final dyj e;
    final dza f;
    final List g;
    Intent h;
    public dzh i;
    public final ebn j;
    final gga k;
    private final dxo l;

    public dzj(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        dxo dxoVarO = cpo.o();
        this.l = dxoVarO;
        dyj dyjVarA = dyj.a(context);
        this.e = dyjVarA;
        cpn cpnVar = dyjVarA.c.g;
        this.f = new dza(applicationContext, dxoVarO);
        this.c = new edj(dyjVarA.c.f);
        dxj dxjVar = dyjVarA.f;
        this.d = dxjVar;
        gga ggaVar = dyjVarA.k;
        this.k = ggaVar;
        this.j = new ebn(dxjVar, ggaVar);
        dxjVar.a(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.dwy
    public final void a(ebm ebmVar, boolean z) {
        String str = dza.a;
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        dza.f(intent, ebmVar);
        this.k.c.execute(new dzg(this, intent, 0));
    }

    public final void b() {
        dwj.b();
        this.d.b(this);
        this.i = null;
    }

    public final void c() {
        e();
        PowerManager.WakeLock wakeLockA = edd.a(this.b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.k.f(new dzf(this));
        } finally {
            wakeLockA.release();
        }
    }

    public final void d(Intent intent, int i) {
        dwj.b();
        Objects.toString(intent);
        e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            dwj.b();
            Log.w(a, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            e();
            List list = this.g;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        List list2 = this.g;
        synchronized (list2) {
            boolean zIsEmpty = list2.isEmpty();
            list2.add(intent);
            if (zIsEmpty) {
                c();
            }
        }
    }
}
