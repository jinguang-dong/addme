package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class uob extends unw implements unk {
    private final uly a;
    public final umb c;
    public final umb d;

    public uob() {
        umc umcVar = umc.a;
        this.c = new umb(null, umcVar);
        this.d = new umb(null, umcVar);
        this.a = new uly(false, umcVar);
    }

    private final boolean A(Runnable runnable) {
        while (true) {
            umb umbVar = this.c;
            Object obj = umbVar.a;
            if (x()) {
                return false;
            }
            if (obj == null) {
                if (umbVar.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof uvv) {
                uvv uvvVar = (uvv) obj;
                int iA = uvvVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    return false;
                }
                umbVar.d(obj, uvvVar.c());
            } else {
                if (obj == uoc.b) {
                    return false;
                }
                uvv uvvVar2 = new uvv(8, true);
                uvvVar2.a((Runnable) obj);
                uvvVar2.a(runnable);
                if (umbVar.d(obj, uvvVar2)) {
                    return true;
                }
            }
        }
    }

    private final void z() {
        uwg uwgVarD;
        uoa uoaVar = (uoa) this.d.a;
        if (uoaVar == null || uoaVar.g()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (uoaVar) {
                uwg uwgVarB = uoaVar.b();
                uwgVarD = null;
                if (uwgVarB != null) {
                    unz unzVar = (unz) uwgVarB;
                    if (jNanoTime - unzVar.b >= 0 && A(unzVar)) {
                        uwgVarD = uoaVar.d(0);
                    }
                }
            }
        } while (((unz) uwgVarD) != null);
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        i(runnable);
    }

    @Override // defpackage.unk
    public final void c(long j, umk umkVar) {
        long jA = uoc.a(j);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            unx unxVar = new unx(this, jA + jNanoTime, umkVar);
            w(jNanoTime, unxVar);
            ung.r(umkVar, unxVar);
        }
    }

    public unt h(long j, Runnable runnable, uhf uhfVar) {
        return uni.a.h(j, runnable, uhfVar);
    }

    public void i(Runnable runnable) {
        z();
        if (A(runnable)) {
            s();
        } else {
            unh.a.i(runnable);
        }
    }

    @Override // defpackage.unw
    public void k() {
        uwg uwgVarD;
        ThreadLocal threadLocal = upk.a;
        upk.a.set(null);
        this.a.a = 1;
        boolean z = unf.a;
        while (true) {
            umb umbVar = this.c;
            Object obj = umbVar.a;
            if (obj == null) {
                if (umbVar.d(null, uoc.b)) {
                    break;
                }
            } else if (obj instanceof uvv) {
                ((uvv) obj).d();
                break;
            } else {
                if (obj == uoc.b) {
                    break;
                }
                uvv uvvVar = new uvv(8, true);
                uvvVar.a((Runnable) obj);
                if (umbVar.d(obj, uvvVar)) {
                    break;
                }
            }
        }
        while (l() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            uoa uoaVar = (uoa) this.d.a;
            if (uoaVar == null) {
                return;
            }
            synchronized (uoaVar) {
                uwgVarD = uoaVar.a() > 0 ? uoaVar.d(0) : null;
            }
            unz unzVar = (unz) uwgVarD;
            if (unzVar == null) {
                return;
            } else {
                j(jNanoTime, unzVar);
            }
        }
    }

    @Override // defpackage.unw
    public final long l() {
        Runnable runnable;
        unz unzVar;
        if (r()) {
            return 0L;
        }
        z();
        umb umbVar = this.c;
        while (true) {
            Object obj = umbVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof uvv)) {
                if (obj == uoc.b) {
                    break;
                }
                if (umbVar.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                uvv uvvVar = (uvv) obj;
                Object objB = uvvVar.b();
                if (objB != uvv.a) {
                    runnable = (Runnable) objB;
                    break;
                }
                umbVar.d(obj, uvvVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        ufu ufuVar = this.b;
        if (((ufuVar == null || ufuVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = umbVar.a;
        if (obj2 != null) {
            if (!(obj2 instanceof uvv)) {
                return obj2 == uoc.b ? Long.MAX_VALUE : 0L;
            }
            if (!((uvv) obj2).e()) {
                return 0L;
            }
        }
        uoa uoaVar = (uoa) this.d.a;
        if (uoaVar == null || (unzVar = (unz) uoaVar.c()) == null) {
            return Long.MAX_VALUE;
        }
        return ukc.q(unzVar.b - System.nanoTime(), 0L);
    }

    protected final unt v(long j, Runnable runnable) {
        long jA = uoc.a(j);
        if (jA >= 4611686018427387903L) {
            return upc.a;
        }
        long jNanoTime = System.nanoTime();
        uny unyVar = new uny(jA + jNanoTime, runnable);
        w(jNanoTime, unyVar);
        return unyVar;
    }

    public final void w(long j, unz unzVar) {
        if (!x()) {
            umb umbVar = this.d;
            uoa uoaVar = (uoa) umbVar.a;
            if (uoaVar == null) {
                umbVar.d(null, new uoa(j));
                Object obj = umbVar.a;
                obj.getClass();
                uoaVar = (uoa) obj;
            }
            synchronized (unzVar) {
                if (unzVar._heap == uoc.a) {
                    return;
                }
                synchronized (uoaVar) {
                    unz unzVar2 = (unz) uoaVar.b();
                    if (!x()) {
                        if (unzVar2 == null) {
                            uoaVar.a = j;
                        } else {
                            long j2 = unzVar2.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = uoaVar.a;
                            if (j - j3 > 0) {
                                uoaVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (unzVar.b - j < 0) {
                            unzVar.b = j;
                        }
                        boolean z = unf.a;
                        unzVar.d(uoaVar);
                        uwg[] uwgVarArr = uoaVar.b;
                        if (uwgVarArr == null) {
                            uwgVarArr = new uwg[4];
                            uoaVar.b = uwgVarArr;
                        } else if (uoaVar.a() >= uwgVarArr.length) {
                            int iA = uoaVar.a();
                            Object[] objArrCopyOf = Arrays.copyOf(uwgVarArr, iA + iA);
                            objArrCopyOf.getClass();
                            uwgVarArr = (uwg[]) objArrCopyOf;
                            uoaVar.b = uwgVarArr;
                        }
                        int iA2 = uoaVar.a();
                        uoaVar.e(iA2 + 1);
                        uwgVarArr[iA2] = unzVar;
                        unzVar.e(iA2);
                        uoaVar.f(iA2);
                        uoa uoaVar2 = (uoa) umbVar.a;
                        if ((uoaVar2 != null ? (unz) uoaVar2.c() : null) == unzVar) {
                            s();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        j(j, unzVar);
    }

    public final boolean x() {
        return this.a.a();
    }

    protected final boolean y() {
        if (!q()) {
            return false;
        }
        uoa uoaVar = (uoa) this.d.a;
        if (uoaVar != null && !uoaVar.g()) {
            return false;
        }
        Object obj = this.c.a;
        if (obj == null) {
            return true;
        }
        return obj instanceof uvv ? ((uvv) obj).e() : obj == uoc.b;
    }
}
