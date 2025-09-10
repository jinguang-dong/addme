package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ega {
    public static final Executor a = Executors.newCachedThreadPool();
    public volatile efy b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public ega(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            elg.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((efu) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((efu) arrayList.get(i)).a(obj);
        }
    }

    public final void c(efy efyVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = efyVar;
        this.e.post(new dzd(this, 3));
    }

    public final synchronized void d(efu efuVar) {
        Throwable th;
        efy efyVar = this.b;
        if (efyVar != null && (th = efyVar.b) != null) {
            efuVar.a(th);
        }
        this.d.add(efuVar);
    }

    public final synchronized void e(efu efuVar) {
        Object obj;
        efy efyVar = this.b;
        if (efyVar != null && (obj = efyVar.a) != null) {
            efuVar.a(obj);
        }
        this.c.add(efuVar);
    }

    public final synchronized void f(efu efuVar) {
        this.d.remove(efuVar);
    }

    public final synchronized void g(efu efuVar) {
        this.c.remove(efuVar);
    }

    public ega(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (!z) {
            a.execute(new efz(this, callable));
            return;
        }
        try {
            c((efy) callable.call());
        } catch (Throwable th) {
            c(new efy(th));
        }
    }
}
