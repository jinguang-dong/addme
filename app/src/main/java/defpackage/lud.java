package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lud {
    public static final /* synthetic */ int c = 0;
    private static final Map d = new HashMap();
    public final String a;
    final luc b;

    public lud(String str, luc lucVar) {
        this.a = str;
        this.b = lucVar;
        e();
    }

    public static lud a(String str) {
        return (lud) d.get(str);
    }

    private final synchronized void e() {
        Map map = d;
        String str = this.a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException("Duplicate setting key for: ".concat(str));
        }
        map.put(str, this);
    }

    public abstract Object b(String str);

    public String c(Object obj) {
        return obj.toString();
    }

    public final Object d(hbj hbjVar) {
        return this.b.a(hbjVar);
    }

    public lud(String str, final Object obj) {
        this(str, new luc() { // from class: lub
            @Override // defpackage.luc
            public final Object a(hbj hbjVar) {
                int i = lud.c;
                return obj;
            }
        });
    }
}
