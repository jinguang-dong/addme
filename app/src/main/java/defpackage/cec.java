package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cec extends MetricAffectingSpan {
    private final String a;

    public cec(String str) {
        this.a = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.a);
    }
}
