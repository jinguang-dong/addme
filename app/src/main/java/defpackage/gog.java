package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gog extends ClickableSpan {
    final /* synthetic */ Runnable a;

    public gog(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
