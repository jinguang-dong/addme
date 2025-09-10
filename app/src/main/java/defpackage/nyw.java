package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyw implements nyy {
    private final TextView a;

    public nyw(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.nyy
    public final int a() {
        return this.a.getCurrentTextColor();
    }

    @Override // defpackage.nyy
    public final View b() {
        return this.a;
    }

    @Override // defpackage.nyy
    public final void c(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // defpackage.nyy
    public final void d(int i) {
        this.a.setTextColor(i);
    }
}
