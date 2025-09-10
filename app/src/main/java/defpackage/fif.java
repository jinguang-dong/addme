package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fif implements png {
    public View a;
    public View b;
    public ImageView c;
    public Bitmap d;
    public ViewGroup e;
    public View f;
    public MaterialCardView g;
    public final owf h;
    public final jug i;
    public final out j;
    public final iob k;
    public GLSurfaceView l;
    public final fjf m;
    public final fdq n;
    public final ktx o;
    private final rww p;

    public fif(owf owfVar, fdq fdqVar, ktx ktxVar, jug jugVar, rww rwwVar, out outVar, iob iobVar, fjf fjfVar) {
        this.h = owfVar;
        this.n = fdqVar;
        this.o = ktxVar;
        this.i = jugVar;
        this.p = rwwVar;
        this.j = outVar;
        this.k = iobVar;
        this.m = fjfVar;
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
        c(paoVar, true);
    }

    public final void b(boolean z) {
        fjf fjfVar = this.m;
        synchronized (fjfVar) {
            fjfVar.a = z;
            if (!z) {
                fjfVar.k = false;
                fjfVar.g = null;
                fjfVar.i = null;
                fjfVar.h = null;
                fjh fjhVar = fjfVar.f;
                if (fjhVar != null) {
                    fjhVar.close();
                }
                fjfVar.f = null;
            }
        }
        if (z) {
            this.l.onResume();
        } else {
            this.l.onPause();
        }
    }

    public final void c(pao paoVar, boolean z) {
        if (this.a == null || this.b == null || this.e == null || d()) {
            return;
        }
        this.j.execute(new fie(this, paoVar, z, 0));
    }

    public final boolean d() {
        return ((mxu) this.p.fr()).a.j.equals(mxj.TABLET_LAYOUT);
    }
}
