package defpackage;

import android.view.ViewGroup;
import com.google.ar.core.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgt {
    public static final dgp a = new dgx(null);
    private static final ThreadLocal c = new ThreadLocal();
    public static final ArrayList b = new ArrayList();

    static yd a() {
        yd ydVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (ydVar = (yd) weakReference.get()) != null) {
            return ydVar;
        }
        yd ydVar2 = new yd();
        threadLocal.set(new WeakReference(ydVar2));
        return ydVar2;
    }

    public static void b(ViewGroup viewGroup, dgp dgpVar) {
        if (dgpVar != null) {
            dgs dgsVar = new dgs(dgpVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(dgsVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(dgsVar);
        }
    }

    public static void c(ViewGroup viewGroup, dgp dgpVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dgp) arrayList.get(i)).u(viewGroup);
            }
        }
        if (dgpVar != null) {
            dgpVar.p(viewGroup, true);
        }
        if (((com) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
