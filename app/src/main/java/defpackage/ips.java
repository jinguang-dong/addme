package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ips implements iqg {
    public final Context a;
    public final mni b;
    public final owf c;
    private final gnt h;
    private final pnq i;
    private final owf j;
    private final owf k;
    public boolean d = false;
    private FrameLayout l = null;
    private FrameLayout m = null;
    public MaterialButton e = null;
    public View.OnClickListener f = null;
    public paq g = null;

    public ips(Context context, mni mniVar, gnt gntVar, pnq pnqVar, owf owfVar, owf owfVar2, owf owfVar3) {
        this.a = context;
        this.b = mniVar;
        this.h = gntVar;
        this.i = pnqVar;
        this.j = owfVar;
        this.k = owfVar2;
        this.c = owfVar3;
    }

    @Override // defpackage.iqg
    public final void a(View.OnClickListener onClickListener) {
        if (this.l == null) {
            this.f = onClickListener;
            Context context = this.a;
            FrameLayout frameLayout = new FrameLayout(context);
            View viewInflate = View.inflate(context, R.layout.saturn_bottomsheet, frameLayout);
            EduImageView eduImageView = (EduImageView) viewInflate.findViewById(R.id.image);
            Drawable drawable = this.i.u ? context.getDrawable(R.drawable.edu_dual_screen) : context.getDrawable(R.drawable.edu_dual_screen_v2);
            drawable.getClass();
            eduImageView.b(drawable, context.getString(R.string.saturn_title));
            ((TextView) viewInflate.findViewById(R.id.description)).setText(R.string.saturn_available_desc);
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.try_button);
            this.e = materialButton;
            materialButton.setText(R.string.bottomsheet_try_button_desc);
            this.e.setOnClickListener(new ipr(this, 0));
            ((MaterialButton) viewInflate.findViewById(R.id.close_button)).setOnClickListener(new ipr(this, 2));
            this.l = frameLayout;
        }
        mni mniVar = this.b;
        FrameLayout frameLayout2 = this.l;
        frameLayout2.getClass();
        mniVar.n(23, R.string.saturn_title, frameLayout2, new fdx(this, 3));
    }

    @Override // defpackage.iqg
    public final void b() {
        int i;
        if (this.m == null) {
            Context context = this.a;
            FrameLayout frameLayout = new FrameLayout(context);
            this.m = frameLayout;
            View.inflate(context, R.layout.saturn_disabled_bottomsheet, frameLayout);
        }
        MaterialButton materialButton = (MaterialButton) this.m.findViewById(R.id.turn_battery_saver_off_button);
        MaterialButton materialButton2 = (MaterialButton) this.m.findViewById(R.id.close_button);
        TextView textView = (TextView) this.m.findViewById(R.id.description);
        if (((Boolean) this.j.dL()).booleanValue()) {
            materialButton.setVisibility(8);
            materialButton2.setVisibility(8);
            i = R.string.saturn_unavailable_due_to_thermal_throttling_desc;
        } else if (((Boolean) this.k.dL()).booleanValue()) {
            materialButton.setVisibility(0);
            materialButton.setOnClickListener(new ipr(this, 3));
            materialButton2.setVisibility(0);
            materialButton2.setOnClickListener(new ipr(this, 4));
            i = R.string.saturn_unavailable_due_to_battery_saver_desc;
        } else if (this.h.j()) {
            materialButton.setVisibility(8);
            materialButton2.setVisibility(8);
            i = R.string.saturn_unavailable_due_to_selfie;
        } else {
            materialButton.setVisibility(8);
            materialButton2.setVisibility(8);
            i = R.string.saturn_unavailable_desc;
        }
        textView.setText(i);
        int i2 = true != ((Boolean) this.k.dL()).booleanValue() ? R.string.saturn_unavailable_title : R.string.saturn_unavailable_due_to_battery_saver_title;
        mni mniVar = this.b;
        FrameLayout frameLayout2 = this.m;
        frameLayout2.getClass();
        mniVar.m(23, i2, frameLayout2);
    }
}
