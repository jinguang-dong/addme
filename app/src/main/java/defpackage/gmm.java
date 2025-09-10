package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.apps.camera.util.ui.GcaTextView;
import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmm implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {
    public static final /* synthetic */ int q = 0;
    private static final Uri r = Uri.parse("https://www.gstatic.com/aiux/gca/useredu/p11/srz.mp4");
    private static final Uri s = Uri.parse("https://www.gstatic.com/aiux/gca/useredu/p11/hdr_02.mp4");
    private static final Uri t = Uri.parse("https://www.gstatic.com/aiux/gca/useredu/p11/stabilization.mp4");
    private static final Uri u = Uri.parse("https://www.gstatic.com/aiux/gca/useredu/p11/unblur.mp4");
    private gml A;
    private gml B;
    private gml C;
    private gml D;
    private final hbj E;
    private final mwq F;
    public final mni a;
    public final Context b;
    public final owq c;
    public final Executor d;
    public final tzj e;
    public final uem f;
    View g;
    public View h;
    public GcaTextView i;
    public View j;
    public GcaTextView k;
    public ViewGroup l;
    public ViewGroup m;
    public final got p;
    private final ScheduledExecutorService v;
    private View w;
    private int x;
    private int y;
    public boolean n = true;
    private boolean z = true;
    public boolean o = false;

    public gmm(mni mniVar, Context context, owq owqVar, mwq mwqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, tzj tzjVar, got gotVar, hbj hbjVar, uem uemVar) {
        this.a = mniVar;
        this.b = context;
        this.c = owqVar;
        this.F = mwqVar;
        this.d = executor;
        this.v = scheduledExecutorService;
        this.e = tzjVar;
        this.p = gotVar;
        this.E = hbjVar;
        this.f = uemVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, moo] */
    private final void d(gml gmlVar) {
        ?? r1 = gmlVar.a;
        rvk rvkVar = rvk.a;
        Object obj = gmlVar.b;
        Object obj2 = gmlVar.d;
        gbh gbhVar = new gbh(this, gmlVar, 11, null);
        Executor executor = this.d;
        Uri uri = (Uri) obj;
        gmlVar.e = new gky(r1, rvkVar, this.F, this.b, executor, uri, (String) obj2, this.v, gbhVar);
        ((gky) gmlVar.e).b();
    }

    private final boolean e() {
        return this.E.p(hax.e);
    }

    public final void a() {
        TextView textView;
        if (this.w == null) {
            this.w = View.inflate(this.b, R.layout.sapphire_bottom_sheet, null);
        }
        this.l = (ViewGroup) this.w.findViewById(R.id.sapphire_about_tab);
        this.m = (ViewGroup) this.w.findViewById(R.id.sapphire_more_info_tab);
        this.h = this.w.findViewById(R.id.sapphire_options_bar_about);
        this.i = (GcaTextView) this.w.findViewById(R.id.sapphire_options_bar_about_text);
        View view = this.h;
        Context context = this.b;
        view.setContentDescription(context.getString(R.string.sapphire_about_option_announce));
        nlj.j(this.h, this.i, context.getResources().getDimensionPixelOffset(R.dimen.sapphire_about_option_text_hit_rect_height_padding), context.getResources().getDimensionPixelOffset(R.dimen.sapphire_about_option_text_hit_rect_width_padding));
        this.j = this.w.findViewById(R.id.sapphire_options_bar_how_to);
        this.k = (GcaTextView) this.w.findViewById(R.id.sapphire_options_bar_how_to_text);
        this.j.setContentDescription(context.getString(R.string.sapphire_more_info_option_announce));
        nlj.j(this.j, this.k, context.getResources().getDimensionPixelOffset(R.dimen.sapphire_more_info_option_text_hit_rect_height_padding), context.getResources().getDimensionPixelOffset(R.dimen.sapphire_more_info_option_text_hit_rect_width_padding));
        this.x = this.i.getCurrentTextColor();
        this.y = this.k.getCurrentTextColor();
        this.h.setOnClickListener(new fvr(this, 7));
        this.j.setOnClickListener(new fvr(this, 8));
        if (hax.b(this.E) && (textView = (TextView) this.w.findViewById(R.id.sapphire_btm_sheet_description)) != null) {
            textView.setText(R.string.sapphire_btm_sheet_desc_bison);
        }
        View viewFindViewById = this.w.findViewById(R.id.sapphire_btm_sheet_button);
        this.g = viewFindViewById;
        viewFindViewById.setOnClickListener(new fvr(this, 9));
        ((TextView) this.w.findViewById(R.id.sapphire_edu_learn_more_textview)).setMovementMethod(LinkMovementMethod.getInstance());
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.w.findViewById(R.id.sapphire_edu_video_scrollview);
        horizontalScrollView.scrollTo(0, 0);
        ViewGroup viewGroup = (ViewGroup) horizontalScrollView.findViewById(R.id.p11_edu_srz_layout);
        if (!e()) {
            viewGroup.setVisibility(8);
        }
        this.B = new gml((moo) this.w.findViewById(R.id.p11_edu_video_hdr), s, (TextView) this.w.findViewById(R.id.p11_edu_caption_hdr), context.getString(R.string.sapphire_hdr_plus_video_acc));
        this.A = new gml((moo) this.w.findViewById(R.id.p11_edu_srz), r, (TextView) this.w.findViewById(R.id.p11_edu_caption_srz), context.getString(R.string.sapphire_srz_video_acc));
        this.C = new gml((moo) this.w.findViewById(R.id.p11_edu_stab), t, (TextView) this.w.findViewById(R.id.p11_edu_caption_stab), context.getString(R.string.sapphire_stabilization_video_acc));
        this.D = new gml((moo) this.w.findViewById(R.id.p11_edu_video_unblur), u, (TextView) this.w.findViewById(R.id.p11_edu_caption_unblur), context.getString(R.string.sapphire_unblur_video_acc));
        if (e()) {
            d(this.A);
        }
        d(this.B);
        d(this.C);
        d(this.D);
        this.a.q(20, R.string.sapphire_btm_sheet_title, this.w, this, null, rwc.j(this));
    }

    public final void b(View view, GcaTextView gcaTextView, View view2, GcaTextView gcaTextView2) {
        Context context = this.b;
        view.setBackground(context.getDrawable(R.drawable.sapphire_edu_option_unselected));
        gcaTextView.setTextColor(this.y);
        view2.setBackground(context.getDrawable(R.drawable.sapphire_edu_option_selected));
        gcaTextView2.setTextColor(this.x);
    }

    public final boolean c() {
        return !this.n;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.z = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (c() && this.z) {
            b(this.j, this.k, this.h, this.i);
            jea.r(this.m, this.l);
            this.n = true;
        }
        this.z = false;
        if (e()) {
            ((gky) this.A.e).d();
        }
        ((gky) this.B.e).d();
        ((gky) this.C.e).d();
        ((gky) this.D.e).d();
    }
}
