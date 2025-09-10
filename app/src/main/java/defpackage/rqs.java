package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqs {
    protected final Set a;
    private final IntentFilter b;
    private final Context c;
    private rqr d;
    private volatile boolean e;

    public rqs(Context context) {
        new rtl("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.a = new HashSet();
        this.d = null;
        this.e = false;
        this.b = intentFilter;
        this.c = qsy.h(context);
    }

    private final void d() {
        rqr rqrVar;
        Set set = this.a;
        if (!set.isEmpty() && this.d == null) {
            rqr rqrVar2 = new rqr(this);
            this.d = rqrVar2;
            this.c.registerReceiver(rqrVar2, this.b, 2);
        }
        if (!set.isEmpty() || (rqrVar = this.d) == null) {
            return;
        }
        this.c.unregisterReceiver(rqrVar);
        this.d = null;
    }

    public final synchronized void a(Object obj) {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) it.next();
            int i = ((rql) obj).a;
            if (i == 2) {
                long j = ((rql) obj).c;
                int i2 = 0;
                int i3 = j != 0 ? (int) ((((rql) obj).b * 100) / j) : 0;
                if (i3 < 0) {
                    ((sgt) nmm.a.c().M(5432)).y("Progress (%d) is less than 0! state=%s", i3, obj);
                } else {
                    i2 = 100;
                    if (i3 > 100) {
                        ((sgt) nmm.a.c().M(5431)).y("Progress (%d) is greater than 100! state=%s", i3, obj);
                    } else {
                        i2 = i3;
                    }
                }
                ((nmm) ambientController.a).c.r(i2);
            } else if (i == 11) {
                Object obj2 = ambientController.a;
                ((nmm) obj2).e.q(ambientController);
                ((nmm) obj2).c.q();
            } else if (i == 6 || i == 5) {
                sgt sgtVar = (sgt) nmm.a.c().M(5430);
                int i4 = ((rql) obj).d;
                sgtVar.t("Update failed. Error code: %s", i4);
                Object obj3 = ambientController.a;
                ((nmm) obj3).e.q(ambientController);
                ((nmm) obj3).c.v(4, i4);
            }
        }
    }

    public final synchronized void b(AmbientModeSupport.AmbientController ambientController) {
        this.a.add(ambientController);
        d();
    }

    public final synchronized void c(AmbientModeSupport.AmbientController ambientController) {
        this.a.remove(ambientController);
        d();
    }
}
