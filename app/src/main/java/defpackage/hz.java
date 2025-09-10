package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hz extends SeekBar {
    private final ia a;

    public hz(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ia iaVar = this.a;
        Drawable drawable = iaVar.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = iaVar.b;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ia iaVar = this.a;
        if (iaVar.c != null) {
            SeekBar seekBar = iaVar.b;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = iaVar.c.getIntrinsicWidth();
                int intrinsicHeight = iaVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                iaVar.c.setBounds(-i, -i2, i, i2);
                int width = (seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight();
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    iaVar.c.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public hz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public hz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        lw.d(this, getContext());
        ia iaVar = new ia(this);
        this.a = iaVar;
        iaVar.b(attributeSet, i);
    }
}
