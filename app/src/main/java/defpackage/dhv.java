package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhv extends Drawable.ConstantState {
    int a;
    dhu b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public dhv() {
        this.c = null;
        this.d = dhx.a;
        this.b = new dhu();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        dhu dhuVar = this.b;
        dhuVar.a(dhuVar.d, dhu.a, canvas, i, i2);
    }

    public final boolean b() {
        dhu dhuVar = this.b;
        if (dhuVar.k == null) {
            dhuVar.k = Boolean.valueOf(dhuVar.d.p());
        }
        return dhuVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new dhx(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new dhx(this);
    }

    public dhv(dhv dhvVar) {
        this.c = null;
        this.d = dhx.a;
        if (dhvVar != null) {
            this.a = dhvVar.a;
            this.b = new dhu(dhvVar.b);
            Paint paint = dhvVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = dhvVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = dhvVar.c;
            this.d = dhvVar.d;
            this.e = dhvVar.e;
        }
    }
}
