package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djw {
    public final long a;
    public final long b;
    public final long c;
    public final cfd d;
    public final cfp e;
    public final cfj f;
    public final cfk g;
    public final long h;
    public final long i;
    public final long j;

    private djw(long j, long j2, long j3, cfd cfdVar, cfp cfpVar, cfj cfjVar, cfk cfkVar, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = cfdVar;
        this.e = cfpVar;
        this.f = cfjVar;
        this.g = cfkVar;
        this.h = j4;
        this.i = j5;
        this.j = j6;
    }

    public static /* synthetic */ djw b(djw djwVar, long j, cfd cfdVar, cfp cfpVar, long j2, long j3, long j4, int i) {
        return new djw((i & 1) != 0 ? djwVar.a : 0L, (i & 2) != 0 ? djwVar.b : 0L, (i & 4) != 0 ? djwVar.c : j, (i & 8) != 0 ? djwVar.d : cfdVar, (i & 16) != 0 ? djwVar.e : cfpVar, (i & 32) != 0 ? djwVar.f : null, (i & 64) != 0 ? djwVar.g : null, (i & 128) != 0 ? djwVar.h : j2, (i & 256) != 0 ? djwVar.i : j3, (i & 512) != 0 ? djwVar.j : j4);
    }

    public final djw a(djw djwVar) {
        long j = djwVar.b;
        if (j == 16) {
            j = this.b;
        }
        long j2 = j;
        long j3 = djwVar.c;
        if (cid.a(j3) == 0) {
            j3 = this.c;
        }
        long j4 = djwVar.a;
        if (j4 == 16) {
            j4 = this.a;
        }
        long j5 = j4;
        cfd cfdVar = djwVar.d;
        if (cfdVar == null) {
            cfdVar = this.d;
        }
        cfd cfdVar2 = cfdVar;
        cfp cfpVar = djwVar.e;
        if (cfpVar == null) {
            cfpVar = this.e;
        }
        cfp cfpVar2 = cfpVar;
        cfj cfjVar = djwVar.f;
        if (cfjVar == null) {
            cfjVar = this.f;
        }
        cfj cfjVar2 = cfjVar;
        cfk cfkVar = djwVar.g;
        if (cfkVar == null) {
            cfkVar = this.g;
        }
        cfk cfkVar2 = cfkVar;
        long j6 = djwVar.h;
        if (cid.a(j6) == 0) {
            j6 = this.h;
        }
        long j7 = j6;
        long j8 = djwVar.i;
        if (cid.a(j8) == 0) {
            j8 = this.i;
        }
        long j9 = j8;
        long j10 = djwVar.j;
        if (cid.a(j10) == 0) {
            j10 = this.j;
        }
        return new djw(j5, j2, j3, cfdVar2, cfpVar2, cfjVar2, cfkVar2, j7, j9, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djw)) {
            return false;
        }
        long j = this.b;
        djw djwVar = (djw) obj;
        long j2 = djwVar.b;
        long j3 = bkv.a;
        if (!a.q(j, j2)) {
            return false;
        }
        long j4 = this.c;
        long j5 = djwVar.c;
        long j6 = cid.a;
        return a.q(j4, j5) && a.q(this.a, djwVar.a) && a.ao(this.d, djwVar.d) && a.ao(this.e, djwVar.e) && a.ao(this.f, djwVar.f) && a.ao(this.g, djwVar.g) && a.q(this.h, djwVar.h) && a.q(this.i, djwVar.i) && a.q(this.j, djwVar.j);
    }

    public final int hashCode() {
        long j = bkv.a;
        long j2 = cid.a;
        cfd cfdVar = this.d;
        int iHashCode = cfdVar != null ? cfdVar.hashCode() : 0;
        long j3 = this.b;
        long j4 = this.c;
        long j5 = this.a;
        cfp cfpVar = this.e;
        return (((((((((((((((a.r(j3) * 31) + a.r(j4)) * 31) + a.r(j5)) * 31) + iHashCode) * 31) + (cfpVar != null ? cfpVar.h : 0)) * 961) + (this.g != null ? 65535 : 0)) * 31) + a.r(this.h)) * 31) + a.r(this.i)) * 31) + a.r(this.j);
    }

    public /* synthetic */ djw(long j, long j2, long j3, cfp cfpVar, cfj cfjVar, cfk cfkVar, long j4, long j5, long j6, int i) {
        this((i & 1) != 0 ? bkv.f : j, (i & 2) != 0 ? bkv.f : j2, (i & 4) != 0 ? cid.a : j3, (cfd) null, (i & 16) != 0 ? null : cfpVar, (i & 32) != 0 ? null : cfjVar, (i & 64) != 0 ? null : cfkVar, (i & 128) != 0 ? cid.a : j4, (i & 256) != 0 ? cid.a : j5, (i & 512) != 0 ? cid.a : j6);
    }

    public final String toString() {
        return "CurvedTextStyle(background=" + ((Object) bkv.g(this.a)) + "color=" + ((Object) bkv.g(this.b)) + ", fontSize=" + ((Object) cid.c(this.c)) + ", fontFamily=" + this.d + ", fontWeight=" + this.e + ", fontStyle=" + this.f + ", fontSynthesis=" + this.g + ", letterSpacing=" + ((Object) cid.c(this.h)) + ", letterSpacingCounterClockwise=" + ((Object) cid.c(this.i)) + MyBPCgKwEjJI.JsZuWXkeP + ((Object) cid.c(this.j)) + ", )";
    }

    public djw(cdo cdoVar) {
        this(cdoVar.e(), cdoVar.f(), cdoVar.g(), cdoVar.l(), cdoVar.o(), cdoVar.m(), cdoVar.n(), cdoVar.h(), cdoVar.h(), cdoVar.i());
    }
}
