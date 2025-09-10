package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreferenceCompat;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jdj implements dal {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jdj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dal
    public final boolean b(Preference preference, Object obj) {
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            ListPreference listPreference = (ListPreference) preference;
            int iK = listPreference.k(listPreference.i);
            int iK2 = listPreference.k((String) obj);
            listPreference.n(listPreference.g[iK2]);
            mdy mdyVar = ((jdl) this.a).F().n;
            String str = listPreference.r;
            CharSequence[] charSequenceArr = listPreference.g;
            mdyVar.i(str, charSequenceArr[iK], charSequenceArr[iK2]);
            return true;
        }
        if (i == 1) {
            ListPreference listPreference2 = (ListPreference) preference;
            int iK3 = listPreference2.k(listPreference2.i);
            int iK4 = listPreference2.k((String) obj);
            listPreference2.n(listPreference2.g[iK4]);
            mdy mdyVar2 = ((jdl) this.a).F().n;
            String str2 = listPreference2.r;
            CharSequence[] charSequenceArr2 = listPreference2.g;
            mdyVar2.i(str2, charSequenceArr2[iK3], charSequenceArr2[iK4]);
            return true;
        }
        if (i == 2) {
            Object obj2 = this.a;
            ((Preference) obj2).n(((ListPreference) obj2).g[((ListPreference) preference).k((String) obj)]);
            return true;
        }
        jdl jdlVar = (jdl) this.a;
        obu obuVar = jdlVar.ai;
        if (obuVar == null) {
            ujp.c("locationHandler");
            obuVar = null;
        }
        obj.getClass();
        if (((Boolean) obj).booleanValue() && !obuVar.p()) {
            Object obj3 = obuVar.b;
            Activity activity = (Activity) obj3;
            if (activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
            } else {
                roy royVarK = roy.k(new on((Context) obj3, R.style.Theme_CameraSettings), activity.findViewById(android.R.id.content), ((bm) obuVar.a).getString(R.string.camera_permissions_error_title));
                royVarK.l(new kcm(obuVar, 16));
                royVarK.f();
            }
            z = false;
        }
        if (z) {
            String str3 = preference.r;
            str3.getClass();
            jdlVar.G(str3, Boolean.valueOf(((TwoStatePreference) ((ManagedSwitchPreferenceCompat) preference)).a), obj);
        }
        return z;
    }
}
