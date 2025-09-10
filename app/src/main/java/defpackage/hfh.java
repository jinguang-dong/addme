package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.Preference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hfh implements Preference.OnPreferenceClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hfh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) throws PackageManager.NameNotFoundException {
        int i = this.b;
        if (i == 0) {
            qom.b(((hfi) this.a).a);
            return true;
        }
        if (i == 1) {
            hfi hfiVar = (hfi) this.a;
            int preferenceCount = hfiVar.c.getPreferenceCount();
            List list = hfiVar.d;
            SharedPreferences.Editor editorEdit = hfiVar.b.edit();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                editorEdit.remove(((Preference) ((jod) it.next()).a).getKey());
            }
            for (int i2 = 0; i2 < preferenceCount; i2++) {
                editorEdit.remove(hfiVar.c.getPreference(i2).getKey());
            }
            editorEdit.apply();
            hfiVar.c.removeAll();
            hfiVar.a(hfiVar.c);
            return true;
        }
        if (i == 2) {
            ((jde) this.a).a.n.A(2);
            return false;
        }
        if (i == 3) {
            int i3 = jde.c;
            int i4 = fed.a;
            Activity activity = (Activity) this.a;
            Context applicationContext = activity.getApplicationContext();
            activity.getPackageName();
            fed.c(applicationContext, activity);
            return true;
        }
        if (i != 4) {
            ((Activity) this.a).startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
            return true;
        }
        int i5 = jde.c;
        int i6 = fed.a;
        Activity activity2 = (Activity) this.a;
        fed.a(activity2.getPackageName(), activity2.getApplicationContext());
        return true;
    }
}
