package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uo {
    public final int a;
    public final List b;
    public final List c;
    public final Executor d;
    public final int e;
    public final Map f;
    public final tm g;

    public uo(int i, List list, List list2, Executor executor, tm tmVar, Map map) {
        executor.getClass();
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = executor;
        this.g = tmVar;
        this.e = 1;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        if (this.a != uoVar.a || !a.ao(this.b, uoVar.b) || !a.ao(this.c, uoVar.c) || !a.ao(this.d, uoVar.d) || !a.ao(this.g, uoVar.g)) {
            return false;
        }
        int i = uoVar.e;
        return a.ao(this.f, uoVar.f);
    }

    public final int hashCode() {
        List list = this.b;
        return (((((((((((this.a * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.g.hashCode()) * 31) + 1) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.a + ", inputConfiguration=" + this.b + ", outputConfigurations=" + this.c + ", executor=" + this.d + ", stateCallback=" + this.g + ", sessionTemplateId=1, sessionParameters=" + this.f + ')';
    }
}
