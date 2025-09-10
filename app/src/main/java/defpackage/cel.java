package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cel extends CharacterStyle {
    private final boolean a;
    private final boolean b;

    public cel(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
