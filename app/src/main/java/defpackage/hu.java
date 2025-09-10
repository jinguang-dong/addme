package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hu extends MultiAutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final hn b;
    private final in c;
    private final ebn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.google.ar.core.R.attr.autoCompleteTextViewStyle);
        ly.a(context);
        lw.d(this, getContext());
        pmg pmgVarJ = pmg.J(getContext(), attributeSet, a, com.google.ar.core.R.attr.autoCompleteTextViewStyle, 0);
        if (pmgVarJ.F(0)) {
            setDropDownBackgroundDrawable(pmgVarJ.z(0));
        }
        pmgVarJ.D();
        hn hnVar = new hn(this);
        this.b = hnVar;
        hnVar.b(attributeSet, com.google.ar.core.R.attr.autoCompleteTextViewStyle);
        in inVar = new in(this);
        this.c = inVar;
        inVar.c(attributeSet, com.google.ar.core.R.attr.autoCompleteTextViewStyle);
        inVar.a();
        ebn ebnVar = new ebn((EditText) this, (byte[]) null);
        this.d = ebnVar;
        ebnVar.t(attributeSet, com.google.ar.core.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (ebn.u(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerV = ebn.v(keyListener);
            if (keyListenerV == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerV);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hn hnVar = this.b;
        if (hnVar != null) {
            hnVar.a();
        }
        in inVar = this.c;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kk.d(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.w(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hn hnVar = this.b;
        if (hnVar != null) {
            hnVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hn hnVar = this.b;
        if (hnVar != null) {
            hnVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        in inVar = this.c;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        in inVar = this.c;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(byi.bJ(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(ebn.v(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        in inVar = this.c;
        if (inVar != null) {
            inVar.d(context, i);
        }
    }
}
