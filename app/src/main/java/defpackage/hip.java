package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.evcomp.EvCompView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class hip extends him {
    final /* synthetic */ hiq a;

    public hip(hiq hiqVar) {
        this.a = hiqVar;
    }

    @Override // defpackage.him, defpackage.mcz, defpackage.mda
    public final void a() {
        hiq hiqVar = this.a;
        hiqVar.d.a(true);
        hiqVar.c.a(true);
    }

    @Override // defpackage.him, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.c.a(false);
    }

    @Override // defpackage.him
    public void d(hhy hhyVar) {
        String string;
        EvCompView evCompView = this.a.a;
        if (((hhv) ((ovx) evCompView.b).d).equals(hhv.SINGLE)) {
            string = evCompView.getContext().getResources().getString(R.string.ev_announcement, EvCompView.c(evCompView.j));
        } else if (hhyVar.equals(hhy.BRIGHTNESS)) {
            string = evCompView.getContext().getResources().getString(R.string.brightness_ev_announcement, EvCompView.c(evCompView.j));
        } else if (hhyVar.equals(hhy.SHADOW)) {
            string = evCompView.getContext().getResources().getString(R.string.shadow_ev_announcement, EvCompView.c(evCompView.k));
        } else {
            string = "";
        }
        if (evCompView.m == null || string.isEmpty()) {
            return;
        }
        evCompView.m.h(string);
    }

    @Override // defpackage.him
    public final void f(float f, hhy hhyVar) throws Resources.NotFoundException {
        hiq hiqVar = this.a;
        hiqVar.k.a(false);
        hiqVar.l(f, hhyVar);
    }
}
