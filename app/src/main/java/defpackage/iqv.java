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
public final class iqv implements iqg {
    public final Context a;
    public final mni b;
    public final owf c;
    private final pnq h;
    private final owf i;
    private final owf j;
    public boolean d = false;
    private FrameLayout k = null;
    private FrameLayout l = null;
    public MaterialButton e = null;
    public View.OnClickListener f = null;
    public paq g = null;

    public iqv(Context context, mni mniVar, pnq pnqVar, owf owfVar, owf owfVar2, owf owfVar3) {
        this.a = context;
        this.b = mniVar;
        this.h = pnqVar;
        this.i = owfVar;
        this.j = owfVar2;
        this.c = owfVar3;
    }

    @Override // defpackage.iqg
    public final void a(View.OnClickListener onClickListener) {
        int i = 5;
        if (this.k == null) {
            this.f = onClickListener;
            Context context = this.a;
            FrameLayout frameLayout = new FrameLayout(context);
            View viewInflate = View.inflate(context, R.layout.uranus_bottomsheet, frameLayout);
            EduImageView eduImageView = (EduImageView) viewInflate.findViewById(R.id.image);
            Drawable drawable = this.h.u ? context.getDrawable(R.drawable.uranus_edu_image) : context.getDrawable(R.drawable.uranus_edu_image_2);
            drawable.getClass();
            eduImageView.b(drawable, context.getString(R.string.uranus_title));
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.try_button);
            this.e = materialButton;
            materialButton.setOnClickListener(new ipr(this, i));
            ((MaterialButton) viewInflate.findViewById(R.id.close_button)).setOnClickListener(new ipr(this, 6));
            this.k = frameLayout;
        }
        mni mniVar = this.b;
        FrameLayout frameLayout2 = this.k;
        frameLayout2.getClass();
        mniVar.n(37, R.string.uranus_title, frameLayout2, new fdx(this, 5));
    }

    @Override // defpackage.iqg
    public final void b() {
        int i;
        if (this.l == null) {
            Context context = this.a;
            FrameLayout frameLayout = new FrameLayout(context);
            View viewInflate = View.inflate(context, R.layout.uranus_unavailable_bottomsheet, frameLayout);
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.turn_battery_saver_off_button);
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(R.id.close_button);
            TextView textView = (TextView) viewInflate.findViewById(R.id.description);
            int i2 = 8;
            if (((Boolean) this.i.dL()).booleanValue()) {
                materialButton.setVisibility(8);
                materialButton2.setVisibility(8);
                i = R.string.uranus_unavailable_due_to_thermal_throttling_desc;
            } else if (((Boolean) this.j.dL()).booleanValue()) {
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new ipr(this, 7));
                materialButton2.setVisibility(0);
                materialButton2.setOnClickListener(new ipr(this, i2));
                i = R.string.uranus_unavailable_due_to_battery_saver_desc;
            } else {
                materialButton.setVisibility(8);
                materialButton2.setVisibility(8);
                i = R.string.uranus_unavailable_desc;
            }
            textView.setText(i);
            this.l = frameLayout;
        }
        int i3 = true != ((Boolean) this.j.dL()).booleanValue() ? R.string.uranus_unavailable_title : R.string.uranus_unavailable_due_to_battery_saver_title;
        mni mniVar = this.b;
        FrameLayout frameLayout2 = this.l;
        frameLayout2.getClass();
        mniVar.m(37, i3, frameLayout2);
    }
}
