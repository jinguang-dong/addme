package defpackage;

import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lsp {
    public static final sgv a = sgv.g("lsp");
    public final List b = new ArrayList();
    public final Map c = new ConcurrentHashMap();
    public final lrp d;
    private final tzj e;
    private final out f;

    public lsp(out outVar, lrp lrpVar, tzj tzjVar) {
        this.f = outVar;
        this.d = lrpVar;
        this.e = tzjVar;
    }

    public final void a(lst lstVar) {
        List list = this.b;
        synchronized (list) {
            list.add(lstVar);
        }
    }

    public final void b(Consumer consumer, ltd ltdVar) {
        this.f.c(new lqd((Object) this, (Object) consumer, (Object) ltdVar, 5, (char[]) null));
    }

    public final void c(Consumer consumer) {
        Iterator it = ((Set) this.e.a()).iterator();
        while (it.hasNext()) {
            consumer.d((lst) it.next());
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            consumer.d((lst) it2.next());
        }
    }

    public final void d(Consumer consumer) {
        this.f.c(new lsn(this, consumer, 1));
    }

    public final void e(ltd ltdVar, Runnable runnable, String str) {
        syu syuVar = (syu) this.c.get(ltdVar);
        if (syuVar == null) {
            ((sgt) a.b().M(4399)).E("%s: No queued future found, maybe shot already finalized?: %s", ltdVar, str);
        } else {
            ske.W(syuVar, new lso(str, runnable, ltdVar, 0), sxo.a);
        }
    }

    public final void f(ltd ltdVar, Bitmap bitmap, int i) {
        d(new jgd(ltdVar, bitmap, i, 2));
    }

    public final void g(ltd ltdVar) {
        syu syuVar = (syu) this.c.get(ltdVar);
        if (syuVar == null) {
            ((sgt) a.b().M(4405)).v("%s: No queued future found, maybe shot already finalized?: notifyTaskDone", ltdVar);
        } else {
            syuVar.c(new lsn(this, ltdVar, 3), sxo.a);
        }
    }

    public final void h(ltd ltdVar, syu syuVar, ltg ltgVar) {
        this.c.put(ltdVar, swz.i(syuVar, new irm(this, ltdVar, ltgVar, 4), sxo.a));
    }

    public final void i(lst lstVar) {
        List list = this.b;
        synchronized (list) {
            list.remove(lstVar);
        }
    }
}
