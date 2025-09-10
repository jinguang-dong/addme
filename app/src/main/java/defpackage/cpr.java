package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpr extends ClickableSpan {
    private final int a;
    private final cpt b;
    private final int c;

    public cpr(int i, cpt cptVar, int i2) {
        this.a = i;
        this.b = cptVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
