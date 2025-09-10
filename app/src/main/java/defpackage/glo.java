package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glo extends cmd {
    final /* synthetic */ TextView a;

    public glo(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.cmd
    public final void a(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    @Override // defpackage.cmd
    public final void b() {
    }
}
