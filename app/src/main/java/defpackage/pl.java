package defpackage;

import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pl {
    public final String a;
    public final List b;
    public final List c;
    public final List d;
    public final Map f;
    public final int g;
    public final Map i;
    public final List j;
    public final Map k;
    public final pm l;
    private final qn o;
    private final ocq q = null;
    public final int e = 1;
    public final int h = 1;
    private final String n = null;
    private final rnu p = null;
    public final List m = ufw.a;

    public pl(String str, List list, List list2, List list3, Map map, int i, Map map2, List list4, Map map3, qn qnVar, pm pmVar) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.f = map;
        this.g = i;
        this.i = map2;
        this.j = list4;
        this.k = map3;
        this.o = qnVar;
        this.l = pmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        if (!a.ao(this.a, plVar.a) || !a.ao(this.b, plVar.b) || !a.ao(this.c, plVar.c) || !a.ao(this.d, plVar.d)) {
            return false;
        }
        ocq ocqVar = plVar.q;
        if (!a.ao(null, null)) {
            return false;
        }
        int i = plVar.e;
        if (!a.p(1, 1) || !a.ao(this.f, plVar.f) || !a.p(this.g, plVar.g)) {
            return false;
        }
        int i2 = plVar.h;
        if (!a.p(1, 1) || !a.ao(this.i, plVar.i) || !a.ao(this.j, plVar.j) || !a.ao(this.k, plVar.k)) {
            return false;
        }
        String str = plVar.n;
        rnu rnuVar = plVar.p;
        return a.ao(null, null) && a.ao(this.o, plVar.o) && a.ao(this.l, plVar.l);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        List list = this.d;
        return (((((((((((((((((iHashCode * 31) + 1) * 31) + (list == null ? 0 : list.hashCode())) * 961) + 1) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + 1) * 961) + 1) * 923521) + this.o.hashCode()) * 31) + this.l.hashCode();
    }

    public final String toString() {
        return "Config(camera=" + ((Object) pp.a(this.a)) + ", streams=" + this.b + ", exclusiveStreamGroups=" + this.c + qcjAcSmlN.rNrMxELbnuAQKKH + this.d + ", postviewStream=null, sessionTemplate=" + ((Object) rd.a(1)) + ", sessionParameters=" + this.f + ", sessionMode=" + ((Object) pn.a(this.g)) + ", defaultTemplate=" + ((Object) rd.a(1)) + ", defaultParameters=" + this.i + ", defaultListeners=" + this.j + ", requiredParameters=" + this.k + ", cameraBackendId=null, customCameraBackend=null, metadataTransform=" + this.o + ", flags=" + this.l + ')';
    }
}
