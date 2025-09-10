package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwp {
    public static final Object a = new Object();
    public final Object b;
    public final oz c;
    public int d;
    public boolean e;
    public volatile Object f;
    public volatile Object g;
    public int h;
    public final Runnable i;
    private boolean j;
    private boolean k;

    public cwp() {
        this.b = new Object();
        this.c = new oz();
        this.d = 0;
        Object obj = a;
        this.g = obj;
        this.i = new ea(this, 14);
        this.f = obj;
        this.h = -1;
    }

    public static void b(String str) {
        if (!op.g().h()) {
            throw new IllegalStateException(a.bw(str, "Cannot invoke ", " on a background thread"));
        }
    }

    private final void i(cwo cwoVar) {
        if (cwoVar.d) {
            if (!cwoVar.dx()) {
                cwoVar.d(false);
                return;
            }
            int i = cwoVar.e;
            int i2 = this.h;
            if (i < i2) {
                cwoVar.e = i2;
                cwoVar.c.b(this.f);
            }
        }
    }

    public final Object a() {
        Object obj = this.f;
        if (obj != a) {
            return obj;
        }
        return null;
    }

    final void c(cwo cwoVar) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        while (true) {
            this.k = false;
            if (cwoVar != null) {
                i(cwoVar);
            } else {
                ow owVarE = this.c.e();
                while (owVarE.hasNext()) {
                    i((cwo) ((ov) owVarE.next()).b);
                    if (this.k) {
                        break;
                    }
                }
            }
            if (!this.k) {
                this.j = false;
                return;
            }
            cwoVar = null;
        }
    }

    protected void e() {
    }

    protected void f() {
    }

    public void g(cwr cwrVar) {
        b("removeObserver");
        cwo cwoVar = (cwo) this.c.b(cwrVar);
        if (cwoVar == null) {
            return;
        }
        cwoVar.b();
        cwoVar.d(false);
    }

    public void h(Object obj) {
        throw null;
    }

    public cwp(Object obj) {
        this.b = new Object();
        this.c = new oz();
        this.d = 0;
        this.g = a;
        this.i = new ea(this, 14);
        this.f = obj;
        this.h = 0;
    }

    public final void d(cwh cwhVar, cwr cwrVar) {
        b(KsvNaXS.fXOCUKvVZuZyth);
        if (cwhVar.getLifecycle().a == cwb.a) {
            return;
        }
        cwn cwnVar = new cwn(this, cwhVar, cwrVar);
        cwo cwoVar = (cwo) this.c.f(cwrVar, cwnVar);
        if (cwoVar != null && !cwoVar.c(cwhVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cwoVar != null) {
            return;
        }
        cwhVar.getLifecycle().a(cwnVar);
    }
}
