package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ppb {
    public final pox a;
    public final long b;
    public final String c;
    public final pou d;
    public final scn e;
    public final scn f;
    public final scn g;
    public final sbp h;
    public final ppu i;
    public final int j;
    private final long k;

    public ppb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        pou pouVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppb) {
            ppb ppbVar = (ppb) obj;
            if (this.a.equals(ppbVar.a) && this.k == ppbVar.k && this.b == ppbVar.b && this.c.equals(ppbVar.c) && ((pouVar = this.d) != null ? pouVar.equals(ppbVar.d) : ppbVar.d == null) && this.e.equals(ppbVar.e) && this.f.equals(ppbVar.f) && this.g.equals(ppbVar.g)) {
                int i = this.j;
                int i2 = ppbVar.j;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ujp.aH(this.h, ppbVar.h) && this.i.equals(ppbVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        String str = this.c;
        long j2 = this.k;
        int iHashCode2 = (((((iHashCode * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ str.hashCode();
        pou pouVar = this.d;
        int iHashCode3 = ((((((((iHashCode2 * 1000003) ^ (pouVar == null ? 0 : pouVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        int i = this.j;
        a.aF(i);
        return this.i.hashCode() ^ ((((iHashCode3 ^ i) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        int i = this.j;
        scn scnVar = this.g;
        scn scnVar2 = this.f;
        scn scnVar3 = this.e;
        pou pouVar = this.d;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(pouVar);
        String strValueOf3 = String.valueOf(scnVar3);
        String strValueOf4 = String.valueOf(scnVar2);
        String strValueOf5 = String.valueOf(scnVar);
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "ABANDON" : "PUBLISH" : "NONE";
        String str2 = this.c;
        long j = this.b;
        long j2 = this.k;
        sbp sbpVar = this.h;
        ppu ppuVar = this.i;
        return "{" + strValueOf + ", " + j2 + ", " + j + ", " + str2 + ", " + strValueOf2 + ", " + strValueOf3 + ", " + strValueOf4 + ", " + strValueOf5 + ", " + str + ", " + String.valueOf(sbpVar) + ", " + String.valueOf(ppuVar) + "}";
    }

    public ppb(pox poxVar, long j, long j2, String str, pou pouVar, scn scnVar, scn scnVar2, scn scnVar3, int i, sbp sbpVar, ppu ppuVar) {
        this.a = poxVar;
        this.k = j;
        this.b = j2;
        this.c = str;
        this.d = pouVar;
        this.e = scnVar;
        this.f = scnVar2;
        this.g = scnVar3;
        this.j = i;
        this.h = sbpVar;
        this.i = ppuVar;
    }
}
