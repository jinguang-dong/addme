package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivp extends nak implements iwu {
    private final Map a;

    public ivp(Context context) {
        super(context);
        this.a = new HashMap();
    }

    private final nan e(String str) {
        return j(str, 4000, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, nan] */
    @Override // defpackage.iwu
    public final void a(thy thyVar) {
        rwc rwcVarJ;
        Map map = this.a;
        nan nanVar = (nan) map.get(thyVar);
        if (nanVar != null) {
            rwcVarJ = rwc.j(nanVar);
        } else {
            int iOrdinal = thyVar.ordinal();
            nan nanVarE = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 4 ? null : e(this.j.getString(R.string.not_enough_motion_chip)) : e(this.j.getString(R.string.subject_moved_fast_chip)) : e(this.j.getString(R.string.phone_moved_fast_chip));
            if (nanVarE != null) {
                map.put(thyVar, nanVarE);
                rwcVarJ = rwc.j(nanVarE);
            } else {
                rwcVarJ = rvk.a;
            }
        }
        if (rwcVarJ.h()) {
            i(rwcVarJ.c());
        }
    }
}
