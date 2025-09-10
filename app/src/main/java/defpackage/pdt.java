package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdt {
    public final pjr a;
    public final pei b;
    public final pek c;
    public final pek d;
    public final pek e;
    public final pek f;
    public final sbp g;
    public final scn h;
    public final pcm i;
    public final pdh j;
    public final long k;
    public final int l;
    public final scn m;
    public final rwc n;
    public final ojl o;
    private final pek p;

    public pdt() {
        throw null;
    }

    public static pds a() {
        pds pdsVar = new pds(null);
        pdsVar.h(pei.NORMAL);
        pdsVar.k(new pek(1));
        pdsVar.a = new pek(2);
        pdsVar.b = new pek(-1);
        pdsVar.c = new pek(1);
        pdsVar.j(new pek(5));
        pdsVar.l(pdr.a);
        pdsVar.e(new peh());
        pdsVar.d = 3100010001000L;
        byte b = pdsVar.f;
        pdsVar.e = 60;
        pdsVar.f = (byte) (b | 3);
        pdsVar.i(sfd.a);
        pdsVar.f = (byte) (pdsVar.f | 4);
        pdsVar.g(rvk.a);
        pdsVar.f = (byte) (pdsVar.f | 8);
        return pdsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pdt) {
            pdt pdtVar = (pdt) obj;
            if (this.a.equals(pdtVar.a) && this.b.equals(pdtVar.b) && this.c.equals(pdtVar.c) && this.d.equals(pdtVar.d) && this.p.equals(pdtVar.p) && this.e.equals(pdtVar.e) && this.f.equals(pdtVar.f) && this.o.equals(pdtVar.o) && ujp.aH(this.g, pdtVar.g) && this.h.equals(pdtVar.h) && this.i.equals(pdtVar.i) && this.j.equals(pdtVar.j) && this.k == pdtVar.k && this.l == pdtVar.l && this.m.equals(pdtVar.m) && this.n.equals(pdtVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.a.b ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
        long j = this.k;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode()) * 1000003;
        return ((this.n.hashCode() ^ ((iHashCode2 ^ 1237) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        rwc rwcVar = this.n;
        scn scnVar = this.m;
        pdh pdhVar = this.j;
        pcm pcmVar = this.i;
        scn scnVar2 = this.h;
        sbp sbpVar = this.g;
        ojl ojlVar = this.o;
        pek pekVar = this.f;
        pek pekVar2 = this.e;
        pek pekVar3 = this.p;
        pek pekVar4 = this.d;
        pek pekVar5 = this.c;
        pei peiVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(peiVar) + ", " + String.valueOf(pekVar5) + ", " + String.valueOf(pekVar4) + ", " + String.valueOf(pekVar3) + ", " + String.valueOf(pekVar2) + ", " + String.valueOf(pekVar) + ", " + String.valueOf(ojlVar) + ", " + String.valueOf(sbpVar) + ", " + String.valueOf(scnVar2) + ", " + String.valueOf(pcmVar) + ", " + String.valueOf(pdhVar) + ", " + this.k + ", " + this.l + ", " + String.valueOf(scnVar) + ", false, " + String.valueOf(rwcVar) + ", false}";
    }

    public pdt(pjr pjrVar, pei peiVar, pek pekVar, pek pekVar2, pek pekVar3, pek pekVar4, pek pekVar5, ojl ojlVar, sbp sbpVar, scn scnVar, pcm pcmVar, pdh pdhVar, long j, int i, scn scnVar2, rwc rwcVar) {
        this.a = pjrVar;
        this.b = peiVar;
        this.c = pekVar;
        this.d = pekVar2;
        this.p = pekVar3;
        this.e = pekVar4;
        this.f = pekVar5;
        this.o = ojlVar;
        this.g = sbpVar;
        this.h = scnVar;
        this.i = pcmVar;
        this.j = pdhVar;
        this.k = j;
        this.l = i;
        this.m = scnVar2;
        this.n = rwcVar;
    }
}
