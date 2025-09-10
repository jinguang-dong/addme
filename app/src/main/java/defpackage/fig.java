package defpackage;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.Optional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fig implements hzi, ial, iac {
    public final cxb a;
    private final hxv b;
    private final owq c;
    private final owf d;
    private final Set e = new HashSet();
    private final swb f;
    private final fja g;
    private final hzl h;
    private final iso i;

    public fig(fja fjaVar, hzl hzlVar, hxv hxvVar, iso isoVar, owq owqVar, cxb cxbVar, owf owfVar, swb swbVar) {
        this.g = fjaVar;
        this.h = hzlVar;
        this.b = hxvVar;
        this.i = isoVar;
        this.c = owqVar;
        this.a = cxbVar;
        this.d = owfVar;
        this.f = swbVar;
    }

    private final synchronized void j(ltd ltdVar) {
        this.e.add(ltdVar);
        this.c.a(true);
    }

    private final synchronized void k(ltd ltdVar) {
        this.e.remove(ltdVar);
        this.c.a(Boolean.valueOf(!r0.isEmpty()));
    }

    @Override // defpackage.hzi
    public final synchronized void a(ltd ltdVar) {
        k(ltdVar);
    }

    @Override // defpackage.hzi
    public final void b(iby ibyVar, lau lauVar) {
        lauVar.close();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iac
    public final void f(iby ibyVar, int i, long j, poe poeVar) {
        ?? r1 = ibyVar.x.b;
        fja fjaVar = this.g;
        ltd ltdVarL = r1.l();
        fip fipVarA = fjaVar.a(ltdVarL);
        if (fipVarA == null) {
            return;
        }
        fipVarA.d(ltdVarL, j);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lss] */
    public final void g(fjk fjkVar) {
        gga ggaVar = fjkVar.k;
        ?? r1 = ggaVar.b;
        int i = r1.l().a;
        ici iciVarA = icj.a();
        iciVarA.e(new lba());
        iciVarA.e = ske.K();
        ShotMetadata shotMetadata = fjkVar.b;
        iciVarA.h(svz.b(shotMetadata.b()).toNanos());
        hxu hxuVar = fjkVar.j;
        iciVarA.d(hxuVar);
        iciVarA.b();
        iciVarA.a = fjkVar.a;
        iciVarA.f(shotMetadata);
        iciVarA.i(ggaVar);
        lsu lsuVar = fjkVar.h;
        iciVarA.j = Optional.of(lsuVar);
        iciVarA.g(fjkVar.f);
        Optional optional = fjkVar.i;
        optional.getClass();
        iciVarA.k = optional;
        if (!fjkVar.c) {
            lsuVar.b.i(this.f.a().toEpochMilli());
            this.h.d(hxuVar, iciVarA.a(), fjkVar.d);
            return;
        }
        ((Optional) this.d.dL()).ifPresent(new fxu(this, fjkVar, 1));
        pos posVar = lsuVar.b;
        posVar.i(r1.f());
        lsuVar.d = true;
        lsuVar.a.h().c(posVar);
        this.h.b(hxuVar, rwc.j(iciVarA.a()), iea.a);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, lss] */
    @Override // defpackage.ial
    public final void h(iby ibyVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) throws Throwable {
        fig figVar;
        final InterleavedImageU8 interleavedImageU82;
        final ShotMetadata shotMetadata2;
        final Optional optionalOfNullable;
        boolean zContains;
        spe speVar;
        final gga ggaVar = ibyVar.x;
        ltd ltdVarL = ggaVar.b.l();
        int i = ltdVarL.a;
        k(ltdVarL);
        fja fjaVar = this.g;
        hxu hxuVarA = this.b.a();
        final fip fipVarA = fjaVar.a(ltdVarL);
        if (fipVarA == null) {
            figVar = this;
            interleavedImageU82 = interleavedImageU8;
            shotMetadata2 = shotMetadata;
        } else {
            synchronized (fipVarA) {
                List list = fipVarA.d;
                if (list.isEmpty() || !list.contains(ltdVarL) || fipVarA.v) {
                    figVar = this;
                    interleavedImageU82 = interleavedImageU8;
                    shotMetadata2 = shotMetadata;
                    ((sgt) fip.a.c().M(185)).G("Return without processing for shotId:%s, isSessionClosed=%s, groupId:%s", Integer.valueOf(i), Boolean.valueOf(fipVarA.v), Integer.valueOf(fipVarA.c));
                } else {
                    fipVarA.x = Optional.of(this);
                    mdq mdqVar = (mdq) Optional.ofNullable(fipVarA.C.a(ltdVarL)).map(new fik(0)).map(new fik(2)).orElse(null);
                    if (mdqVar == null) {
                        ((sgt) fip.a.c().M(178)).v("Missing capture session trace for %s", ltdVarL);
                    } else if (fipVarA.j(ltdVarL)) {
                        fipVarA.j.e(mdqVar);
                    } else {
                        fipVarA.j.i(mdqVar);
                    }
                    fipVarA.h();
                    if (fipVarA.j(ltdVarL)) {
                        fjj fjjVarA = fjk.a();
                        fjjVarA.c(interleavedImageU8);
                        fjjVarA.a = new ShotMetadata(shotMetadata);
                        fjjVarA.h = hxuVarA;
                        fjjVarA.i = ggaVar;
                        fjjVarA.f = ggaVar.b.j();
                        synchronized (fipVarA) {
                            fmg fmgVar = fipVarA.r;
                            if (fmgVar != null) {
                                fjjVarA.c = Optional.of(fmgVar.b);
                            }
                            zContains = fip.b.contains(fipVarA.y);
                            if (zContains) {
                                fipVarA.w = Optional.of(fjjVarA.a());
                            }
                        }
                        if (zContains) {
                            synchronized (fipVarA) {
                                speVar = fipVarA.y;
                            }
                            fipVarA.f(speVar);
                            return;
                        } else {
                            fjjVarA.e = Optional.of(ske.P(new as(fipVarA, interleavedImageU8, shotMetadata, 15, (short[]) null), fipVarA.e));
                            synchronized (fipVarA) {
                                fipVarA.w = Optional.of(fjjVarA.a());
                            }
                            return;
                        }
                    }
                    interleavedImageU82 = interleavedImageU8;
                    shotMetadata2 = shotMetadata;
                    synchronized (fipVarA) {
                        final Optional optional = fipVarA.w;
                        if (!optional.isEmpty()) {
                            spe speVar2 = fipVarA.y;
                            fjj fjjVarA2 = fjk.a();
                            fjjVarA2.c(interleavedImageU82);
                            fjjVarA2.a = new ShotMetadata(shotMetadata2);
                            fjjVarA2.h = hxuVarA;
                            fjjVarA2.i = ggaVar;
                            fjjVarA2.f = ggaVar.b.j();
                            final fjk fjkVarA = fjjVarA2.a();
                            if (fip.b.contains(speVar2)) {
                                Optional optionalOf = Optional.of(fjkVarA);
                                int i2 = sbp.d;
                                fipVarA.m(optional, optionalOf, sex.a, speVar2, Optional.of(shotMetadata2), Optional.of(this));
                                return;
                            } else {
                                final Optional optionalFlatMap = optional.flatMap(new fik(3));
                                synchronized (fipVarA) {
                                    fmg fmgVar2 = fipVarA.s;
                                    optionalOfNullable = Optional.ofNullable(fmgVar2 != null ? fmgVar2.b : null);
                                }
                                fipVarA.e.execute(new Runnable() { // from class: fil
                                    /* JADX WARN: Removed duplicated region for block: B:100:0x01f1  */
                                    /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
                                    /* JADX WARN: Removed duplicated region for block: B:127:0x0262  */
                                    /* JADX WARN: Removed duplicated region for block: B:143:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:146:0x0285 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
                                    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, lss] */
                                    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, lss] */
                                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lss] */
                                    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, lss] */
                                    @Override // java.lang.Runnable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final void run() throws java.lang.Throwable {
                                        /*
                                            Method dump skipped, instructions count: 674
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fil.run():void");
                                    }
                                });
                                return;
                            }
                        }
                        figVar = this;
                    }
                }
            }
        }
        int i3 = ltdVarL.a;
        ici iciVarA = icj.a();
        iciVarA.e(new lba());
        iciVarA.e = ske.K();
        iciVarA.h(svz.b(shotMetadata2.b()).toNanos());
        iciVarA.d(hxuVarA);
        iciVarA.b();
        iciVarA.a = interleavedImageU82;
        iciVarA.f(shotMetadata2);
        iciVarA.i(ggaVar);
        figVar.h.b(hxuVarA, rwc.j(iciVarA.a()), iea.a);
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        ibz ibzVarF = this.i.f(ltdVar);
        ibzVarF.e(this);
        ibzVarF.a(this);
        j(ltdVar);
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
    }

    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
    }
}
