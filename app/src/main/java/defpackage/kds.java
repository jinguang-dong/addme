package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.ar.core.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kds implements kej {
    private final Context a;
    private final mni b;
    private final rwc c;
    private final float d;
    private final owq e;
    private final owf f;

    public kds(Context context, mni mniVar, rwc rwcVar, hbj hbjVar, owq owqVar, owf owfVar) {
        this.a = context;
        this.b = mniVar;
        this.c = rwcVar;
        this.e = owqVar;
        this.d = TimeUnit.MILLISECONDS.toSeconds(((Integer) hbjVar.a(hac.j).get()).intValue()) / 60.0f;
        this.f = owfVar;
    }

    @Override // defpackage.kej
    public final paq a() {
        return new kxk(1);
    }

    @Override // defpackage.kej
    public final void b() throws Resources.NotFoundException {
        Context context = this.a;
        FrameLayout frameLayout = new FrameLayout(context);
        View.inflate(context, R.layout.bottom_sheet, frameLayout);
        EduImageView eduImageView = (EduImageView) frameLayout.findViewById(R.id.bottom_sheet_image);
        eduImageView.c(context.getString(R.string.astro_photo_url), context.getString(R.string.astro_edu_image_content_description));
        eduImageView.a();
        efs efsVar = new efs();
        Object obj = efm.c(context, R.raw.astro_edu_animation).a;
        obj.getClass();
        efsVar.v((efh) obj);
        efsVar.t(-1);
        ((ImageView) frameLayout.findViewById(R.id.bottom_sheet_animation)).setImageDrawable(efsVar);
        rwc rwcVar = this.c;
        if (rwcVar.h() && ((Boolean) this.e.dL()).booleanValue() && !((Boolean) this.f.dL()).booleanValue()) {
            ((TextView) frameLayout.findViewById(R.id.kepler_edu_textview)).setText(AmbientMode.AmbientCallback.q(context, R.string.kepler_edu_text, "count", Float.valueOf(this.d)));
            ((LinearLayout) frameLayout.findViewById(R.id.kepler_edu)).setVisibility(0);
        }
        frameLayout.addOnAttachStateChangeListener(new iuw(efsVar, frameLayout, 2));
        mni mniVar = this.b;
        mniVar.d = new kdr(efsVar, 0);
        mniVar.m(21, R.string.astrophotography_edu_title, frameLayout);
    }
}
