package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipp implements iqg {
    public final mni a;
    public final MaterialButton b;
    private final Context d;
    private final pnq e;
    private final MaterialButton f;
    private final EduImageView g;
    private final FrameLayout h;
    private final TextView i;
    private final owf j;
    private final luj l;
    public boolean c = false;
    private FrameLayout k = null;

    public ipp(Context context, mni mniVar, pnq pnqVar, luj lujVar, owf owfVar) {
        this.d = context;
        this.a = mniVar;
        this.e = pnqVar;
        this.j = owfVar;
        this.l = lujVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        View.inflate(context, R.layout.jupiter_bottom_sheet_content, frameLayout);
        this.g = (EduImageView) frameLayout.findViewById(R.id.jupiter_bottom_sheet_image);
        this.i = (TextView) frameLayout.findViewById(R.id.jupiter_bottom_sheet_description);
        this.b = (MaterialButton) frameLayout.findViewById(R.id.confirm_button);
        this.f = (MaterialButton) frameLayout.findViewById(R.id.close_button);
    }

    @Override // defpackage.iqg
    public final void a(final View.OnClickListener onClickListener) {
        Drawable drawable = this.e.u ? this.d.getDrawable(R.drawable.jupiter_edu) : this.d.getDrawable(R.drawable.jupiter_edu_v2);
        EduImageView eduImageView = this.g;
        drawable.getClass();
        Context context = this.d;
        eduImageView.b(drawable, context.getString(R.string.jupiter_edu_image_desc));
        MaterialButton materialButton = this.b;
        materialButton.setText(context.getString(R.string.jupiter_bottom_sheet_entry_confirm_button));
        if (((muj) this.j.dL()).equals(qpt.bl())) {
            this.i.setText(context.getString(R.string.jupiter_bottom_sheet_fold_desc));
        } else {
            this.i.setText(context.getString(R.string.jupiter_bottom_sheet_unfold_desc));
        }
        eduImageView.a();
        this.a.n(17, R.string.jupiter_bottom_sheet_entry_title, this.h, new DialogInterface.OnDismissListener() { // from class: ipo
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ipp ippVar = this.a;
                if (ippVar.c) {
                    View.OnClickListener onClickListener2 = onClickListener;
                    ippVar.c = false;
                    onClickListener2.onClick(ippVar.b);
                }
            }
        });
        materialButton.setOnClickListener(new fvr(this, 20));
        this.f.setOnClickListener(new ipr(this, 1));
        this.l.d(luf.aQ, true);
    }

    @Override // defpackage.iqg
    public final void b() {
        if (this.k == null) {
            Context context = this.d;
            FrameLayout frameLayout = new FrameLayout(context);
            View.inflate(context, R.layout.jupiter_disabled_bottomsheet, frameLayout);
            this.k = frameLayout;
        }
        this.a.m(17, R.string.rear_camera_selfie_unavailable_title, this.k);
    }
}
