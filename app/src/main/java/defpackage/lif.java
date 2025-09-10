package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lif {
    public static final sbv a;
    private static final lie i;
    private static final lie j;
    private static final lie k;
    public final owf b;
    public final owf c;
    public final out d;
    public final muu e;
    public final fdq f;
    public final ocq g;
    public final ocq h;
    private final Context l;
    private final mni m;
    private final FrameLayout n;

    public lif(Context context, mni mniVar, ocq ocqVar, fdq fdqVar, owf owfVar, muu muuVar, ocq ocqVar2, owf owfVar2, out outVar) {
        this.l = context;
        this.m = mniVar;
        this.h = ocqVar;
        this.n = new FrameLayout(context);
        this.f = fdqVar;
        this.b = owfVar;
        this.e = muuVar;
        this.g = ocqVar2;
        this.c = owfVar2;
        this.d = outVar;
    }

    public final void a(lie lieVar) {
        FrameLayout frameLayout = this.n;
        if (frameLayout.getChildCount() == 0) {
            View.inflate(this.l, R.layout.pro_feature_bottom_sheet, frameLayout);
        }
        EduImageView eduImageView = (EduImageView) frameLayout.findViewById(R.id.pro_bottom_sheet_image);
        Context context = this.l;
        int i2 = lieVar.b;
        int i3 = lieVar.a;
        eduImageView.c(context.getString(i2), context.getString(i3));
        ((TextView) frameLayout.findViewById(R.id.pro_bottom_sheet_body)).setText(lieVar.c);
        frameLayout.findViewById(R.id.manual_focus_details).setVisibility(true != lieVar.e ? 8 : 0);
        this.m.m(lieVar.g, i3, frameLayout);
        this.h.ak(lieVar.f);
    }

    static {
        lie lieVar = new lie(R.string.manual_focus_bottom_sheet_header, R.string.manual_focus_bottom_sheet_photo_url, R.string.manual_focus_bottom_sheet_body, R.string.manual_focus_help_context_desc, true, 25, "focus_feature_bottom_sheet_edu");
        i = lieVar;
        lie lieVar2 = new lie(R.string.iso_bottom_sheet_header, R.string.iso_bottom_sheet_photo_url, R.string.iso_bottom_sheet_body, R.string.iso_help_context_desc, false, 29, VnmwoBe.syI);
        j = lieVar2;
        lie lieVar3 = new lie(R.string.shutter_speed_bottom_sheet_header, R.string.shutter_bottom_sheet_photo_url, R.string.shutter_speed_bottom_sheet_body, R.string.shutter_speed_help_context_desc, false, 30, "shutter_speed_feature_bottom_sheet_edu");
        k = lieVar3;
        a = sbv.p(jjt.FOCUS, lieVar, jjt.DETAIL_NOISE, lieVar2, jjt.SHUTTER_SPEED, lieVar3);
    }
}
