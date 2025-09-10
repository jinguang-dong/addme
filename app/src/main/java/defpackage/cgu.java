package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgu extends CharacterStyle implements UpdateAppearance {
    public final Object a;
    private final /* synthetic */ int b;

    public cgu(byi byiVar, int i) {
        this.b = i;
        this.a = byiVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.b == 0) {
            throw null;
        }
        if (textPaint != null) {
            Object obj = this.a;
            if (a.ao(obj, bmx.a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(obj instanceof bmy)) {
                throw new uet();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            bmy bmyVar = (bmy) obj;
            textPaint.setStrokeWidth(bmyVar.a);
            textPaint.setStrokeMiter(bmyVar.b);
            int i = bmyVar.d;
            textPaint.setStrokeJoin(a.p(i, 0) ? Paint.Join.MITER : a.p(i, 1) ? Paint.Join.ROUND : a.p(i, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = bmyVar.c;
            textPaint.setStrokeCap(a.p(i2, 0) ? Paint.Cap.BUTT : a.p(i2, 1) ? Paint.Cap.ROUND : a.p(i2, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
