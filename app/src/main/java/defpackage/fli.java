package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.BottomBar;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fli extends flg {
    final /* synthetic */ fln a;

    public fli(fln flnVar) {
        this.a = flnVar;
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        Duration duration = fln.a;
        fln flnVar = this.a;
        flnVar.h.a(true);
        fjz fjzVar = flnVar.f;
        fjzVar.i();
        if (!flnVar.l || ((Boolean) flnVar.k.dL()).booleanValue()) {
            fjzVar.o(2, fln.a);
        }
        BottomBar bottomBar = flnVar.d.a;
        bottomBar.p(sbv.o(fvo.CENTER_LEFT, rvk.a, fvo.CENTER_RIGHT, rwc.j(bottomBar.h())), true);
        flnVar.e.Q();
        fif fifVar = flnVar.i;
        if (fifVar.a != null && fifVar.f != null) {
            ktx ktxVar = fifVar.o;
            ktxVar.c(fifVar);
            fifVar.c(ktxVar.a(), false);
            View view = fifVar.a;
            view.getClass();
            view.setVisibility(0);
            if (fifVar.i.e(pka.BACK) == 1 || fifVar.d()) {
                View view2 = fifVar.f;
                view2.getClass();
                view2.setVisibility(8);
            } else {
                View view3 = fifVar.f;
                view3.getClass();
                view3.setVisibility(0);
            }
            fifVar.b(true);
        }
        flnVar.l = true;
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void b() {
        Duration duration = fln.a;
        fln flnVar = this.a;
        flnVar.h.a(false);
        fjz fjzVar = flnVar.f;
        fjzVar.k();
        fjzVar.f();
        fif fifVar = flnVar.i;
        if (fifVar.a == null || fifVar.c == null) {
            return;
        }
        Bitmap bitmap = fifVar.d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        ImageView imageView = fifVar.c;
        imageView.getClass();
        imageView.setImageDrawable(null);
        View view = fifVar.a;
        view.getClass();
        view.setVisibility(8);
        fifVar.o.h(fifVar);
        fifVar.b(false);
    }

    @Override // defpackage.flg
    public void d() {
        fln flnVar = this.a;
        flnVar.h();
        flnVar.p.ak("suggestion_all_in_end_to_end_count");
    }

    @Override // defpackage.flg
    public void c() {
    }
}
