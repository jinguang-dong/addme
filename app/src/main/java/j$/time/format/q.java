package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes3.dex */
public class q implements e {
    public final j$.desugar.sun.nio.fs.n a;
    public final String b;

    public q(j$.desugar.sun.nio.fs.n nVar, String str) {
        this.a = nVar;
        this.b = str;
    }

    @Override // j$.time.format.e
    public boolean h(u uVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) uVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.f());
        return true;
    }

    public final String toString() {
        return this.b;
    }
}
