package com.google.android.apps.camera.smarts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.fuo;
import defpackage.ipd;
import defpackage.ktd;
import defpackage.lxo;
import defpackage.lxp;
import defpackage.lxq;
import defpackage.lyr;
import defpackage.lzl;
import defpackage.mut;
import defpackage.mxj;
import defpackage.nlj;
import defpackage.our;
import defpackage.owf;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SmartsChipView extends LinearLayout {
    public FrameLayout a;
    public TextView b;
    public FrameLayout c;
    public boolean d;
    public Runnable e;
    public Runnable f;
    public CharSequence g;
    public boolean h;
    public boolean i;
    public boolean j;
    public mxj k;
    public Optional l;
    public boolean m;
    public boolean n;
    public our o;
    private ImageView p;
    private ImageView q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;

    public SmartsChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.g = "";
        this.h = true;
        this.i = true;
        this.k = mxj.PHONE_LAYOUT;
        this.l = Optional.empty();
        this.n = true;
        this.o = new our();
    }

    public final void a(int i) {
        animate().alpha(i == 0 ? 1.0f : 0.0f).setDuration(this.w).setListener(new lxq(this, i)).start();
    }

    public final void b() {
        this.g = "";
        this.d = false;
        a(8);
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.o.close();
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5 A[PHI: r2
      0x00b5: PHI (r2v18 boolean) = (r2v7 boolean), (r2v3 boolean) binds: [B:34:0x00d4, B:21:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.lxd r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.smarts.SmartsChipView.c(lxd):void");
    }

    public final boolean d() {
        return this.a.isAccessibilityFocused() || this.c.isAccessibilityFocused();
    }

    public final void e(owf owfVar, lyr lyrVar) {
        this.o.d(owfVar.dK(new ktd(this, lyrVar, 5, null), getContext().getMainExecutor()));
    }

    public final void f(lyr lyrVar) {
        int i = 8;
        if (lyrVar.a()) {
            lzl lzlVar = lyrVar.b;
            String str = lzlVar.c;
            Drawable drawable = lzlVar.d;
            Runnable runnable = lzlVar.e;
            Runnable runnable2 = lzlVar.h;
            if (str != null) {
                this.b.setText(str);
                this.b.setVisibility(0);
            } else {
                this.b.setVisibility(8);
            }
            if (drawable != null) {
                this.p.setImageDrawable(drawable);
                this.p.setVisibility(0);
            } else {
                this.p.setVisibility(8);
            }
            int i2 = 1;
            if (runnable != null) {
                this.a.setClickable(true);
                ipd ipdVar = new ipd(lyrVar, runnable, 11);
                fuo fuoVar = new fuo(this, i, null);
                this.a.setOnClickListener(ipdVar);
                this.a.setOnTouchListener(fuoVar);
                this.b.setOnClickListener(ipdVar);
                this.b.setOnTouchListener(fuoVar);
            } else {
                this.a.setClickable(false);
            }
            if (runnable2 != null) {
                this.q.setVisibility(0);
                this.q.setClickable(true);
                this.q.setOnClickListener(new mut(this, lyrVar, runnable2, i2));
                this.q.setContentDescription(getResources().getString(R.string.dialog_dismiss));
                TextView textView = this.b;
                textView.setPaddingRelative(textView.getPaddingLeft(), this.b.getPaddingTop(), 0, this.b.getPaddingBottom());
            } else {
                this.q.setVisibility(8);
                this.q.setContentDescription("");
                TextView textView2 = this.b;
                textView2.setPaddingRelative(textView2.getPaddingLeft(), this.b.getPaddingTop(), lyrVar.b.n == 2 ? this.v : this.u, this.b.getPaddingBottom());
            }
            this.a.setVisibility(0);
            this.a.setContentDescription(lzlVar.g);
        } else {
            this.a.setVisibility(8);
            this.a.setContentDescription("");
        }
        this.b.setMaxWidth(this.r);
        this.c.setVisibility(8);
        this.c.setContentDescription("");
    }

    @Override // android.view.View
    public final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        this.a = (FrameLayout) findViewById(R.id.smarts_chip);
        this.p = (ImageView) findViewById(R.id.smarts_chip_icon);
        this.b = (TextView) findViewById(R.id.smarts_chip_text);
        this.q = (ImageView) findViewById(R.id.smarts_chip_dismiss_button);
        this.c = (FrameLayout) findViewById(R.id.smarts_action_button);
        this.s = getContext().getResources().getDimensionPixelSize(R.dimen.smarts_notification_drawables_slide_up_y_translation);
        this.t = -nlj.b(56.0f);
        this.w = getResources().getInteger(R.integer.smarts_ui_animation_duration_ms);
        getResources().getDimensionPixelSize(R.dimen.smarts_notification_chip_max_width_with_button);
        this.r = getResources().getDimensionPixelSize(R.dimen.smarts_notification_chip_max_width_without_button);
        this.u = getResources().getDimensionPixelSize(R.dimen.smarts_notification_chip_text_padding_horizontal);
        this.v = getResources().getDimensionPixelSize(R.dimen.smarts_notification_lens_suggestion_chip_text_padding_horizontal);
        lxo lxoVar = new lxo(this);
        this.a.setAccessibilityDelegate(new lxp(this, lxoVar));
        this.c.setAccessibilityDelegate(lxoVar);
        this.b.setMovementMethod(new ScrollingMovementMethod());
    }
}
