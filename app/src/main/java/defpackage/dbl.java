package defpackage;

import android.widget.CompoundButton;
import androidx.preference.TwoStatePreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbl implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ TwoStatePreference a;
    private final /* synthetic */ int b;

    public dbl(TwoStatePreference twoStatePreference, int i) {
        this.b = i;
        this.a = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        if (i == 0) {
            TwoStatePreference twoStatePreference = this.a;
            if (twoStatePreference.R(Boolean.valueOf(z))) {
                twoStatePreference.k(z);
                return;
            } else {
                compoundButton.setChecked(!z);
                return;
            }
        }
        if (i != 1) {
            TwoStatePreference twoStatePreference2 = this.a;
            if (twoStatePreference2.R(Boolean.valueOf(z))) {
                twoStatePreference2.k(z);
                return;
            } else {
                compoundButton.setChecked(!z);
                return;
            }
        }
        TwoStatePreference twoStatePreference3 = this.a;
        if (twoStatePreference3.R(Boolean.valueOf(z))) {
            twoStatePreference3.k(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
