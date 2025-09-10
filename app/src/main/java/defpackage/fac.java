package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientDelegate;
import com.google.ar.core.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public abstract class fac extends ezv {
    protected final View a;
    public final AmbientDelegate b;

    public fac(View view) {
        eoz.k(view);
        this.a = view;
        this.b = new AmbientDelegate(view);
    }

    @Override // defpackage.ezv, defpackage.faa
    public final ezn a() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof ezn) {
            return (ezn) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.ezv, defpackage.faa
    public final void e(ezn eznVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, eznVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.faa
    public final void i(ezt eztVar) {
        AmbientDelegate ambientDelegate = this.b;
        int iU = ambientDelegate.u();
        int iT = ambientDelegate.t();
        if (AmbientDelegate.w(iU, iT)) {
            eztVar.e(iU, iT);
            return;
        }
        ?? r0 = ambientDelegate.b;
        if (!r0.contains(eztVar)) {
            r0.add(eztVar);
        }
        if (ambientDelegate.a == null) {
            ViewTreeObserver viewTreeObserver = ((View) ambientDelegate.c).getViewTreeObserver();
            ambientDelegate.a = new fab(ambientDelegate);
            viewTreeObserver.addOnPreDrawListener(ambientDelegate.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.faa
    public final void j(ezt eztVar) {
        this.b.b.remove(eztVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
