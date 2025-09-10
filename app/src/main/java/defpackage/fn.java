package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fn {
    cov b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final cow f = new fm(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ejs) arrayList.get(i)).i();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ejs ejsVar = (ejs) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                ejsVar.k(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) ((WeakReference) ejsVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                ejsVar.l(this.f);
            }
            View view2 = (View) ((WeakReference) ejsVar.a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void d(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void e(cov covVar) {
        if (this.c) {
            return;
        }
        this.b = covVar;
    }

    public final void f(ejs ejsVar) {
        if (this.c) {
            return;
        }
        this.a.add(ejsVar);
    }
}
