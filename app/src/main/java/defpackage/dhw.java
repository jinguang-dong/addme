package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhw extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public dhw(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        dhx dhxVar = new dhx();
        dhxVar.e = (VectorDrawable) this.a.newDrawable();
        return dhxVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        dhx dhxVar = new dhx();
        dhxVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return dhxVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        dhx dhxVar = new dhx();
        dhxVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return dhxVar;
    }
}
