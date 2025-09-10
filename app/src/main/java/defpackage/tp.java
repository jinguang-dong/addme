package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tp {
    public final List a;
    public final Executor b;
    public final Integer c;
    public final tq d;
    public final sa e;
    private final int f;
    private final int g;
    private final Map h;
    private final tm i;

    public tp(List list, Executor executor, tm tmVar, Map map, Integer num, tq tqVar) {
        executor.getClass();
        this.f = 2;
        this.a = list;
        this.b = executor;
        this.i = tmVar;
        this.g = 1;
        this.h = map;
        this.c = num;
        this.d = tqVar;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        int i = tpVar.f;
        if (!a.ao(this.a, tpVar.a) || !a.ao(this.b, tpVar.b) || !a.ao(this.i, tpVar.i)) {
            return false;
        }
        int i2 = tpVar.g;
        if (!a.ao(this.h, tpVar.h) || !a.ao(this.c, tpVar.c) || !a.ao(this.d, tpVar.d)) {
            return false;
        }
        sa saVar = tpVar.e;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() + 62) * 31) + this.b.hashCode()) * 31) + this.i.hashCode()) * 31) + 1) * 31) + this.h.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.a + ", executor=" + this.b + ", stateCallback=" + this.i + ", sessionTemplateId=1, sessionParameters=" + this.h + ", extensionMode=" + this.c + ", extensionStateCallback=" + this.d + ", postviewOutputConfiguration=null)";
    }
}
