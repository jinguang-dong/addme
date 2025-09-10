package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kiy extends pog {
    public final Map a;

    public kiy(poj pojVar) {
        super(pojVar);
        this.a = new ConcurrentHashMap();
    }

    public final syu k() {
        return (syu) l(kix.a);
    }

    public final Object l(kiw kiwVar) {
        Map map = this.a;
        if (map.containsKey(kiwVar)) {
            return map.get(kiwVar);
        }
        return null;
    }

    public final boolean m() {
        return a() != -1;
    }

    public kiy(poj pojVar, syu syuVar) {
        this(pojVar);
        if (syuVar != null) {
            this.a.put(kix.a, syuVar);
        }
    }
}
