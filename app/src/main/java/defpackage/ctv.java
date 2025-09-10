package defpackage;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctv extends InputConnectionWrapper {
    private final TextView a;

    public ctv(TextView textView, InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = textView;
        ctq ctqVar = ctq.a;
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return com.i(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return com.i(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
