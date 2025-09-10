package defpackage;

import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luj implements paq {
    private final SharedPreferences b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;
    private final hbj e;
    public final Map a = new HashMap();
    private final List d = new ArrayList();

    public luj(final hbj hbjVar, final SharedPreferences sharedPreferences) {
        this.e = hbjVar;
        this.b = sharedPreferences;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: luh
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                Object objA;
                lui luiVar = (lui) this.a.a.get(str);
                if (luiVar == null) {
                    return;
                }
                String string = sharedPreferences.getString(str, null);
                if (string != null) {
                    objA = luiVar.a.b(string);
                } else {
                    objA = luiVar.a.b.a(hbjVar);
                }
                owq owqVar = luiVar.b;
                if (Objects.equals(((ovx) owqVar).d, objA)) {
                    return;
                }
                owqVar.a(objA);
            }
        };
        this.c = onSharedPreferenceChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final owq a(lud ludVar) {
        Map map = this.a;
        synchronized (map) {
            String str = ludVar.a;
            if (map.get(str) == null) {
                ovx ovxVar = new ovx(b(ludVar));
                this.d.add(ovxVar.dK(new leg(this, ludVar, 6, null), sxo.a));
                map.put(str, new lui(ludVar, ovxVar));
            }
        }
        lui luiVar = (lui) this.a.get(ludVar.a);
        luiVar.getClass();
        return luiVar.b;
    }

    public final Object b(lud ludVar) {
        String string;
        synchronized (this) {
            string = this.b.getString(ludVar.a, null);
        }
        return string != null ? ludVar.b(string) : ludVar.b.a(this.e);
    }

    public final void c(lud ludVar) {
        synchronized (this) {
            this.b.edit().remove(ludVar.a).apply();
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.b.unregisterOnSharedPreferenceChangeListener(this.c);
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((paq) it.next()).close();
        }
    }

    public final void d(lud ludVar, Object obj) {
        String str = ludVar.a;
        String strC = ludVar.c(obj);
        synchronized (this) {
            this.b.edit().putString(str, strC).apply();
        }
    }
}
