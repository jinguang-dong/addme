package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dag extends dap {
    public int ag;
    private CharSequence[] ah;
    private CharSequence[] ai;

    private final ListPreference G() {
        return (ListPreference) F();
    }

    @Override // defpackage.dap
    public final void C(boolean z) {
        int i;
        if (!z || (i = this.ag) < 0) {
            return;
        }
        String string = this.ai[i].toString();
        ListPreference listPreferenceG = G();
        if (listPreferenceG.R(string)) {
            listPreferenceG.o(string);
        }
    }

    @Override // defpackage.dap
    protected final void dA(du duVar) {
        CharSequence[] charSequenceArr = this.ah;
        int i = this.ag;
        fdf fdfVar = new fdf(this, 1, null);
        dq dqVar = duVar.a;
        dqVar.n = charSequenceArr;
        dqVar.p = fdfVar;
        dqVar.v = i;
        dqVar.u = true;
        duVar.j(null, null);
    }

    @Override // defpackage.dap, defpackage.bb, defpackage.bm
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.ag = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.ah = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.ai = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceG = G();
        if (listPreferenceG.g == null || listPreferenceG.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ag = listPreferenceG.k(listPreferenceG.i);
        this.ah = listPreferenceG.g;
        this.ai = listPreferenceG.h;
    }

    @Override // defpackage.dap, defpackage.bb, defpackage.bm
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ag);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ah);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ai);
    }
}
