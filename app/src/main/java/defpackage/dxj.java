package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxj {
    private static final String g = dwj.a("Processor");
    public final WorkDatabase a;
    private final Context h;
    private final dvs i;
    private final gga k;
    private final Map j = new HashMap();
    public final Map b = new HashMap();
    public final Set d = new HashSet();
    public final List e = new ArrayList();
    public final Object f = new Object();
    public final Map c = new HashMap();

    public dxj(Context context, dvs dvsVar, gga ggaVar, WorkDatabase workDatabase) {
        this.h = context;
        this.i = dvsVar;
        this.k = ggaVar;
        this.a = workDatabase;
    }

    public static void f(nhz nhzVar, int i) throws Throwable {
        if (nhzVar == null) {
            dwj.b();
            return;
        }
        ((uov) nhzVar.a).s(new dyl(i));
        dwj.b();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final void h(ebm ebmVar) {
        this.k.c.execute(new at(this, ebmVar, 19, (byte[]) null));
    }

    public final void a(dwy dwyVar) {
        synchronized (this.f) {
            this.e.add(dwyVar);
        }
    }

    public final void b(dwy dwyVar) {
        synchronized (this.f) {
            this.e.remove(dwyVar);
        }
    }

    public final boolean c(String str) {
        boolean z;
        synchronized (this.f) {
            z = e(str) != null;
        }
        return z;
    }

    public final nhz d(String str) {
        Map map = this.b;
        nhz nhzVar = (nhz) map.remove(str);
        boolean z = nhzVar != null;
        if (!z) {
            nhzVar = (nhz) this.j.remove(str);
        }
        this.c.remove(str);
        if (z) {
            synchronized (this.f) {
                if (map.isEmpty()) {
                    Context context = this.h;
                    int i = eax.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (Throwable th) {
                        dwj.b();
                        Log.e(g, "Unable to stop foreground service", th);
                    }
                }
            }
        }
        return nhzVar;
    }

    public final nhz e(String str) {
        nhz nhzVar = (nhz) this.b.get(str);
        return nhzVar == null ? (nhz) this.j.get(str) : nhzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final boolean g(ejs ejsVar) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Object obj = ejsVar.a;
        ebm ebmVar = (ebm) obj;
        String str = ebmVar.a;
        efk efkVar = new efk(this, arrayList, str, 1);
        WorkDatabase workDatabase = this.a;
        ebx ebxVar = (ebx) workDatabase.f(efkVar);
        if (ebxVar == null) {
            dwj.b();
            String str2 = g;
            Objects.toString(obj);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(obj.toString()));
            h(ebmVar);
            return false;
        }
        synchronized (this.f) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (c(str)) {
                    Set set = (Set) this.c.get(str);
                    if (((ebm) ((ejs) set.iterator().next()).a).b == ((ebm) obj).b) {
                        set.add(ejsVar);
                        dwj.b();
                        Objects.toString(obj);
                    } else {
                        h((ebm) obj);
                    }
                } else {
                    if (ebxVar.r == ((ebm) obj).b) {
                        Context context = this.h;
                        dvs dvsVar = this.i;
                        gga ggaVar = this.k;
                        nhz nhzVar = new nhz(new gko(context, dvsVar, ggaVar, workDatabase, ebxVar, arrayList));
                        syu syuVarQ = cij.q(((ugx) ((gga) nhzVar.e).d).plus(new uon(null)), new crd(nhzVar, (uhb) null, 16, (byte[]) null));
                        syuVarQ.c(new as(this, syuVarQ, nhzVar, 3, (char[]) null), ggaVar.c);
                        this.j.put(str, nhzVar);
                        HashSet hashSet = new HashSet();
                        hashSet.add(ejsVar);
                        this.c.put(str, hashSet);
                        dwj.b();
                        getClass().getSimpleName();
                        Objects.toString(obj);
                        return true;
                    }
                    h((ebm) obj);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
