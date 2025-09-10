package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrc {
    private static final Map n = new HashMap();
    public final Context a;
    public boolean f;
    public final Intent g;
    public ServiceConnection k;
    public IInterface l;
    public final rtl m;
    public final List c = new ArrayList();
    public final Set d = new HashSet();
    public final Object e = new Object();
    public final IBinder.DeathRecipient i = new IBinder.DeathRecipient() { // from class: rqu
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            rrc rrcVar = this.a;
            rqy rqyVar = (rqy) rrcVar.h.get();
            if (rqyVar != null) {
                rqyVar.a();
            } else {
                List list = rrcVar.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((rqt) it.next()).b(rrcVar.a());
                }
                list.clear();
            }
            synchronized (rrcVar.e) {
                rrcVar.b();
            }
        }
    };
    public final AtomicInteger j = new AtomicInteger(0);
    public final String b = "AppUpdateService";
    public final WeakReference h = new WeakReference(null);

    public rrc(Context context, rtl rtlVar, Intent intent) {
        this.a = context;
        this.m = rtlVar;
        this.g = intent;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.b).concat(" : Binder has died."));
    }

    public final void b() {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((pfl) it.next()).e(a());
        }
        set.clear();
    }

    public final void c(rqt rqtVar) {
        Handler handler;
        Map map = n;
        synchronized (map) {
            String str = this.b;
            if (!map.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(str);
        }
        handler.post(rqtVar);
    }

    public final void e(rqt rqtVar, pfl pflVar) {
        c(new rqw(this, rqtVar.d, pflVar, rqtVar));
    }

    public final void f(pfl pflVar) {
        synchronized (this.e) {
            this.d.remove(pflVar);
        }
        c(new rqx(this));
    }
}
