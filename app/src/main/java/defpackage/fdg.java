package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdg implements fre {
    public final feb a;
    private final DevicePolicyManager b;
    private final Context c;
    private final out d;
    private final hbj e;

    public fdg(cxb cxbVar, hbj hbjVar, Context context, feb febVar, out outVar) {
        this.b = cxbVar.y();
        this.e = hbjVar;
        this.c = context;
        this.a = febVar;
        this.d = outVar;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final syu b() throws Resources.NotFoundException {
        if (!this.e.p(gzo.bu)) {
            return ske.M(true);
        }
        boolean cameraDisabled = this.b.getCameraDisabled(null);
        if (cameraDisabled) {
            Context context = this.c;
            rkc rkcVar = new rkc(context, R.style.Theme_Camera_MaterialAlertDialog);
            TextView textView = new TextView(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dialog_horizontal_padding);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dialog_vertical_padding);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            textView.setText(R.string.camera_disabled_body);
            rkcVar.s(R.string.camera_disabled_title);
            rkcVar.u(textView);
            rkcVar.k(false);
            rkcVar.q(R.string.camera_disabled_close_app, new fdf(this, 0));
            this.d.execute(new dzd(rkcVar, 17));
        }
        return ske.M(Boolean.valueOf(!cameraDisabled));
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return gsn.Z(this);
    }
}
