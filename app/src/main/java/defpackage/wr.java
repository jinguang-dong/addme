package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wr implements AutoCloseable {
    public final wq a;
    public final uem b;
    public final py c;
    public final Map d;
    public final Object e = new Object();
    public final Map f;
    public final Map g;
    public boolean h;
    public boolean i;

    public wr(wq wqVar, uem uemVar, py pyVar, Map map) {
        this.a = wqVar;
        this.b = uemVar;
        this.c = pyVar;
        this.d = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((xn) entry.getValue()).a());
        }
        this.f = linkedHashMap;
        this.g = new LinkedHashMap();
        this.h = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        synchronized (this.e) {
            if (this.i) {
                return;
            }
            this.i = true;
            this.f.clear();
            Map map = this.g;
            List listBN = ske.bN(map.values());
            map.clear();
            Iterator it = listBN.iterator();
            while (it.hasNext()) {
                a.ae((AutoCloseable) it.next());
            }
        }
    }
}
