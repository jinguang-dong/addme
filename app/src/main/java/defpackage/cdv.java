package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdv {
    public final CharSequence a;
    public final TextPaint b;
    private final int d;
    private BoringLayout.Metrics f;
    private boolean g;
    private CharSequence h;
    private float e = Float.NaN;
    public float c = Float.NaN;

    public cdv(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.d = i;
    }

    private final CharSequence d() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            charSequence = this.a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (bqs.q(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    Iterator itAu = ske.au(characterStyleArr);
                    SpannableString spannableString = null;
                    while (itAu.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) itAu.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.h = charSequence;
        }
        return charSequence;
    }

    public final float a(int i, int i2) {
        return Layout.getDesiredWidth(d(), i, i2, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b() {
        /*
            r5 = this;
            float r0 = r5.e
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r5 = r5.e
            return r5
        Lb:
            android.text.BoringLayout$Metrics r0 = r5.c()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L2e
            java.lang.CharSequence r0 = r5.d()
            int r0 = r0.length()
            r2 = 0
            float r0 = r5.a(r2, r0)
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            float r0 = (float) r2
        L2e:
            java.lang.CharSequence r2 = r5.a
            android.text.TextPaint r3 = r5.b
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 != 0) goto L37
            goto L58
        L37:
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L4d
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<ceg> r4 = defpackage.ceg.class
            boolean r4 = defpackage.bqs.q(r2, r4)
            if (r4 != 0) goto L55
            java.lang.Class<cef> r4 = defpackage.cef.class
            boolean r2 = defpackage.bqs.q(r2, r4)
            if (r2 != 0) goto L55
        L4d:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L58
        L55:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L58:
            r5.e = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdv.b():float");
    }

    public final BoringLayout.Metrics c() {
        if (!this.g) {
            this.f = BoringLayout.isBoring(this.a, this.b, cdz.b(this.d), true, null);
            this.g = true;
        }
        return this.f;
    }
}
