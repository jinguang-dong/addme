package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
final class cws implements cwf {
    private final Object a;
    private final cvq b;

    public cws(Object obj) {
        this.a = obj;
        this.b = cvs.a.b(obj.getClass());
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Map map = this.b.a;
        List list = (List) map.get(cwaVar);
        Object obj = this.a;
        cvq.a(list, cwhVar, cwaVar, obj);
        cvq.a((List) map.get(cwa.ON_ANY), cwhVar, cwaVar, obj);
    }
}
