package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcl {
    public final pzc a;
    public final qag b;
    public final qbq c;
    public final Context d;
    public final pwt e;
    public final rwc f;
    public final Executor g;
    public final lat h;

    public qcl(Context context, pzc pzcVar, qag qagVar, lat latVar, qbq qbqVar, pwt pwtVar, rwc rwcVar, Executor executor) {
        this.d = context;
        this.a = pzcVar;
        this.b = qagVar;
        this.h = latVar;
        this.c = qbqVar;
        this.e = pwtVar;
        this.f = rwcVar;
        this.g = executor;
    }

    public static final String a(pvl pvlVar) {
        return pvlVar.c + "|" + pvlVar.d;
    }

    public static final Set b(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }
}
