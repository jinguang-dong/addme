package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class daa implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public daa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        jh jhVar;
        if (this.b != 0) {
            if (i == -1 || (jhVar = ((jz) this.a).e) == null) {
                return;
            }
            jhVar.a = false;
            return;
        }
        if (i >= 0) {
            Object obj = this.a;
            ListPreference listPreference = (ListPreference) obj;
            String string = listPreference.h[i].toString();
            if (string.equals(listPreference.i) || !((Preference) obj).R(string)) {
                return;
            }
            listPreference.o(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
