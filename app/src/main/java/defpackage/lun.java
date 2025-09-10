package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lun extends luk {
    private static final sgv a = sgv.g("lun");
    private final Context c;
    private final String d;
    private final SharedPreferences e;
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final Object b = new Object();

    public lun(final Context context, SharedPreferences sharedPreferences) {
        this.c = context;
        this.d = context.getPackageName();
        this.e = sharedPreferences;
        e(new ltp() { // from class: lum
            @Override // defpackage.ltp
            public final void a(String str) {
                BackupManager.dataChanged(context.getPackageName());
            }
        });
    }

    @Override // defpackage.luk
    public final int a(String str) {
        int iB;
        synchronized (this.b) {
            iB = b(str, 0);
        }
        return iB;
    }

    @Override // defpackage.luk
    public final int b(String str, Integer num) {
        synchronized (this.b) {
            String strO = o(str, Integer.toString(num.intValue()));
            if (strO == null) {
                return num.intValue();
            }
            return Integer.parseInt(strO);
        }
    }

    @Override // defpackage.luk
    public final SharedPreferences c() {
        SharedPreferences sharedPreferences;
        synchronized (this.b) {
            sharedPreferences = this.e;
        }
        return sharedPreferences;
    }

    @Override // defpackage.luk
    public final String d(String str) {
        String string;
        synchronized (this.b) {
            try {
                try {
                    string = this.e.getString(str, null);
                } catch (ClassCastException e) {
                    ((sgt) ((sgt) a.c().i(e)).M(4436)).s("existing preference with invalid type, removing and returning default");
                    this.e.edit().remove(str).apply();
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // defpackage.luk
    public final void e(final ltp ltpVar) {
        Object obj = this.b;
        rnt.x(obj);
        List list = this.g;
        rnt.x(list);
        SharedPreferences sharedPreferences = this.e;
        rnt.x(sharedPreferences);
        synchronized (obj) {
            List list2 = this.f;
            if (list2.contains(ltpVar)) {
                return;
            }
            list2.add(ltpVar);
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: lul
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                    ltpVar.a(str);
                }
            };
            list.add(onSharedPreferenceChangeListener);
            sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    @Override // defpackage.luk
    public final void f(String str) {
        synchronized (this.b) {
            this.e.edit().remove(str).apply();
        }
    }

    @Override // defpackage.luk
    public final void g(ltp ltpVar) {
        Object obj = this.b;
        rnt.x(obj);
        List list = this.g;
        rnt.x(list);
        SharedPreferences sharedPreferences = this.e;
        rnt.x(sharedPreferences);
        synchronized (obj) {
            List list2 = this.f;
            if (list2.contains(ltpVar)) {
                int iIndexOf = list2.indexOf(ltpVar);
                list2.remove(ltpVar);
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) list.get(iIndexOf);
                list.remove(iIndexOf);
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        }
    }

    @Override // defpackage.luk
    public final void h(String str, int i) {
        synchronized (this.b) {
            i(str, Integer.toString(i));
        }
    }

    @Override // defpackage.luk
    public final void i(String str, String str2) {
        synchronized (this.b) {
            this.e.edit().putString(str, str2).apply();
        }
    }

    @Override // defpackage.luk
    public final void j(String str, boolean z) {
        synchronized (this.b) {
            i(str, true != z ? "0" : "1");
        }
    }

    @Override // defpackage.luk
    public final boolean k(String str) {
        boolean zM;
        synchronized (this.b) {
            zM = m(str);
        }
        return zM;
    }

    @Override // defpackage.luk
    public final boolean l(String str) {
        boolean zContains;
        synchronized (this.b) {
            zContains = this.e.contains(str);
        }
        return zContains;
    }

    @Override // defpackage.luk
    public final boolean m(String str) {
        synchronized (this.b) {
            String strO = o(str, "0");
            if (strO == null) {
                return false;
            }
            return Integer.parseInt(strO) != 0;
        }
    }

    @Override // defpackage.luk
    public final SharedPreferences n() {
        SharedPreferences sharedPreferences;
        synchronized (this.b) {
            sharedPreferences = this.c.getSharedPreferences(this.d + "_preferences_camera", 0);
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                sharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) it.next());
            }
        }
        return sharedPreferences;
    }

    public final String o(String str, String str2) {
        String string;
        synchronized (this.b) {
            try {
                try {
                    string = this.e.getString(str, str2);
                } catch (ClassCastException e) {
                    ((sgt) ((sgt) a.c().i(e)).M(4437)).s("existing preference with invalid type, removing and returning default");
                    this.e.edit().remove(str).apply();
                    return str2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}
