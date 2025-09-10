package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.location.Location;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class miz implements paf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ miz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.paf
    public final void a(Object obj) throws Resources.NotFoundException {
        int i = this.b;
        z = false;
        boolean z = false;
        if (i == 0) {
            rwc rwcVar = (rwc) obj;
            rwcVar.getClass();
            if (rwcVar.h()) {
                mje mjeVar = (mje) this.a;
                sbp sbpVarB = kzz.b(mjeVar.o, (Location) rwcVar.c());
                int i2 = ((sex) sbpVarB).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    pej pejVar = (pej) sbpVarB.get(i3);
                    pfu pfuVar = mjeVar.aa;
                    pfuVar.getClass();
                    pfuVar.l(pejVar);
                }
                return;
            }
            return;
        }
        if (i == 1) {
            ((mex) this.a).l(mej.ACTIVITY_STEADY, CameraActivityTiming.a);
            return;
        }
        if (i == 2) {
            mod modVar = (mod) this.a;
            mog mogVar = (mog) obj;
            if (modVar.e.decrementAndGet() > 0) {
                return;
            }
            mogVar.getClass();
            if (mogVar.a()) {
                return;
            }
            if (mogVar.b()) {
                modVar.h();
                return;
            }
            if (!mogVar.a() && !mogVar.b()) {
                z = true;
            }
            rnt.L(z);
            Bitmap bitmap = mogVar.b;
            rnt.x(bitmap);
            modVar.k(bitmap, mogVar.c);
            return;
        }
        ram ramVar = (ram) obj;
        ramVar.getClass();
        if (myi.b(ramVar)) {
            return;
        }
        myi myiVar = (myi) this.a;
        pbn pbnVar = myiVar.d;
        pbnVar.f("MarsWirer#mainThread");
        nbc nbcVar = new nbc(myiVar.a);
        myl mylVar = myiVar.b;
        mgr mgrVar = mylVar.i;
        View view = myiVar.g;
        Context context = mylVar.b;
        mylVar.f = new nbb(context, mgrVar, view, nbcVar, 3, mylVar.k);
        mylVar.f.d();
        nbb nbbVar = mylVar.f;
        String string = context.getResources().getString(R.string.mars_menu_title);
        nbbVar.d = (TextView) nbbVar.p.findViewById(R.id.popup_title);
        nbbVar.d.setText(string);
        nbbVar.d.setVisibility(0);
        nbbVar.e = (ImageButton) nbbVar.p.findViewById(R.id.popup_help_button);
        nbbVar.e.setContentDescription(nbbVar.a.getString(R.string.menu_help_button_announce, string));
        nbbVar.m = nbbVar.a();
        mylVar.f.n = context.getResources().getDimensionPixelSize(R.dimen.mars_anchor_margin);
        nbb nbbVar2 = mylVar.f;
        nbbVar2.e.setOnClickListener(new mlk(mylVar, 11));
        nbbVar2.e.setVisibility(0);
        mylVar.f.e(R.color.mars_menu_bg_color);
        nbb nbbVar3 = mylVar.f;
        if (nbbVar3 != null) {
            nbbVar3.f = new myj(mylVar, 0);
            nbbVar3.r = new AmbientMode.AmbientController(mylVar, null);
            nbbVar3.f(mylVar.e ? ltg.MARS_STORE : ltg.MEDIA_STORE);
            mylVar.e = false;
        }
        myiVar.h.i(mylVar, mxk.TO_RIGHT);
        myiVar.j.k(mylVar);
        pbnVar.g();
    }
}
