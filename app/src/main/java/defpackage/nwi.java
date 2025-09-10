package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.clockwork.common.wearable.wearmaterial.drawable.OutlineDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwi extends Drawable.ConstantState {
    public int a;
    public int b;
    public int c;
    public ColorStateList d;
    public PorterDuff.Mode e;

    public nwi() {
        this.e = PorterDuff.Mode.SRC_IN;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new OutlineDrawable(this, null);
    }

    public nwi(nwi nwiVar) {
        this.e = PorterDuff.Mode.SRC_IN;
        this.a = nwiVar.a;
        this.b = nwiVar.b;
        this.c = nwiVar.c;
        this.d = nwiVar.d;
        this.e = nwiVar.e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new OutlineDrawable(this, null);
    }
}
