package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tow {
    public static final tow a = new tow((byte[]) null);
    private static volatile boolean b = false;
    private static volatile tow c;
    private final Map d;

    public tow() {
        this.d = new HashMap();
    }

    public static tow a() {
        tow towVar = c;
        if (towVar != null) {
            return towVar;
        }
        synchronized (tow.class) {
            tow towVar2 = c;
            if (towVar2 != null) {
                return towVar2;
            }
            tra traVar = tra.a;
            tow towVarB = tpb.b(tow.class);
            c = towVarB;
            return towVarB;
        }
    }

    public static tow b() {
        tra traVar = tra.a;
        return new tow();
    }

    public tql c(tqr tqrVar, int i) {
        return (tql) this.d.get(new tov(tqrVar, i));
    }

    public final void d(tql tqlVar) {
        this.d.put(new tov(tqlVar.d, ((tpg) tqlVar.c).a), tqlVar);
    }

    public tow(tow towVar) {
        if (towVar == a) {
            this.d = Collections.EMPTY_MAP;
        } else {
            this.d = DesugarCollections.unmodifiableMap(towVar.d);
        }
    }

    public tow(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
