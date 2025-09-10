package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbz implements fqa {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    @Override // defpackage.fqa
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fqa) it.next()).a();
        }
    }
}
