package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxv {
    private static final Map a = new yd();
    private final SharedPreferences b;
    private SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        Map map = a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            qxv qxvVar = (qxv) it.next();
            SharedPreferences sharedPreferences = qxvVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = qxvVar.c;
            throw null;
        }
        map.clear();
    }
}
