package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ht extends ImageButton {
    private final hn a;
    private boolean b;
    private final iua c;

    public ht(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.a();
        }
        iua iuaVar = this.c;
        if (iuaVar != null) {
            iuaVar.h();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.l() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        iua iuaVar = this.c;
        if (iuaVar != null) {
            iuaVar.h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        iua iuaVar = this.c;
        if (iuaVar != null && drawable != null && !this.b) {
            iuaVar.j(drawable);
        }
        super.setImageDrawable(drawable);
        if (iuaVar != null) {
            iuaVar.h();
            if (this.b) {
                return;
            }
            iuaVar.g();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.b = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.c.k(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        iua iuaVar = this.c;
        if (iuaVar != null) {
            iuaVar.h();
        }
    }

    public ht(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ly.a(context);
        this.b = false;
        lw.d(this, getContext());
        hn hnVar = new hn(this);
        this.a = hnVar;
        hnVar.b(attributeSet, i);
        iua iuaVar = new iua(this);
        this.c = iuaVar;
        iuaVar.i(attributeSet, i);
    }
}
