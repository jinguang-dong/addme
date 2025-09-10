package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.ui.notificationchip.NotificationChipView;
import com.google.ar.core.R;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nap implements nan {
    public NotificationChipView a;
    private final int b;
    private final boolean c;
    private final Context d;
    private final boolean e;
    private final View.OnClickListener f;
    private final nam g;
    private final int h;
    private final int i;
    private final String j;
    private int k;
    private Date l;
    private Date m;
    private String n;
    private mxj o = mxj.PHONE_LAYOUT;
    private final int p;

    public nap(Context context, String str, String str2, int i, int i2, boolean z, View.OnClickListener onClickListener, nam namVar, boolean z2, int i3, int i4) {
        this.d = context;
        this.n = str;
        this.j = str2;
        this.b = i;
        this.p = i2;
        this.c = z;
        this.f = onClickListener;
        this.g = namVar;
        this.e = z2;
        this.i = i3;
        this.h = i4;
    }

    @Override // defpackage.imj
    public final int b() {
        return this.b + 500;
    }

    @Override // defpackage.imj
    public final imk c() {
        return imk.NOTIFICATION_CHIP;
    }

    @Override // defpackage.imj
    public final paq d() {
        NotificationChipView notificationChipView = this.a;
        if (notificationChipView == null) {
            return new kxk(6);
        }
        int importantForAccessibility = notificationChipView.getImportantForAccessibility();
        this.a.setImportantForAccessibility(4);
        return new iti(this, importantForAccessibility, 3);
    }

    @Override // defpackage.imj
    public final /* synthetic */ Object e() {
        return new Object();
    }

    public final boolean equals(Object obj) {
        Date date;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nap)) {
            return false;
        }
        nap napVar = (nap) obj;
        return this.b == napVar.b && this.c == napVar.c && this.p == napVar.p && Objects.equals(this.n, napVar.n) && Objects.equals(this.j, napVar.j) && Objects.equals(this.f, napVar.f) && Objects.equals(this.g, napVar.g) && (date = this.l) != null && napVar.l != null && date.getTime() == napVar.l.getTime();
    }

    @Override // defpackage.imj
    public final /* synthetic */ Runnable f() {
        return null;
    }

    @Override // defpackage.imj
    public final Date g() {
        return this.m;
    }

    @Override // defpackage.imj
    public final void h(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.p), Boolean.valueOf(this.c), this.n, this.j, this.f, this.g, this.l);
    }

    @Override // defpackage.imj
    public final void i() {
        NotificationChipView notificationChipView = this.a;
        ((AnimatorSet) notificationChipView.h.a).end();
        notificationChipView.setVisibility(8);
        if (!notificationChipView.c) {
            notificationChipView.a();
        }
        nam namVar = notificationChipView.d;
        if (namVar != null) {
            namVar.a(new Date().getTime() - notificationChipView.f);
        }
    }

    @Override // defpackage.imj
    public final void j() {
        this.a.a();
        oer oerVar = this.a.h;
        if (((AnimatorSet) oerVar.b).isRunning()) {
            ((AnimatorSet) oerVar.b).reverse();
        }
        this.a.c(this.b);
    }

    @Override // defpackage.imj
    public final void k(Date date) {
        this.m = date;
    }

    @Override // defpackage.nan
    public final void l(String str) {
        this.n = str;
        NotificationChipView notificationChipView = this.a;
        if (notificationChipView != null) {
            notificationChipView.setText(str);
        }
    }

    @Override // defpackage.imj
    public final void m() {
        int i = this.i;
        if (i != -1) {
            int i2 = this.k;
            if (i2 >= i) {
                return;
            } else {
                this.k = i2 + 1;
            }
        }
        this.l = new Date();
        NotificationChipView notificationChipView = (NotificationChipView) ((Activity) this.d).findViewById(R.id.notification_chip_view);
        this.a = notificationChipView;
        String str = this.n;
        String str2 = this.j;
        int i3 = this.h;
        int i4 = this.b;
        boolean z = this.c;
        View.OnClickListener onClickListener = this.f;
        nam namVar = this.g;
        notificationChipView.b = i4;
        notificationChipView.c = z;
        notificationChipView.d = namVar;
        notificationChipView.setText(str);
        if (str2 != null) {
            notificationChipView.setContentDescription(str2);
        }
        if (onClickListener != null) {
            notificationChipView.setOnClickListener(onClickListener);
        }
        notificationChipView.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
        notificationChipView.setCompoundDrawablePadding(nlj.b(8.0f));
        notificationChipView.g = new mub(notificationChipView, 16);
        ((ViewGroup) notificationChipView.getParent()).addOnLayoutChangeListener(new fjt(notificationChipView, 11));
        nla nlaVar = new nla(200, new LinearInterpolator());
        nlaVar.b(notificationChipView, "alpha", 0.0f, 1.0f);
        nlaVar.a = 200;
        nlaVar.b(notificationChipView, "scaleX", 0.5f, 1.0f);
        nlaVar.b(notificationChipView, "scaleY", 0.5f, 1.0f);
        oer oerVar = notificationChipView.h;
        oerVar.a = nlaVar.a();
        nla nlaVar2 = new nla(500, new LinearInterpolator());
        nlaVar2.b(notificationChipView, "alpha", 1.0f, 0.0f);
        oerVar.b = nlaVar2.a();
        NotificationChipView notificationChipView2 = this.a;
        notificationChipView2.e = this.o;
        Context context = notificationChipView2.a;
        notificationChipView2.setBackground(context.getDrawable(R.drawable.notification_chip_background));
        notificationChipView2.setPaddingRelative(context.getResources().getDimensionPixelSize(R.dimen.notification_chip_text_padding_left), context.getResources().getDimensionPixelSize(R.dimen.notification_chip_text_padding_top), context.getResources().getDimensionPixelSize(R.dimen.notification_chip_text_padding_right), context.getResources().getDimensionPixelSize(R.dimen.notification_chip_text_padding_bottom));
        notificationChipView2.b();
        ((AnimatorSet) notificationChipView2.h.a).start();
        notificationChipView2.setVisibility(0);
        notificationChipView2.sendAccessibilityEvent(32768);
        if (!notificationChipView2.c) {
            notificationChipView2.c(notificationChipView2.b);
        }
        notificationChipView2.f = new Date().getTime();
    }

    @Override // defpackage.imj
    public final void n(boolean z, boolean z2, boolean z3, mxm mxmVar, mxj mxjVar, Optional optional, boolean z4) {
        this.o = mxjVar;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.imj
    public final boolean p() {
        return this.e;
    }

    @Override // defpackage.imj
    public final boolean q() {
        return this.c;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.imj
    public final int t() {
        return this.p;
    }
}
