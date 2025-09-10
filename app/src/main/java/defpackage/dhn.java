package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhn extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public dhn(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        dho dhoVar = new dho();
        dhoVar.e = this.a.newDrawable();
        dhoVar.e.setCallback(dhoVar.d);
        return dhoVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        dho dhoVar = new dho();
        dhoVar.e = this.a.newDrawable(resources);
        dhoVar.e.setCallback(dhoVar.d);
        return dhoVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        dho dhoVar = new dho();
        dhoVar.e = this.a.newDrawable(resources, theme);
        dhoVar.e.setCallback(dhoVar.d);
        return dhoVar;
    }
}
