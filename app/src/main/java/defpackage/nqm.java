package defpackage;

import android.util.ArraySet;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqm implements nqo {
    private final Set a = new ArraySet();
    private boolean b = true;

    @Override // defpackage.nqo
    public final synchronized boolean a(MotionEvent motionEvent) {
        boolean zA;
        Iterator it = this.a.iterator();
        zA = false;
        while (it.hasNext()) {
            zA |= ((nqo) it.next()).a(motionEvent);
        }
        return zA;
    }

    public final synchronized void b(nqo nqoVar) {
        this.a.add(nqoVar);
    }

    public final synchronized void c(boolean z) {
        this.b = z;
    }

    public final synchronized void d(nqo nqoVar) {
        this.a.remove(nqoVar);
    }

    public final synchronized boolean e() {
        return this.b;
    }
}
