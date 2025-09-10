package defpackage;

import android.view.View;
import androidx.wear.widget.CurvedTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyv implements nyy {
    private final CurvedTextView a;

    public nyv(CurvedTextView curvedTextView) {
        this.a = curvedTextView;
    }

    @Override // defpackage.nyy
    public final int a() {
        return this.a.f;
    }

    @Override // defpackage.nyy
    public final View b() {
        return this.a;
    }

    @Override // defpackage.nyy
    public final void c(CharSequence charSequence) {
        String string = charSequence != null ? charSequence.toString() : "";
        CurvedTextView curvedTextView = this.a;
        curvedTextView.e = string != null ? string : "";
        curvedTextView.b();
    }

    @Override // defpackage.nyy
    public final void d(int i) {
        CurvedTextView curvedTextView = this.a;
        curvedTextView.f = i;
        curvedTextView.a = true;
        curvedTextView.postInvalidate();
    }
}
