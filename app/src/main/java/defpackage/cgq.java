package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgq extends ClickableSpan {
    private final ccu a;

    public cgq(ccu ccuVar) {
        this.a = ccuVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.b();
    }
}
