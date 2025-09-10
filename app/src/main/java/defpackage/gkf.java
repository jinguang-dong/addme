package defpackage;

import android.view.Surface;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkf implements paq {
    public final Object a;
    public final Map b;
    public final LinkedList c;

    public gkf(ojl ojlVar) {
        ojlVar.getClass();
        this.a = new Object();
        this.b = new ConcurrentHashMap();
        this.c = new LinkedList();
    }

    public final Surface a(pas pasVar) {
        Surface surface;
        synchronized (this.a) {
            surface = (Surface) this.b.get(pasVar);
        }
        return surface;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            Map map = this.b;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
            map.clear();
            LinkedList linkedList = this.c;
            Iterator it2 = linkedList.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next = it2.next();
                next.getClass();
                ((gke) next).b.release();
            }
            linkedList.clear();
        }
    }
}
