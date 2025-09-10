package defpackage;

import android.content.res.ColorStateList;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.ProgressSpinnerDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyc {
    public ColorStateList a;
    public ColorStateList b;
    final /* synthetic */ ProgressSpinnerDrawable c;

    public nyc(ProgressSpinnerDrawable progressSpinnerDrawable) {
        this.c = progressSpinnerDrawable;
    }

    public final void a() {
        ColorStateList colorStateList = this.a;
        if (colorStateList != null) {
            this.c.setProgressColor(colorStateList);
        }
        this.c.setTrackColor(this.b);
    }
}
