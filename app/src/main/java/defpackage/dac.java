package defpackage;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dac extends dap {
    public EditText ag;
    public final Runnable ah = new mb(this, 12, null);
    public long ai = -1;
    private CharSequence aj;

    private final EditTextPreference G() {
        return (EditTextPreference) F();
    }

    @Override // defpackage.dap
    protected final void B(View view) {
        super.B(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.ag = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ag.setText(this.aj);
        EditText editText2 = this.ag;
        editText2.setSelection(editText2.getText().length());
        G();
    }

    @Override // defpackage.dap
    public final void C(boolean z) {
        if (z) {
            String string = this.ag.getText().toString();
            EditTextPreference editTextPreferenceG = G();
            if (editTextPreferenceG.R(string)) {
                editTextPreferenceG.i(string);
            }
        }
    }

    @Override // defpackage.dap
    protected final boolean D() {
        return true;
    }

    public final void E() {
        this.ai = -1L;
    }

    @Override // defpackage.dap, defpackage.bb, defpackage.bm
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.aj = G().g;
        } else {
            this.aj = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.dap, defpackage.bb, defpackage.bm
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.aj);
    }
}
