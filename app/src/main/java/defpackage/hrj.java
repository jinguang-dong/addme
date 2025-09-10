package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrj {
    public final owq a;
    public View b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hrj(fdq fdqVar, owf owfVar, owq owqVar, owf owfVar2, out outVar) {
        this.d = fdqVar;
        this.c = owfVar;
        this.f = owfVar2;
        this.a = owqVar;
        this.e = outVar;
    }

    public final void a(boolean z) {
        out.a();
        boolean zP = ((hbj) this.f).p(gyo.g);
        Context context = (Context) this.d;
        FrameLayout frameLayout = new FrameLayout(context);
        View.inflate(context, R.layout.catcher_bottom_sheet, frameLayout);
        ((TextView) frameLayout.findViewById(R.id.bottom_sheet_description_container)).setText(context.getString(zP ? R.string.catcher_always_on_bottomsheet_text : R.string.catcher_bottomsheet_text));
        Object obj = efm.c(context, R.raw.gesture_capture_edu_v1).a;
        obj.getClass();
        Object obj2 = this.e;
        efs efsVar = (efs) obj2;
        efsVar.v((efh) obj);
        efsVar.t(-1);
        ((EduImageView) frameLayout.findViewById(R.id.bottom_sheet_video)).b((Drawable) obj2, context.getString(R.string.catcher_edu_image_content_description));
        efsVar.n();
        TextView textView = (TextView) frameLayout.findViewById(R.id.bottom_sheet_lower_description_container);
        textView.setText(context.getString(R.string.catcher_always_on_bottomsheet_lower_text));
        this.a.a(Boolean.valueOf(b()));
        int i = true != zP ? R.string.catcher_bottomsheet_title : R.string.pref_camera_catcher_title;
        this.b = frameLayout.findViewById(R.id.btn_sheet_button);
        if (z) {
            ((mni) this.c).m(19, i, frameLayout);
            this.b.setOnClickListener(new fvr(this, 15));
        } else {
            ((mni) this.c).o(19, i, frameLayout);
            this.b.setVisibility(4);
        }
        if (zP) {
            this.b.setVisibility(8);
        } else {
            textView.setVisibility(8);
        }
    }

    public final boolean b() {
        return ((mni) this.c).k();
    }

    public hrj(Context context, mni mniVar, owq owqVar, hbj hbjVar) {
        this.d = context;
        this.c = mniVar;
        this.e = new efs();
        this.a = owqVar;
        this.f = hbjVar;
    }
}
