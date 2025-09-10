package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class daj extends dap {
    final Set ag = new HashSet();
    boolean ah;
    CharSequence[] ai;
    CharSequence[] aj;

    private final MultiSelectListPreference G() {
        return (MultiSelectListPreference) F();
    }

    @Override // defpackage.dap
    public final void C(boolean z) {
        if (z && this.ah) {
            MultiSelectListPreference multiSelectListPreferenceG = G();
            Set set = this.ag;
            if (multiSelectListPreferenceG.R(set)) {
                multiSelectListPreferenceG.k(set);
            }
        }
        this.ah = false;
    }

    @Override // defpackage.dap
    protected final void dA(du duVar) {
        int length = this.aj.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ag.contains(this.aj[i].toString());
        }
        CharSequence[] charSequenceArr = this.ai;
        dai daiVar = new dai(this);
        dq dqVar = duVar.a;
        dqVar.n = charSequenceArr;
        dqVar.w = daiVar;
        dqVar.s = zArr;
        dqVar.t = true;
    }

    @Override // defpackage.dap, defpackage.bb, defpackage.bm
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle != null) {
            Set set = this.ag;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.ah = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.ai = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.aj = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceG = G();
        CharSequence[] charSequenceArr2 = multiSelectListPreferenceG.g;
        if (charSequenceArr2 == null || (charSequenceArr = multiSelectListPreferenceG.h) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        Set set2 = this.ag;
        set2.clear();
        set2.addAll(multiSelectListPreferenceG.i);
        this.ah = false;
        this.ai = charSequenceArr2;
        this.aj = charSequenceArr;
    }

    @Override // defpackage.dap, defpackage.bb, defpackage.bm
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ag));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ah);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ai);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.aj);
    }
}
