package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.ar.core.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqy implements mxl, jhh, jhg {
    private static final sgv g = sgv.g("kqy");
    public final Context b;
    public final uem c;
    public kse d;
    public nlr e;
    private final owf i;
    public final SparseIntArray a = new SparseIntArray();
    private final SparseArray h = new SparseArray();
    public boolean f = true;

    public kqy(Context context, uem uemVar, owf owfVar) {
        this.b = context;
        this.c = uemVar;
        this.i = owfVar;
        gzi gziVar = gzq.a;
    }

    private final void m(String str, boolean z, int i, String str2, krs krsVar) throws Resources.NotFoundException {
        int i2;
        krs krsVar2;
        SparseArray sparseArray = this.h;
        if (!sparseArray.contains(i)) {
            sparseArray.put(i, new HashSet());
        }
        Set set = (Set) sparseArray.get(i);
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
        if (set.isEmpty()) {
            if (n(i)) {
                SparseIntArray sparseIntArray = this.a;
                int i3 = sparseIntArray.get(i);
                sparseIntArray.delete(i);
                if (this.d.d(i3) != null) {
                    this.d.d(i3).setOnClickListener(null);
                }
                this.d.getResources().getResourceEntryName(i);
                this.d.f(i3, false, 0, null, null);
                return;
            }
            return;
        }
        if (n(i)) {
            return;
        }
        str2.getClass();
        int i4 = 0;
        while (true) {
            this.d.i();
            if (i4 >= 4) {
                i2 = i;
                krsVar2 = krsVar;
                i4 = -1;
                break;
            } else {
                if (this.a.indexOfValue(i4) < 0) {
                    i2 = i;
                    krsVar2 = krsVar;
                    this.d.f(i4, true, i2, str2, krsVar2);
                    break;
                }
                i4++;
            }
        }
        this.d.getResources().getResourceEntryName(i2);
        if (i4 == -1) {
            return;
        }
        this.a.put(i2, i4);
        if (this.d.d(i4) != null) {
            this.d.d(i4).setOnClickListener(new ktm(this, krsVar2, 1));
        }
    }

    private final boolean n(int i) {
        return this.a.indexOfKey(i) >= 0;
    }

    public final View a() {
        return (View) this.d;
    }

    public final nkw d() {
        return (nkw) this.i.dL();
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        this.d.eR(mxjVar, mxmVar);
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.d.e();
    }

    public final void f(boolean z, krt krtVar) {
        kta ktaVar = (kta) krtVar;
        g(z, ktaVar.c, ktaVar.d, ktaVar.e, ktaVar.f);
    }

    public final void g(boolean z, int i, int i2, String str, krs krsVar) {
        m(str, z, i, this.d.getResources().getString(i2), krsVar);
    }

    public final void h(ltr ltrVar) {
        ltr ltrVar2 = ltr.OFF;
        if (!ltrVar2.equals(ltrVar)) {
            this.d.setEnabled(false);
            this.d.g(ltrVar);
        } else {
            this.d.g(ltrVar2);
            if (this.d.h()) {
                this.d.setEnabled(true);
            }
        }
    }

    public final void i(boolean z) {
        if (this.d == null) {
            ((sgt) g.c().M(3404)).s("minibar null when updateVisibility() called");
            return;
        }
        boolean z2 = z && ((krj) this.c.a()).r() && this.d.h();
        this.d.setVisibility(true != z ? 8 : 0);
        this.d.setEnabled(z2);
    }

    public final void j(boolean z, int i, boolean z2) {
        this.d.k(z, i, z2);
    }

    public final void k(int i, boolean z) {
        j(false, i, z);
        this.d.postDelayed(new kdx(this, 18), this.b.getResources().getInteger(R.integer.motion_animation_duration));
    }

    public final void l(boolean z, String str) throws Resources.NotFoundException {
        m("MicInput", z, R.drawable.gm_filled_bluetooth_connected_white_24, str, null);
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
