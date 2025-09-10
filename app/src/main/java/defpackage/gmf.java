package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gmf implements ksd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gmf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ksd
    public final void a(ksa ksaVar, boolean z) {
        int i = this.b;
        int i2 = 10;
        if (i == 0) {
            Object obj = this.a;
            if (z) {
                ((gmg) obj).c.a();
                return;
            }
            gmx gmxVar = ((gmg) obj).c;
            gmv gmvVar = (gmv) gmxVar;
            View viewInflate = View.inflate(gmvVar.d, R.layout.stabilization_disable_bottom_sheet_content, null);
            viewInflate.findViewById(R.id.learn_more_about_stabilization).setOnClickListener(new fvr(gmxVar, i2));
            gmvVar.c.n(3, R.string.stabilization_disable_bottom_sheet_title, viewInflate, null);
            return;
        }
        if (i == 1) {
            Object obj2 = this.a;
            if (z) {
                ((gld) obj2).a.a();
                return;
            }
            glb glbVar = ((gld) obj2).a;
            View viewInflate2 = View.inflate(glbVar.b, R.layout.hdr_video_disable_bottom_sheet_content, null);
            viewInflate2.findViewById(R.id.learn_more_about_hdr_video).setOnClickListener(new fvr(glbVar, 6));
            TextView textView = (TextView) viewInflate2.findViewById(R.id.hdr_video_disable_description);
            hbj hbjVar = glbVar.h;
            if (hax.b(hbjVar)) {
                textView.setText(R.string.hdr_video_disable_bottom_sheet_description_with_8k);
            } else if (hbjVar.p(gym.B)) {
                textView.setText(R.string.hdr_video_disable_bottom_sheet_description_with_24fps);
            } else {
                textView.setText(R.string.hdr_video_disable_bottom_sheet_description);
            }
            glbVar.a.n(27, R.string.hdr_video_disable_bottom_sheet_title, viewInflate2, null);
            return;
        }
        if (i == 2) {
            ((gmn) this.a).b.a();
            return;
        }
        if (i == 3) {
            Object obj3 = this.a;
            if (z) {
                ((kgn) obj3).b();
                return;
            }
            out.a();
            kgn kgnVar = (kgn) obj3;
            if (kgnVar.d == null) {
                Context context = (Context) kgnVar.b;
                FrameLayout frameLayout = new FrameLayout(context);
                View.inflate(context, R.layout.motionphoto_disabled_sheet, frameLayout);
                Button button = (Button) frameLayout.findViewById(R.id.what_is_button);
                button.setOnClickListener(new kcm(obj3, 1));
                kgnVar.d = frameLayout;
            }
            ((mni) kgnVar.c).m(7, R.string.motion_photos_not_available_title_2, (View) kgnVar.d);
            return;
        }
        if (i != 4) {
            Object obj4 = this.a;
            if (z) {
                ((mcn) obj4).b.b();
                return;
            }
            mck mckVar = ((mcn) obj4).b;
            out.a();
            Context context2 = mckVar.b;
            mni mniVar = mckVar.a;
            View viewInflate3 = View.inflate(context2, R.layout.speech_btmsheet_disabled_content, null);
            ((TextView) viewInflate3.findViewById(R.id.speech_btmsheet_diabled_description)).setText(true != mckVar.f.p(gym.B) ? R.string.speech_btmsheet_why_not_available : R.string.speech_btmsheet_why_not_available_with_24fps);
            viewInflate3.findViewById(R.id.learn_more_about_speech_enhance).setOnClickListener(new kcm(mckVar, 17));
            mniVar.n(10, R.string.speech_btmsheet_not_available_title, viewInflate3, null);
            return;
        }
        pmg pmgVar = ((ksj) this.a).c;
        if (pmgVar.c == null) {
            Context context3 = (Context) pmgVar.a;
            pmgVar.c = new FrameLayout(context3);
            View.inflate(context3, R.layout.feature_sound_effects_bottom_sheet, (ViewGroup) pmgVar.c);
        }
        int i3 = true != z ? R.string.feature_sound_effects_bottom_sheet_content_disabled : R.string.feature_sound_effects_bottom_sheet_content_enabled;
        Object obj5 = pmgVar.c;
        obj5.getClass();
        TextView textView2 = (TextView) ((ViewGroup) obj5).findViewById(R.id.feature_sound_effect_text_view);
        textView2.getClass();
        textView2.setText(i3);
        Object obj6 = pmgVar.c;
        obj6.getClass();
        ((mni) pmgVar.b).m(38, true != z ? R.string.feature_sound_effects_bottom_sheet_title_disabled : R.string.feature_sound_effects_bottom_sheet_title_enabled, (View) obj6);
    }

    public gmf(ksj ksjVar, int i) {
        this.b = i;
        this.a = ksjVar;
    }
}
