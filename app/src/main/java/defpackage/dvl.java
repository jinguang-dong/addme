package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvl implements dvi {
    public final ReentrantLock a = new ReentrantLock();
    public final WeakHashMap b = new WeakHashMap();
    private final dvi c;

    public dvl(dvi dviVar) {
        this.c = dviVar;
    }

    public final void a(Activity activity, duy duyVar) {
        activity.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.b;
            if (a.ao(duyVar, (duy) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((dvo) this.c).a.c.iterator();
            it.getClass();
            while (it.hasNext()) {
                dvp dvpVar = (dvp) it.next();
                if (a.ao(dvpVar.a, activity)) {
                    dvpVar.a(duyVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
