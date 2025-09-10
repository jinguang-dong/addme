package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hp extends CheckedTextView {
    private final hn a;
    private final in b;
    private final nyt c;
    private byz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        ly.a(context);
        lw.d(this, getContext());
        in inVar = new in(this);
        this.b = inVar;
        inVar.c(attributeSet, R.attr.checkedTextViewStyle);
        inVar.a();
        hn hnVar = new hn(this);
        this.a = hnVar;
        hnVar.b(attributeSet, R.attr.checkedTextViewStyle);
        nyt nytVar = new nyt(this);
        this.c = nytVar;
        nytVar.d(attributeSet);
        a().G(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final byz a() {
        if (this.d == null) {
            this.d = new byz((TextView) this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        in inVar = this.b;
        if (inVar != null) {
            inVar.a();
        }
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.a();
        }
        nyt nytVar = this.c;
        if (nytVar != null) {
            nytVar.c();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        cok.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kk.d(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        cty.e();
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

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(byi.bJ(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        in inVar = this.b;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        in inVar = this.b;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        in inVar = this.b;
        if (inVar != null) {
            inVar.d(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        nyt nytVar = this.c;
        if (nytVar != null) {
            if (nytVar.a) {
                nytVar.a = false;
            } else {
                nytVar.a = true;
                nytVar.c();
            }
        }
    }
}
