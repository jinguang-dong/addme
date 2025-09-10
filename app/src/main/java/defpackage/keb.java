package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.android.apps.camera.util.ui.GcaTextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class keb implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener, kej {
    public kea a;
    public kea b;
    public kea c;
    public final muu d;
    private final Context e;
    private final mni f;
    private final owf g;
    private final owf h;
    private final owf i;
    private final owf j;
    private final out k;
    private View l;
    private kea m;
    private boolean n = true;
    private int o;
    private int p;
    private final hbj q;

    public keb(Context context, mni mniVar, muu muuVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, out outVar, hbj hbjVar) {
        this.e = context;
        this.f = mniVar;
        this.d = muuVar;
        this.g = owfVar;
        this.k = outVar;
        this.h = owfVar2;
        this.j = owfVar3;
        this.i = owfVar4;
        this.q = hbjVar;
    }

    @Override // defpackage.kej
    public final paq a() {
        our ourVar = new our();
        if (this.q.p(gzo.bJ)) {
            this.d.g(rbb.d, R.string.astro_help_context_desc, R.string.astro_desc, false);
        } else {
            this.d.d(new kcm(this, 5), R.string.astro_help_context_desc);
        }
        owf owfVar = this.g;
        juf jufVar = new juf(this, 9);
        out outVar = this.k;
        ourVar.d(owfVar.dK(jufVar, outVar));
        ourVar.d(this.h.dK(new juf(this, 10), outVar));
        ourVar.d(this.i.dK(new juf(this, 11), outVar));
        ourVar.d(new jkf(this, 17));
        return ourVar;
    }

    @Override // defpackage.kej
    public final void b() {
        if (this.q.p(gzo.bJ)) {
            return;
        }
        if (this.l == null) {
            this.l = View.inflate(this.e, R.layout.astro_bottom_sheet_v2, null);
        }
        this.a = new kea((ViewGroup) this.l.findViewById(R.id.astro_about_tab), this.l.findViewById(R.id.astro_options_bar_about), (GcaTextView) this.l.findViewById(R.id.astro_options_bar_about_text));
        this.b = new kea((ViewGroup) this.l.findViewById(R.id.astro_manual_tab), this.l.findViewById(R.id.astro_options_bar_manual), (GcaTextView) this.l.findViewById(R.id.astro_options_bar_manual_text));
        this.c = new kea((ViewGroup) this.l.findViewById(R.id.astro_auto_tab), this.l.findViewById(R.id.astro_options_bar_auto), (GcaTextView) this.l.findViewById(R.id.astro_options_bar_auto_text));
        kea keaVar = this.a;
        this.m = keaVar;
        this.o = keaVar.c.getCurrentTextColor();
        this.p = this.b.c.getCurrentTextColor();
        this.a.b.setOnClickListener(new kcm(this, 2));
        this.b.b.setOnClickListener(new kcm(this, 3));
        this.c.b.setOnClickListener(new kcm(this, 4));
        EduImageView eduImageView = (EduImageView) this.l.findViewById(R.id.astro_bottom_sheet_image);
        Context context = this.e;
        eduImageView.c(context.getString(R.string.astro_photo_url_2), context.getString(R.string.astro_edu_image_content_description));
        this.f.q(21, R.string.astrophotography_edu_title, this.l, this, null, rwc.j(this));
    }

    public final void c() {
        if (this.j.dL() == nkw.NIGHT_SIGHT && !((Boolean) this.h.dL()).booleanValue() && !((Boolean) this.i.dL()).booleanValue()) {
            owf owfVar = this.g;
            if (((Boolean) owfVar.dL()).booleanValue()) {
                if (((Boolean) owfVar.dL()).booleanValue()) {
                    this.d.h(this);
                    return;
                }
                return;
            }
        }
        this.d.a(this);
    }

    public final void d(kea keaVar) {
        kea keaVar2 = this.m;
        if (keaVar2 != keaVar) {
            View view = keaVar2.b;
            GcaTextView gcaTextView = keaVar2.c;
            View view2 = keaVar.b;
            GcaTextView gcaTextView2 = keaVar.c;
            Context context = this.e;
            view.setBackground(context.getDrawable(R.drawable.astro_edu_option_unselected));
            gcaTextView.setTextColor(this.p);
            view2.setBackground(context.getDrawable(R.drawable.astro_edu_option_selected));
            gcaTextView2.setTextColor(this.o);
            ViewGroup viewGroup = this.m.a;
            ViewGroup viewGroup2 = keaVar.a;
            viewGroup.setVisibility(8);
            viewGroup2.setVisibility(0);
            this.m = keaVar;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.n = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        kea keaVar = this.m;
        kea keaVar2 = this.a;
        if (keaVar != keaVar2 && this.n) {
            d(keaVar2);
        }
        this.n = false;
    }
}
