package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ar.core.R;
import defpackage.fvf;
import defpackage.fvp;
import defpackage.inl;
import defpackage.ksq;
import defpackage.ktf;
import defpackage.ktj;
import defpackage.ktk;
import defpackage.ktl;
import defpackage.kxj;
import defpackage.nlr;
import defpackage.ojl;
import defpackage.our;
import defpackage.out;
import defpackage.owf;
import defpackage.paq;
import defpackage.ujk;
import defpackage.ujp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OptionsEntryButtonImpl extends FrameLayout implements ktf {
    public owf a;
    public owf b;
    public out c;
    public ImageView d;
    public boolean e;
    public our f;
    private final nlr g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionsEntryButtonImpl(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // defpackage.ktf
    public final paq a() {
        setImportantForAccessibility(4);
        return new kxj(this, 1);
    }

    @Override // defpackage.ktf
    public final void b() throws Resources.NotFoundException {
        this.g.c();
    }

    @Override // defpackage.ktf
    public final void c() throws Resources.NotFoundException {
        this.g.d();
    }

    @Override // defpackage.ktf
    public final void d(boolean z) {
        getBackground().setColorFilter(new BlendModeColorFilter(z ? ojl.aP(this) : getResources().getColor(R.color.camera_protection_background_opaque, null), BlendMode.SRC_OVER));
    }

    @Override // defpackage.ktf
    public final void e(Runnable runnable, Runnable runnable2) {
        setOnTouchListener(new ktj(new GestureDetector(getContext(), new ktl(runnable)), 0));
        setOnClickListener(new fvp(runnable2, 10));
        addOnLayoutChangeListener(new fvf(this, 5, null));
    }

    public final out f() {
        out outVar = this.c;
        if (outVar != null) {
            return outVar;
        }
        ujp.c("mainThread");
        return null;
    }

    public final our g() {
        our ourVar = this.f;
        if (ourVar != null) {
            return ourVar;
        }
        ujp.c("activityLifetime");
        return null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Object systemService = getContext().getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R.layout.options_entry_button, this);
        this.d = (ImageView) findViewById(R.id.options_entry_button_icon);
        our ourVarG = g();
        owf owfVar = this.a;
        owf owfVar2 = null;
        if (owfVar == null) {
            ujp.c("gcaMode");
            owfVar = null;
        }
        ourVarG.d(owfVar.dK(new ksq(this, 3), f()));
        our ourVarG2 = g();
        owf owfVar3 = this.b;
        if (owfVar3 == null) {
            ujp.c("uiOrientation");
        } else {
            owfVar2 = owfVar3;
        }
        ourVarG2.d(owfVar2.dK(new ksq(this, 4), f()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionsEntryButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.g = new nlr(this, true);
        this.e = true;
        ((ktk) ((inl) context).d(ktk.class)).c(this);
    }

    public /* synthetic */ OptionsEntryButtonImpl(Context context, AttributeSet attributeSet, int i, ujk ujkVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
