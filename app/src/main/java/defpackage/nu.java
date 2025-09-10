package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nu {
    public final ufu a;
    public no b;
    private final Runnable c;
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private boolean f;
    private boolean g;

    public nu() {
        this(null);
    }

    private final void g(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z) {
            if (this.f) {
                return;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
            this.f = true;
            return;
        }
        if (this.f) {
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }

    public final nb a(no noVar) {
        this.a.add(noVar);
        ns nsVar = new ns(this, noVar);
        noVar.e(nsVar);
        f();
        noVar.d = new nt(this, 0);
        return nsVar;
    }

    public final void b(no noVar) {
        noVar.getClass();
        a(noVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        no noVarPrevious;
        no noVar = this.b;
        if (noVar == null) {
            ufu ufuVar = this.a;
            ListIterator listIterator = ufuVar.listIterator(ufuVar.c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    noVarPrevious = 0;
                    break;
                } else {
                    noVarPrevious = listIterator.previous();
                    if (((no) noVarPrevious).b) {
                        break;
                    }
                }
            }
            noVar = noVarPrevious;
        }
        this.b = null;
        if (noVar != null) {
            noVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        no noVarPrevious;
        no noVar = this.b;
        if (noVar == null) {
            ufu ufuVar = this.a;
            ListIterator listIterator = ufuVar.listIterator(ufuVar.c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    noVarPrevious = 0;
                    break;
                } else {
                    noVarPrevious = listIterator.previous();
                    if (((no) noVarPrevious).b) {
                        break;
                    }
                }
            }
            noVar = noVarPrevious;
        }
        this.b = null;
        if (noVar != null) {
            noVar.b();
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.e = onBackInvokedDispatcher;
        g(this.g);
    }

    public final void f() {
        boolean z = this.g;
        ufu ufuVar = this.a;
        boolean z2 = false;
        if (!ufuVar.isEmpty()) {
            Iterator<E> it = ufuVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((no) it.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z) {
            g(z2);
        }
    }

    public nu(Runnable runnable) {
        this.c = runnable;
        this.a = new ufu();
        this.d = new nq(new np(this, 1), new np(this, 0), new ne(this, 3), new ne(this, 4));
    }
}
