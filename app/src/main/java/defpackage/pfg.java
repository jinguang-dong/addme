package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfg {
    public final Map a;
    public final Set b;
    public rwc c;
    private final Set d;

    public pfg(Map map, Set set, Set set2, rwc rwcVar) {
        this.a = map;
        this.d = set;
        this.b = set2;
        this.c = rwcVar;
    }

    public static pfg a(pfg pfgVar) {
        return new pfg(new HashMap(pfgVar.a), new HashSet(pfgVar.d), new HashSet(pfgVar.b), pfgVar.c);
    }

    public final pfh b() {
        return new pfh(new HashSet(this.a.values()), new HashSet(this.d), new HashSet(this.b), this.c);
    }

    public final void d() {
        this.b.clear();
    }

    public final void e(CaptureRequest.Key key, Object obj) {
        this.a.put(key, new pej(key, obj));
    }

    public final void f(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pej pejVar = (pej) it.next();
            this.a.put(pejVar.a, pejVar);
        }
    }

    public final void g(ojl ojlVar) {
        this.d.add(ojlVar);
    }

    public final void c(pdv pdvVar) {
        Set set = this.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pgb pgbVar = (pgb) it.next();
            if (!ojl.bt(pdvVar, pgbVar, null)) {
                Log.w("pck", mn.j(pdvVar, pgbVar, CGlJpiVWrCQOq.QWCNcGg, " because it conflicts with "));
                it.remove();
            }
        }
        set.add((pgb) pdvVar);
    }
}
