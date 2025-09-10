package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyy {
    public final ebn a;
    private final long b;
    private final Object c;
    private final Map d;
    private final ejs e;

    public dyy(ejs ejsVar, ebn ebnVar) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.e = ejsVar;
        this.a = ebnVar;
        this.b = millis;
        this.c = new Object();
        this.d = new LinkedHashMap();
    }

    public final void a(ejs ejsVar) {
        Runnable runnable;
        ejsVar.getClass();
        synchronized (this.c) {
            runnable = (Runnable) this.d.remove(ejsVar);
        }
        if (runnable != null) {
            this.e.g(runnable);
        }
    }

    public final void b(ejs ejsVar) {
        eao eaoVar = new eao(this, ejsVar, 1);
        synchronized (this.c) {
        }
        this.e.h(this.b, eaoVar);
    }
}
