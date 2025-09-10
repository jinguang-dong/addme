package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syl {
    public final AtomicInteger c;
    public final syu[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public syl(syu[] syuVarArr) {
        this.d = syuVarArr;
        this.c = new AtomicInteger(syuVarArr.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (syu syuVar : this.d) {
                if (syuVar != null) {
                    syuVar.cancel(this.b);
                }
            }
        }
    }
}
