package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esp implements eqi {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final eqi g;
    private final Map h;
    private final eqm i;
    private int j;

    public esp(Object obj, eqi eqiVar, int i, int i2, Map map, Class cls, Class cls2, eqm eqmVar) {
        eoz.k(obj);
        this.b = obj;
        eoz.j(eqiVar, "Signature must not be null");
        this.g = eqiVar;
        this.c = i;
        this.d = i2;
        eoz.k(map);
        this.h = map;
        eoz.j(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        eoz.k(eqmVar);
        this.i = eqmVar;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof esp) {
            esp espVar = (esp) obj;
            if (this.b.equals(espVar.b) && this.g.equals(espVar.g) && this.d == espVar.d && this.c == espVar.c && this.h.equals(espVar.h) && this.e.equals(espVar.e) && this.f.equals(espVar.f) && this.i.equals(espVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.h.hashCode();
        this.j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.e.hashCode();
        this.j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f.hashCode();
        this.j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.i.hashCode();
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        eqm eqmVar = this.i;
        Map map = this.h;
        eqi eqiVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + eqiVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + eqmVar.toString() + "}";
    }
}
