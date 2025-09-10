package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hs extends EditText {
    private final hn a;
    private final in b;
    private im c;
    private AmbientMode.AmbientController d;
    private final ebn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        ly.a(context);
        lw.d(this, getContext());
        hn hnVar = new hn(this);
        this.a = hnVar;
        hnVar.b(attributeSet, R.attr.editTextStyle);
        in inVar = new in(this);
        this.b = inVar;
        inVar.c(attributeSet, R.attr.editTextStyle);
        inVar.a();
        ebn ebnVar = new ebn((EditText) this, (byte[]) null);
        this.e = ebnVar;
        ebnVar.t(attributeSet, R.attr.editTextStyle);
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

    private final AmbientMode.AmbientController c() {
        if (this.d == null) {
            this.d = new AmbientMode.AmbientController(this);
        }
        return this.d;
    }

    final im a() {
        if (this.c == null) {
            this.c = new im(this, new ipg(this, 1));
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.a();
        }
        in inVar = this.b;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        cok.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return a().b;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return a().a;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kk.d(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.e.w(inputConnectionOnCreateInputConnection);
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
    public final boolean setFontVariationSettings(String str) {
        return a().b(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(ebn.v(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        in inVar = this.b;
        if (inVar != null) {
            inVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        a().a(typeface);
    }
}
