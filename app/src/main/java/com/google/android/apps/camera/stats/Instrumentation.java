package com.google.android.apps.camera.stats;

import com.google.android.apps.camera.stats.timing.TimingSession;
import defpackage.lor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Instrumentation {
    private static Instrumentation a;
    private final List b = new ArrayList();

    public static synchronized void d(Instrumentation instrumentation) {
        a = instrumentation;
    }

    public static synchronized Instrumentation instance() {
        return a;
    }

    public final synchronized TimingSession a(Class cls) {
        return (TimingSession) b(cls).get(r2.size() - 1);
    }

    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            TimingSession timingSession = (TimingSession) ((WeakReference) it.next()).get();
            if (timingSession != null && timingSession.getClass().equals(cls)) {
                arrayList.add(timingSession);
            }
        }
        return arrayList;
    }

    public final synchronized void c(WeakReference weakReference) {
        this.b.remove(weakReference.get());
    }

    public final synchronized boolean e(Class cls) {
        return !b(cls).isEmpty();
    }

    public final synchronized void f(TimingSession timingSession) {
        this.b.add(new WeakReference(timingSession));
        timingSession.b(new lor(this, timingSession, 7));
    }
}
