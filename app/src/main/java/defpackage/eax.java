package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.wear.ambient.AmbientLifecycleObserver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eax implements dzs, dwy {
    public static final String a = dwj.a("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final dyj b;
    public final Object c = new Object();
    ebm d;
    public final Map e;
    public final Map f;
    public final Map g;
    public eaw h;
    public final ejs i;
    public final gga j;
    private final Context l;

    public eax(Context context) {
        this.l = context;
        dyj dyjVarA = dyj.a(context);
        this.b = dyjVarA;
        this.j = dyjVarA.k;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.i = new ejs(dyjVarA.j);
        dyjVarA.f.a(this);
    }

    @Override // defpackage.dwy
    public final void a(ebm ebmVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            uol uolVar = ((ebx) this.f.remove(ebmVar)) != null ? (uol) this.g.remove(ebmVar) : null;
            if (uolVar != null) {
                uolVar.s(null);
            }
        }
        Map map = this.e;
        dwb dwbVar = (dwb) map.remove(ebmVar);
        if (ebmVar.equals(this.d)) {
            if (map.size() > 0) {
                Iterator it = map.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (ebm) entry.getKey();
                if (this.h != null) {
                    dwb dwbVar2 = (dwb) entry.getValue();
                    eaw eawVar = this.h;
                    int i = dwbVar2.a;
                    eawVar.c(i, dwbVar2.b, dwbVar2.c);
                    this.h.a(i);
                }
            } else {
                this.d = null;
            }
        }
        eaw eawVar2 = this.h;
        if (dwbVar == null || eawVar2 == null) {
            return;
        }
        dwj.b();
        int i2 = dwbVar.a;
        Objects.toString(ebmVar);
        int i3 = dwbVar.b;
        eawVar2.a(i2);
    }

    public final void b(Intent intent) {
        if (this.h == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        ebm ebmVar = new ebm(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        dwj.b();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        dwb dwbVar = new dwb(intExtra, notification, intExtra2);
        Map map = this.e;
        map.put(ebmVar, dwbVar);
        dwb dwbVar2 = (dwb) map.get(this.d);
        if (dwbVar2 == null) {
            this.d = ebmVar;
        } else {
            this.h.b(intExtra, notification);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((dwb) ((Map.Entry) it.next()).getValue()).b;
            }
            dwbVar = new dwb(dwbVar2.a, dwbVar2.c, i);
        }
        this.h.c(dwbVar.a, dwbVar.b, dwbVar.c);
    }

    public final void c() {
        this.h = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((uol) it.next()).s(null);
            }
        }
        this.b.f.b(this);
    }

    @Override // defpackage.dzs
    public final void e(ebx ebxVar, cpo cpoVar) {
        if (cpoVar instanceof dzo) {
            dwj.b();
            this.b.d(AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar), ((dzo) cpoVar).a);
        }
    }
}
