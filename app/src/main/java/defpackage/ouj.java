package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouj implements paq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public ouj(fqg fqgVar, our ourVar, int i) {
        this.b = i;
        this.a = fqgVar;
        this.c = ourVar;
    }

    public ouj(ouk oukVar, int i) {
        this.b = i;
        this.a = oukVar;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            synchronized (((fqg) this.a).a) {
                ((our) this.c).close();
            }
            return;
        }
        boolean z = true;
        if (((AtomicBoolean) this.c).getAndSet(true)) {
            return;
        }
        Object obj = this.a;
        synchronized (((ouk) obj).d) {
            int i = ((ouk) obj).b - 1;
            ((ouk) obj).b = i;
            rnt.B(i >= 0, pAAtrB.sxYxDMJgA);
        }
        Object obj2 = this.a;
        ouk oukVar = (ouk) obj2;
        synchronized (oukVar.d) {
            if (((ouk) obj2).f) {
                return;
            }
            if (((ouk) obj2).b != 0) {
                z = false;
            } else {
                ovj ovjVar = ((ouk) obj2).c;
                if (ovjVar != null) {
                    Runnable runnable = ((ouk) obj2).e;
                    synchronized (ovjVar.c) {
                        ovjVar.d = runnable;
                        ovjVar.a.execute(ovjVar.b);
                    }
                    z = false;
                } else {
                    ((ouk) obj2).f = true;
                }
            }
            if (z) {
                oukVar.a.close();
            }
        }
    }
}
