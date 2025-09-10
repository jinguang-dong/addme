package defpackage;

import android.content.Context;
import android.preference.ListPreference;
import android.preference.Preference;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jdb implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jdb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            jdf jdfVar = ((jde) this.a).a;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            luk lukVar = jdfVar.k;
            lukVar.j(luf.aV.a, true);
            owq owqVar = jdfVar.j;
            if (zBooleanValue && !lukVar.k(luf.an.a)) {
                z = true;
            }
            owqVar.a(Boolean.valueOf(z));
            return true;
        }
        if (i == 1) {
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            Object obj2 = this.a;
            if (!zBooleanValue2) {
                hbp.b((Context) ((hbp) obj2).c);
            }
            Object obj3 = ((hbp) obj2).b;
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.FREQUENT_FACE_PREFERENCE_CHANGE_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            tpc tpcVarM2 = sqr.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sqr sqrVar = (sqr) tpcVarM2.b;
            sqrVar.b |= 1;
            sqrVar.c = zBooleanValue2;
            sqr sqrVar2 = (sqr) tpcVarM2.l();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            sqrVar2.getClass();
            sodVar2.U = sqrVar2;
            sodVar2.c |= 16777216;
            ((mdy) obj3).I(tpcVarM);
            return true;
        }
        if (i == 2) {
            ListPreference listPreference = (ListPreference) preference;
            int iFindIndexOfValue = listPreference.findIndexOfValue(listPreference.getValue());
            int iFindIndexOfValue2 = listPreference.findIndexOfValue((String) obj);
            listPreference.setSummary(listPreference.getEntries()[iFindIndexOfValue2]);
            ((jde) this.a).a.n.i(preference.getKey(), listPreference.getEntries()[iFindIndexOfValue], listPreference.getEntries()[iFindIndexOfValue2]);
            return true;
        }
        if (i != 3) {
            ListPreference listPreference2 = (ListPreference) preference;
            int iFindIndexOfValue3 = listPreference2.findIndexOfValue(listPreference2.getValue());
            int iFindIndexOfValue4 = listPreference2.findIndexOfValue((String) obj);
            listPreference2.setSummary(listPreference2.getEntries()[iFindIndexOfValue4]);
            ((jde) this.a).a.n.i(preference.getKey(), listPreference2.getEntries()[iFindIndexOfValue3], listPreference2.getEntries()[iFindIndexOfValue4]);
            return true;
        }
        Object obj4 = this.a;
        jde jdeVar = (jde) obj4;
        jdeVar.a.n.i(preference.getKey(), Boolean.valueOf(jdeVar.b.isChecked()), obj);
        if (((Boolean) obj).booleanValue() && !jdeVar.b()) {
            if (!jdeVar.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && !jdeVar.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                View view = jdeVar.getView();
                view.getClass();
                int i2 = roy.t;
                roy royVarK = roy.k(null, view, view.getResources().getText(R.string.camera_permissions_error_title));
                royVarK.l(new ipr(obj4, 14));
                royVarK.f();
                return false;
            }
            jdeVar.getActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
        }
        return true;
    }
}
