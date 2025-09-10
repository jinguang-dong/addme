package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.camera.util.ui.GcaTextView;
import com.google.ar.core.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwr {
    public final boolean a;
    public final Object b;
    public final Object c;

    private rwr(rwq rwqVar, boolean z, rvs rvsVar) {
        this.c = rwqVar;
        this.a = z;
        this.b = rvsVar;
    }

    public static rwr b(char c) {
        final rvp rvpVar = new rvp(c);
        return new rwr(new rwq() { // from class: rwm
            @Override // defpackage.rwq
            public final Iterator a(rwr rwrVar, CharSequence charSequence) {
                return new rwn(rwrVar, charSequence, rvpVar);
            }
        });
    }

    public static rwr c(final String str) {
        rnt.B(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? b(str.charAt(0)) : new rwr(new rwq() { // from class: rwl
            @Override // defpackage.rwq
            public final Iterator a(rwr rwrVar, CharSequence charSequence) {
                return new rwo(rwrVar, charSequence, str);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rwq] */
    public final rwr a() {
        return new rwr((rwq) this.c, true, (rvs) this.b);
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new rwp(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rwq] */
    public final Iterator e(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itE = e(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itE.hasNext()) {
            arrayList.add((String) itE.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final void g() {
        ((muu) this.c).a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.DialogInterface$OnDismissListener, java.lang.Object] */
    public final void h() {
        if (this.a) {
            return;
        }
        ?? r6 = this.b;
        gmy gmyVar = (gmy) r6;
        if (gmyVar.f == null) {
            gmyVar.f = View.inflate(gmyVar.c, R.layout.nsv_bottom_sheet, null);
        }
        gmyVar.k = (ViewGroup) gmyVar.f.findViewById(R.id.nsv_about_tab);
        gmyVar.l = (ViewGroup) gmyVar.f.findViewById(R.id.nsv_more_info_tab);
        gmyVar.g = gmyVar.f.findViewById(R.id.nsv_options_bar_about);
        gmyVar.h = (GcaTextView) gmyVar.f.findViewById(R.id.nsv_options_bar_about_text);
        View view = gmyVar.g;
        Context context = gmyVar.c;
        view.setContentDescription(context.getString(R.string.nsv_about_option_announce));
        nlj.j(gmyVar.g, gmyVar.h, context.getResources().getDimensionPixelOffset(R.dimen.nsv_about_option_text_hit_rect_height_padding), context.getResources().getDimensionPixelOffset(R.dimen.nsv_about_option_text_hit_rect_width_padding));
        gmyVar.i = gmyVar.f.findViewById(R.id.nsv_options_bar_more_info);
        gmyVar.j = (GcaTextView) gmyVar.f.findViewById(R.id.nsv_options_bar_more_info_text);
        gmyVar.i.setContentDescription(context.getString(R.string.nsv_more_info_option_announce));
        nlj.j(gmyVar.i, gmyVar.j, context.getResources().getDimensionPixelOffset(R.dimen.nsv_more_info_option_text_hit_rect_height_padding), context.getResources().getDimensionPixelOffset(R.dimen.nsv_more_info_option_text_hit_rect_width_padding));
        gmyVar.n = gmyVar.h.getCurrentTextColor();
        gmyVar.o = gmyVar.j.getCurrentTextColor();
        gmyVar.g.setOnClickListener(new fvr(r6, 11));
        gmyVar.i.setOnClickListener(new fvr(r6, 12));
        ((TextView) gmyVar.f.findViewById(R.id.nsv_edu_learn_more_textview)).setMovementMethod(LinkMovementMethod.getInstance());
        gmyVar.p = new gky((moo) gmyVar.f.findViewById(R.id.nsv_video_view), rvk.a, gmyVar.q, context, gmyVar.d, gmy.a, context.getString(R.string.nsv_video_acc), gmyVar.e, new gku(r6, 19));
        gmyVar.p.b();
        gmyVar.b.q(36, R.string.nsv_bottom_sheet_title, gmyVar.f, r6, null, rwc.j(r6));
    }

    public final void i() {
        ((muu) this.c).h(this);
    }

    public rwr(muu muuVar, gmy gmyVar, hbj hbjVar) {
        this.c = muuVar;
        this.b = gmyVar;
        this.a = hbjVar.p(gzo.bJ);
    }

    public rwr(hbj hbjVar) {
        this.c = new ovx(false);
        this.a = hbjVar.p(hak.af);
        this.b = hbjVar;
    }

    private rwr(rwq rwqVar) {
        this(rwqVar, false, rvr.a);
    }
}
