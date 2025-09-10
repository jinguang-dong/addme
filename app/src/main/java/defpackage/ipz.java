package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ipz implements RadioGroup.OnCheckedChangeListener {
    public static final /* synthetic */ int h = 0;
    private static final sgv i = sgv.g("ipz");
    public final ryq a;
    public final Dialog b;
    public final RadioGroup c;
    public Optional d = Optional.empty();
    public Runnable e = new fij(15);
    public final luj f;
    public final luj g;
    private final Context j;
    private final EduImageView k;
    private final TextView l;
    private final View m;

    public ipz(Context context, luj lujVar, luj lujVar2) {
        this.j = context;
        this.f = lujVar;
        this.g = lujVar2;
        saw sawVar = new saw();
        this.a = sawVar;
        sawVar.put(iqm.STANDARD, Integer.valueOf(R.id.preference_button_standard_camera));
        sawVar.put(iqm.REAR_CAMERA_SELFIE, Integer.valueOf(R.id.preference_button_rear_camera_selfie));
        sawVar.put(iqm.DUAL_SCREEN, Integer.valueOf(R.id.preference_button_dual_screen));
        sawVar.put(iqm.MADE_YOU_LOOK, Integer.valueOf(R.id.preference_button_made_you_look));
        Dialog dialog = new Dialog(context, R.style.Theme_Camera_MaterialAlertDialog_FloatingWidth);
        this.b = dialog;
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnDismissListener(new fdx(this, 4));
        View viewInflate = View.inflate(context, R.layout.unfold_preference_dialog, null);
        this.m = viewInflate;
        this.k = (EduImageView) viewInflate.findViewById(R.id.preference_image_content);
        this.l = (TextView) viewInflate.findViewById(R.id.preference_text_description);
        this.c = (RadioGroup) viewInflate.findViewById(R.id.preference_buttons);
        ((Button) viewInflate.findViewById(R.id.confirm_button)).setOnClickListener(new ipd(this, lujVar2, 2));
        dialog.setContentView(viewInflate);
    }

    public final void a() {
        int i2;
        int i3;
        int i4;
        if (this.d.isEmpty()) {
            return;
        }
        int iOrdinal = ((iqm) this.d.get()).ordinal();
        if (iOrdinal == 1) {
            i2 = R.string.standard_camera_text_description;
            i3 = R.string.standard_camera_edu_image_desc;
            i4 = R.drawable.edu_standard_camera;
        } else if (iOrdinal == 2) {
            i2 = R.string.rear_camera_selfie_text_description;
            i3 = R.string.jupiter_edu_image_desc;
            i4 = R.drawable.jupiter_edu_v2;
        } else if (iOrdinal == 3) {
            i2 = R.string.saturn_available_desc;
            i3 = R.string.saturn_title;
            i4 = R.drawable.edu_dual_screen_v2;
        } else if (iOrdinal != 4) {
            ((sgt) i.c().M(2227)).v("unfold preference dialog get unexpected option %s", this.d.get());
            return;
        } else {
            i2 = R.string.uranus_edu_description;
            i3 = R.string.uranus_title;
            i4 = R.drawable.uranus_edu_image_2;
        }
        EduImageView eduImageView = this.k;
        Context context = this.j;
        Drawable drawable = context.getDrawable(i4);
        drawable.getClass();
        eduImageView.b(drawable, context.getString(i3));
        this.l.setText(i2);
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
        ryq ryqVar = this.a;
        Integer numValueOf = Integer.valueOf(i2);
        if (!ryqVar.containsValue(numValueOf)) {
            ((sgt) i.c().M(2226)).y("unfold preference dialog checked unknown id %d, not any of %s", i2, ryqVar);
            this.d = Optional.empty();
            return;
        }
        saw sawVar = (saw) ryqVar;
        ryq saqVar = sawVar.g;
        if (saqVar == null) {
            saqVar = new saq(sawVar);
            sawVar.g = saqVar;
        }
        iqm iqmVar = (iqm) saqVar.get(numValueOf);
        iqmVar.getClass();
        this.d = Optional.of(iqmVar);
        a();
    }
}
