package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.ar.core.R;
import defpackage.a;
import defpackage.clu;
import defpackage.efe;
import defpackage.eff;
import defpackage.efg;
import defpackage.efh;
import defpackage.efm;
import defpackage.efs;
import defpackage.efu;
import defpackage.efw;
import defpackage.efx;
import defpackage.ega;
import defpackage.egc;
import defpackage.egd;
import defpackage.eia;
import defpackage.eji;
import defpackage.eln;
import defpackage.elq;
import defpackage.fsu;
import defpackage.gml;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final efu a = new efu() { // from class: efc
        @Override // defpackage.efu
        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            efu efuVar = LottieAnimationView.a;
            ThreadLocal threadLocal = eln.a;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            elg.b("Unable to load composition.", th);
        }
    };
    public int b;
    public final efs c;
    public boolean d;
    public final Set e;
    private final efu f;
    private final efu g;
    private String h;
    private int i;
    private boolean j;
    private boolean k;
    private final Set l;
    private ega m;

    public LottieAnimationView(Context context) {
        super(context);
        this.f = new efu() { // from class: efb
            @Override // defpackage.efu
            public final void a(Object obj) {
                this.a.f((efh) obj);
            }
        };
        this.g = new efe(this);
        this.b = 0;
        this.c = new efs();
        this.j = false;
        this.k = false;
        this.d = true;
        this.e = new HashSet();
        this.l = new HashSet();
        k(null, R.attr.lottieAnimationViewStyle);
    }

    private final void j() {
        ega egaVar = this.m;
        if (egaVar != null) {
            egaVar.g(this.f);
            this.m.f(this.g);
        }
    }

    private final void k(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, egc.a, i, 0);
        this.d = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(12);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(7);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(17);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                d(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(7);
            if (string2 != null) {
                e(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(17)) != null) {
            l(this.d ? efm.h(getContext(), string, "url_".concat(string)) : efm.h(getContext(), string, null));
        }
        this.b = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.k = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(10, false)) {
            this.c.t(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            i(typedArrayObtainStyledAttributes.getInt(15, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            h(typedArrayObtainStyledAttributes.getInt(14, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            this.c.b.c = typedArrayObtainStyledAttributes.getFloat(16, 1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
            efs efsVar = this.c;
            if (z != efsVar.j) {
                efsVar.j = z;
                eji ejiVar = efsVar.k;
                if (ejiVar != null) {
                    ejiVar.j = z;
                }
                efsVar.invalidateSelf();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            String string3 = typedArrayObtainStyledAttributes.getString(4);
            efs efsVar2 = this.c;
            efsVar2.h = string3;
            gml gmlVarW = efsVar2.w();
            if (gmlVarW != null) {
                gmlVarW.e = string3;
            }
        }
        g(typedArrayObtainStyledAttributes.getString(9));
        m(typedArrayObtainStyledAttributes.getFloat(11, 0.0f), typedArrayObtainStyledAttributes.hasValue(11));
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        efs efsVar3 = this.c;
        if (efsVar3.i != z2) {
            efsVar3.i = z2;
            if (efsVar3.a != null) {
                efsVar3.h();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            efsVar3.g(new eia("**"), efx.K, new elq(new egd(clu.b(getContext(), typedArrayObtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(13, 0);
            a.an();
            if (i2 >= 3) {
                i2 = 0;
            }
            efsVar3.p = a.an()[i2];
            efsVar3.k();
        }
        efsVar3.d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            efsVar3.b.l = typedArrayObtainStyledAttributes.getBoolean(18, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context = getContext();
        ThreadLocal threadLocal = eln.a;
        boolean z3 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
        Boolean.valueOf(z3).getClass();
        efsVar3.c = z3;
    }

    private final void l(ega egaVar) {
        this.e.add(efg.SET_ANIMATION);
        this.c.j();
        j();
        egaVar.e(this.f);
        egaVar.d(this.g);
        this.m = egaVar;
    }

    private final void m(float f, boolean z) {
        if (z) {
            this.e.add(efg.SET_PROGRESS);
        }
        this.c.s(f);
    }

    public final void a() {
        this.k = false;
        this.c.m();
    }

    public final void b() {
        this.e.add(efg.PLAY_OPTION);
        this.c.n();
    }

    public final void c() {
        this.e.add(efg.PLAY_OPTION);
        this.c.q();
    }

    public final void d(final int i) {
        ega egaVarG;
        this.i = i;
        this.h = null;
        if (isInEditMode()) {
            egaVarG = new ega(new Callable() { // from class: efd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = i;
                    LottieAnimationView lottieAnimationView = this.a;
                    return lottieAnimationView.d ? efm.c(lottieAnimationView.getContext(), i2) : efm.d(lottieAnimationView.getContext(), i2, null);
                }
            }, true);
        } else if (this.d) {
            Context context = getContext();
            egaVarG = efm.g(context, i, efm.i(context, i));
        } else {
            egaVarG = efm.g(getContext(), i, null);
        }
        l(egaVarG);
    }

    public final void f(efh efhVar) {
        efs efsVar = this.c;
        efsVar.setCallback(this);
        this.j = true;
        boolean zV = efsVar.v(efhVar);
        this.j = false;
        if (getDrawable() == efsVar) {
            if (!zV) {
                return;
            }
        } else if (!zV) {
            boolean zU = efsVar.u();
            setImageDrawable(null);
            setImageDrawable(efsVar);
            if (zU) {
                efsVar.q();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((efw) it.next()).a();
        }
    }

    public final void g(String str) {
        this.c.g = str;
    }

    public final void h(int i) {
        this.e.add(efg.SET_REPEAT_COUNT);
        this.c.t(i);
    }

    public final void i(int i) {
        this.e.add(efg.SET_REPEAT_MODE);
        this.c.b.setRepeatMode(i);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof efs) && ((efs) drawable).m) {
            this.c.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        efs efsVar = this.c;
        if (drawable2 == efsVar) {
            super.invalidateDrawable(efsVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.k) {
            return;
        }
        this.c.n();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof eff)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eff effVar = (eff) parcelable;
        super.onRestoreInstanceState(effVar.getSuperState());
        this.h = effVar.a;
        Set set = this.e;
        efg efgVar = efg.SET_ANIMATION;
        if (!set.contains(efgVar) && !TextUtils.isEmpty(this.h)) {
            e(this.h);
        }
        this.i = effVar.b;
        if (!set.contains(efgVar) && (i = this.i) != 0) {
            d(i);
        }
        if (!set.contains(efg.SET_PROGRESS)) {
            m(effVar.c, false);
        }
        if (!set.contains(efg.PLAY_OPTION) && effVar.d) {
            b();
        }
        if (!set.contains(efg.SET_IMAGE_ASSETS)) {
            g(effVar.e);
        }
        if (!set.contains(efg.SET_REPEAT_MODE)) {
            i(effVar.f);
        }
        if (set.contains(efg.SET_REPEAT_COUNT)) {
            return;
        }
        h(effVar.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        eff effVar = new eff(super.onSaveInstanceState());
        effVar.a = this.h;
        effVar.b = this.i;
        efs efsVar = this.c;
        effVar.c = efsVar.c();
        if (efsVar.isVisible()) {
            z = efsVar.b.k;
        } else {
            int i = efsVar.o;
            z = i == 2 || i == 3;
        }
        effVar.d = z;
        effVar.e = efsVar.g;
        effVar.f = efsVar.b.getRepeatMode();
        effVar.g = efsVar.e();
        return effVar;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        j();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        j();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        j();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        efs efsVar;
        if (!this.j && drawable == (efsVar = this.c) && efsVar.u()) {
            a();
        } else if (!this.j && (drawable instanceof efs)) {
            efs efsVar2 = (efs) drawable;
            if (efsVar2.u()) {
                efsVar2.m();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public final void e(String str) {
        ega egaVarF;
        this.h = str;
        this.i = 0;
        byte[] bArr = null;
        if (isInEditMode()) {
            egaVarF = new ega(new fsu(this, str, 1, bArr), true);
        } else if (this.d) {
            egaVarF = efm.f(getContext(), str, uCzt.CfiosBRK.concat(String.valueOf(str)));
        } else {
            egaVarF = efm.f(getContext(), str, null);
        }
        l(egaVarF);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new efu() { // from class: efb
            @Override // defpackage.efu
            public final void a(Object obj) {
                this.a.f((efh) obj);
            }
        };
        this.g = new efe(this);
        this.b = 0;
        this.c = new efs();
        this.j = false;
        this.k = false;
        this.d = true;
        this.e = new HashSet();
        this.l = new HashSet();
        k(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new efu() { // from class: efb
            @Override // defpackage.efu
            public final void a(Object obj) {
                this.a.f((efh) obj);
            }
        };
        this.g = new efe(this);
        this.b = 0;
        this.c = new efs();
        this.j = false;
        this.k = false;
        this.d = true;
        this.e = new HashSet();
        this.l = new HashSet();
        k(attributeSet, i);
    }
}
