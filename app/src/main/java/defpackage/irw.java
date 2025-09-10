package defpackage;

import android.content.Context;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class irw implements ito {
    final /* synthetic */ lvq a;
    final /* synthetic */ Context b;
    final /* synthetic */ iry c;
    final /* synthetic */ imi d;

    public irw(iry iryVar, lvq lvqVar, Context context, imi imiVar) {
        this.a = lvqVar;
        this.b = context;
        this.d = imiVar;
        this.c = iryVar;
    }

    @Override // defpackage.ito
    public final boolean a(boolean z) {
        if (z) {
            iry iryVar = this.c;
            if (((Boolean) iryVar.f.d).booleanValue()) {
                lvq lvqVar = this.a;
                if (((lvp) lvqVar.dL()).equals(lvp.ZOOM) || ((lvp) lvqVar.dL()).equals(lvp.d)) {
                    if (iryVar.o == null) {
                        nao naoVar = new nao();
                        naoVar.j = 8;
                        naoVar.a = false;
                        Context context = this.b;
                        naoVar.h = context;
                        naoVar.e = context.getString(R.string.uranus_adjust_volume_toast);
                        iryVar.o = naoVar.a();
                    }
                    this.d.a(iryVar.o);
                }
            }
        }
        return ((Boolean) this.c.f.d).booleanValue();
    }

    @Override // defpackage.ito
    public final int b() {
        return 103;
    }

    @Override // defpackage.ito
    public final void c() {
    }
}
