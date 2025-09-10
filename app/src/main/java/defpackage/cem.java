package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cem extends MetricAffectingSpan {
    private final Typeface a;

    public cem(Typeface typeface) {
        this.a = typeface;
    }

    private final void a(Paint paint) {
        paint.setTypeface(this.a);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
