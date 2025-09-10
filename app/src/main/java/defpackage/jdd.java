package defpackage;

import android.preference.Preference;
import android.widget.RadioGroup;
import com.google.android.apps.camera.ui.preference.EmptyListPreference;
import com.google.ar.core.R;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jdd implements Preference.OnPreferenceClickListener {
    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        EmptyListPreference emptyListPreference = (EmptyListPreference) preference;
        Stream map = DesugarArrays.stream(emptyListPreference.getEntries()).map(new idv(16));
        int i = sbp.d;
        sbp sbpVar = (sbp) map.collect(ryv.a);
        RadioGroup radioGroup = (RadioGroup) emptyListPreference.getDialog().findViewById(R.id.preference_buttons);
        int[] iArr = {R.id.preference_button_standard_camera, R.id.preference_button_rear_camera_selfie, R.id.preference_button_dual_screen, R.id.preference_button_made_you_look};
        radioGroup.check(iArr[emptyListPreference.findIndexOfValue(emptyListPreference.getValue())]);
        for (int i2 = 0; i2 < 4; i2++) {
            radioGroup.findViewById(iArr[i2]).setOnClickListener(new ipd(emptyListPreference, sbpVar, 5));
        }
        return true;
    }
}
