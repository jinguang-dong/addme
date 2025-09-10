package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvz {
    public static final cwa a(cwb cwbVar) {
        cwbVar.getClass();
        int iOrdinal = cwbVar.ordinal();
        if (iOrdinal == 2) {
            return cwa.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return cwa.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return cwa.ON_PAUSE;
    }

    public static final cwa b(cwb cwbVar) {
        cwbVar.getClass();
        int iOrdinal = cwbVar.ordinal();
        if (iOrdinal == 1) {
            return cwa.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return cwa.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return cwa.ON_RESUME;
    }

    public static final void c(cxm cxmVar, det detVar, cwc cwcVar) throws NoSuchMethodException, SecurityException {
        detVar.getClass();
        cwcVar.getClass();
        cxc cxcVar = (cxc) cxmVar.fc("androidx.lifecycle.savedstate.vm.tag");
        if (cxcVar == null || cxcVar.b) {
            return;
        }
        cxcVar.b(detVar, cwcVar);
        d(detVar, cwcVar);
    }

    public static final void d(det detVar, cwc cwcVar) throws NoSuchMethodException, SecurityException {
        cwb cwbVar = cwcVar.a;
        if (cwbVar == cwb.b || cwbVar.a(cwb.d)) {
            detVar.c(cvx.class);
        } else {
            cwcVar.a(new cvy(cwcVar, detVar));
        }
    }

    public static final String e(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static final dcn f(Context context, Class cls, String str) {
        if (ujp.r(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (a.ao(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new dcn(context, cls, str);
    }
}
