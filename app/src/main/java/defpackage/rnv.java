package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnv extends Drawable.ConstantState {
    public roc a;
    rom b;
    public rkg c;
    ColorFilter d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    ColorStateList h;
    PorterDuff.Mode i;
    Rect j;
    float k;
    public float l;
    float m;
    int n;
    public float o;
    float p;
    float q;
    int r;
    int s;
    int t;
    int u;
    boolean v;
    Paint.Style w;

    public rnv(rnv rnvVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = 255;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = rnvVar.a;
        this.b = rnvVar.b;
        this.c = rnvVar.c;
        this.m = rnvVar.m;
        this.d = rnvVar.d;
        this.e = rnvVar.e;
        this.f = rnvVar.f;
        this.i = rnvVar.i;
        this.h = rnvVar.h;
        this.n = rnvVar.n;
        this.k = rnvVar.k;
        this.t = rnvVar.t;
        int i = rnvVar.r;
        this.r = 0;
        boolean z = rnvVar.v;
        this.v = false;
        this.l = rnvVar.l;
        this.o = rnvVar.o;
        this.p = rnvVar.p;
        float f = rnvVar.q;
        this.q = 0.0f;
        this.s = rnvVar.s;
        int i2 = rnvVar.u;
        this.u = 0;
        ColorStateList colorStateList = rnvVar.g;
        this.g = null;
        this.w = rnvVar.w;
        Rect rect = rnvVar.j;
        if (rect != null) {
            this.j = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        rnx rnxVar = new rnx(this);
        rnxVar.e = true;
        rnxVar.f = true;
        return rnxVar;
    }

    public rnv(roc rocVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = 255;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = rocVar;
        this.c = null;
    }
}
