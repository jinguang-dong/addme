package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coj {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    public static final ViewParent c(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final cwd d(cwh cwhVar) {
        return e(cwhVar.getLifecycle());
    }

    public static final cwd e(cwc cwcVar) {
        AtomicReference atomicReference;
        cwd cwdVar;
        uoz uozVar;
        cwcVar.getClass();
        do {
            atomicReference = (AtomicReference) cwcVar.b.a;
            cwd cwdVar2 = (cwd) atomicReference.get();
            if (cwdVar2 != null) {
                return cwdVar2;
            }
            upi upiVar = new upi();
            una unaVar = unr.a;
            uozVar = uvw.a;
            cwdVar = new cwd(cwcVar, ske.aI(upiVar, uozVar.i()));
        } while (!a.x(atomicReference, cwdVar));
        ukc.C(cwdVar, uozVar.i(), 0, new cwe(cwdVar, (uhb) null, 0), 2);
        return cwdVar;
    }
}
