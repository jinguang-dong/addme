package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkw {
    public final boolean a;
    public final muu b;
    private final mni c;
    private final Context d;
    private View e;

    public gkw(Context context, muu muuVar, mni mniVar, hbj hbjVar) {
        this.d = context;
        this.b = muuVar;
        this.c = mniVar;
        this.a = hbjVar.p(gzo.bJ);
    }

    public final void a() {
        this.b.a(this);
    }

    public final void b() {
        if (this.a) {
            return;
        }
        if (this.e == null) {
            Context context = this.d;
            View viewInflate = View.inflate(context, R.layout.cinematic_pan_bottom_sheet_content, null);
            EduImageView eduImageView = (EduImageView) viewInflate.findViewById(R.id.cinematic_pan_edu_image);
            eduImageView.c(context.getString(R.string.cinematic_pan_edu_image_url), context.getString(R.string.cinematic_pan_edu_panning_video_announcement));
            eduImageView.a();
            this.e = viewInflate;
        }
        this.c.m(22, R.string.cinematic_pan_bottom_sheet_title, this.e);
    }

    public final void c() {
        this.b.h(this);
    }
}
