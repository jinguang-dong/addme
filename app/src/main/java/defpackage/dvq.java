package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.cij;
import defpackage.duy;
import defpackage.dvk;
import defpackage.dvl;
import defpackage.dvn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvq implements dvd {
    public static volatile dvq a;
    public static final ReentrantLock b = new ReentrantLock();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final dvn d;

    public dvq(final dvn dvnVar) {
        this.d = dvnVar;
        if (dvnVar != null) {
            dvnVar.e = new dvl(new dvo(this));
            SidecarInterface sidecarInterface = dvnVar.a;
            if (sidecarInterface != null) {
                sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                        SidecarInterface sidecarInterface2;
                        sidecarDeviceState.getClass();
                        dvn dvnVar2 = dvnVar;
                        for (Activity activity : dvnVar2.c.values()) {
                            IBinder iBinderY = cij.y(activity);
                            SidecarWindowLayoutInfo windowLayoutInfo = null;
                            if (iBinderY != null && (sidecarInterface2 = dvnVar2.a) != null) {
                                windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinderY);
                            }
                            dvl dvlVar = dvnVar2.e;
                            if (dvlVar != null) {
                                dvk dvkVar = dvnVar2.b;
                                dvlVar.a(activity, dvk.a(windowLayoutInfo, sidecarDeviceState));
                            }
                        }
                    }

                    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                        SidecarDeviceState sidecarDeviceState;
                        iBinder.getClass();
                        sidecarWindowLayoutInfo.getClass();
                        dvn dvnVar2 = dvnVar;
                        Activity activity = (Activity) dvnVar2.c.get(iBinder);
                        if (activity == null) {
                            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                            return;
                        }
                        dvk dvkVar = dvnVar2.b;
                        SidecarInterface sidecarInterface2 = dvnVar2.a;
                        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        duy duyVarA = dvk.a(sidecarWindowLayoutInfo, sidecarDeviceState);
                        dvl dvlVar = dvnVar2.e;
                        if (dvlVar != null) {
                            dvlVar.a(activity, duyVarA);
                        }
                    }
                }, null));
            }
        }
    }

    @Override // defpackage.dvd
    public final void a(Context context, Executor executor, cnh cnhVar) {
        Object next;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            dvn dvnVar = this.d;
            if (dvnVar == null) {
                cnhVar.accept(new duy(ufw.a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            boolean z = false;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (a.ao(((dvp) it.next()).a, context)) {
                        z = true;
                        break;
                    }
                }
            }
            dvp dvpVar = new dvp((Activity) context, executor, cnhVar);
            copyOnWriteArrayList.add(dvpVar);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (a.ao(context, ((dvp) next).a)) {
                            break;
                        }
                    }
                }
                dvp dvpVar2 = (dvp) next;
                duy duyVar = dvpVar2 != null ? dvpVar2.c : null;
                if (duyVar != null) {
                    dvpVar.a(duyVar);
                }
            } else {
                IBinder iBinderY = cij.y((Activity) context);
                if (iBinderY != null) {
                    dvnVar.b(iBinderY, (Activity) context);
                } else {
                    ((Activity) context).getWindow().getDecorView().addOnAttachStateChangeListener(new dvm(dvnVar, (Activity) context));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dvd
    public final void b(cnh cnhVar) {
        synchronized (b) {
            dvn dvnVar = this.d;
            if (dvnVar == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            Iterator it = copyOnWriteArrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                dvp dvpVar = (dvp) it.next();
                if (dvpVar.b == cnhVar) {
                    dvpVar.getClass();
                    arrayList.add(dvpVar);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Activity activity = ((dvp) it2.next()).a;
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (a.ao(((dvp) it3.next()).a, activity)) {
                            break;
                        }
                    }
                }
                IBinder iBinderY = cij.y(activity);
                if (iBinderY == null) {
                    continue;
                } else {
                    SidecarInterface sidecarInterface = dvnVar.a;
                    if (sidecarInterface != null) {
                        sidecarInterface.onWindowLayoutChangeListenerRemoved(iBinderY);
                    }
                    Map map = dvnVar.d;
                    cnh cnhVar2 = (cnh) map.get(activity);
                    if (cnhVar2 != null) {
                        if (activity instanceof clw) {
                            ((clw) activity).f(cnhVar2);
                        }
                        map.remove(activity);
                    }
                    dvl dvlVar = dvnVar.e;
                    if (dvlVar != null) {
                        ReentrantLock reentrantLock = dvlVar.a;
                        reentrantLock.lock();
                        try {
                            dvlVar.b.put(activity, null);
                            reentrantLock.unlock();
                        } finally {
                        }
                    }
                    Map map2 = dvnVar.c;
                    int size = map2.size();
                    map2.remove(iBinderY);
                    if (size == 1 && sidecarInterface != null) {
                        sidecarInterface.onDeviceStateListenersChanged(true);
                    }
                }
            }
        }
    }
}
