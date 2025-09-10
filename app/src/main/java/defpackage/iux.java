package defpackage;

import android.content.Context;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iux extends mnp {
    public final List a;
    public final ocq b;
    private final pnq f;

    public iux(Context context, mni mniVar, ocq ocqVar, pnq pnqVar) {
        super(context, mniVar);
        this.a = new ArrayList();
        this.b = ocqVar;
        this.f = pnqVar;
    }

    public final void a(iwt iwtVar) {
        this.a.clear();
        efs efsVar = new efs();
        iwt iwtVar2 = iwt.ACTION;
        int i = iwtVar == iwtVar2 ? true != this.f.k() ? R.raw.action_phone_edu_animation : R.raw.action_tablet_edu_animation : true != this.f.k() ? R.raw.long_exposure_phone_edu_animation : R.raw.long_exposure_tablet_edu_animation;
        Context context = this.d;
        Object obj = efm.c(context, i).a;
        obj.getClass();
        efsVar.v((efh) obj);
        efsVar.t(-1);
        mnn mnnVar = iwtVar == iwtVar2 ? new mnn(context.getString(R.string.moblur_action_title), context.getString(R.string.moblur_action_edu_desc), sbp.o(obu.j(efsVar), obu.i(context.getString(R.string.moblur_action_url1)), obu.i(context.getString(R.string.moblur_action_url2)), obu.i(context.getString(R.string.moblur_action_url3))), context.getString(R.string.moblur_action_edu_photo_acc), context.getString(R.string.moblur_action_edu_animation_acc), context.getString(R.string.moblur_regular)) : new mnn(context.getString(R.string.moblur_landscape_title), context.getString(R.string.moblur_landscape_edu_desc), sbp.o(obu.j(efsVar), obu.i(context.getString(R.string.moblur_landscape_url1)), obu.i(context.getString(R.string.moblur_landscape_url2)), obu.i(context.getString(R.string.moblur_landscape_url3))), context.getString(R.string.moblur_landscape_edu_photo_acc), context.getString(R.string.moblur_landscape_edu_animation_acc), context.getString(R.string.moblur_regular));
        int i2 = iwtVar == iwtVar2 ? 33 : 32;
        View viewB = b();
        c(viewB, sbp.l(mnnVar), ((sex) mnnVar.c).c, new iuv(this, efsVar), new iuu(iwtVar, 0)).d(0, false);
        viewB.addOnAttachStateChangeListener(new iuw(efsVar, viewB, 0));
        this.c.d = new kdr(efsVar, 1);
        d(i2, viewB, new AmbientMode.AmbientController(this, null));
    }
}
