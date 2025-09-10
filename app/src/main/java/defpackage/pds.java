package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pds {
    public pek a;
    public pek b;
    public pek c;
    public long d;
    public int e;
    public byte f;
    private pjr g;
    private pei h;
    private pek i;
    private pek j;
    private sbk k;
    private sbp l;
    private scl m;
    private scn n;
    private pcm o;
    private pdh p;
    private scn q;
    private rwc r;
    private ojl s;

    public pds() {
        throw null;
    }

    public final pdt a() {
        pjr pjrVar;
        pei peiVar;
        pek pekVar;
        pek pekVar2;
        pek pekVar3;
        pek pekVar4;
        pek pekVar5;
        ojl ojlVar;
        pcm pcmVar;
        pdh pdhVar;
        scn scnVar;
        pcm pcmVar2 = this.o;
        if (!(pcmVar2 == null ? rvk.a : rwc.j(pcmVar2)).h()) {
            this.o = new pcn();
        }
        sbk sbkVar = this.k;
        if (sbkVar != null) {
            this.l = sbkVar.g();
        } else if (this.l == null) {
            int i = sbp.d;
            this.l = sex.a;
        }
        scl sclVar = this.m;
        if (sclVar != null) {
            this.n = sclVar.g();
        } else if (this.n == null) {
            this.n = sfd.a;
        }
        if (this.f != 15 || (pjrVar = this.g) == null || (peiVar = this.h) == null || (pekVar = this.i) == null || (pekVar2 = this.a) == null || (pekVar3 = this.b) == null || (pekVar4 = this.c) == null || (pekVar5 = this.j) == null || (ojlVar = this.s) == null || (pcmVar = this.o) == null || (pdhVar = this.p) == null || (scnVar = this.q) == null) {
            throw new IllegalStateException();
        }
        pdt pdtVar = new pdt(pjrVar, peiVar, pekVar, pekVar2, pekVar3, pekVar4, pekVar5, ojlVar, this.l, this.n, pcmVar, pdhVar, this.d, this.e, scnVar, this.r);
        sbp sbpVar = pdtVar.g;
        pei peiVar2 = pdtVar.b;
        pei peiVar3 = pei.HIGH_SPEED;
        int i2 = ((sex) sbpVar).c;
        if (peiVar2 == peiVar3) {
            if (i2 > 2) {
                throw new IllegalStateException(rnt.z("At most 2 surfaces are supported in %s, but we get %s", peiVar3, Integer.valueOf(i2)));
            }
            for (int i3 = 0; i3 < i2; i3++) {
                pet petVar = ((peq) sbpVar.get(i3)).a;
                rnt.M(petVar == pet.SURFACE || petVar == pet.SURFACE_DEFERRED || petVar == pet.SURFACE_VIEW || petVar == pet.SURFACE_TEXTURE, "Streams in highspeed operating mode must be a viewfinder or MediaRecorder/MediaCodec surface.");
            }
        }
        rnt.M(i2 > 0, "At least one stream should be provided");
        return pdtVar;
    }

    public final scl b() {
        if (this.m == null) {
            this.m = new scl();
        }
        return this.m;
    }

    public final void c(Set set) {
        b().j(set);
    }

    public final void d(peq peqVar) {
        if (this.k == null) {
            int i = sbp.d;
            this.k = new sbk();
        }
        this.k.h(peqVar);
    }

    public final void e(pdh pdhVar) {
        pdhVar.getClass();
        this.p = pdhVar;
    }

    public final void f(pjr pjrVar) {
        pjrVar.getClass();
        this.g = pjrVar;
    }

    public final void g(rwc rwcVar) {
        rwcVar.getClass();
        this.r = rwcVar;
    }

    public final void h(pei peiVar) {
        peiVar.getClass();
        this.h = peiVar;
    }

    public final void i(scn scnVar) {
        scnVar.getClass();
        this.q = scnVar;
    }

    public final void j(pek pekVar) {
        pekVar.getClass();
        this.j = pekVar;
    }

    public final void k(pek pekVar) {
        pekVar.getClass();
        this.i = pekVar;
    }

    public final void l(ojl ojlVar) {
        ojlVar.getClass();
        this.s = ojlVar;
    }

    public pds(byte[] bArr) {
        this.r = rvk.a;
    }
}
