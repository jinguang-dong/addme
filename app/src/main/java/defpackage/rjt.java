package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rjt extends dhj {
    final /* synthetic */ rjw b;

    public rjt(rjw rjwVar) {
        this.b = rjwVar;
    }

    @Override // defpackage.dhj
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.dhj
    public final void c(Drawable drawable) {
        rjw rjwVar = this.b;
        ColorStateList colorStateList = rjwVar.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(rjwVar.d, colorStateList.getDefaultColor()));
        }
    }
}
