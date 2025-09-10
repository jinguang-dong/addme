package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pal extends pam {
    public pal(NavigableMap navigableMap) {
        super(navigableMap);
    }

    private final Object a() {
        if (size() > 9000) {
            return super.remove((Comparable) Collections.min(super.navigableKeySet()));
        }
        return null;
    }

    @Override // defpackage.pam, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut = super.put(obj, obj2);
        return objPut != null ? objPut : a();
    }

    @Override // defpackage.pam, java.util.Map
    public final void putAll(Map map) {
        super.putAll(map);
        while (a() != null) {
        }
    }
}
