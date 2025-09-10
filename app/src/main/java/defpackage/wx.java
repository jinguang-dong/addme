package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wx implements AutoCloseable {
    private final Object a = new Object();
    private final ufu b = new ufu();
    private boolean c;

    public final void a() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            Iterator<E> it = this.b.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            ufu ufuVar = this.b;
            Iterator it = ufuVar.iterator();
            if (it.hasNext()) {
                throw null;
            }
            ufuVar.clear();
        }
    }
}
