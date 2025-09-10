package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Animatable2;
import android.hardware.camera2.CaptureRequest;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ar.core.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pez {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public pez(imi imiVar, luj lujVar, luj lujVar2) {
        this.c = imiVar;
        this.a = lujVar;
        this.b = lujVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized scn a() {
        return scn.F(this.b.values());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized scn b() {
        return scn.F(this.a.values());
    }

    final synchronized void c(Runnable runnable) {
        rnt.M(this.d == null, "Listener is already set, override not supported.");
        this.d = runnable;
    }

    public final void d(pej pejVar) {
        if (((rcg) this.c).c(pejVar.a)) {
            return;
        }
        e(new sfm(pejVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final void e(Set set) {
        ?? r0;
        synchronized (this) {
            Iterator it = set.iterator();
            r0 = 0;
            while (it.hasNext()) {
                pej pejVar = (pej) it.next();
                Object obj = this.c;
                CaptureRequest.Key key = pejVar.a;
                if (!((rcg) obj).c(key)) {
                    ?? r2 = this.a;
                    if (!r2.containsKey(key) || !pejVar.equals(r2.get(key))) {
                        r0 = this.d;
                        r2.put(key, pejVar);
                    }
                }
            }
        }
        if (r0 != 0) {
            r0.run();
        }
    }

    public final void f() {
        out.a();
        if (this.d == null) {
            Context context = (Context) this.c;
            FrameLayout frameLayout = new FrameLayout(context);
            View.inflate(context, R.layout.lens_selection_bottom_sheet, frameLayout);
            this.d = frameLayout;
        }
        ((mni) this.a).m(31, R.string.lens_selection_bottom_sheet_header, (View) this.d);
        ((luj) this.b).d(luf.aW, true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uif] */
    public final void g() {
        ?? r1;
        if (h() || (r1 = this.d) == 0) {
            return;
        }
        r1.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Animatable2, java.lang.Object] */
    public final boolean h() {
        ?? r0 = this.b;
        if (!r0.isEmpty()) {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                if (((cto) it.next()).n) {
                    return true;
                }
            }
        }
        Object obj = this.c;
        if (obj != null && ((AnimatorSet) obj).isRunning()) {
            return true;
        }
        ?? r3 = this.a;
        return r3 != 0 && r3.isRunning();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, paq] */
    public final void i() {
        ?? r0 = this.d;
        if (r0 != 0) {
            r0.close();
            this.d = null;
        }
    }

    public pez(mni mniVar, luj lujVar, Context context) {
        this.d = null;
        this.a = mniVar;
        this.b = lujVar;
        this.c = context;
    }

    public pez() {
        this(ufy.a, (AnimatorSet) null, (Animatable2) null);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.Animatable2, java.lang.Object] */
    public pez(Set set, AnimatorSet animatorSet, Animatable2 animatable2) {
        set.getClass();
        this.b = set;
        this.c = animatorSet;
        this.a = animatable2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((cto) it.next()).i(new fvy(this, 2));
        }
        Object obj = this.c;
        if (obj != null) {
            ((AnimatorSet) obj).addListener(new mmn(this));
        }
        ?? r2 = this.a;
        if (r2 != 0) {
            r2.registerAnimationCallback(new mmo(this));
        }
    }

    public pez(rcg rcgVar) {
        this.b = new HashMap();
        new ufu();
        this.c = rcgVar;
        this.a = new HashMap();
    }
}
